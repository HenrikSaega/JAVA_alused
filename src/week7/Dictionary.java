package week7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
    private HashMap<String, String> dictionary;


    public Dictionary(){
        this.dictionary = new HashMap<String, String>();
    }


    public String translate(String word){
        if(word == null || !dictionary.containsKey(word)){
            return "";
        }
        return dictionary.get(word);
    }


    public void add(String word, String translation){
        this.dictionary.put(word, translation);
    }


    public int amountOfWords(){
        return dictionary.size();
    }


    public ArrayList<String> translationList(){
        ArrayList<String> translation= new ArrayList<>();

        for (Map.Entry<String, String> entry : this.dictionary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            translation.add(key + " = " + value);
        }
        return translation;
    }
}
