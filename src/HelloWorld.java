import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args){
//        System.out.println("Hello World!");
//        System.out.print("Hello ");
//        System.out.println("World!");
//        int favNum = 37;
//        System.out.println(favNum);
//        String myString = "This is my string.";
//        System.out.println(myString);
//        double myNumber = 3.14;
//        System.out.println(myNumber);
//
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);
//
//        x = 4;
//        x+= 5;
//
//        x=3;
//        int y = 4;
//        y*= x;
//        System.out.println(y);

        String name = "codeup";
        System.out.printf("Hello there, %s. Nice to see you.\n",name);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput =  scanner.next();

        System.out.println("You entered: -->\""+ userInput+"\"<--");






    }
}
