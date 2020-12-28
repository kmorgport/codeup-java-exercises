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
    public static void main(String[] args){
        int sum = addition(3,2);
        System.out.println(sum);
        int diff = subtraction(5,2);
        System.out.println(diff);
        int prod = multiplication(3,2);
        System.out.println(prod);
        int remain = division(6,2);
        System.out.println(remain);
        int mod = modulus(10,5);
        System.out.println(mod);
        String choice = getInteger(4,12);
        System.out.println(choice);
    }
}