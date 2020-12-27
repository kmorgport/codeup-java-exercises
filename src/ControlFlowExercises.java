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

    }
}
