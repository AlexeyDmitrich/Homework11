import java.util.ArrayList;

/**
 * Яблочная коробка
 */
public class AppleBox implements Box<Apple> {
    private double weightFull;   // вес с яблоками
    ArrayList<Apple> appleBox;

    public AppleBox(ArrayList<Apple> appleBox) {   // создание коробки из кучи яблок
        this.appleBox = new ArrayList<>();
    }

    public int getSize(){
        return appleBox.size();
    }   // получение количества яблок
    public AppleBox() {
        this.appleBox = new ArrayList<>();
    }   // создание пустой коробки для яблок
    @Override
    public void putFruit (ArrayList<Apple> box){   // положить все фрукты в коробку
        double empty = Box.getWeightEmpty();
        weightFull += empty;
        Apple apl = new Apple();
        double putWeight = apl.getWeight();
        for (Apple apple: box) {
            appleBox.add(apple);
            weightFull += putWeight;
        }
    }

    @Override
    public void getAnyFruit ( int value){   // взять определенное количество фруктов из коробки
        double empty = Box.getWeightEmpty();
        weightFull += empty;
        Apple apl = new Apple();
        double getWeight = apl.getWeight();
        do {
            if (!(this.isEmpty())) {
                appleBox.remove(0);
                weightFull -= getWeight;
                value -= 1;
            }
        }while (value > 0 && weightFull > 0);
    }

    @Override
    public void putAnyFruit ( int value){    // положить определенное количество фруктов в коробку
        double empty = Box.getWeightEmpty();
        weightFull += empty;
        Apple apl = new Apple();
        double getWeight = apl.getWeight();
        do {
                appleBox.add(new Apple());
                weightFull += getWeight;
                value -= 1;
        }while (value > 0);
    }

    @Override
    public boolean isEmpty() {   // проверка коробки на пустоту
        return this.weightFull <= 0.2;
    }

    @Override
    public String toString() {   // в моём представлении коробка в консоли выглядит именно так
        String str = " ";
        String about;
        int vol = appleBox.size();
        if (weightFull > 0.2){
            String com = "Коробка c яблоками, содержимое: \n";
            String fin = "Общий вес: " + weightFull + " кг.\n";
            for (Apple apl:appleBox) {
                str += apl.toString() + " ";
            }
            about = com + "Внутри находится "+ vol + " яблок. \n" + str + fin;
        }
        else {
            about = "Пустая коробка для яблок, ничего интересного. \n";
        }
        return about;
    }


}
