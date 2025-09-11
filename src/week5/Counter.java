package week5;

public class Counter {
    private int number;
    private boolean check;

    public Counter(int number, boolean check) {
        this.number = number;
        this.check = check;
    }
    public Counter(){
        this.number = 0;
        this.check = false;
    }
    public Counter(int number){
        this.number = number;
    }
    public Counter(boolean check){
            this.check = true;
    }

    public int getValue(){
        return this.number;
    }
    public boolean getCheck(){
        return this.check;
    }

    public int increase(int increaseSize){
    return this.number += increaseSize;
    }
    public int decrease(int decreaseSize){
        return this.number -= decreaseSize;
    }
}
