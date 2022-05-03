package main.java.database.sql.crud;

import main.java.database.sql.DBConnection;
import main.java.studentModel.Student;
import main.java.studentModel.eduField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQueries {

  public DeleteQueries() {}


  public void deleteUserByEmail(Student student) {

    if (student.getId() == null) {
      throw new NullPointerException("Parameters must not be empty");
    }

    if (student.getId() == null || student.getId() == null || student.getLastName() == null || student.getEduField() == null) {
      throw new NullPointerException("Parameters must not be empty");
    }
    Connection conn = DBConnection.getDBConnection();

    if(student.getEduField() == eduField.TECHNICAL){

      String studentToDelete = "DELETE FROM techstudents WHERE techstudents.id_techStudent = ?";

      try (PreparedStatement prStmt = conn.prepareStatement(studentToDelete)) {

        prStmt.setInt(1, student.getId());
        prStmt.executeUpdate();

      } catch (SQLException e) {
        System.out.println("Error: "+e.getMessage());
        e.printStackTrace();
      }

    }
    else if(student.getEduField() == eduField.HUMAN){

      String studentToDelete = "DELETE FROM humanstudents WHERE humanstudents.id_humanStudent = ?";

      try (PreparedStatement prStmt = conn.prepareStatement(studentToDelete)) {

        prStmt.setInt(1, student.getId());
        prStmt.executeUpdate();

      } catch (SQLException e) {
        System.out.println("Error: "+e.getMessage());
        e.printStackTrace();
      }

    }
    else if(student.getEduField() == eduField.COMBINED){

      String studentToDelete = "DELETE FROM combinedstudents WHERE combinedstudents.id_combinedStudent = ?";

      try (PreparedStatement prStmt = conn.prepareStatement(studentToDelete)) {

        prStmt.setInt(1, student.getId());
        prStmt.executeUpdate();

      } catch (SQLException e) {
        System.out.println("Error: "+e.getMessage());
        e.printStackTrace();
      }

    }
    else{
      System.out.println("Unknown ");
    }


  }



}


