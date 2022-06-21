import java.util.ArrayList;

public class OrangeBox implements Box<Orange>{
    private double weightFull;
    ArrayList<Orange> orangeBox;

    public OrangeBox(ArrayList<Orange> orangeBox) {
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
    public String toString() {
        String str = null;
        String about = null;
        if (weightFull > 0.2){
            String com = "Коробка с апельсинами, содержимое: \n";
            String fin = "Общий вес: " + weightFull + " кг.\n";
            for (Orange org:orangeBox) {
                str += org.toString() + "\n";
            }
            about = com + str + fin;
        }
        else {
            about = "Пустая коробка для апельсинов, ничего интересного. \n";
        }
            return about;
    }
}
