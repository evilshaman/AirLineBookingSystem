package airlinebookingsystem;

import javafx.beans.property.SimpleStringProperty;

public class Cancel {
    
    private final SimpleStringProperty flightno, date;
    
    public Cancel(String a, String b) {
        flightno = new SimpleStringProperty(a);
        date = new SimpleStringProperty(b);
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
}
