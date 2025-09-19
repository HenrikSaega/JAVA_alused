package week8;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Storehouse store = new Storehouse();
        store.addProduct("coffee", 5, 4);
        store.addProduct("milk", 3, 5);
        store.addProduct("milkbutter", 2, 2);
        store.addProduct("bread", 7, 6);

        Shop shop = new Shop(store, new Scanner(System.in));
        shop.manage("Pekka");
    }
}
