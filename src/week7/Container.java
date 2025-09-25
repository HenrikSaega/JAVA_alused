package week7;

import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase addSuitcase){
       if(this.totalWeight() + addSuitcase.totalWeight() <= maxWeight){
           this.suitcases.add(addSuitcase);
       }
    }
    public int totalWeight() {
        int total = 0;
        for (Suitcase suitcase  : suitcases) {
            total += suitcase.totalWeight();
        }
        return total;
    }
    @Override
    public String toString() {
        return suitcases.size() + " suitcases ( " + this.totalWeight() + " kg)";
    }
}