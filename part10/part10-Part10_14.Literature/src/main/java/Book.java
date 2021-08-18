
public class Book {
    
    private String name;
    private int age;
    
    
    public Book(String initialName, int initialAge){
        this.name = initialName;
        this.age = initialAge;
    }

    @Override
    public String toString() {
        return name + " (recommended for " + age + " year-olds or older)";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
    
    
}
