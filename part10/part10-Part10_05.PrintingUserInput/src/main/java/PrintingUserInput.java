
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list= new ArrayList();
        
        while(true){
            String buffer = scanner.nextLine();
            if(buffer.equals("")){
                break;
            }
            list.add(buffer);
        }
        String result = list.stream()
            .reduce("",(previus, now) -> previus+now);
            //.collect(Collectors.joining("\n"));
        
        System.out.println(result);
    }
    
    
}
