import java.util.ArrayList;

public interface Box <F extends Fruit> {
    double weightEmpty = 0.2;

    static double getWeightEmpty() {
        return weightEmpty;
    }

    public void putFruit (ArrayList<F> box);
    public void getAnyFruit ( int value);
    public void putAnyFruit ( int value);
    public int getSize();

    public static  <T extends Fruit> void arrToArrList (T[] array){
        ArrayList <T> list = new ArrayList<>();
        for (T element: array) {
            list.add(element);
        }
    }


    boolean isEmpty();
}
