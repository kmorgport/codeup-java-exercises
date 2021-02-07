package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import util.Input;

public class GroceryList {
    protected HashMap<String,Integer> groceries;

    public static void main(String[] args){
        chooseGrocery();


    }

    public GroceryList(){
    this.groceries = new HashMap<>();
    }

    public static void chooseGrocery(){
        Input input = new Input();
        GroceryList list = new GroceryList();
        System.out.println("Would you like to add an item to the list? ");
        boolean ans = input.yesNo();
        if(ans){
            System.out.println("Select Fruit : Grain : Vegetable : Meat ");
            String foodType = input.getString();
            System.out.println("Pick quantity");
            int quantity = input.getInt();
            list.addToHash(foodType,quantity);
            System.out.println("Would you like to add another item to the list? ");
            ans = input.yesNo();
            while(ans){
                System.out.println("Select Fruit : Grain : Vegetable : Meat ");
                foodType = input.getString();
                System.out.println("Pick quantity");
                quantity = input.getInt();
                list.addToHash(foodType,quantity);
                System.out.println("Would you like to add another item to the list? ");
                ans = input.yesNo();
            }
            for(Map.Entry entry: list.groceries.entrySet()){
                System.out.println("key: " + entry.getKey() + "; value: " + entry.getValue());
            }

        }else{
            System.out.println("Have a good day");
        }

    }

    public Set findKeys(){
        return this.groceries.keySet();
    }

    public int findAmount(String food){
        return this.groceries.get(food);
    }

    public void addToHash(String food, int amount){
        this.groceries.put(food,amount);
    }
}
