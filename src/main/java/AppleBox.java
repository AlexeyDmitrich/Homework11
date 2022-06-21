import java.util.ArrayList;

public class AppleBox implements Box<Apple> {
    private double weightFull;
    ArrayList<Apple> appleBox;

    public AppleBox(ArrayList<Apple> appleBox) {
        this.appleBox = new ArrayList<>();
    }
    @Override
    public void putFruit (ArrayList<Apple> box){
        double empty = Box.getWeightEmpty();
        weightFull += empty;
        Apple apl = new Apple();
        double putWeight = apl.getWeight();
        for (Apple apple: box) {
            appleBox.add(apple);
            weightFull += putWeight;
        }

    }

    @Override
    public String toString() {
        String str = null;
        String about = null;
        if (weightFull > 0.2){
            String com = "Коробка c яблоками, содержимое: \n";
            String fin = "Общий вес: " + weightFull + " кг.\n";
            for (Apple apl:appleBox) {
                str += apl.toString() + "\n";
            }
            about = com + str + fin;
        }
        else {
            about = "Пустая коробка для яблок, ничего интересного. \n";
        }
        return about;
    }

}
