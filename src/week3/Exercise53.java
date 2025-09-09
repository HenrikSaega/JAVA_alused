package week3;
import java.util.Scanner;
public class Exercise53 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String sõna = reader.nextLine();

        System.out.print("Length of the word part: ");
        int pikkus = Integer.parseInt(reader.nextLine());

        System.out.print("Result: " + sõna.substring(0, pikkus));
    }
}
