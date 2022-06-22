import java.util.ArrayList;

public class Methods {
    /**
     * метод для смены местами элементов в массиве
     * @param array массив
     * @param inx1 индекс первого элемента
     * @param inx2 индекс второго элемента
     * @param <E> универсальный объектный тип
     */
    public <E> void replace (E[] array, int inx1, int inx2){
        E element = array[inx1];
        array[inx1] = array[inx2];
        array[inx2] = element;
    }

    /**
     * метод для преобразования массива в коллекцию
     * @param array массив
     * @param <T> универсальный тип данных
     */
    public <T> void arrToArrList (T[] array){
        ArrayList <T> list = new ArrayList<>();
        for (T element: array) {
            list.add(element);
        }
    }


}
