package main.java.studentModel;

import java.util.HashMap;
import java.util.List;

public interface Student {

    Integer getId();

    String getLastName();

    String getFirstName();

    eduField getEduField();

    List<Integer> getGrades();

    void setFirstName(String firstName);

    void setLastName(String lastName);

    void addGrade(Grade grade);

    HashMap<String,Float> gradeAVG();

    String printStudent();


}
