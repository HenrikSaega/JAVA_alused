package week2;

public class Exercise40 {

    public static void main(String[] args) {
        printTriangle(5);
    }

    private  static void printStars(int amount){
        int i = 0;
        while (amount  > i){
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }
    private static void whiteSpaces(int amount){
        int i = 0;
        while (amount  > i){
            System.out.print("U");
            i++;
        }
        System.out.print("\n");
    }

    public static void printTriangle(int size) {
        whiteSpaces(size);
    }
}
