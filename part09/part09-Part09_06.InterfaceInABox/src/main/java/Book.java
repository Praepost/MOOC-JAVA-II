
public class Book implements Packable{
    
    private String autor;
    private String name;
    private Double weight;
    
    public Book(String autor, String name, double weight){
        this.autor = autor;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return autor + ": " + name;
    }
    
    
    
}
