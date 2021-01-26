import java.util.Scanner;
public class HighLow {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        Scanner string = new Scanner(System.in);
        int range = 100 - 1 +1;
        int count = 0;
        int random = (int)(Math.random()*range)+1;
        System.out.println("Let's start the number game");
        System.out.println("Pick a number between 1 and 100!");
        while(true){
            if(count>=5){
                System.out.println("I'm sorry, you took too many turns. Would you like to play again? Type Yes or No to continue: ");
                String retry = string.nextLine();
                if(retry.toLowerCase().equals("no")){
                    System.out.println("Goodbye");
                    break;
                }else if(retry.toLowerCase().equals("yes")){
                    random = (int)(Math.random()*range)+1;
                    System.out.println("Pick a number between 1 and 100!");
                    count = 0;
                }
            }
            int guess = num.nextInt();
            if(guess == random){
                System.out.println("Excellent! The number is "+random+" and you discovered it in "+count+" turns! Would you like to play again? Enter yes or no.");
                String input = string.nextLine();
                count = 0;
                if(input.toLowerCase().equals("no")){
                    System.out.println("Goodbye");
                    break;
                }else if(input.toLowerCase().equals("yes")){
                    random = (int)(Math.random()*range)+1;
                    System.out.println("Pick a number between 1 and 100!");
                }

            }else if(guess<random){
                System.out.println("Your guess is too low!");
                count ++;
            }else{
                System.out.println("Your guess is too high!");
                count++;
            }
        }

    }
}
