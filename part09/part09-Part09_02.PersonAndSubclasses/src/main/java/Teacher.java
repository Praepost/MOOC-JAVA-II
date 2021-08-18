public class Teacher extends Person{

    private int price;
    public Teacher(String name,String adress, int price){
        super(name, adress);
        this.price = price;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  salary " + price + " euro/month"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
