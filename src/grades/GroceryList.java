package grades;

import java.util.HashMap;
import java.util.Set;

public class GroceryList {
    protected HashMap<String,Integer> groceries;

    public GroceryList(){
    this.groceries = new HashMap<>();
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
