package airlinebookingsystem;

import javafx.beans.property.SimpleStringProperty;

public class FlightSearch {
    private final SimpleStringProperty flightno, flightname, source, departure, destination, arrival;
    
    public FlightSearch(String a, String b, String c, String d, String e, String f) {
        this.flightno = new SimpleStringProperty(a);
        this.flightname = new SimpleStringProperty(b);
        this.source = new SimpleStringProperty(c);
        this.departure = new SimpleStringProperty(d);
        this.destination = new SimpleStringProperty(e);
        this.arrival = new SimpleStringProperty(f);
    }
    
    public String getFlightno() {
        return flightno.get();
    }
    
    public void setFlightno(String a) {
        flightno.set(a);
    }
    
    public String getFlightname() {
        return flightname.get();
    }
    
    public void setFlightname(String a) {
        flightname.set(a);
    }
    
    public String getSource() {
        return source.get();
    }
    
    public void setSource(String a) {
        source.set(a);
    }
    
    public String getDeparture() {
        return departure.get();
    }
    
    public void setDeparture(String a) {
        departure.set(a);
    }
    
    public String getDestination() {
        return destination.get();
    }
    
    public void setDestination(String a) {
        destination.set(a);
    }
    
    public String getArrival() {
        return arrival.get();
    }
    
    public void setArrival(String a) {
        arrival.set(a);
    }
}
