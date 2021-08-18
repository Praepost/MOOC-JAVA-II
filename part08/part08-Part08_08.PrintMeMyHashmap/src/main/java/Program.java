
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Program {

    public static void main(String[] args) {
        HashSet<String> countryHashSet = new HashSet<>();
        countryHashSet.add("ав");
        countryHashSet.r
    }
    
    public static void printKeys(HashMap<String,String> hashmap){
        hashmap.keySet().forEach(key -> System.out.println(key));
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text){
        for(String key:hashmap.keySet()){
                if(key.contains(text)){
                    System.out.println(key);
            }
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for(String key:hashmap.keySet()){
            if(key.contains(text)){
                System.out.println(hashmap.get(key));
            }
        }
    }
    
}
