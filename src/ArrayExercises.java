import java.util.Arrays;

public class ArrayExercises {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        Person adam = new Person("Adam");
        Person eve = new Person("Eve");
        Person lillith = new Person("Lillith");
        people[0] = adam;
        people[1] = eve;
        people[2] = lillith;

        for(Person human: people){
            System.out.println(human.getName());
        }
        Person steve = new Person("Steve");
        Person [] people2 = addPerson(people,steve);
        for(Person human: people2){
            System.out.println(human.getName());
        }

    }

    public static Person[] addPerson(Person[] perp, Person human){
        Person[] morePeople = new Person[perp.length+1];
        for(int i =0; i<perp.length; i++){
            morePeople[i] = perp[i];
        }
        morePeople[morePeople.length-1]= human;
        return morePeople;
    }
}
