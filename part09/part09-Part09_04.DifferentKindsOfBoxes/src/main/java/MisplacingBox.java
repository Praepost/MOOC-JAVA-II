
import java.util.ArrayList;


public class MisplacingBox extends Box {

    private ArrayList<Item> Box;
    @Override
    public void add(Item item) {
    }

    @Override
    public boolean isInBox(Item item) {
        return false;
    }
    
    public MisplacingBox(){
        Box = new ArrayList<>();
    }
    
}
