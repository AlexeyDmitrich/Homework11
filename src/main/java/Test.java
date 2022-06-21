import java.util.ArrayList;
import java.util.Random;

public class Test {
    static Random rnd = new Random();

    public static void main(String[] args) {

        Fruit[] desorted = new Fruit[30];
        addFruits(desorted);

        ArrayList <Apple> apples = new ArrayList<>();

        ArrayList <Orange> oranges = new ArrayList<>();

        sortFruits(desorted, apples, oranges);
        AppleBox appleBox = new AppleBox<>(apples);
        OrangeBox orangeBox = new OrangeBox<>(oranges);
    }
//__________________________________________________________________
public static void addFruits(Fruit[] arr){
    for (int i = 0; i < arr.length; i++) {
        int choice = rnd.nextInt(2);
        if (choice == 1){
            arr[i] = new Apple();
        } else {
            arr[i] = new Orange();
        }
    }
}

    public static void sortFruits (Fruit[] array, ArrayList <Apple> apples, ArrayList <Orange> oranges) {
        Apple ethalonApple = new Apple();
        Orange ethalonOrange = new Orange();
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(ethalonApple)){
                apples.add((Apple) array[i]);
            }
        }
    }
}

