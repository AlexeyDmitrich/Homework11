import java.util.ArrayList;

public class OrangeBox <O extends Orange> extends Box{
    private double weightFull;
    ArrayList<O> orangeBox = new ArrayList<>();

    public OrangeBox(ArrayList<O> orangeBox) {
        this.orangeBox = orangeBox;
    }
    @Override
    public void setWeightWithFruit(double weightWithFruit) {
        super.setWeightWithFruit(weightWithFruit);
    }
    public void putApple (O org){
        double empty = super.getWeightEmpty();
        double putWeight = org.getWeight();
        orangeBox.add(org);
        weightFull = empty + putWeight;
        setWeightWithFruit(weightFull);
    }
    @Override
    public String toString() {
        String str = null;
        String com = "Коробка для апельсинов, содержимое: \n";
        String fin = "Общий вес: " + weightFull + " кг.\n";
        for (O org:orangeBox) {
            str += org.toString() + "\n";
        }
        String about = com + str + fin;
        return about;
    }
}
