 
import java.util.Scanner;
 
public class LiquidContainers {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String first_name = ("First: ");
        String second_name = ("Second: ");
        String named = ("/100");
        int first = 0;
        int second = 0;
 
        while (true) {
            
            System.out.println(first_name + first + named);
            System.out.println(second_name + second + named);
 
            String input = scan.next();
            
            if (input.equals("quit")) {
                break;
            } else if (input.equals("add")) {
                int buffer = scan.nextInt();
                if (buffer+first>100){
                    first = 100;
                } else if(buffer<0){
                    continue;
                } else {
                    first+=buffer;
                }
                
            } else if (input.equals("move")){
                int buffer = scan.nextInt();
                if (buffer>first){
                    buffer = first;
                }
                if (buffer+second>100){
                    first -= 100 - second;
                    second = 100;
                } else if(buffer<0){
                    continue;
                } else {
                    second+=buffer;
                    first-=buffer;
                }
                
            } else if (input.equals("remove")){
                
                int buffer = scan.nextInt();
                
                if (second-buffer<0){
                    second = 0;
                } else if(buffer<0){
                    continue;
                } else {
                    second-=buffer;
                }
            }
 
        }
    }
    
 
    
}