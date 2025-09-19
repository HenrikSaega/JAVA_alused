package week8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase>  ShoppingBasket;

    public ShoppingBasket() {
        ShoppingBasket = new HashMap<>();
    }
    public void add(String product, int unitPrice){
       if(ShoppingBasket.containsKey(product)){
            ShoppingBasket.get(product).increaseAmount();
       } else{
           ShoppingBasket.put(product, new Purchase(product, 1, unitPrice));
       }
    }
    public int price(){
        int total = 0;
        for(Purchase p : ShoppingBasket.values()){
            total += p.price();
        }
        return total;
    }

    public  void print() {
        for(Purchase purchase : ShoppingBasket.values()){
            System.out.println(purchase.toString());
        }
    }
}
