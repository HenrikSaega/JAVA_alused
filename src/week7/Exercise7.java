package week7;
import java.util.ArrayList;
import java.util.HashMap;

public class Exercise7 {
    public static void main(String[] args) {
        HashMap<String, Dictionary> bookCollection = new HashMap<String, Dictionary>();

        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }
    }
}
