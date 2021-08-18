package logic; 

import domain.Airplane;
import domain.Flight;
import domain.Place;
import java.util.HashMap;

public class FlightControl {

    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;

    public FlightControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity) {
        this.airplanes.put(ID, new Airplane(ID, capacity));
    }

    public void addFlight(Airplane airplane, String originID, String destinationID) {
        this.places.putIfAbsent(originID, new Place(originID)); 
        this.places.putIfAbsent(destinationID, new Place(destinationID));

        Flight flight = new Flight(this.places.get(originID), this.places.get(destinationID), airplane); 
        this.flights.put(flight.toString(), flight); 
    }

    public Airplane getAirplane(String planeID) {
        if (this.airplanes.containsKey(planeID)) {
            return this.airplanes.get(planeID);
        }
        return null;
    }

    public Place getPlace(String placeID) {
        if (this.places.containsKey(placeID)) {
            return this.places.get(placeID);
        }
        return null;
    }

    public void printPlanes() {
        this.airplanes.values().stream().forEach(plane -> System.out.println(plane));
    }

    public void printFlights() {
        this.flights.values().stream().forEach(flight -> System.out.println(flight));
    }

    public void printAirplaneDetails(String planeID) {
        if (this.airplanes.containsKey(planeID)) {
            System.out.println(this.airplanes.get(planeID));
        } else {
            System.out.println("Plane not found");
        }
    }
}