
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }
    
    public static List<Book> readBooks(String file){
        List<Book> rows = new ArrayList<>();
        try{
            Files.lines(Paths.get(file)).forEach(b ->{
                String[] row = (b.split(","));
                rows.add(new Book(row[0],Integer.parseInt(row[1]),Integer.parseInt(row[2]),row[3]));
                    });
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        } 
        return rows;
    }

}
