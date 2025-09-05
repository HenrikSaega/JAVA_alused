package week2;

public class Exercise39 {

    private  static void printStars(int amount){
        int i = 0;
        while (amount  >= i){
            System.out.print("*");
            i++;
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        printSquare(3);
    }

    public static void printSquare(int sideSize){
        int i = 0;
        while (sideSize > i){
                printStars(sideSize);
            i++;
        }
    }
}

