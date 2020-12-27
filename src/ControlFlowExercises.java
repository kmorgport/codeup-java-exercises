import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args){
//        int i = 5;
//        while(i<=15){
//            System.out.println("i is "+ i);
//            i++;
//        }
//        for(int j = 100; j>=-10; j-=5){
//            System.out.println(j);
//        }

        long a = 2; do{
            System.out.println(a);
            a = a*a;
        }while(a<1000000);

//        for(int k =1; k<=100; k++){
//            if(k%3==0 && k%5==0){
//                System.out.println("FizzBuzz");
//            }else if(k%3==0){
//                System.out.println("Fizz");
//            }else if(k%5==0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(k);
//            }
//        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("What number would you like to go up to? ");
        int integer = scanner.nextInt();
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for(int z=1; z<=integer; z++){
            System.out.format("%1s%10d%10s%n", z, z*z, z*z*z);
        }
        boolean gradestatus = true;
        while(gradestatus) {
            System.out.print("What is your number grade? ");
            int grade = scanner.nextInt();
            if (grade <= 100 && grade >= 88) {
                System.out.println("Your grade is an A");
            } else if (grade <= 87 && grade >= 80) {
                System.out.println("Your grade is a B");
            } else if (grade <= 79 && grade >= 67) {
                System.out.println("Your grade is a C");
            } else if (grade <= 66 && grade >= 60) {
                System.out.println("Your grade is a D");
            } else if (grade <= 65 && grade >= 0) {
                System.out.println("We're sorry, this is a failing grade.");
            }
            System.out.print("Would you like to continue? y/n ");
            String userInput = scanner.next();
            gradestatus = userInput.equals("y");
    }}
}
