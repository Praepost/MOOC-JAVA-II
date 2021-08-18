
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class UI {
    
    private Scanner scanner;
    private ArrayList<Book>books;
    
    public UI(Scanner initScanner){
        this.scanner = initScanner;
        this.books = new ArrayList<>();
    }
    
    public void start(){
        while(true){
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.print("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(name,age));
        }
        
            System.out.println(books.size() + " books in total.");
            
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAge)
                .thenComparing(Book::getName);
        
        books.stream()
                .sorted(comparator)
                .forEach(v -> System.out.println(v));
        
    }
    
}
