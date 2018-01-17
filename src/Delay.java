package airlinebookingsystem;

import javafx.beans.property.SimpleStringProperty;

public class Delay {
    private final SimpleStringProperty flightno, date, delay;
    
    public Delay(String a, String b, String c) {
        flightno = new SimpleStringProperty(a);
        date = new SimpleStringProperty(b);
        delay = new SimpleStringProperty(c);
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
    
    public String getDelay() {
        return delay.get();
    }
    
    public void setDelay(String a) {
        delay.set(a);
    }
    
}
