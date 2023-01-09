package test;

import org.example.SQLParserFactory;
import org.junit.Test;
import tools.TestParser;

public class SelectTest {

    @Test
    public void subquery(){
        String s = "SELECT\n" +
                "    e.employee_id,\n" +
                "    e.last_name,\n" +
                "    e.first_name,\n" +
                "    e.salary,\n" +
                "    d.department_name\n" +
                "FROM\n" +
                "    employees e\n" +
                "    INNER JOIN departments d\n" +
                "        ON e.department_id = d.department_id\n" +
                "WHERE\n" +
                "    e.salary > (SELECT AVG(salary) FROM employees)\n" +
                "    AND e.department_id IN (\n" +
                "        SELECT department_id FROM departments\n" +
                "        WHERE location_id = 2000\n" +
                "    )\n";
        TestParser parser = SQLParserFactory.getSQLParser("mysql", s);
        SQLParserFactory.parse(parser);
    }
    @Test
    public void aggregateFunc() {
        String s = "SELECT\n" +
                "    d.department_name,\n" +
                "    COUNT(e.employee_id) AS num_employees,\n" +
                "    AVG(e.salary) AS avg_salary,\n" +
                "    MAX(e.salary) AS max_salary,\n" +
                "    MIN(e.salary) AS min_salary\n" +
                "FROM\n" +
                "    employees e\n" +
                "    INNER JOIN departments d\n" +
                "        ON e.department_id = d.department_id\n" +
                "GROUP BY\n" +
                "    d.department_name" +
                "LIMIT 10 OFFSET 100";
        TestParser parser = SQLParserFactory.getSQLParser("mysql", s);
        SQLParserFactory.parse(parser);
    }

    @Test
    public void selectWithUnion() {
        String s = "SELECT\n" +
                "    e.employee_id,\n" +
                "    e.last_name,\n" +
                "    e.first_name,\n" +
                "    e.salary,\n" +
                "    d.department_name,\n" +
                "    l.city\n" +
                "FROM\n" +
                "    employees e\n" +
                "    INNER JOIN departments d\n" +
                "        ON e.department_id = d.department_id\n" +
                "    INNER JOIN locations l\n" +
                "        ON d.location_id = l.location_id\n" +
                "UNION\n" +
                "SELECT\n" +
                "    e.employee_id,\n" +
                "    e.last_name,\n" +
                "    e.first_name,\n" +
                "    e.salary,\n" +
                "    d.department_name,\n" +
                "    l.city\n" +
                "FROM\n" +
                "    employees e\n" +
                "    INNER JOIN departments d\n" +
                "        ON e.department_id = d.department_id\n" +
                "    INNER JOIN locations l\n" +
                "        ON d.location_id = l.location_id\n" +
                "WHERE e.salary > 15000\n";
        TestParser parser = SQLParserFactory.getSQLParser("mysql", s);
        SQLParserFactory.parse(parser);
    }

    @Test(expected = RuntimeException.class)
    public void withoutFrom() {
        String s = "SELECT 1";
        TestParser parser = SQLParserFactory.getSQLParser("mysql", s);
        SQLParserFactory.parse(parser);
    }

    @Test(expected = RuntimeException.class)
    public void deepSql() {
        String s = "SELECT * FROM t WHERE a = (SELECT * FROM T2 WHERE SELECT * FROM T3 WHERE A = (SELECT * FROM T4 WHERE A = (SELECT * FROM T5 WHERE A = (SELECT * FROM T6 WHERE A = (SELECT * FROM T7 WHERE A = (SELECT * FROM T8 WHERE A = (SELECT * FROM T9 WHERE A = (SELECT * FROM T10 WHERE A = (SELECT * FROM T11 WHERE A = (SELECT * FROM T12 WHERE A = (SELECT * FROM T13 WHERE A = (SELECT * FROM T14 WHERE A = (SELECT * FROM T15 WHERE A = (SELECT * FROM T16 WHERE A = (SELECT * FROM T17 WHERE A = (SELECT * FROM T18 WHERE A = (SELECT * FROM T19 WHERE A = (SELECT * FROM T20 WHERE A = (SELECT * FROM T21 WHERE A = (SELECT * FROM T22 WHERE A = (SELECT * FROM T23 WHERE A = (SELECT * FROM T24 WHERE A = (SELECT * FROM T25 WHERE A = (SELECT * FROM T26 WHERE A = (SELECT * FROM T27 WHERE A = (SELECT * FROM T28 WHERE A = (SELECT * FROM T29 WHERE A = (SELECT * FROM T30 WHERE A = (SELECT * FROM T31 WHERE A = (SELECT * FROM T32 WHERE A = (SELECT * FROM T33 WHERE A = (SELECT * FROM T34 WHERE A = (SELECT * FROM T35 WHERE A = (SELECT * FROM T36 WHERE A = (SELECT * FROM T37 WHERE A = (SELECT * FROM T38 WHERE A = (SELECT * FROM T39 WHERE A = (SELECT * FROM T40 WHERE A = (SELECT * FROM T41 WHERE A = (SELECT * FROM T42 WHERE A = (SELECT * FROM T43 WHERE A = (SELECT * FROM T44 WHERE A = (SELECT * FROM T45 WHERE A = (SELECT * FROM T46 WHERE A = (SELECT * FROM T47 WHERE A = (SELECT * FROM T48 WHERE A = (SELECT * FROM T49 WHERE A = (SELECT * FROM T50 WHERE A = (SELECT * FROM T51 WHERE A = (SELECT * FROM T52 WHERE A = (SELECT * FROM T53 WHERE A = (SELECT * FROM T54 WHERE A = (SELECT * FROM T55 WHERE A = (SELECT * FROM T56 WHERE A = (SELECT * FROM T57 WHERE A = (SELECT * FROM T58 WHERE A = (SELECT * FROM T59 WHERE A = (SELECT *))";
        TestParser parser = SQLParserFactory.getSQLParser("mysql", s);
        SQLParserFactory.parse(parser);
    }

    @Test (expected = RuntimeException.class)
    public void tooManyLiterals () {
        String s = "SELECT * FROM TEST WHERE A = 1 AND B = 2 AND C = 3 AND D = 4 AND E = 5  AND H = 6";
        TestParser parser = SQLParserFactory.getSQLParser("mysql", s);
        SQLParserFactory.parse(parser);
    }

}
