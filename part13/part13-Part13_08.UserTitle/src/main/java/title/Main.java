package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Enter org name: ");
        String name = scanner.nextLine();
        Application.launch(UserTitle.class,
            "--organization=" + name,
            "--course=Title");
    }

}
