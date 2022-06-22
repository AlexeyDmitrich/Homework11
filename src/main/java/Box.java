import java.util.ArrayList;

public interface Box <F extends Fruit> {
    double weightEmpty = 0.2;

    static double getWeightEmpty() {
        return weightEmpty;
    }

    public void putFruit (ArrayList<F> box);
    public void getAnyFruit (ArrayList<F> box, int value);
    public void putAnyFruit (ArrayList<F> box, int value);

    public static  <T extends Fruit> void arrToArrList (T[] array){
        ArrayList <T> list = new ArrayList<>();
        for (T element: array) {
            list.add(element);
        }
    }


}
