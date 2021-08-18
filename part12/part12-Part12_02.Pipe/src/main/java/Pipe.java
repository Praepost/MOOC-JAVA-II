
import java.util.ArrayList;


public class Pipe<T> {
    
    private ArrayList<T> list;
    private Pipe(){
        this.list = new ArrayList<T>();
    }
    
    public void putIntoPipe(T value) {
        list.add(value);
    }
    
    public T takeFromPipe(){
        T buffer = null;
        if(this.isInPipe()){
            buffer = list.get(0);
            list.remove(buffer);
        }
        return buffer;
    }
    
    public boolean isInPipe(){
        return !list.isEmpty();
    }
}
