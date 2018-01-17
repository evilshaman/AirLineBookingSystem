package airlinebookingsystem;

import javafx.beans.property.SimpleStringProperty;

public class PassengerInfo {
    
    private final SimpleStringProperty rid, userid, flightno, date, etickets, btickets, fare;
    
    public PassengerInfo (String a, String b, String c, String d, String e, String f, String g) {
        rid = new SimpleStringProperty(a);
        userid = new SimpleStringProperty(b);
        flightno = new SimpleStringProperty(c);
        date = new SimpleStringProperty(d);
        etickets = new SimpleStringProperty(e);
        btickets = new SimpleStringProperty(f);
        fare = new SimpleStringProperty(g);
    }
    
    public String getRid() {
        return rid.get();
    }
    
    public void setRid(String a) {
        rid.set(a);
    }
    
    public String getUserid() {
        return userid.get();
    }
    
    public void setUserid(String a) {
        userid.set(a);
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
    
    public String getEtickets() {
        return etickets.get();
    }
    
    public void setEtickets(String a) {
        etickets.set(a);
    }
    
    public String getBtickets() {
        return btickets.get();
    }
    
    public void setBtickets(String a) {
        btickets.set(a);
    }
    
    public String getFare() {
        return fare.get();
    }
    
    public void setFare(String a) {
        fare.set(a);
    }
}
