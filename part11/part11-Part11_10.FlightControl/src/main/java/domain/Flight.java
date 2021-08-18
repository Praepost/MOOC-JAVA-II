package domain;

public class Flight {

    private Place origin;
    private Place destination;
    private Airplane plane;

    public Flight(Place origin, Place destination, Airplane plane) {
        this.origin = origin;
        this.destination = destination;
        this.plane = plane;
    }
    
    @Override
    public String toString() {
        return this.plane.toString() + " (" + this.origin + "-" + this.destination + ")";
    }
}