package week8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase>  shoppingBasket;

    public ShoppingBasket() {
        shoppingBasket = new HashMap<>();
    }
    public void add(String product, int unitPrice){
       if(shoppingBasket.containsKey(product)){
            shoppingBasket.get(product).increaseAmount();
       } else{
            shoppingBasket.put(product, new Purchase(product, 1, unitPrice));
       }
    }
    public int price(){
        int total = 0;
        for(Purchase p : shoppingBasket.values()){
            total += p.price();
        }
        return total;
    }

    public  void print() {
        for(Purchase purchase : shoppingBasket.values()){
            System.out.println(purchase.toString());
        }
    }
}
