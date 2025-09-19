package week8;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    private Storehouse store;
    private Scanner reader;

    public Shop(Storehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }

    // the method to deal with a customer in the shop
    public void manage(String customer) {
        ShoppingBasket basket = new ShoppingBasket();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("below is our sale offer:");

        for (String product : store.products()) {
            System.out.println( product );
        }

        while (true) {
            System.out.print("what do you want to buy (press enter to pay):");
            String product = reader.nextLine();
            if (product.isEmpty()) {
                break;
            }
            if(product.equals("coffee")){
                if(store.stock("coffee") > 0){
                    basket.add("coffee", store.price("coffee"));
                    store.take("coffee");
                }else {
                    System.out.println("Sorry, product not available.");
                }
            } else if(product.equals("milk")){
                if(store.stock("milk") > 0){
                    basket.add("milk", store.price("milk"));
                    store.take("milk");
                }else {
                    System.out.println("Sorry, product not available.");
                }
            }
            else if(product.equals("milkbutter")){
                if(store.stock("milkbutter") > 0){
                    basket.add("milkbutter", store.price("milkbutter"));
                    store.take("milkbutter");
                }else {
                    System.out.println("Sorry, product not available.");
                }
            }
            else if(product.equals("bread")){
                if(store.stock("bread") > 0){
                    basket.add("bread", store.price("bread"));
                    store.take("bread");
                }else {
                    System.out.println("Sorry, product not available.");
                }
            }
        }

        System.out.println("your purchases are:");
        basket.print();
        System.out.println("basket price: " + basket.price());
    }
}