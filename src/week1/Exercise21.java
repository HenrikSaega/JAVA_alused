package week1;

import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Sisesta aastaarv: ");
        int aasta = Integer.parseInt(reader.nextLine());

        if((aasta%4 == 0 && aasta%100 != 0) || (aasta%400 == 0  && aasta%100 == 0)){
            System.out.print("Sisestatud aasta on liigaasta.");
        } else{
            System.out.print("Sisestatud aasta ei ole liigaasta.");
        }
    }
}
