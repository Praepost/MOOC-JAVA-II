
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList();
        
        while(true){
            int buffer = scanner.nextInt();
            if (buffer < 0){
                break;
            } else {
                list.add(buffer);
            }
        }
        
        String result = list.stream()
            .filter(v -> v>=1&&v<=5)
            .map(v -> v.toString())
            .reduce("",(previus, now) -> previus + now + "\n");
        
        System.out.println(result.substring(0, result.length()-1));
    }
}
