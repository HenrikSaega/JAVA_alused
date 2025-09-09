package Week3;
import java.util.Scanner;
public class Exercise50 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name =  reader.nextLine();

        if(name.length() > 2){
            int num = 0;
            while( num < 3){
                System.out.println((num+1) + ". charater: " + name.charAt(num));
                num++;
            }

        }
    }
}
