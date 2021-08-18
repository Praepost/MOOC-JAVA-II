
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        String input = "0";
    boolean result = Boolean.parseBoolean(input);
    result = !result;
    String output = String.valueOf(result);
    System.out.println(output);
    }
    
    public static void printValues(HashMap<String,Book> hashmap){
        for(String buffer:hashmap.keySet()){
            System.out.println(hashmap.get(buffer));
        }
    }

    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for(String buffer:hashmap.keySet()){
            if(hashmap.get(buffer).getName().contains(text)){
                System.out.println(hashmap.get(buffer));
            }
                
        }
    }
}
