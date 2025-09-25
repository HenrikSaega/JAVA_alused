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

    @Override
    public String toString() {
        return this.things.size() + " things ( " + this.totalWeight() + " kg)";
    }
}