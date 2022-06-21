import java.util.Objects;

public class Apple extends Fruit{
    private final double weight = 1.0;

    @Override
    public double getWeight() {
        return super.getWeight();
    }

    @Override
    public String toString() {
        return "Яблоко. " +
                "Вес: " + weight +
                "кг.";
    }

    @Override
    public boolean equals(Object o) {
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
