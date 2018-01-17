package airlinebookingsystem;

import javafx.beans.property.SimpleStringProperty;

public class Booking {
    private final SimpleStringProperty b1, e1, b2, e2, b3, e3;
    
    public Booking(String a, String b, String c, String d, String e, String f) {
        this.b1 = new SimpleStringProperty(a);
        this.e1 = new SimpleStringProperty(b);
        this.b2 = new SimpleStringProperty(c);
        this.e2 = new SimpleStringProperty(d);
        this.b3 = new SimpleStringProperty(e);
        this.e3 = new SimpleStringProperty(f);
    }
    
    public String getB1() {
        return b1.get();
    }
    
    public void setB1(String a) {
        b1.set(a);
    }
    
    public String getE1() {
        return e1.get();
    }
    
    public void setE1(String a) {
        e1.set(a);
    }
    
    public String getB2() {
        return b2.get();
    }
    
    public void setB2(String a) {
        b2.set(a);
    }
    
    public String getE2() {
        return e2.get();
    }
    
    public void setE2(String a) {
        e2.set(a);
    }
    
    public String getB3() {
        return b3.get();
    }
    
    public void getB3(String a) {
        b3.set(a);
    }
    
    public String getE3() {
        return e3.get();
    }
    
    public void setE3(String a) {
        e3.set(a);
    }
}
