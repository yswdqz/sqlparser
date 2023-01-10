package test;

import org.example.CacheProperties;
import org.example.SQLParserFacade;
import org.example.SQLParserFactory;
import org.junit.Test;

public class UpdateTest {
    @Test
    public void multipleTable() {
        String s = "UPDATE employees e\n" +
                "    INNER JOIN departments d\n" +
                "        ON e.department_id = d.department_id\n" +
                "SET e.salary = e.salary * 1.1\n" +
                "WHERE d.location_id = 2500\n";
        String result = new SQLParserFacade("mysql", CacheProperties.defaultProperties())
                .parse(s, false);
        System.out.println(result);
    }
    @Test
    public void subquery() {
        String s = "UPDATE employees\n" +
                "SET salary = salary * 1.1\n" +
                "WHERE salary IN (SELECT salary FROM employees WHERE department = 'IT');\n";
        String result = new SQLParserFacade("mysql", CacheProperties.defaultProperties())
                .parse(s, false);
        System.out.println(result);
    }
}
