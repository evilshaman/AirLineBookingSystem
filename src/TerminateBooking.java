package airlinebookingsystem;

import javafx.beans.property.SimpleStringProperty;

public class TerminateBooking {
    
    private final SimpleStringProperty rid, flightno, date, source, destination, tickets, cls;
    
    public TerminateBooking (String a, String b, String c, String d, String e, String f, String g) {
        rid = new SimpleStringProperty(a);
        flightno = new SimpleStringProperty(b);
        date = new SimpleStringProperty(c);
        source = new SimpleStringProperty(d);
        destination = new SimpleStringProperty(e);
        tickets = new SimpleStringProperty(f);
        cls = new SimpleStringProperty(g);
    }
    
    public String getRid() {
        return rid.get();
    }
    
    public void setRid(String a) {
        rid.set(a);
    }
    
    public String getFlightno() {
        return flightno.get();
    }
    
    public void setFlightno(String a) {
        flightno.set(a);
    }
    
    public String getDate() {
        return date.get();
    }
    
    public void setDate(String a) {
        date.set(a);
    }
    
    public String getSource() {
        return source.get();
    }
    
    public void setSource(String a) {
        source.set(a);
    }
    
    public String getDestination() {
        return destination.get();
    }
    
    public void setDestination(String a) {
        destination.set(a);
    }
    
    public String getTickets() {
        return tickets.get();
    }
    
    public void setTickets(String a) {
        tickets.set(a);
    }
    
    public String getCls() {
        return cls.get();
    }
    
    public void setCls(String a) {
        cls.set(a);
    }
}
