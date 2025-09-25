package week7;
import java.util.ArrayList;
public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;

    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public void addThing(Thing thing){
        if(this.totalWeight() + thing.getWeight() <= this.maxWeight){
            this.things.add(thing);
        }
    }

    public int totalWeight() {
        int total = 0;
        for (Thing thing : things) {
            total += thing.getWeight();
        }
        return total;
    }
    public ArrayList<Thing> printThings() {
        ArrayList<Thing> temp = new ArrayList<>();
        for (Thing thing : things) {
            System.out.println(thing);
        }
        return temp;
    }

    @Override
    public String toString() {
        if(this.things.size() == 0){
            return "Empty " + "(0 kg)";
        } else if(this.things.size() == 1){
            return this.things.size() + " thing ( " + this.totalWeight() + " kg)";
        } else {
            return this.things.size() + " things ( " + this.totalWeight() + " kg)";
        }
    }
}