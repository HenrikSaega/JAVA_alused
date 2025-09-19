package week8;
import java.util.HashMap;
import java.util.Map;

public class Storehouse {
    private Map<String, Integer> storehouse;
    private Map<String, Integer> product;
    private Map<String, Integer> price;
    private Map<String, Integer> stock;

    public Storehouse() {
        storehouse = new HashMap<String, Integer>();
        product = new HashMap<String, Integer>();
        price= new HashMap<String, Integer>();
        stock = new HashMap<String, Integer>();
    }
    public void addProduct(String product, int price, int stock){
         storehouse.put(product, price);
         this.price.put(product, price);
        this.stock.put(product, stock);
    }
    public int price(String product){
        if(storehouse.containsKey(product)){
           return price.getOrDefault(product, -99);
        }
        return -99;
    }
    public int stock(String product){
    return stock.getOrDefault(product, 0);
    }
    public boolean take(String product){
        if(storehouse.containsKey(product)){
            stock.remove(product);
            return true;
        }
        return false;
    }
}
