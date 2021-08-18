
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        List<String> row = new ArrayList<>();
        List<Literacy> rows = new ArrayList<>();
        try{
            Files.lines(Paths.get("literacy.csv")).forEach(v -> row.add(v));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
            
        row.stream()
                .map(b->b.split(","))
                .map(v->new Literacy(v[0],v[1],v[2],v[3],v[4],v[5]))
                .sorted()
                .forEach(v-> System.out.println(v));
    }
    
}
