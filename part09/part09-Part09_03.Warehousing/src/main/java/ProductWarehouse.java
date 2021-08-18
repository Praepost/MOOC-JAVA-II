
public class ProductWarehouse extends Warehouse{
    
    private String name;
    
    public ProductWarehouse(String productName, double capacity){
        super(capacity);
        this.name = productName;
    }
    
    
    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ": " +super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
