package org.apache.skywalking.oap.server;

import com.google.protobuf.ByteString;
import org.apache.skywalking.apm.network.common.v3.KeyStringValuePair;
import org.apache.skywalking.apm.network.language.agent.v3.SegmentObject;
import org.apache.skywalking.apm.network.language.agent.v3.SpanLayer;
import org.apache.skywalking.apm.network.language.agent.v3.SpanObject;
import org.apache.skywalking.apm.network.language.agent.v3.SpanType;
import org.apache.skywalking.oap.server.analyzer.module.AnalyzerModule;

import org.apache.skywalking.oap.server.analyzer.provider.trace.parser.ISegmentParserService;
import org.apache.skywalking.oap.server.analyzer.provider.trace.parser.SpanTags;
import org.apache.skywalking.oap.server.analyzer.provider.trace.parser.listener.vservice.VirtualDatabaseProcessor;

import org.apache.skywalking.oap.server.library.module.ModuleManager;
import org.apache.skywalking.oap.server.starter.config.ApplicationConfigLoader;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.junit.Before;
import org.junit.Test;
import org.openjdk.jmh.annotations.Benchmark;

import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

@State(Scope.Thread)
public class RealSegmentTest {
    static SpanObject spanObject;
    static SegmentObject segmentObject;
    static ISegmentParserService segmentParserService;
   // @Before
   @Setup
   @Before
    public void prepare() {
       ModuleManager moduleManager = new ModuleManager();
       ApplicationConfigLoader configLoader = new ApplicationConfigLoader();
       try {
           moduleManager.init(configLoader.load());
       } catch (Exception e){
           e.printStackTrace();
       }
       spanObject = SpanObject.newBuilder()
                .setSpanLayer(SpanLayer.Database)
                .setSpanId(0)
                .addAllTags(buildTags())
                .setSpanType(SpanType.Exit)
                .setPeerBytes(ByteString.copyFrom("127.0.0.1:3306".getBytes(StandardCharsets.UTF_8)))
                .setStartTime(getTimeInMillis("2022-09-12 14:13:12.790"))
                .setEndTime(getTimeInMillis("2022-09-12 14:13:13.790"))
                .build();
       segmentObject = SegmentObject.newBuilder()
                .setTraceId("trace-id-1")
                 .addSpans(spanObject)
                .build();
       segmentParserService = moduleManager.find(AnalyzerModule.NAME)
               .provider()
               .getService(ISegmentParserService.class);
    }
    @Test
    @Benchmark
    public void test() {
           segmentParserService.send(segmentObject);
    }

    private long getTimeInMillis(String s) {
        return DateTime.parse(s, DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss.SSS")).getMillis();
    }

    private List<KeyStringValuePair> buildTags() {
        return Arrays.asList(
                KeyStringValuePair.newBuilder().setKey(SpanTags.DB_STATEMENT).setValue("select * from dual").build(),
                KeyStringValuePair.newBuilder().setKey(SpanTags.DB_STATEMENT).setValue("select * from dual where a=b").build(),
                KeyStringValuePair.newBuilder().setKey(SpanTags.DB_STATEMENT).setValue("SELECT \n" +
                        "    CUSTOMERNUMBER, \n" +
                        "    CUSTOMERNAME\n" +
                        "FROM\n" +
                        "    CUSTOMERS\n" +
                        "WHERE\n" +
                        "    EXISTS( SELECT \n" +
                        "            ORDERNUMBER, SUM(PRICEEACH * QUANTITYORDERED)\n" +
                        "        FROM\n" +
                        "            ORDERDETAILS\n" +
                        "                INNER JOIN\n" +
                        "            ORDERS USING (ORDERNUMBER)\n" +
                        "        WHERE\n" +
                        "            CUSTOMERNUMBER = CUSTOMERS.CUSTOMERNUMBER\n" +
                        "        GROUP BY ORDERNUMBER\n" +
                        "        HAVING SUM(PRICEEACH * QUANTITYORDERED) > 60000);\n").build()
        );
    }
    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder().include(RealSegmentTest.class.getSimpleName())
                .forks(1)
                .warmupIterations(3)
                .threads(20)
                .syncIterations(false)
                .measurementIterations(5)
                .build();

        new Runner(opt).run();
    }
}
