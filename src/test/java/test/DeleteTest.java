package test;

import org.example.CacheProperties;
import org.example.SQLParserFacade;
import org.example.SQLParserFactory;
import org.junit.Test;

public class DeleteTest {
    @Test
    public void multipleTable() {
        String s = "DELETE e, d\n" +
                "FROM employees e\n" +
                "    INNER JOIN departments d\n" +
                "        ON e.department_id = d.department_id\n" +
                "WHERE d.location_id = 2500\n";
        tools.TestParser parser = SQLParserFactory.getSQLParser("mysql", s);
        String result = new SQLParserFacade("mysql", CacheProperties.defaultProperties())
                .parse(s, false);
        System.out.println(result);
    }
    @Test
    public void subquery() {
        String s = "DELETE FROM employees\n" +
                "WHERE salary IN (SELECT salary FROM employees WHERE department = 'IT')\n";
        String result = new SQLParserFacade("mysql", CacheProperties.defaultProperties())
                .parse(s, false);
        System.out.println(result);
    }
}

