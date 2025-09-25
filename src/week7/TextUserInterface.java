package week7;
import java.util.HashMap;
import java.util.Scanner;

public class TextUserInterface {
    private Scanner scanner;
    Dictionary dict = new Dictionary();
    private HashMap<String, String> dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this .scanner = new Scanner(System.in);
        this.dictionary = new HashMap<String, String>();
    }

    public void start() {
        do{
            System.out.print("Statement: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Cheers!");
                break;
            } else {
                System.out.println("Unknown statement");
            }
        } while(true);
    }
}
