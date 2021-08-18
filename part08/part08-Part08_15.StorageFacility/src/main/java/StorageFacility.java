
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> map;
    
    public StorageFacility(){
        map = new HashMap();
    }
    
    public void add(String unit, String item){
        if(map.get(unit)==null){
            map.put(unit, new ArrayList<>());
        }
        map.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        if(map.get(storageUnit)==null){
            return new ArrayList();
        }
        return map.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item) {
        if(map.get(storageUnit)!=null){
            map.get(storageUnit).remove(item);
            if(map.get(storageUnit).isEmpty()){
                map.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits(){
        return new ArrayList<>(map.keySet());
    }
    
}
