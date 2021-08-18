
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K.Dmitriy
 */
public class Person {
    
    private final String name;
    private final String adress;
    private ArrayList<Person> persons ;
    
    public Person(String name,String adress){
        this.name = name;
        this.adress = adress;
        persons = new ArrayList<>();
    }

    @Override
    public String toString() {
        return name + "\n  " + adress ;
    }
    
    public void add(Person person){
        persons.add(person);
    }
    
    
}
