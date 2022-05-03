package main.java.database.sql.crud;

import main.java.database.sql.DBConnection;
import main.java.studentModel.ImplementedStudents.combinedStudent;
import main.java.studentModel.ImplementedStudents.humStudent;
import main.java.studentModel.ImplementedStudents.techStudent;
import main.java.studentModel.Student;
import main.java.studentModel.eduField;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertQueries {

  public InsertQueries() {}

  public void insertNewUser(Student student) {

    if (student.getId() == null || student.getId() == null || student.getLastName() == null || student.getEduField() == null) {
      throw new NullPointerException("Parameters must not be empty");
    }
    Connection conn = DBConnection.getDBConnection();

    if(student.getEduField() == eduField.TECHNICAL){

      String insertUser = "INSERT INTO techstudents " + "(id_techStudent,firstName_techStudent,lastnameName_techStudent,isLeap_techStudent)" + "VALUES(?,?,?,?)";

      try (PreparedStatement prStmt = conn.prepareStatement(insertUser)) {

        prStmt.setInt(1, student.getId());
        prStmt.setString(2, student.getFirstName());
        prStmt.setString(3, student.getLastName());
        prStmt.setBoolean(4, ((techStudent) student).isLeap());

        prStmt.executeUpdate();


      } catch (SQLException e) {
        System.out.println("Error: "+e.getMessage());
        e.printStackTrace();
      }

    }
    else if(student.getEduField() == eduField.HUMAN){

      String insertUser = "INSERT INTO humanstudents " + "(id_humanStudent,firstName_humanStudent,lastnameName_humanStudent,zodiac_humanStudent)" + "VALUES(?,?,?,?)";

      try (PreparedStatement prStmt = conn.prepareStatement(insertUser)) {

        prStmt.setInt(1, student.getId());
        prStmt.setString(2, student.getFirstName());
        prStmt.setString(3, student.getLastName());
        prStmt.setString(4, ((humStudent) student).getZodiac().toString());

        prStmt.executeUpdate();


      } catch (SQLException e) {
        System.out.println("Error: "+e.getMessage());
        e.printStackTrace();
      }

    }
    else if(student.getEduField() == eduField.COMBINED){

      String insertUser = "INSERT INTO combinedstudents " + "(id_combinedStudent,firstName_combinedStudent,lastnameName_combinedStudent,zodiac_combinedStudent,isLeap_combinedStudent)" + "VALUES(?,?,?,?,?)";

      try (PreparedStatement prStmt = conn.prepareStatement(insertUser)) {

        prStmt.setInt(1, student.getId());
        prStmt.setString(2, student.getFirstName());
        prStmt.setString(3, student.getLastName());
        prStmt.setBoolean(4, ((combinedStudent) student).isLeap());
        prStmt.setString(5, ((combinedStudent) student).getZodiac().toString());

        prStmt.executeUpdate();


      } catch (SQLException e) {
        System.out.println("Error: "+e.getMessage());
        e.printStackTrace();
      }

    }
    else{
      System.out.println("Unknown education field");
    }

  }

  public void insertStudentGrade(Student student){

    List<Integer> grades = student.getGrades();

    if(student.getGrades().isEmpty()){

      throw new NullPointerException("Parameters must not be empty");

    }

    Connection conn = DBConnection.getDBConnection();


    for(var grade : grades){

      String insertGrade = "INSERT INTO znamky " + "(id_Student,grade)" + "VALUES(?,?)";
      try (PreparedStatement prStmt = conn.prepareStatement(insertGrade)) {

        prStmt.setInt(1, student.getId());
        prStmt.setInt(2, grade);
        prStmt.executeUpdate();


      } catch (SQLException e) {
        System.out.println("Error: "+e.getMessage());
        e.printStackTrace();
      }


    }



  }







}
