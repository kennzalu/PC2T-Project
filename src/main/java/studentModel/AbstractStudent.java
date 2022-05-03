package main.java.studentModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AbstractStudent implements Student, Serializable, Comparable<Student> {

    private Integer id;
    private String firstName;
    private String lastName;
    private eduField education_field;
    private final List<Grade> gradeList = new ArrayList<>();

    public AbstractStudent() {}

    public AbstractStudent(Integer id, eduField educationField, List<Grade> gradeL) {

        this.id = id;
        this.education_field = educationField;
        this.gradeList.addAll(gradeL);

    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public eduField getEduField() {
        return education_field;
    }

    public List<Integer> getGrades() {

        List<Integer> grades = new ArrayList<>();

        for (var val:gradeList) {
            grades.add(val.getGrade());
        }
        return grades;
    }

    public String printStudent(){

        return "Student ID: "+getId()+
                "\nFirst Name: "+getFirstName()+
                "\nLast name: "+getLastName()+
                "\nEducation field: "+getEduField().toString()+
                "\nGrades:"+getGrades();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addGrade(Grade grade) {
        gradeList.add(grade);
    }

    public HashMap<String,Float> gradeAVG(){

        HashMap<String, Float> averageComponents = new HashMap<>();

        float gradeSUM=0;
        float gradeCOUNT=0;

        var gradeList = getGrades();

        for (var val: gradeList) {

            gradeSUM = gradeSUM + val;
            gradeCOUNT++;
        }

        averageComponents.put("gradeSUM",gradeSUM);
        averageComponents.put("gradeCOUNT",gradeCOUNT);

        return averageComponents;

    }

    public void setEducationField(eduField educationField) {
        this.education_field = educationField;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Override
    public int compareTo(Student o) {
        return this.lastName.compareTo(o.getLastName());
    }



}
