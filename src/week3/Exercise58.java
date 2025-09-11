package week3;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise58 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();
        String add = word;
        words.add(word);

        while(words.contains(word)){
            System.out.print("Type a word: ");
            word = reader.nextLine();
            words.add(word);
            add = word;
            for(String w : words) {
                if (word.contains(add)) {
                    break;
                }
            }
        }
    }
}
