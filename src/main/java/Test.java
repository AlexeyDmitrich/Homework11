import java.util.ArrayList;
import java.util.Random;

public class Test {
    static Random rnd = new Random();

    public static void main(String[] args) {

        Fruit[] desorted = new Fruit[30];
        addFruits(desorted);
        System.out.println("Пересортица:");
        for (Fruit fruit: desorted) {
            System.out.print(fruit);
        }

        ArrayList <Apple> apples = new ArrayList<>();
        System.out.println(apples);
        ArrayList <Orange> oranges = new ArrayList<>();
        System.out.println(oranges);

        AppleBox appleBox = new AppleBox(apples);
        OrangeBox orangeBox = new OrangeBox(oranges);

        sortFruits(desorted, apples, oranges);
    /*    System.out.println("Коробка яблок");
        System.out.println(apples);
        System.out.println("Коробка апельсинов");
        System.out.println(oranges);
*/
        appleBox.putFruit(apples);
        orangeBox.putFruit(oranges);

        String ab = appleBox.toString();
        String ob = orangeBox.toString();
        System.out.println(ab);
        System.out.println(ob);

        AppleBox appleBox2 = new AppleBox();
        OrangeBox orangeBox2 = new OrangeBox();
        appleBox2.putAnyFruit(12);
        orangeBox2.putAnyFruit(8);

        String ab2 = appleBox2.toString();
        String ob2 = orangeBox2.toString();
        System.out.println(ab2);
        System.out.println(ob2);

        Load.fruitReplace(appleBox, appleBox2);
        Load.fruitReplace(orangeBox, orangeBox2);

        ab = appleBox.toString();
        ob = orangeBox.toString();
        System.out.println(ab);
        System.out.println(ob);
        ab2 = appleBox2.toString();
        ob2 = orangeBox2.toString();
        System.out.println(ab2);
        System.out.println(ob2);

        Load.comparsion(appleBox, appleBox2);
        Load.comparsion(appleBox2, orangeBox2);
        Load.comparsion(orangeBox, orangeBox2);
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
            if (array[i].equals(ethalonOrange)){
                oranges.add((Orange) array[i]);
            }
        }
    }
}

