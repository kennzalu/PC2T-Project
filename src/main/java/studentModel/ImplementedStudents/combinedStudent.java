package main.java.studentModel.ImplementedStudents;

import main.java.studentModel.*;
import main.java.studentModel.eduFieldInterfaces.*;

import java.util.List;


public class combinedStudent extends AbstractStudent implements HUM, TECH {

    private final humStudent humanStudent;
    private final techStudent technicalStudent;

    public combinedStudent(Integer id, eduField education_field, List<Grade> gradeL) {
        super(id, education_field,gradeL);
        this.humanStudent = new humStudent(id, education_field,gradeL);
        this.technicalStudent = new techStudent(id, education_field,gradeL);
    }

    public Boolean isLeap() {
        return technicalStudent.isLeap();
    }

    public void setLeap(Boolean leapYear) {
        this.technicalStudent.setLeap(leapYear);
    }

    public Zodiac getZodiac() {
        return this.humanStudent.getZodiac();
    }

    public void setZodiac(Zodiac zodiacSign) {
        this.humanStudent.setZodiac(zodiacSign);
    }

    @Override
    public String printStudent(){

        return "Student ID: "+getId()+
                "\nFirst Name: "+getFirstName()+
                "\nLast name: "+getLastName()+
                "\nEducation field: "+getEduField().toString()+
                "\nGrades: "+getGrades()+
                "\nZodiac: "+getZodiac()+
                "\nLeap year: "+isLeap();


    }


}
