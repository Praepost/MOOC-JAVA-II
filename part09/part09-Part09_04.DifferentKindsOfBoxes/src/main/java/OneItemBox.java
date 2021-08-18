
import java.util.ArrayList;


public class OneItemBox extends Box{
    
    private ArrayList<Item>box;

    @Override
    public void add(Item item) {
        if(box.size()==0){
            box.add(item);
        }else{
            return;
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
    
    public OneItemBox(){
        box = new ArrayList<>();
    }
    
}
