package test;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import tools.TestLexer;
import tools.TestParser;

import java.util.Locale;


public class SqlParserTest {

        @Test
        @Benchmark
        public void parseComplexSQLPerf() {
            String s = "SELECT \n" +
                    "    customerNumber, \n" +
                    "    customerName\n" +
                    "FROM\n" +
                    "    customers\n" +
                    "WHERE\n" +
                    "    EXISTS( SELECT \n" +
                    "            orderNumber, SUM(priceEach * quantityOrdered)\n" +
                    "        FROM\n" +
                    "            orderdetails\n" +
                    "                INNER JOIN\n" +
                    "            orders USING (orderNumber)\n" +
                    "        WHERE\n" +
                    "            customerNumber = customers.customerNumber\n" +
                    "        GROUP BY orderNumber\n" +
                    "        HAVING SUM(priceEach * quantityOrdered) > 60000);";
            s = s.toUpperCase(Locale.ROOT);
            CodePointCharStream cs  = CharStreams.fromString(s);

            TestLexer lexer = new TestLexer(cs);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            TestParser parser = new TestParser(tokens);
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

     //      System.out.println(parser.result.toString());
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder().include(SqlParserTest.class.getSimpleName())
                .forks(1)
                .warmupIterations(3)
                .threads(1)
                .syncIterations(false)
                .measurementIterations(5)
                .build();

        new Runner(opt).run();
    }

}
