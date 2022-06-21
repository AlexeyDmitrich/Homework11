import java.util.ArrayList;

public class AppleBox extends Box{
    private double weightFull;
    ArrayList<Apple> appleBox;

    public AppleBox(ArrayList<Apple> appleBox) {
        this.appleBox = new ArrayList<>();
    }
    @Override
    public void setWeightWithFruit(double weightWithFruit) {
        super.setWeightWithFruit(weightWithFruit);
    }
    public void putApple (ArrayList<Apple> box){
        double empty = super.getWeightEmpty();
        weightFull += empty;
        Apple apl = new Apple();
        double putWeight = apl.getWeight();
        for (Apple apple: box) {
            appleBox.add(apple);
            weightFull += putWeight;
            setWeightWithFruit(weightFull);
        }

    }

    @Override
    public String toString() {
        String str = null;
        String com = "Коробка для яблок, содержимое: \n";
        String fin = "Общий вес: " + weightFull + " кг.\n";
        for (Apple apl:appleBox) {
           str += apl.toString() + "\n";
        }
        String about = com + str + fin;
        return about;
    }

}
