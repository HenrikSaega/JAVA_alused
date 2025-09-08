package week2;
import java.util.Scanner;;

public class Exercise41 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int SuvaArv = (int) (Math.random() * 100);
        int Arv = 0;
        int Arvamisi = 0;
        while(Arv != SuvaArv){
            System.out.print("Guess the number: ");
             Arv = Integer.parseInt(reader.nextLine());
            if(Arv > SuvaArv){
                Arvamisi++;
                System.out.println("The number is lesser, guesses made: " + Arvamisi);
            }
            else if(Arv < SuvaArv){
                Arvamisi++;
                System.out.println("The number is greater, guesses made: " + Arvamisi);
            }
            else{
                System.out.println("Congratulations, your guess is correct! Total guesses made: " + Arvamisi);
                break;
            }
        }
    }
}
