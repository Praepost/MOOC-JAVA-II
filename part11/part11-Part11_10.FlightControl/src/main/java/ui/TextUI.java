package ui; 

import java.util.Scanner;
import logic.FlightControl;

public class TextUI {

    private Scanner scanner;
    private FlightControl flightControl;

    public TextUI(Scanner scanner, FlightControl fc) {
        this.scanner = scanner;
        this.flightControl = fc;
    }

    public void start() {
        this.assetControl();
        System.out.println();
        this.flightControl();
        System.out.println();
    }

    public void assetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print(">");
            String command = scanner.nextLine();

            if (command.equals("1")) {
                System.out.print("Give the airplane id: ");
                String ID = scanner.nextLine();
                System.out.print("Give the airplane capacity: ");
                int capacity = Integer.valueOf(scanner.nextLine());

                this.flightControl.addAirplane(ID, capacity);
            }

            if (command.equals("2")) {
                System.out.print("Give the airplane id: ");
                String planeID = scanner.nextLine();
                System.out.print("Give the departure airport id: ");
                String originID = scanner.nextLine();
                System.out.print("Give the target airport id: ");
                String destinationID = scanner.nextLine();

                this.flightControl.addFlight(this.flightControl.getAirplane(planeID), originID, destinationID);
            }

            if (command.equals("x")) {
                break;
            }
        }

    }
    
    public void flightControl() {
        System.out.println("Flight Control");
        System.out.println("--------------------");
        System.out.println();
        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");

            String command = scanner.nextLine();

            if (command.equals("1")) {
                this.flightControl.printPlanes();
            }
            if (command.equals("2")) {
                this.flightControl.printFlights();
            }
            if (command.equals("3")) {
                System.out.print("Give the airplane id: ");
                String planeID = scanner.nextLine();
                this.flightControl.printAirplaneDetails(planeID);
            }
            if (command.equals("x")) {
                scanner.close();
                break;
            }
        }
    }
}