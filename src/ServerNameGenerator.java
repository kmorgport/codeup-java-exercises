
import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args){
        String randomWord1 = randomElem(adjectives);
        String randomWord2 = randomElem(nouns);
        System.out.println(randomWord1+"-"+randomWord2);
    }
    private static String[] adjectives = {"sleepy","bashful","sneezy","grumpy","happy","dopey","sleazy","cranky","funny","sassy"};
    private static String[] nouns = {"quartz","ruby","pearl","garnet","amethyst","lapis","peridot","bismuth","sapphire","diamond"};

    public static String randomElem(String[] arr){
        Random randomizer = new Random();
        int randInt = randomizer.nextInt(arr.length);
        return arr[randInt];
    }
}
