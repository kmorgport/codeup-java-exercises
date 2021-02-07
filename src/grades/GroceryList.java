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
        HashMap<String, GroceryList> list = new HashMap<>();
        GroceryList fruits = new GroceryList();
        GroceryList grains = new GroceryList();
        GroceryList veggies = new GroceryList();
        GroceryList meats = new GroceryList();
        list.put("Fruit", fruits);
        list.put("Grains", grains);
        list.put("Vegetables", veggies);
        list.put("Meat", meats);
        System.out.println("Would you like to add an item to the list? ");
        boolean ans = input.yesNo();
        if(ans){
            while(ans) {
                System.out.println("Select Fruit : Grain : Vegetable : Meat ");
                String foodType = input.getString();
                switch (foodType.toLowerCase()) {
                    case "fruit":
                        System.out.println("Select a fruit type to add: ");
                        foodType = input.getString();
                        System.out.println("Pick quantity");
                        int quantity = input.getInt();
                        fruits.addToHash(foodType, quantity);
                        break;
                    case "grain":
                        System.out.println("Select a grain to add: ");
                        foodType = input.getString();
                        System.out.println("Pick quantity");
                        quantity = input.getInt();
                        grains.addToHash(foodType, quantity);
                        break;
                    case "vegetable":
                        System.out.println("Select a vegetable to add: ");
                        foodType = input.getString();
                        System.out.println("Pick quantity");
                        quantity = input.getInt();
                        veggies.addToHash(foodType, quantity);
                        break;
                    case "meat":
                        System.out.println("Select a meat or meat substitute type to add: ");
                        foodType = input.getString();
                        System.out.println("Pick quantity");
                        quantity = input.getInt();
                        meats.addToHash(foodType, quantity);
                        break;
                }
                System.out.println("Would you like to add another item to the list? ");
                ans = input.yesNo();
            }
        printGroceryList(list);

        }else{
            System.out.println("Have a good day");
        }

    }

    public static void printGroceryList(HashMap<String,GroceryList>list){
        for(Map.Entry<String,GroceryList>entry:list.entrySet()){
            String category = entry.getKey();
            GroceryList content = entry.getValue();
            for(Object thing: content.findKeys()){
                String food = (String) thing;
                System.out.println(thing);
                System.out.println(content.findAmount(food));
            }
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
