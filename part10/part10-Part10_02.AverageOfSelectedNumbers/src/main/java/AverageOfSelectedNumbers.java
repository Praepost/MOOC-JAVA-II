
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();
        double average = 0.0;
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true){
            String buffer = scanner.nextLine();
            if(buffer.equals("end")){
                break;
            }
            list.add(buffer);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        if(scanner.nextLine().equals("n")){
            average = list.stream()
                    .mapToDouble(s -> Double.valueOf(s))
                    .filter(s -> s < 0.0)
                    .average()
                    .getAsDouble();
        } else{
            average = list.stream()
                    .mapToDouble(s -> Double.valueOf(s))
                    .filter(d -> d > 0.0)
                    .average()
                    .getAsDouble();
        }
        System.out.println("Average of the negative numbers: " + average);
    }
}
