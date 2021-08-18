
import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double>historyList;
    
    public ChangeHistory(){
        historyList = new ArrayList<>();
    }
    
    public void add(double status) {
        historyList.add(status);
    }
    
    public void clear() {
        historyList.clear();
    }
    
    public String toString() {
        if(historyList!=null){
            return historyList.toString();
        }
        return "";
    }
    
    public double maxValue (){
        Double max = 0.0;
        for(Double buffer:historyList){
            if(buffer>max){
                max = buffer;
            }
        }
        return max;
    }
    
    public double minValue (){
        Double min = 999999.0;
        for(Double buffer:historyList){
            if(buffer<min){
                min = buffer;
            }
        }
        return min;
    }
    
    public double average () {
        Double average = 0.0;
        for(Double buffer:historyList){
            average += buffer;
        }
        return average/historyList.size();
    }
}
