import java.util.Scanner;
public class MethodsExercises {
    public static int addition(int a, int b){
        return a+b;
    }
    public static int subtraction(int a, int b){
        return a-b;
    }
    public static int multiplication(int a, int b){
        if(a<b){
            return multiplication(b,a);
        }else if(b!= 0){
          return(a+multiplication(a, b-1));
        }else{
            return 0;
        }
    }
    public static int division(int a, int b){
        return a/b;
    }
    public static int modulus(int a, int b){
        return a%b;
    }
    public static String getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between " +min+" and "+max+": ");
        int input = sc.nextInt();
        while(input<min|| input>max){
            sc = new Scanner(System.in);
            System.out.println("Enter a number between " +min+" and "+max+": ");
            input = sc.nextInt();
        }
        String message = "You chose the number "+input+". That is a number between "+min+" and "+max+".";
       return message;
    }
    public static String factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please pick a number between 1 and 10");
        int input = sc.nextInt();
        while(input<1||input>10){
            sc = new Scanner(System.in);
            System.out.println("Please pick a number between 1 and 10");
            input = sc.nextInt();
        }
        long fact = 1;
        for(int i = 1; i<=input; i++){
            fact = fact *i;
        }
        return "The factorial of !"+input+" is "+fact+".";
    }

    public static void dice(){
        System.out.println("What sided dice would you like to use?(Must be a minimum of six sides) ");
        Scanner sc = new Scanner(System.in);
            int diceSides = sc.nextInt();
            int min = 1;
            int range = diceSides-min+1;
            int dice1 = (int)(Math.random()*range)+min;
            int dice2 = (int)(Math.random()*range)+min;
            System.out.println("You rolled a "+dice1+" and a "+dice2+".");
            System.out.println("Would you like to play again? Enter yes or no: ");
            while(true) {
                String response = sc.nextLine();
                if (response.toLowerCase().equals("no")) {
                    System.out.println("thank you for playing");
                    break;
                }else if(response.toLowerCase().equals("yes")){
                    System.out.println("What sided dice would you like to use?(Must be a minimum of six sides) ");
                    diceSides = sc.nextInt();
                    min = 1;
                    range = diceSides-min+1;
                    dice1 = (int)(Math.random()*range)+min;
                    dice2 = (int)(Math.random()*range)+min;
                    System.out.println("You rolled a "+dice1+" and a "+dice2+".");
                    System.out.println("Would you like to play again? Enter yes or no: ");
                }
            }
    }
    public static void main(String[] args){
//        int sum = addition(3,2);
//        System.out.println(sum);
//        int diff = subtraction(5,2);
//        System.out.println(diff);
//        int prod = multiplication(3,2);
//        System.out.println(prod);
//        int remain = division(6,2);
//        System.out.println(remain);
//        int mod = modulus(10,5);
//        System.out.println(mod);
//        String choice = getInteger(4,12);
//        System.out.println(choice);
//        String factor = factorial();
//        System.out.println(factor);
        MethodsExercises.dice();
    }
}