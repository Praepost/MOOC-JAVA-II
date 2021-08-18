
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box{
    
    private int capacity;
    private ArrayList<Item>box;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.box = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        int counter = 0;
        for(Item buffer:box){
            counter+=buffer.getWeight();
        }
        if(counter+item.getWeight()<=capacity){
            box.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for(Item buffer:box){
            if(buffer.equals(item)){
                return true;
            }
        }
        return false;
    }
}
