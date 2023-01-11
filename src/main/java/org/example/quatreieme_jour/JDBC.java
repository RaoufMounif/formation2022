package org.example.quatreieme_jour;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    public static void main(String[] args) throws SQLException {
        var conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/tp","root","");
        //avec les values explicite
       /* var stm = conn.createStatement();
        stm.executeUpdate("insert into person (firstName, lastName) values ('oufi' , 'foufi')");
        conn.close();*/
        //avec les values sont des variables
        var stm = conn.prepareStatement("insert into person (firstName, lastName) values (? , ?)");
        stm.setString(1,"fifa");
        stm.setString(2,"world cup");

        stm.execute();


        conn.close();
    }
}
