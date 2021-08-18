
public class CD implements Packable{

    private String autor;
    private String name;
    private Double weight;
    private int  date;
    
    public CD(String autor, String name, int date){
        this.autor = autor;
        this.name = name;
        this.date = date;
        this.weight = 0.1;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return autor + ": " + name + " (" + date +")";
    }
    
    
    
}
