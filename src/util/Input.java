package util;

import java.util.Scanner;

public class Input {
    protected Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        System.out.println("Enter a string:");
        return scanner.nextLine();
    }

    public boolean yesNo(){
        System.out.println("Enter yes or no");
        String answer = scanner.nextLine();
        return answer.toLowerCase().equals("yes") || answer.toLowerCase().equals("y");
    }

    public int getInt(){
        System.out.println("Enter an integer");
        return scanner.nextInt();
    }

    public double getDouble(){
        System.out.println("Enter a double: ");
        return scanner.nextDouble();
    }

}