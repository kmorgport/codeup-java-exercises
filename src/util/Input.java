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
        String answer = this.scanner.nextLine();
        return(answer.toLowerCase().equals("y")||answer.toLowerCase().equals("yes"));
    }

    public int getInt(){
        System.out.println("Enter an integer");
        return scanner.nextInt();
    }

    public int getInt(int min, int max){
        while(true){
            System.out.println("Enter an integer between "+min+" and "+max+".");
            int answer = this.scanner.nextInt();
            if(answer>= min && answer<= max)
                return answer;
        }
    }

    public double getDouble(){
        System.out.println("Enter a double: ");
        return scanner.nextDouble();
    }

}