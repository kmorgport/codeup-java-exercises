package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList <Double> grades;

    public static void main(String[] args){
        Student kole = new Student("Kole");
        kole.getName();
        kole.addGrade(3.2);
        kole.addGrade(4.2);
        kole.addGrade(5.6);
        kole.getGrades();
        kole.getGradeAverage();


    }

    Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void getName(){
        System.out.println(this.name);
    }

    public void addGrade(double grade){
        this.grades.add(grade);
    }

    public void getGrades(){
        System.out.println(this.grades);
    }

    public void getGradeAverage(){
        double gradeTotal = 0;
        for(Double grade: grades){
            gradeTotal += grade;
        }
        double a = gradeTotal / grades.size();
        System.out.println(Math.round(a * 100.0) / 100.0);
    }
}
