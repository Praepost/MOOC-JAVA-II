
import java.util.ArrayList;


public class Box implements Packable{
    
    private ArrayList<Packable> box;
    private Double maxCapacity;
    private Double capacity;
    
    public Box(double capacity ){
        box = new ArrayList();
        this.maxCapacity = capacity;
        this.capacity = 0.0;
    }
    
    public void add(Packable pack){
        if(this.weight() + pack.weight()<=this.maxCapacity){
            this.box.add(pack);
            capacity+=pack.weight();
        }
    }

    @Override
    public double weight() {
        double weight = 0.0;
        for(Packable buffer:box){
            weight+=buffer.weight();
        }
        return weight;
        
    }

    @Override
    public String toString() {
        return "Box: " + box.size() + " items, total weight " + capacity + " kg"; 
    }
    
    
    
}
