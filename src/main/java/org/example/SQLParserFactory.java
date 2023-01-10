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
        CodePointCharStream cs  = CharStreams.fromString(sql);

        TestLexer lexer = new TestLexer(cs);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        return new TestParser(tokens);
    }
}
