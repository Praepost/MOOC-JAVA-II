
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while(true){
            String buffer = scanner.nextLine();
            if(buffer.equals("end")){
                break;
            }
            list.add(buffer);
        }
        
        double count = list.stream()
                .mapToDouble(buffer -> Double.valueOf(buffer))
                .average()
                .getAsDouble();
        
        
        
        System.out.println("average of the numbers: " + count);

    }
}
