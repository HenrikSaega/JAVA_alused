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
            System.out.println("\nStatements:\n" +
                    "  add - adds a word pair to the dictionary\n" +
                    "  translate - asks a word and prints its translation\n" +
                    "  quit - quits the text user interface");
            System.out.print("Statement: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Cheers!");
                break;
            } else {
                System.out.println("Unknown statement");
            }

            if(input.equalsIgnoreCase("add")){
                String sõna;
                String vaste;
                System.out.print("In Estonia: ");
                sõna = scanner.nextLine();
                System.out.print("Translation: ");
                vaste = scanner.nextLine();
                this.add(sõna, vaste);
            }
            else if (input.equalsIgnoreCase("translate")){
                String sõna;
                System.out.print("Give a word: ");
                sõna = scanner.nextLine();
                if(this.dictionary.containsKey(sõna)){
                    this.translate(sõna);
                } else{
                    System.out.println("Sorry no such word!");
                }
            }
        } while(true);
    }

    public void add(String sõna, String vaste){
         this.dictionary.put(sõna,vaste);
         System.out.println("Word added successfully!");
    }
    public void translate(String sõna){
        System.out.print("Translation: " + this.dictionary.get(sõna) + "\n");
    }
}
