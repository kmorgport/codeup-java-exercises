public class ControlFlowExercises {
    public static void main(String[] args){
        int i = 5;
        while(i<=15){
            System.out.println("i is "+ i);
            i++;
        }
        for(int j = 100; j>=-10; j-=5){
            System.out.println(j);
        }

        for(int k =1; k<=100; k++){
            if(k%3==0 && k%5==0){
                System.out.println("FizzBuzz");
            }else if(k%3==0){
                System.out.println("Fizz");
            }else if(k%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(k);
            }
        }

    }
}
