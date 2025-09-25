package week7;

public class Exercise4 {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        int weight = 1;

        while(container.totalWeight() < 1000){
            Thing brick = new Thing("Brick", weight);
            Suitcase suitcase = new Suitcase(1000);
            suitcase.addThing(brick);
            if (container.totalWeight() + suitcase.totalWeight() > 1000) {
                break;
            }
            container.addSuitcase(suitcase);
            System.out.println(container);
            weight++;
        }
    }
}