import java.util.ArrayList;

public class AppleBox implements Box<Apple> {
    private double weightFull;
    ArrayList<Apple> appleBox;

    public AppleBox(ArrayList<Apple> appleBox) {
        this.appleBox = new ArrayList<>();
    }
    public AppleBox() {
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
    public void getAnyFruit ( int value){
        double empty = Box.getWeightEmpty();
        weightFull += empty;
        Apple apl = new Apple();
        double getWeight = apl.getWeight();
        do {
            if (!(this.isEmpty())) {
                appleBox.remove(0);
                weightFull -= getWeight;
                value -= 1;
            }
        }while (value > 0 && weightFull > 0);
    }

    @Override
    public void putAnyFruit ( int value){
        double empty = Box.getWeightEmpty();
        weightFull += empty;
        Apple apl = new Apple();
        double getWeight = apl.getWeight();
        do {
                appleBox.add(new Apple());
                weightFull += getWeight;
                value -= 1;
        }while (value > 0);
    }

    @Override
    public boolean isEmpty() {
        if (this.weightFull <= 0.2) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String str = " ";
        String about = null;
        int vol = appleBox.size();
        if (weightFull > 0.2){
            String com = "Коробка c яблоками, содержимое: \n";
            String fin = "Общий вес: " + weightFull + " кг.\n";
            for (Apple apl:appleBox) {
                str += apl.toString() + " ";
            }
            about = com + "Внутри находится "+ vol + " яблок. \n" + str + fin;
        }
        else {
            about = "Пустая коробка для яблок, ничего интересного. \n";
        }
        return about;
    }


}
