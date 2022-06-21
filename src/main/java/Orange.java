import java.util.Objects;

public class Orange extends Fruit{
    private final double weight = 1.5;

    public Orange() {
        super.setWeight(weight);
    }

    @Override
    public double getWeight() {
        return super.getWeight();
    }
    @Override
    public String toString() {
        return "Апельсин. " +
                "Вес: " + weight +
                "кг.\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orange orange = (Orange) o;
        return Double.compare(orange.getWeight(), getWeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight());
    }
}
