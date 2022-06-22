import java.util.Scanner;

public class Load <B extends Box<?>>{
    static Scanner input = new Scanner(System.in);
    public static <B extends Box> void fruitReplace(B box1, B box2) {    // метод для перекладывания фруктов из коробки в коробку
        if (box1.getClass() == box2.getClass()){
            System.out.println("Сколько фруктов нужно переложить?");
            int value = input.nextInt();
            box1.getAnyFruit(value);
            System.out.println("из коробки взяты фрукты");
            String b1 = box1.toString();
            System.out.println(b1);
            box2.putAnyFruit(value);
            System.out.println("в коробку помещены фрукты");
            String b2 = box2.toString();
            System.out.println(b2);
        }
        else {
            System.out.println("Нельзя смешивать фрукты и путать коробки");
        }
    }

    public static <B extends Box> void comparsion (B box1, B box2){   // метод для сравнения коробок
        if (box1.getSize() > box2.getSize()){
            System.out.println("В первой коробке фруктов больше на " + (box1.getSize() - box2.getSize()));
        } else if (box1.getSize() < box2.getSize()) {
            System.out.println("Во второй коробке фруктов больше на " + (box2.getSize() - box1.getSize()));
        } else {
            System.out.println("В обеих коробках фруктов по " + box1.getSize() + " штук");
        }
    }
}
