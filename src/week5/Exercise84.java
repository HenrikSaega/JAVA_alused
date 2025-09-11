package week5;

public class Exercise84 {
    public static void main(String[] args) {
        Counter count1 = new Counter();
        Counter count2= new Counter(10);
        Counter count3 = new Counter(true);
        Counter count4= new Counter(20, true);


        System.out.println(count1.getValue() + " " + count1.getCheck());
        System.out.println(count2.getValue() + " " + count2.getCheck());
        System.out.println(count3.getValue() + " " + count3.getCheck());
        System.out.println(count4.getValue() + " " + count4.getCheck());

        count4.increase(20);
        System.out.println(count4.getValue() + " " + count4.getCheck());
        count4.decrease(10);
        System.out.println(count4.getValue() + " " + count4.getCheck());
    }
}
