package FlightControl;

import java.util.Scanner;
import logic.FlightControl;
import ui.TextUI;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        FlightControl fc = new FlightControl();
        TextUI userInterface = new TextUI(scan, fc);
        
        userInterface.start();
    }
}