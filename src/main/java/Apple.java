import java.util.Objects;

/**
 * Класс для яблок
 */
public class Apple extends Fruit{
    private final double weight = 1.0;  // вес максимально стандартного яблока

    public Apple() {
        super.setWeight(weight);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public String toString() { // печать яблока в консоль
        return "Яблоко. " +
                "Вес: " + weight +
                "кг.\n";
    }

    @Override
    public boolean equals(Object o) {  // сравнение яблок
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return Double.compare(apple.getWeight(), getWeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight());
    }
}
