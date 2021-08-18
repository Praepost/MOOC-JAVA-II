
import java.util.ArrayList;
import java.util.HashMap;


public class IOU {
    
    private HashMap<String, Double> hashmap ;
    
    public IOU(){
        hashmap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.hashmap.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        if(hashmap.containsKey(toWhom)){
            return hashmap.get(toWhom);
        } else {
            return 0;
        }
        
    }

    
    
}
