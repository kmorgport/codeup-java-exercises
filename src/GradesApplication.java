import grades.Student;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args){
        HashMap <String, Student> studentAndGrades = new HashMap<>();
        Student kole = new Student("Kole");
        Student johnny = new Student("Johnny");
        Student jacob = new Student("Jacob");
        Student dan = new Student("Dan");
        kole.addGrade(3.8);
        kole.addGrade(4.0);
        kole.addGrade(4.3);
        johnny.addGrade(4.0);
        johnny.addGrade(3.6);
        johnny.addGrade(4.4);
        jacob.addGrade(4.7);
        jacob.addGrade(4.0);
        jacob.addGrade(3.9);
        dan.addGrade(3.9);
        dan.addGrade(4.1);
        dan.addGrade(4.3);
        studentAndGrades.put("kmorgport",kole);
        studentAndGrades.put("daniel-benzion",dan);
        studentAndGrades.put("JacobGonzalez0",jacob);
        studentAndGrades.put("JohnnyLF",johnny);

    }
}
