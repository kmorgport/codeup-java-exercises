package grades;

import util.Input;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList <Double> grades;

    public static void main(String[] args){
        Input test = new Input();
        System.out.println("test with integer");
        test.getDouble();
//        Student kole = new Student("Kole");
//        kole.getName();
//        kole.addGrade(3.2);
//        kole.addGrade(4.2);
//        kole.addGrade(5.6);
//        kole.getGrades();
//        kole.getGradeAverage();


    }

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(double grade){
        this.grades.add(grade);
    }

    public ArrayList<Double> getGrades(){
        return this.grades;
    }

    public double getGradeAverage(){
        double gradeTotal = 0;
        for(Double grade: grades){
            gradeTotal += grade;
        }
        double a = gradeTotal / grades.size();
        return Math.round(a * 100.0) / 100.0;
    }
}
