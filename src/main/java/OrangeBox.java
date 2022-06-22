import java.util.ArrayList;

/**
 * коробка для апельсинов. от коробки для яблок отличается только типом фрукта
 */
public class OrangeBox implements Box<Orange>{
    private double weightFull;
    ArrayList<Orange> orangeBox;

    public OrangeBox(ArrayList<Orange> orangeBox) {
        this.orangeBox = new ArrayList<>();
    }
    public int getSize(){
        return orangeBox.size();
    }
    public OrangeBox() {
        this.orangeBox = new ArrayList<>();
    }
    @Override
    public void putFruit (ArrayList<Orange> box){
        double empty = Box.getWeightEmpty();
        weightFull += empty;
        Orange org = new Orange();
        double putWeight = org.getWeight();
        for (Orange orange: box) {
            orangeBox.add(orange);
            weightFull += putWeight;
        }
    }

    @Override
    public void getAnyFruit ( int value){
        double empty = Box.getWeightEmpty();
        weightFull += empty;
        Orange org = new Orange();
        double getWeight = org.getWeight();
        do {
            if (!(this.isEmpty())) {
                orangeBox.remove(0);
                weightFull -= getWeight;
                value -= 1;
            }
        }while (value > 0 && weightFull > 0);
    }

    @Override
    public void putAnyFruit (int value){
        double empty = Box.getWeightEmpty();
        weightFull += empty;
        Orange org = new Orange();
        double getWeight = org.getWeight();
        do {
                orangeBox.add(new Orange());
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
        int vol = orangeBox.size();
        if (weightFull > 0.2){
            String com = "Коробка с апельсинами, содержимое: \n";
            String fin = "Общий вес: " + weightFull + " кг.\n";
            for (Orange org:orangeBox) {
                str += org.toString() + " ";
            }
            about = com + "Внутри находится "+ vol + " апельсинов. \n" + str + fin;
        }
        else {
            about = "Пустая коробка для апельсинов, ничего интересного. \n";
        }
            return about;
    }
}
