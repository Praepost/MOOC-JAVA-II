
public class Student extends Person{
    
    private int counter;
    
    public Student(String name, String adress){
        super(name, adress);
        this.counter = 0;
    }
    
    public int credits(){
        return counter;
    }
    
    public void study(){
        counter++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + counter; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
