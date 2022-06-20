import java.util.ArrayList;

public class OrangeBox <O extends Orange> extends Box{
    ArrayList<O> orangeBox = new ArrayList<>();

    public OrangeBox(ArrayList<O> orangeBox) {
        this.orangeBox = orangeBox;
    }
}
