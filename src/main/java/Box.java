import java.util.ArrayList;

public interface Box <F extends Fruit> {
    double weightEmpty = 0.2;   // константный вес самой коробки

    static double getWeightEmpty() {
        return weightEmpty;
    }

    void putFruit (ArrayList<F> box);   // положить все фрукты
    void getAnyFruit ( int value);   // взять несколько фруктов
    void putAnyFruit ( int value);   // положить несколько фруктов
    int getSize();   // узнать сколько фруктов внутри

    static  <T extends Fruit> void arrToArrList (T[] array){
        ArrayList <T> list = new ArrayList<>();
        for (T element: array) {
            list.add(element);
        }
    }


    boolean isEmpty();
}
