package JDBC_sample1;

import java.sql.*;



public class MySQLCon {


    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sample", "root", "MySqlPassword");
            System.out.println("Successfully Established connection");

            PreparedStatement p = null;
            ResultSet rs = null;

            try {

                // SQL command data stored in String datatype
                String sql = "select * from emp";
                p = con.prepareStatement(sql);
                rs = p.executeQuery();

                // Printing ID, name, salary of employees
                // of the SQL command above
                System.out.println("eid\t\tename\t\tsalary");

                // Condition check
                while (rs.next()) {
                    int eid = rs.getInt("eid");
                    String ename = rs.getString("ename");
                    int salary = rs.getInt("salary");
                    System.out.println(eid + "\t\t" + ename
                            + "\t\t" + salary);
                }
            }

            // Catch block to handle exception
            catch (SQLException e) {
                // Print exception pop-up on screen
                System.out.println(e);
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
