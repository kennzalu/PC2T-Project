package main.java.database.sql.crud;


import main.java.database.sql.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLrunner {

    public SQLrunner() {}


    public void runSQL() {

        Connection conn = DBConnection.getDBConnection();


        String two ="CREATE TABLE `combinedstudents` (  `id_combinedStudent` int(4) NOT NULL,  `firstName_combinedStudent` varchar(6) NOT NULL,  `lastnameName_combinedStudent` varchar(12) NOT NULL,  `isLeap_combinedStudent` tinyint(1) NOT NULL,  `zodiac_combinedStudent` varchar(10) NOT NULL)";
        String three = "CREATE TABLE `humanstudents` (  `id_humanStudent` int(4) NOT NULL,  `firstName_humanStudent` varchar(6) NOT NULL,  `lastnameName_humanStudent` varchar(12) NOT NULL,  `zodiac_humanStudent` varchar(10) NOT NULL)";
        String four = "CREATE TABLE `techstudents` (  `id_techStudent` int(4) NOT NULL,  `firstName_techStudent` varchar(6) NOT NULL,  `lastnameName_techStudent` varchar(12) NOT NULL,  `isLeap_techStudent` tinyint(1) NOT NULL)";
        String five = "CREATE TABLE `znamky` (  `id_Student` int(4) NOT NULL,  `grade` int(1) NOT NULL)";




        try (PreparedStatement prStmt = conn.prepareStatement(two);) {
            int rowsUpdated = prStmt.executeUpdate();
            System.out.println(rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try (PreparedStatement prStmt = conn.prepareStatement(three);) {
            int rowsUpdated = prStmt.executeUpdate();
            System.out.println(rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try (PreparedStatement prStmt = conn.prepareStatement(four);) {
            int rowsUpdated = prStmt.executeUpdate();
            System.out.println(rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try (PreparedStatement prStmt = conn.prepareStatement(five);) {
            int rowsUpdated = prStmt.executeUpdate();
            System.out.println(rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


}



