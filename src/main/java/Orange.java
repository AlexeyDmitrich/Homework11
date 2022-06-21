public class Orange extends Fruit{
    private final double weight = 1.5;

    @Override
    public double getWeight() {
        return super.getWeight();
    }
    @Override
    public String toString() {
        return "Апельсин. " +
                "Вес: " + weight +
                "кг.";
    }
}
