package main.java.studentModel.ImplementedStudents;

import main.java.studentModel.AbstractStudent;
import main.java.studentModel.Grade;
import main.java.studentModel.eduField;
import main.java.studentModel.eduFieldInterfaces.HUM;
import main.java.studentModel.eduFieldInterfaces.Zodiac;

import java.util.List;

public class humStudent extends AbstractStudent implements HUM {

    private Zodiac zodiacSign;

    public humStudent(Integer id, eduField education_field,List<Grade> gradeL) {
        super(id, education_field,gradeL);
    }

    public Zodiac getZodiac() {
        return zodiacSign;
    }

    public void setZodiac(Zodiac zodiacSign) {
        this.zodiacSign = zodiacSign;
    }

    @Override
    public String printStudent(){

        return "Student ID: "+getId()+
                "\nFirst Name: "+getFirstName()+
                "\nLast name: "+getLastName()+
                "\nEducation field: "+getEduField().toString()+
                "\nGrades: "+getGrades()+
                "\nZodiac: "+getZodiac();


    }
}
