import java.util.*;

public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> balances;

    public Warehouse(){
        this.prices = new HashMap<>();
        this.balances = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock){
        prices.put(product, price);
        balances.put(product, stock);
    }

    public int price(String product){
        return prices.getOrDefault(product, -99);
    }

    public int stock(String product){
        return balances.getOrDefault(product, 0);
    }

    public boolean take(String product){
        if (this.stock(product) > 0) {
            balances.put(product, balances.get(product) - 1);
            return true;
        }
        return false;
    }
    public Set<String> products(){
        return balances.keySet();
    }
}
