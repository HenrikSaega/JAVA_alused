package week3;
import java.util.Scanner;
public class Exercise56 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type in your text: ");
        String tekst =  reader.nextLine();
        System.out.println("In reverse order: " + reverse(tekst));
    }

    public static String reverse(String tekst){

        String reversed = "";
        for(int i = tekst.length()-1; i >= 0; i--){
            reversed += tekst.charAt(i);
        }
        return  reversed;
    }
}
