import java.util.ArrayList;

public abstract class Box <A extends Apple, O extends Orange> {
    private final double weightEmpty = 0.2;
private double weightWithFruit;

    public double getWeightEmpty() {
        return weightEmpty;
    }

    public double getWeightWithFruit() {
        return weightWithFruit;
    }

    public void setWeightWithFruit(double weightWithFruit) {
        this.weightWithFruit = weightWithFruit;
    }

    public <T extends Fruit> void arrToArrList (T[] array){
        ArrayList <T> list = new ArrayList<>();
        for (T element: array) {
            list.add(element);
        }
    }

}
