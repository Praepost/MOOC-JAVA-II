
import java.util.HashMap;
import java.util.HashSet;


public class VehicleRegistry {
    private HashMap <LicensePlate,String> map;
    public VehicleRegistry(){
        map = new HashMap ();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(map.get(licensePlate)!= null){
            return false;
        } else {
            map.put(licensePlate, owner);
        }
        return true;
    }
    
    public String get(LicensePlate licensePlate){
        if(this.map.get(licensePlate)==null){
            return null;
        }
        return this.map.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(this.map.get(licensePlate)==null){
            return false;
        } else {
            this.map.remove(licensePlate);
        }
        return true;
    }
    public void printLicensePlates(){
        for(LicensePlate buffer:map.keySet()){
            System.out.println(buffer);
        }
    }
    
    public void printOwners(){
        HashSet <String> owners = new HashSet();
        for(LicensePlate buffer:map.keySet()){
            owners.add(map.get(buffer));
        }
        
        for (String owner : owners) {
            System.out.println(owner);
        }
    }
    
}
