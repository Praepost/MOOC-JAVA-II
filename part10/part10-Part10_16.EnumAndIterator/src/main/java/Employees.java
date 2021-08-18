import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
   private ArrayList<Person> employeeList;
   
   public Employees(){
       this.employeeList = new ArrayList<>();
   }
   
   public void add(Person person){
       this.employeeList.add(person);
   }
   
   public void add(List<Person> peopleToAdd){
       for(Person p : peopleToAdd){
           this.employeeList.add(p);
       }
   }
   
   public void print(){
       Iterator<Person> iterator = employeeList.iterator(); 
       while(iterator.hasNext()){ 
           Person nextPerson = iterator.next(); 
           System.out.println(nextPerson); 
       }
   }

   public void print(Education education){
       Iterator<Person> iterator = employeeList.iterator();
       while(iterator.hasNext()){
           Person nextPerson = iterator.next();
           if(nextPerson.getEducation() == education){
               System.out.println(nextPerson);
           }
       }
   }
   
   public void fire(Education education){
       Iterator <Person> iterator = employeeList.iterator();
       while(iterator.hasNext()){
           if(iterator.next().getEducation() == education){
               iterator.remove();
           }
       }
   }
}