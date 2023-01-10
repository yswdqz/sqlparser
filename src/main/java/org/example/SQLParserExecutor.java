package org.example;

import lombok.AllArgsConstructor;
import org.antlr.v4.runtime.atn.DecisionInfo;
import org.antlr.v4.runtime.atn.DecisionState;
import org.antlr.v4.runtime.atn.PredictionMode;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import tools.TestParser;

@AllArgsConstructor
public class SQLParserExecutor {
    private String databaseType;
    public String parse(String sql) {
        TestParser parser = SQLParserFactory.getSQLParser(databaseType, sql);

        try {
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
            parser.setBuildParseTree(false);
    //        parser.setProfile(true);
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
  //      profileParser(parser);
        return parser.result.toString();
    }
    public void profileParser(tools.TestParser parser) {
        System.out.printf("%-" + 35 + "s", "rule");
        System.out.printf("%-" + 15 + "s", "time");
        System.out.printf("%-" + 15 + "s", "invocations");
        System.out.printf("%-" + 15 + "s", "lookahead");
        System.out.printf("%-" + 15 + "s", "lookahead(max)");
        System.out.printf("%-" + 15 + "s", "ambiguities");
        System.out.printf("%-" + 15 + "s", "errors");
        System.out.println();

        for (DecisionInfo decisionInfo : parser.getParseInfo().getDecisionInfo()) {
            DecisionState ds = parser.getATN().getDecisionState(decisionInfo.decision);
            String[] ruleNames = parser.getRuleNames();
            String rule = ruleNames[ds.ruleIndex];
            if (decisionInfo.timeInPrediction > 0) {
                System.out.printf("%-" + 35 + "s", rule);
                System.out.printf("%-" + 15 + "s", decisionInfo.timeInPrediction);
                System.out.printf("%-" + 15 + "s", decisionInfo.invocations);
                System.out.printf("%-" + 15 + "s", decisionInfo.SLL_TotalLook);
                System.out.printf("%-" + 15 + "s", decisionInfo.SLL_MaxLook);
                System.out.printf("%-" + 15 + "s", decisionInfo.ambiguities);
                System.out.printf("%-" + 15 + "s", decisionInfo.errors);
                System.out.println();
            }
        }
    }
}
