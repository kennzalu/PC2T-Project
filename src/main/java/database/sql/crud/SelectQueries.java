package main.java.database.sql.crud;

import main.java.database.sql.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class SelectQueries {

  public SelectQueries() {}


  public void printStudents() {

    Connection conn = DBConnection.getDBConnection();

    try (PreparedStatement prStmt = conn.prepareStatement("SELECT * FROM techStudents");
         ResultSet rs = prStmt.executeQuery()) {
      while (rs.next()) {
        System.out.println(rs.getString("id_techStudent") + ": " + rs.getString("firstName_techStudent"));
        System.out.println();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }


    try (PreparedStatement prStmt = conn.prepareStatement("SELECT * FROM humanStudents");
         ResultSet rs = prStmt.executeQuery()) {
      while (rs.next()) {
        System.out.println(rs.getString("id_humanStudent") + ": " + rs.getString("firstName_humanStudent"));
        System.out.println();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }


    try (PreparedStatement prStmt = conn.prepareStatement("SELECT * FROM combinedStudents");
         ResultSet rs = prStmt.executeQuery()) {
      while (rs.next()) {
        System.out.println(rs.getString("id_combinedStudent") + ": " + rs.getString("firstName_combinedStudent"));
        System.out.println();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }






  }

}

