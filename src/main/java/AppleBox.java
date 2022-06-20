import java.util.ArrayList;

public class AppleBox <A extends Apple> extends Box{
    ArrayList<A> appleBox = new ArrayList<>();

    public AppleBox(ArrayList<A> appleBox) {
        this.appleBox = appleBox;
    }
}
