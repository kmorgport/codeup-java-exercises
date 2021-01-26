import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to say to Bob? Type n to end the conversation: ");
        while(true){
            String response = scanner.nextLine();
            if(response.equals("n")){
                System.out.println("hmmph");
                break;
            }else if (response.endsWith("?")) {
                System.out.println("Sure");
            } else if (response.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (response.isEmpty()) {
                System.out.println("Fine, be that way!");
            }else{
                System.out.println("Whatever");
            }
        }
            }
        }
