package week1;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Sisesta number:");
        int number = Integer.parseInt(reader.nextLine());

        if(number%2 == 1){
            System.out.println("Number " + number + " on paaritu");
        }
        else{
            System.out.println("Number " + number + " on paaris");
        }
    }
}
