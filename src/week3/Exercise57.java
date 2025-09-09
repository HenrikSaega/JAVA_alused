package week3;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise57 {
    public static void main(String[] args) {
    ArrayList<String> words = new ArrayList<String>();
    Scanner reader = new Scanner(System.in);

    System.out.print("Type a word: ");
    String word = reader.nextLine();
    words.add(word);

    while(!word.isEmpty()){
        System.out.print("Type a word: ");
        word = reader.nextLine();
        words.add(word);
    }

    for( String w : words){
        System.out.println("Typed a word: " + w);
    }


    }
}
