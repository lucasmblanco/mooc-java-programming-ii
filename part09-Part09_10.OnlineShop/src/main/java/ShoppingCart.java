import java.util.*;

public class ShoppingCart {
    private Map<String, Item> shoppingMap;

    public ShoppingCart(){
        this.shoppingMap = new HashMap<>();
    }

    public void add(String product, int price){
        Item newItem = new Item(product, 1, price);
        if(shoppingMap.containsKey(product)) {
            shoppingMap.get(product).increaseQuantity();
        } else {
           shoppingMap.put(product, newItem);
        }

    }
    public int price(){
        int total = 0;
        for(Item item : shoppingMap.values()){
            total += item.price();
        }
        return total;
    }

    public void print(){
        for(String product : shoppingMap.keySet()){
            System.out.println(shoppingMap.get(product).toString());
        }
    }

}

