package test;

import org.example.CacheProperties;
import org.example.SQLParserFacade;
import org.example.SQLParserFactory;
import org.junit.Test;

public class InsertTest {
    @Test
    public void insert() {
        String s = "INSERT INTO employees (employee_id, last_name, first_name, email, phone_number, hire_date, job_id, salary, commission_pct, manager_id, department_id)\n" +
                "VALUES (100, 'King', 'Steven', 'SKING', '515.123.4567', '2003-06-17', 'AD_PRES', 24000, NULL, NULL, 90)";
        String result = new SQLParserFacade("mysql", CacheProperties.defaultProperties())
                .parse(s, false);
        System.out.println(result);
    }

    @Test
    public void multipleTable() {
        String s = "INSERT INTO departments (department_id, department_name, location_id)\n" +
                "SELECT department_id, department_name, location_id FROM tmp_departments\n" +
                "WHERE department_id NOT IN (SELECT department_id FROM departments)\n";
        String result = new SQLParserFacade("mysql", CacheProperties.defaultProperties())
                .parse(s, false);
        System.out.println(result);
    }
}
