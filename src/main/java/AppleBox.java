import java.util.ArrayList;

public class AppleBox <A extends Apple> extends Box{
    private double weightFull;
    ArrayList<A> appleBox = new ArrayList<>();

    public AppleBox(ArrayList<A> appleBox) {
        this.appleBox = appleBox;
    }
    @Override
    public void setWeightWithFruit(double weightWithFruit) {
        super.setWeightWithFruit(weightWithFruit);
    }
    public void putApple (A apl){
        double empty = super.getWeightEmpty();
        double putWeight = apl.getWeight();
        appleBox.add(apl);
        weightFull = empty + putWeight;
        setWeightWithFruit(weightFull);
    }

    @Override
    public String toString() {
        String str = null;
        String com = "Коробка для яблок, содержимое: \n";
        String fin = "Общий вес: " + weightFull + " кг.\n";
        for (A apl:appleBox) {
           str += apl.toString() + "\n";
        }
        String about = com + str + fin;
        return about;
    }

}
