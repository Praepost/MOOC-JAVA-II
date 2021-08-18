import java.util.ArrayList;

public class Herd implements Movable{
    private ArrayList<Movable> list;

    public Herd(){
        this.list = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.list.add(movable);
    }
    
    public void move(int dx, int dy){
        for(Movable m : list){
            m.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){
        String s = "";
        for(Movable m : list){
            s = s + m.toString() + "\n";
        }
        return s;
    }

}