
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count = 0;
        int counter = 0;
        
        while(true){
            int number = scanner.nextInt();
            if(number==0){
                break;
            } else if (number<0){
                continue;
            } else {
                count+=number+0.0;
                counter++;
            }
        }
        
        if(counter == 0 ){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(count/(counter+0.0));
        }
    }
}
