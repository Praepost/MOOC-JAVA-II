
import java.util.ArrayList;
import java.util.HashMap;


public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> phoneNumbers;
    
    public DictionaryOfManyTranslations(){
        phoneNumbers = new HashMap();
    }
    
    public void add(String word, String translation){
        if(phoneNumbers.get(word)== null){
            phoneNumbers.put(word, new ArrayList<>());
        } 
        phoneNumbers.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        if(phoneNumbers.get(word)==null){
            return new ArrayList<>();
        } 
        return phoneNumbers.get(word);
    }
    
    public void remove(String word) {
        if(phoneNumbers.get(word)!=null){
            phoneNumbers.remove(word);
        }
    }
    
}
