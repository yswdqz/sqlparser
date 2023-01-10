package test;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.CacheProperties;
import org.example.SQLParserFacade;
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
    public void parseSimpleSQLPerf() {
        String s = "select * from table_1 where col = ?";
        String result = new SQLParserFacade("mysql", CacheProperties.defaultProperties())
                .parse(s, true);
    }
    @Test
    @Benchmark
    public void parseComplexSQLPerf() {
        String s = "SELECT \n" +
                "    productname, \n" +
                "    buyprice\n" +
                "FROM\n" +
                "    products p1\n" +
                "WHERE\n" +
                "    buyprice > (SELECT \n" +
                "            AVG(buyprice)\n" +
                "        FROM\n" +
                "            products\n" +
                "        WHERE\n" +
                "            productline = p1.productline)";
        String result = new SQLParserFacade("mysql", CacheProperties.defaultProperties())
                .parse(s, true);
    }

    @Test
    @Benchmark
    public void parseComplexSQL2Perf() {
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
        String result = new SQLParserFacade("mysql", CacheProperties.defaultProperties())
                .parse(s, true);
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
