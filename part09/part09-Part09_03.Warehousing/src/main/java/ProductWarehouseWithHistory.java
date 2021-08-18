
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory changeHistory;
    
    public ProductWarehouseWithHistory (String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        changeHistory = new ChangeHistory();
        balance = initialBalance;
        changeHistory.add(balance);
    }
    
    public String history () {
        return changeHistory.toString();
    }
    
    @Override
    public void addToWarehouse (double amount) {
        super.addToWarehouse(amount);
        changeHistory.add(balance);
        
    }
    
    @Override
    public double takeFromWarehouse(double amount){
        amount = super.takeFromWarehouse(amount);
        changeHistory.add(balance);
        return amount;
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("SAverage: " + changeHistory.average());
    }
    
    
}
