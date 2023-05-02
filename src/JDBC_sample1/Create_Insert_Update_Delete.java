package JDBC_sample1;

import java.sql.*;
import java.util.*;

public class Create_Insert_Update_Delete {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sample", "root", "MySqlPassword");
            System.out.println("Successfully Established connection");

            // Creating table and inserting values manually
//            String [] command_arr = {"CREATE TABLE STUDENT (id INTEGER, name VARCHAR(255), rollno VARCHAR(255))" , " INSERT INTO STUDENT VALUES (1, 'Aaditya', '7'), (2, 'Chirag', '4'), (1, 'Pranav', '9')"};

            // Inserting values dynamically

//            Scanner sc = new Scanner(System.in);
//
//            for(int i = 0; i< 3; i++){
//                input_arr[i] = sc.next();
//            }
//            String command = String.format("INSERT INTO STUDENT VALUES (%s, '%s', '%s')", input_arr[0], input_arr[1], input_arr[2]);
//            System.out.println(command);
//            String[] command_arr = {command};

            // Updating value in table
//            String [] command_arr = {"update student set id = 'Kumar' where id = 2"};

            // Delete values from table
//            String[] command_arr = {"delete from student where name = NULL"};


            // Print values in table
//            PreparedStatement p = null;
//            ResultSet rs = null;
//
//            String sql = "select * from emp";
//            p = con.prepareStatement(sql);
//            rs = p.executeQuery();
//
////            To print all the rows
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                int rollno = rs.getInt("roono");
//                System.out.println(id + "\t\t" + name
//                        + "\t\t" + rollno);
//            }
//            try {
//
//                // To execute commands/ queries
////                Statement stmt = con.createStatement();
////
////                for (String e : command_arr) {
////                    stmt.execute(e);
////                }
////
//            }

//            // Catch block to handle exception
//            catch (SQLException e) {
//                // Print exception pop-up on screen
//                System.out.println(e);
//            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
