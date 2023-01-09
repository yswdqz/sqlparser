package org.example;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import tools.TestLexer;
import tools.TestParser;

import java.util.Locale;

public class SQLParserFactory {
    public static TestParser getSQLParser(String type, String sql){
        sql = sql.toUpperCase(Locale.ROOT);

        CodePointCharStream cs  = CharStreams.fromString(sql);

        TestLexer lexer = new TestLexer(cs);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        return new TestParser(tokens);
    }

    public static void parse(TestParser parser) {
        try {
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
            parser.setBuildParseTree(false);
            parser.dmlStatement();
        } catch (final ParseCancellationException ex) {
            parser.reset();
            parser.getInterpreter().setPredictionMode(PredictionMode.LL);
            parser.removeErrorListeners();
            try {
                parser.dmlStatement();
            } catch (final ParseCancellationException e) {
                throw new RuntimeException("can not pass");
            }
        } catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println(parser.result.toString());
    }
}
