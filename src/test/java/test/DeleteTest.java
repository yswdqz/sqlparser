package test;

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
        SQLParserFactory.parse(parser);
    }
    @Test
    public void subquery() {
        String s = "DELETE FROM employees\n" +
                "WHERE salary IN (SELECT salary FROM employees WHERE department = 'IT')\n";
        tools.TestParser parser = SQLParserFactory.getSQLParser("mysql", s);
        SQLParserFactory.parse(parser);
    }
}

