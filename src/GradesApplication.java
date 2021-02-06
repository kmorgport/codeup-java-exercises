import grades.Student;
import util.Input;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, Student> studentAndGrades = new HashMap<>();
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
        studentAndGrades.put("kmorgport", kole);
        studentAndGrades.put("daniel-benzion", dan);
        studentAndGrades.put("jacobGonzalez0", jacob);
        studentAndGrades.put("johnnyLF", johnny);

        System.out.println("Welcome!");
        System.out.println(" ");
        System.out.println("Here are the GitHub usernames of our students!");
        System.out.println(" ");
        System.out.println(studentAndGrades.keySet());
//        for (String student : studentAndGrades.keySet()) {
//            System.out.print("|" + student + "| ");
//        }
//        System.out.println(" ");
//        questionLoop(studentAndGrades);
//        System.out.println("What student would you like to see more information on?");
//        String answer = input.nextLine();
//        if(studentAndGrades.containsKey(answer)) {
//            System.out.println("Name: " + studentAndGrades.get(answer).getName() + " - Github Username: " + answer);
//            System.out.println("Current Average: " + studentAndGrades.get(answer).getGradeAverage());
//        }else if(!studentAndGrades.containsKey(answer)) {
//            while (!studentAndGrades.containsKey(answer)) {
//                System.out.println("Sorry, no student found with the GitHub username of " + answer + ".");
//                System.out.println(" ");
//                System.out.println("Would you like to see another student? y/n: ");
//                answer = input.nextLine();
//                if (answer.equals("n") | answer.equals("No")) {
//                    System.out.println("Goodbye, and have a wonderful day!");
//                    break;
//                } else if (answer.equals("y")) {
//                    System.out.println("What student would you like to see more information on?");
//                    answer = input.nextLine();
//                    System.out.println("Name: " + studentAndGrades.get(answer).getName() + " - Github Username: " + answer);
//                    System.out.println("Current Average: " + studentAndGrades.get(answer).getGradeAverage());
//                    System.out.println("Would you like to see another student? y/n: ");
//                    answer = input.nextLine();
//                }
//            }
//        }
//    }
    }
    public static void questionLoop(HashMap<String,Student>map) {
        System.out.println("What student would you like to see more information on?");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        if (map.containsKey(answer)) {
            System.out.println("Name: " + map.get(answer).getName() + " - Github Username: " + answer);
            System.out.println("Current Average: " + map.get(answer).getGradeAverage());
            System.out.println("Would you like to see another student? y/n: ");
            answer = input.nextLine();
            if (answer.equals("y")) {
                questionLoop(map);
            }else if (answer.equals("n") | answer.equals("No")) {
                System.out.println("Goodbye, and have a wonderful day!");
            }
        } else if(!map.containsKey(answer)){
            while (!map.containsKey(answer)) {
                System.out.println("Sorry, no student found with the GitHub username of " + answer + ".");
                System.out.println(" ");
                System.out.println("Would you like to see another student? y/n: ");
                answer = input.nextLine();
                if (answer.equals("n") | answer.equals("No")) {
                    System.out.println("Goodbye, and have a wonderful day!");
                    break;
                } else if (answer.equals("y")) {
                    System.out.println("What student would you like to see more information on?");
                    answer = input.nextLine();
                    if(!map.containsKey(answer)){
                        System.out.println("That student is not in our database.");
                        questionLoop(map);
                    }
                    System.out.println("Name: " + map.get(answer).getName() + " - Github Username: " + answer);
                    System.out.println("Current Average: " + map.get(answer).getGradeAverage());
                    System.out.println("Would you like to see another student? y/n: ");
                    answer = input.nextLine();
                    if (answer.equals("y")) {
                        questionLoop(map);
                    }else{
                        System.out.println("Goodbye, and have a wonderful day!");
                    }
                }
            }
        }
    }
}
