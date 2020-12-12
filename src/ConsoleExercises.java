import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();

        System.out.println("You entered: -->\""+ integer+"\"<--");

        System.out.print("Enter three words: ");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();
        System.out.println("You entered: "+userInput1+"\n"+userInput2+"\n"+userInput3);

        System.out.print("Enter a sentence: ");
        String userString = scanner.nextLine();
        System.out.println("This is the sentence you wrote: "+ userString);


    }
}
