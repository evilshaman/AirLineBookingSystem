package airlinebookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class User {
    
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21;
    private ImageView bg, bg1, bg2, bg3, bg4, bg5, img1, bg6, bg7;
    private Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22;
    private PasswordField p1, p2, p3, p4, p5, p6;
    private Label l23, l24, l25, l26, l27, l28, l29, l30, l31, l32, l33, l34, l35, l36, l37, l38;
    private int cp, bg1added, l2added, l9added, tblval, s1added, bg6added, cp1p, tbl1val, eclassseats, bclassseats, eclassfare, bclassfare;
    private int se1, se2, se3, fe1, fe2, fe3, sb1, sb2, sb3, fb1, fb2, fb3, ff;
    private TextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11;
    private ToggleGroup group;
    private RadioButton domestic, international;
    private TableView<FlightSearch> table;
    private TableView<Booking> table1;
    private TableView<TerminateBooking> table2;
    private TableView<Delay> table3;
    private TableView<Cancel> table4;
    private ObservableList<FlightSearch> data = FXCollections.observableArrayList();
    private ObservableList<Booking> data1 = FXCollections.observableArrayList();
    private ObservableList<TerminateBooking> data2 = FXCollections.observableArrayList();
    private ObservableList<Delay> data3 = FXCollections.observableArrayList();
    private ObservableList<Cancel> data4 = FXCollections.observableArrayList();
    TableColumn col1, col2, col3, col4, col5, col6;
    TableColumn col7, col8, col9, col10, col11, col12;
    TableColumn col13, col14, col15, col16, col17, col18, col19;
    TableColumn col20, col21, col22, col23, col24;
    ScrollPane s, s1, s2, s3, s4;
    String type, date, date1, date2;
    private ComboBox combobox;
    
    private ObservableList<String> siteList = FXCollections.observableArrayList("1", "2", "3", "4", "5");
    
    public void userLayout() {
        
        combobox = new ComboBox(siteList);
        combobox.getSelectionModel().selectFirst();
        combobox.setLayoutX(770);
        combobox.setLayoutY(330);
        
        bg = new ImageView(new Image(Login.class.getResourceAsStream("files/U.png")));
        bg.setX(0);
        bg.setY(0);
        
        bg1 = new ImageView(new Image(Login.class.getResourceAsStream("files/aus.jpg")));
        bg1.setX(0);
        bg1.setY(150);
        
        bg2 = new ImageView(new Image(Login.class.getResourceAsStream("files/img.png")));
        bg2.setX(0);
        bg2.setY(100);
        
        bg3 = new ImageView(new Image(Login.class.getResourceAsStream("files/AI.png")));
        bg3.setX(35);
        bg3.setY(5);
        
        bg4 = new ImageView(new Image(Login.class.getResourceAsStream("files/maharaja.png")));
        bg4.setX(1250);
        bg4.setY(50);
        
        bg5 = new ImageView(new Image(Login.class.getResourceAsStream("files/box2.png")));
        bg5.setX(20);
        bg5.setY(170);
        
        bg6 = new ImageView(new Image(Login.class.getResourceAsStream("files/box3.png")));
        bg6.setX(350);
        bg6.setY(170);
        
        bg7 = new ImageView(new Image(Login.class.getResourceAsStream("files/box4.png")));
        bg7.setX(100);
        bg7.setY(180);
        
        b1 = new Button("Sign out");
        b1.setLayoutX(1100);
        b1.setLayoutY(125);
        b1.getStyleClass().addAll("button3");
        
        b21 = new Button("Home");
        b21.setLayoutX(1100);
        b21.setLayoutY(100);
        b21.getStyleClass().addAll("button3");
        
        
        b2 = new Button("Search for Flight");
        b2.setLayoutX(0);
        b2.setLayoutY(100);
        b2.getStyleClass().addAll("button1");
        b2.setPrefHeight(58);
        b2.setPrefWidth(200);
        
        l1 = new Label("Enter Details");
        l1.setLayoutX(65);
        l1.setLayoutY(180);
        l1.getStyleClass().addAll("my_customLabel1");
        
        
        l2 = new Label("Enter all details !!");
        l2.setLayoutX(120);
        l2.setLayoutY(440);
        l2.getStyleClass().addAll("my_customLabel");
        l2.setTextFill(Color.web("red"));
        
        l4 = new Label("Seats Available");
        l4.setLayoutX(400);
        l4.setLayoutY(460);
        l4.getStyleClass().addAll("my_customLabel2");
        
        l5 = new Label("Fare (Rs)");
        l5.setLayoutX(400);
        l5.setLayoutY(480);
        l5.getStyleClass().addAll("my_customLabel2");
        
        l6 = new Label("Flight No :");
        l6.setLayoutX(400);
        l6.setLayoutY(250);
        l6.getStyleClass().addAll("my_customLabel3");
        
        l7 = new Label("Journey Date :");
        l7.setLayoutX(720);
        l7.setLayoutY(250);
        l7.getStyleClass().addAll("my_customLabel3");
        
        l8 = new Label("Class : ");
        l8.setLayoutX(1050);
        l8.setLayoutY(250);
        l8.getStyleClass().addAll("my_customLabel3");
        
        l9 = new Label("From : ");
        l9.setLayoutX(400);
        l9.setLayoutY(280);
        l9.getStyleClass().addAll("my_customLabel3");
        
        l10 = new Label("To : ");
        l10.setLayoutX(720);
        l10.setLayoutY(280);
        l10.getStyleClass().addAll("my_customLabel3");
        
        l11 = new Label("Journey Details");
        l11.setLayoutX(700);
        l11.setLayoutY(180);
        l11.getStyleClass().addAll("my_customLabel1");
        
        l17 = new Label("Number of Tickets");
        l17.setLayoutX(600);
        l17.setLayoutY(330);
        l17.getStyleClass().addAll("my_customLabel3");
        
        l19 = new Label("Your ticket has been booked successfully.");
        l19.setLayoutX(650);
        l19.setLayoutY(330);
        l19.getStyleClass().addAll("my_customLabel3");
        l19.setTextFill(Color.web("green"));
        
        l21 = new Label("No Bookings");
        l21.setLayoutX(550);
        l21.setLayoutY(330);
        l21.getStyleClass().addAll("my_customLabel1");
        
        l22 = new Label("Update Details");
        l22.setLayoutX(550);
        l22.setLayoutY(200);
        l22.getStyleClass().addAll("my_customLabel1");
        
        l23 = new Label("User Id : ");
        l23.setLayoutX(200);
        l23.setLayoutY(280);
        l23.getStyleClass().addAll("my_customLabel3");
        
        l24 = new Label("First Name : ");
        l24.setLayoutX(550);
        l24.setLayoutY(280);
        l24.getStyleClass().addAll("my_customLabel3");
        
        l25 = new Label("Last Name : ");
        l25.setLayoutX(900);
        l25.setLayoutY(280);
        l25.getStyleClass().addAll("my_customLabel3");
        
        l26 = new Label("Address : ");
        l26.setLayoutX(200);
        l26.setLayoutY(320);
        l26.getStyleClass().addAll("my_customLabel3");
        
        l27 = new Label("Contact : ");
        l27.setLayoutX(550);
        l27.setLayoutY(320);
        l27.getStyleClass().addAll("my_customLabel3");
        
        l28 = new Label("Email : ");
        l28.setLayoutX(900);
        l28.setLayoutY(320);
        l28.getStyleClass().addAll("my_customLabel3");
        
        l29 = new Label("Sex : ");
        l29.setLayoutX(200);
        l29.setLayoutY(360);
        l29.getStyleClass().addAll("my_customLabel3");
        
        l30 = new Label("Date of Birth : ");
        l30.setLayoutX(550);
        l30.setLayoutY(360);
        l30.getStyleClass().addAll("my_customLabel3");
        
        l34 = new Label("Change Password");
        l34.setLayoutX(550);
        l34.setLayoutY(440);
        l34.getStyleClass().addAll("my_customLabel1");
        
        l35 = new Label("Recent Updates");
        l35.setLayoutX(550);
        l35.setLayoutY(200);
        l35.getStyleClass().addAll("my_customLabel1");
        
        l36 = new Label("Delay Schedule");
        l36.setLayoutX(200);
        l36.setLayoutY(310);
        l36.getStyleClass().addAll("my_customLabel1");
        
        l37 = new Label("Cancelled Flights");
        l37.setLayoutX(200);
        l37.setLayoutY(440);
        l37.getStyleClass().addAll("my_customLabel1");
        
        t1 = new TextField();
        t1.setPromptText("Enter Source");
        t1.setLayoutX(75);
        t1.setLayoutY(280);
        t1.setPrefHeight(30);
        t1.setPrefWidth(200);
        
        t2 = new TextField();
        t2.setPromptText("Enter Destination");
        t2.setLayoutX(75);
        t2.setLayoutY(330);
        t2.setPrefHeight(30);
        t2.setPrefWidth(200);
        
        t3 = new TextField();
        t3.setPromptText("Enter Date (dd/mm/yyyy)");
        t3.setLayoutX(75);
        t3.setLayoutY(380);
        t3.setPrefHeight(30);
        t3.setPrefWidth(200);
        
        t4 = new TextField();
        t4.setPromptText("Enter flight number");
        t4.setLayoutX(600);
        t4.setLayoutY(370);
        t4.setPrefHeight(30);
        t4.setPrefWidth(200);
        
        t5 = new TextField();
        t5.setPromptText("Enter your card number");
        t5.setLayoutX(700);
        t5.setLayoutY(390);
        t5.setPrefHeight(30);
        t5.setPrefWidth(200);
        
        t6 = new TextField();
        t6.setPromptText("Enter Reservation Id to cancel");
        t6.setLayoutX(450);
        t6.setLayoutY(450);
        t6.setPrefHeight(30);
        t6.setPrefWidth(200);
        
        p4 = new PasswordField();
        p4.setPromptText("Current Password");
        p4.setLayoutX(200);
        p4.setLayoutY(510);
        p4.setPrefHeight(30);
        p4.setPrefWidth(200);
        
        p5 = new PasswordField();
        p5.setPromptText("New Password");
        p5.setLayoutX(450);
        p5.setLayoutY(510);
        p5.setPrefHeight(30);
        p5.setPrefWidth(200);
        
        p6 = new PasswordField();
        p6.setPromptText("Re-Enter New Password");
        p6.setLayoutX(700);
        p6.setLayoutY(510);
        p6.setPrefHeight(30);
        p6.setPrefWidth(200);
        
        b3 = new Button("Search");
        b3.setLayoutX(75);
        b3.setLayoutY(470);
        b3.getStyleClass().addAll("button2");
        b3.setPrefHeight(30);
        b3.setPrefWidth(200);
        
        b4 = new Button("Search");
        b4.setLayoutX(850);
        b4.setLayoutY(370);
        b4.getStyleClass().addAll("button4");
        b4.setPrefHeight(20);
        b4.setPrefWidth(150);
        
        b5 = new Button("Book Now");
        b5.setLayoutX(520);
        b5.setLayoutY(530);
        b5.getStyleClass().addAll("button4");
        b5.setPrefHeight(20);
        b5.setPrefWidth(100);
        
        b6 = new Button("Book Now");
        b6.setLayoutX(640);
        b6.setLayoutY(530);
        b6.getStyleClass().addAll("button4");
        b6.setPrefHeight(20);
        b6.setPrefWidth(100);
        
        b7 = new Button("Book Now");
        b7.setLayoutX(760);
        b7.setLayoutY(530);
        b7.getStyleClass().addAll("button4");
        b7.setPrefHeight(20);
        b7.setPrefWidth(100);
        
        b8 = new Button("Book Now");
        b8.setLayoutX(880);
        b8.setLayoutY(530);
        b8.getStyleClass().addAll("button4");
        b8.setPrefHeight(20);
        b8.setPrefWidth(100);
        
        b9 = new Button("Book Now");
        b9.setLayoutX(1000);
        b9.setLayoutY(530);
        b9.getStyleClass().addAll("button4");
        b9.setPrefHeight(20);
        b9.setPrefWidth(100);
        
        b10 = new Button("Book Now");
        b10.setLayoutX(1120);
        b10.setLayoutY(530);
        b10.getStyleClass().addAll("button4");
        b10.setPrefHeight(20);
        b10.setPrefWidth(100);
        
        b11 = new Button("Confirm");
        b11.setLayoutX(850);
        b11.setLayoutY(330);
        b11.getStyleClass().addAll("button4");
        b11.setPrefHeight(17);
        b11.setPrefWidth(100);
        
        b12 = new Button("Make Payment");
        b12.setLayoutX(950);
        b12.setLayoutY(390);
        b12.getStyleClass().addAll("button4");
        b12.setPrefHeight(17);
        b12.setPrefWidth(200);
        
        b13 = new Button("Terminate Booking");
        b13.setLayoutX(200);
        b13.setLayoutY(100);
        b13.getStyleClass().addAll("button1");
        b13.setPrefHeight(58);
        b13.setPrefWidth(200);
        
        b14 = new Button("Cancel Booking");
        b14.setLayoutX(700);
        b14.setLayoutY(450);
        b14.getStyleClass().addAll("button4");
        b14.setPrefHeight(17);
        b14.setPrefWidth(200);
        
        b15 = new Button("View Ticket");
        b15.setLayoutX(400);
        b15.setLayoutY(100);
        b15.getStyleClass().addAll("button1");
        b15.setPrefHeight(58);
        b15.setPrefWidth(200);

        
        b16 = new Button("Updates");
        b16.setLayoutX(600);
        b16.setLayoutY(100);
        b16.getStyleClass().addAll("button1");
        b16.setPrefHeight(58);
        b16.setPrefWidth(200);
        
        b17 = new Button("Change Details");
        b17.setLayoutX(800);
        b17.setLayoutY(100);
        b17.getStyleClass().addAll("button1");
        b17.setPrefHeight(58);
        b17.setPrefWidth(200);
        
        b18 = new Button("Print Ticket");
        b18.setLayoutX(700);
        b18.setLayoutY(450);
        b18.getStyleClass().addAll("button4");
        b18.setPrefHeight(17);
        b18.setPrefWidth(200);
        
        b19 = new Button("Update");
        b19.setLayoutX(600);
        b19.setLayoutY(400);
        b19.getStyleClass().addAll("button4");
        b19.setPrefHeight(17);
        b19.setPrefWidth(200);
        
        b20 = new Button("Change Password");
        b20.setLayoutX(950);
        b20.setLayoutY(510);
        b20.getStyleClass().addAll("button4");
        b20.setPrefHeight(17);
        b20.setPrefWidth(200);
        
        col1 = new TableColumn("Flight Number");
        col2 = new TableColumn("Flight Name");
        col3 = new TableColumn("Source");
        col4 = new TableColumn("Departure Time");
        col5 = new TableColumn("Destination");
        col6 = new TableColumn("Arrival Time");
        
        col1.setMinWidth(113);
        col1.setCellValueFactory(new PropertyValueFactory<FlightSearch, String>("flightno"));
        
        col2.setMinWidth(200);
        col2.setCellValueFactory(new PropertyValueFactory<FlightSearch, String>("flightname"));
        
        col3.setMinWidth(135);
        col3.setCellValueFactory(new PropertyValueFactory<FlightSearch, String>("source"));
        
        col4.setMinWidth(100);
        col4.setCellValueFactory(new PropertyValueFactory<FlightSearch, String>("departure"));
        
        col5.setMinWidth(135);
        col5.setCellValueFactory(new PropertyValueFactory<FlightSearch, String>("destination"));
        
        col6.setMinWidth(100);
        col6.setCellValueFactory(new PropertyValueFactory<FlightSearch, String>("arrival"));
        
        
        
        col20 = new TableColumn("Flight Number");
        col21 = new TableColumn("Date");
        col22 = new TableColumn("Delay Time\n(hrs : min)");
        
        
        col20.setMinWidth(200);
        col20.setCellValueFactory(new PropertyValueFactory<FlightSearch, String>("flightno"));
        
        col21.setMinWidth(200);
        col21.setCellValueFactory(new PropertyValueFactory<FlightSearch, String>("date"));
        
        col22.setMinWidth(200);
        col22.setCellValueFactory(new PropertyValueFactory<FlightSearch, String>("delay"));
        
        col23 = new TableColumn("Flight Number");
        col24 = new TableColumn("Date");
        
        col23.setMinWidth(200);
        col23.setCellValueFactory(new PropertyValueFactory<FlightSearch, String>("flightno"));
        
        col24.setMinWidth(200);
        col24.setCellValueFactory(new PropertyValueFactory<FlightSearch, String>("date"));
        
    }
    
    public void userFunction (Pane root, User user, Login login, Admin admin) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/abs", "root", "password");
        
        l38 = new Label("Welcome " + login.user);
        l38.setLayoutX(1110);
        l38.setLayoutY(75);
        l38.getStyleClass().addAll("my_customLabel3");
        
        
        
        root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, b1, b2, b13, b15, b16, b17, b21, l38);
        
        cp = 0;
        l2added = 0;
        tblval = 0;
        s1added = 0;
        bg6added = 0;
        cp1p = 0;
        tbl1val = 0;
        
        b21.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                removepages(root);
            }
        });
        
        b1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                try {
                    login.login1(root, login, admin, user);
                } catch (Exception ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b16.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                removepages(root);
                
                
                table3 = new TableView<Delay>();
                table3.setEditable(true);
                table3.setLayoutX(550);
                table3.setLayoutY(280);
                table3.setPrefSize(600, 120);
                data3 = FXCollections.observableArrayList();
                table3.getColumns().addAll(col20, col21, col22);
                s3 = new ScrollPane(); 
                s3.setContent(table3);
                s3.setLayoutX(550);
                s3.setLayoutY(280);
                s3.setPrefSize(600, 120);

                table4 = new TableView<Cancel>();
                table4.setEditable(true);
                table4.setLayoutX(550);
                table4.setLayoutY(420);
                table4.setPrefSize(400, 120);
                data4 = FXCollections.observableArrayList();
                table4.getColumns().addAll(col23, col24);
                s4 = new ScrollPane(); 
                s4.setContent(table4);
                s4.setLayoutX(550);
                s4.setLayoutY(420);
                s4.setPrefSize(400, 120);
                
                
                
                try {
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("select * from delay");
                    
                    
                    
                    
                    while (rs.next()) {
                        data3.add(new Delay(rs.getString("flightno"), rs.getString("date"), rs.getString("delaytime")));
                    }
                    
                    table3.setItems(data3);
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                try {
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("select * from cancelflight");
                    
                    
                    
                    
                    while (rs.next()) {
                        data4.add(new Cancel(rs.getString("flightno"), rs.getString("date")));
                    }
                    
                    table4.setItems(data4);
                    
                    
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                root.getChildren().addAll(bg7, s3, s4, l35, l36, l37);
            }
        });
        
        b2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                removepages(root);
                cp = 1;
                root.getChildren().addAll(bg5, l1, t1, t2, t3, b3);
            }
        });
        
        b3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                removepage1(root);
                if (t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("")) {
                    if (l2added == 0) {
                        l2added = 1;
                        root.getChildren().add(l2);
                    }
                }
                else {
                    if (l2added == 1) {
                        l2added = 0;
                        root.getChildren().remove(l2);
                    }
                    Vector <String> v = null;
                    try {
                        v = new Vector(showflights(t1.getText(), t2.getText()));
                    } catch (Exception ex) {
                        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    table = new TableView<FlightSearch>();
                    table.setEditable(true);
                    table.setLayoutX(420);
                    table.setLayoutY(190);
                    table.setPrefSize(800, 170);
                    data = FXCollections.observableArrayList();
                    table.getColumns().addAll(col1, col2, col3, col4, col5, col6);
                    s = new ScrollPane(); 
                    s.setContent(table);
                    s.setLayoutX(420);
                    s.setLayoutY(190);
                    s.setPrefSize(800, 170);
                    root.getChildren().addAll(bg6);
                    bg6added = 1;
                    tblval = v.size()/6;
                    cp1p = 1;
                    if (v.size() != 0) {
                        for (int i = 0; i < v.size(); i += 6) {
                            data.add(new FlightSearch(v.get(i), v.get(i+1), v.get(i+2), v.get(i+3), v.get(i+4), v.get(i+5)));
                            table.setItems(data);
                        }
                        root.getChildren().addAll(s, t4, b4);
                    }
                    else {
                        l3 = new Label("No flight from " + t1.getText() + " to " + t2.getText());
                        l3.setLayoutX(620);
                        l3.setLayoutY(310);
                        l3.getStyleClass().addAll("my_customLabel1");
                        root.getChildren().add(l3);
                    }
                }
            }
        });
        
        b4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                try {
                    removebelow(root);
                    table1 = new TableView<Booking>();
                    data1 = FXCollections.observableArrayList();
                    
                    table1.setEditable(true);
                    table1.setLayoutX(510);
                    table1.setLayoutY(420);
                    table1.setPrefSize(700, 100);
                    getSeatFare(t4.getText());
                    addcol(t3.getText());
                    s1 = new ScrollPane();
                    s1.setContent(table1);
                    s1.setLayoutX(510);
                    s1.setLayoutY(420);
                    s1.setPrefSize(700, 100);
                    root.getChildren().addAll(s1, l4, l5);
                } catch (Exception ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
                data1.add(new Booking(Integer.toString(bclassseats-sb1), Integer.toString(eclassseats-se1), Integer.toString(bclassseats-sb2), Integer.toString(eclassseats-se2), Integer.toString(bclassseats-sb3), Integer.toString(eclassseats-se3)));
                data1.add(new Booking(Integer.toString(fb1), Integer.toString(fe1), Integer.toString(fb2), Integer.toString(fe2),Integer.toString(fb3), Integer.toString(fe3)));
                table1.setItems(data1);
                root.getChildren().addAll(b5, b6, b7, b8, b9, b10);
            }
        });
        
        b5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                type = "B";
                date = t3.getText();
                ff = fb1;
                root.getChildren().clear();
                root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, b1, b2);
                root.getChildren().addAll(bg5, l1, t1, t2, t3, b3, b13, b17, b15, b16);
                root.getChildren().addAll(bg6);
                callfunc(t4.getText(), date, type, t1.getText(), t2.getText(), root);
            }
        });
        
        b6.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                type = "E";
                date = t3.getText();
                ff = fe1;
                root.getChildren().clear();
                root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, b1, b2);
                root.getChildren().addAll(bg5, l1, t1, t2, t3, b3, b13, b17, b15, b16);
                root.getChildren().addAll(bg6);
                callfunc(t4.getText(), date, type, t1.getText(), t2.getText(), root);
            }
        });
        
        b7.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                type = "B";
                date = date1;
                ff = fb2;
                root.getChildren().clear();
                root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, b1, b2);
                root.getChildren().addAll(bg5, l1, t1, t2, t3, b3, b13, b17, b15, b16);
                root.getChildren().addAll(bg6);
                callfunc(t4.getText(), date, type, t1.getText(), t2.getText(), root);
            }
        });
        
        b8.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                type = "E";
                date = date1;
                ff = fe2;
                root.getChildren().clear();
                root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, b1, b2);
                root.getChildren().addAll(bg5, l1, t1, t2, t3, b3, b13, b17, b15, b16);
                root.getChildren().addAll(bg6);
                callfunc(t4.getText(), date, type, t1.getText(), t2.getText(), root);
            }
        });
        
        b9.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                type = "B";
                date = date2;
                ff = fb3;
                root.getChildren().clear();
                root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, b1, b2);
                root.getChildren().addAll(bg5, l1, t1, t2, t3, b3, b13, b17, b15, b16);
                root.getChildren().addAll(bg6);
                callfunc(t4.getText(), date, type, t1.getText(), t2.getText(), root);
            }
        });
        
        b10.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                type = "E";
                date = date2;
                ff = fe3;
                root.getChildren().clear();
                root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, b1, b2);
                root.getChildren().addAll(bg5, l1, t1, t2, t3, b3, b13, b17, b15, b16);
                root.getChildren().addAll(bg6);
                callfunc(t4.getText(), date, type, t1.getText(), t2.getText(), root);
            }
        });
        
        b11.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().remove(b11);
                int tmp = Integer.parseInt((String) combobox.getValue());
                ff = ff * Integer.parseInt((String) combobox.getValue());
                l18 = new Label("Total Payment : " + Integer.toString(ff) + " Rs");
                l18.setLayoutX(450);
                l18.setLayoutY(390);
                l18.getStyleClass().addAll("my_customLabel3");
                
                root.getChildren().addAll(b12, l18, t5);
            }
        });
        
        b12.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                root.getChildren().clear();
                root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, b1, b2);
                root.getChildren().addAll(bg5, l1, t1, t2, t3, b3, bg6, l19, b13, b15, b16, b17);
                t1.clear();
                t2.clear();
                t3.clear();
                
                String s = "", t = "";
                
                try {
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("select * from rid");
                    
                    while (rs.next())
                        s = rs.getString("id");
                    t = Integer.toString(Integer.parseInt(s)+1);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    PreparedStatement ps = connect.prepareStatement("update rid set id = ? where id = ?");
                    ps.setString(1, t);
                    ps.setString(2, s);
                    ps.executeUpdate();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    PreparedStatement ps = connect.prepareStatement("insert into ticketsbooked values (?, ?, ?, ?, ?, ?, ?)");
                    ps.setString(1, s);
                    ps.setString(2, t4.getText());
                    ps.setString(3, login.user);
                    ps.setString(4, date);
                    if (type.equals("E"))
                        ps.setString(5, (String) combobox.getValue());
                    else
                        ps.setString(5, "0");
                    if (type.equals("B"))
                        ps.setString(6, (String) combobox.getValue());
                    else
                        ps.setString(6, "0");
                    ps.setString(7, Integer.toString(ff));
                    ps.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b13.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                removepages(root);
                table2 = new TableView<TerminateBooking>();
                data2 = FXCollections.observableArrayList();
                    
                table2.setEditable(true);
                table2.setLayoutX(150);
                table2.setLayoutY(200);
                table2.setPrefSize(1050, 200);
                
                addcol2(root);
                
                int tmp = 0;
                
                table2.getColumns().addAll(col13, col14, col15, col16, col17, col18, col19);
                
                try {
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("select * from ticketsbooked");
                    //System.out.println("0");
                    while (rs.next()) {
                        if (rs.getString("userid").equals(login.user)) {
                            String a = rs.getString("reservationid");
                            String b = rs.getString("flightno");
                            String c = rs.getString("date");
                            String d = "", e = "", f, g;
                            int p2 = Integer.parseInt(rs.getString("bustickets"));
                            int p1 = Integer.parseInt(rs.getString("ecotickets"));
                            if (p1 > p2) {
                                f = rs.getString("ecotickets");
                                g = "Economy";
                            }
                            else {
                                f = rs.getString("bustickets");
                                g = "Business";
                            }
                            Statement st1 = connect.createStatement();
                            ResultSet rs1 = st1.executeQuery("select * from flight");
                            while (rs1.next()) {
                                if (rs1.getString("flightnumber").equals(b)) {
                                    d = rs1.getString("source");
                                    e = rs1.getString("destination");
                                    break;
                                }
                            }
                            tmp = 1;
                            data2.add(new TerminateBooking(a, b, c, d, e, f, g));
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
                table2.setItems(data2);
                
                s2 = new ScrollPane();
                s2.setContent(table2);
                s2.setLayoutX(150);
                s2.setLayoutY(200);
                s2.setPrefSize(1050, 200);
                root.getChildren().addAll(bg7);
                if (tmp == 1) {
                    root.getChildren().addAll(s2, t6, b14);
                }
                else
                    root.getChildren().addAll(l21);
                
                
            }
        });
        
        b14.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                String a = t6.getText();
                try {
                    PreparedStatement ps = connect.prepareStatement("delete from ticketsbooked where reservationid = ?");
                    ps.setString(1, a);
                    ps.executeUpdate();
                    l20 = new Label("Your ticket has been canceled.");
                    l20.setLayoutX(450);
                    l20.setLayoutY(330);
                    l20.getStyleClass().addAll("my_customLabel1");
                    l20.setTextFill(Color.web("green"));
                    root.getChildren().add(l20);
                    root.getChildren().removeAll(s2, t6, b14);
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b15.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                removepages(root);
                table2 = new TableView<TerminateBooking>();
                data2 = FXCollections.observableArrayList();
                    
                table2.setEditable(true);
                table2.setLayoutX(150);
                table2.setLayoutY(200);
                table2.setPrefSize(1050, 200);
                
                addcol2(root);
                
                int tmp = 0;
                
                table2.getColumns().addAll(col13, col14, col15, col16, col17, col18, col19);
                
                try {
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("select * from ticketsbooked");
                    //System.out.println("0");
                    while (rs.next()) {
                        if (rs.getString("userid").equals(login.user)) {
                            String a = rs.getString("reservationid");
                            String b = rs.getString("flightno");
                            String c = rs.getString("date");
                            String d = "", e = "", f, g;
                            int p2 = Integer.parseInt(rs.getString("bustickets"));
                            int p1 = Integer.parseInt(rs.getString("ecotickets"));
                            if (p1 > p2) {
                                f = rs.getString("ecotickets");
                                g = "Economy";
                            }
                            else {
                                f = rs.getString("bustickets");
                                g = "Business";
                            }
                            Statement st1 = connect.createStatement();
                            ResultSet rs1 = st1.executeQuery("select * from flight");
                            while (rs1.next()) {
                                if (rs1.getString("flightnumber").equals(b)) {
                                    d = rs1.getString("source");
                                    e = rs1.getString("destination");
                                    break;
                                }
                            }
                            tmp = 1;
                            data2.add(new TerminateBooking(a, b, c, d, e, f, g));
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
                table2.setItems(data2);
                
                s2 = new ScrollPane();
                s2.setContent(table2);
                s2.setLayoutX(150);
                s2.setLayoutY(200);
                s2.setPrefSize(1050, 200);
                root.getChildren().addAll(bg7);
                if (tmp == 1) {
                    root.getChildren().addAll(s2, t6, b18);
                }
                else
                    root.getChildren().addAll(l21);
            }
        });
        
        b17.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                removepages(root);
                root.getChildren().addAll(bg7, l22, l23, l24, l25, l26, l27, l28, l29, l30);
                
                l31 = new Label(login.user);
                l31.setLayoutX(300);
                l31.setLayoutY(280);
                l31.getStyleClass().addAll("my_customLabel3");
                
                l32 = new Label(login.sex);
                l32.setLayoutX(300);
                l32.setLayoutY(360);
                l32.getStyleClass().addAll("my_customLabel3");
                
                System.out.println(login.dob);
                
                l33 = new Label(login.dob);
                l33.setLayoutX(670);
                l33.setLayoutY(360);
                l33.getStyleClass().addAll("my_customLabel3");
                
                t7 = new TextField(login.first);
                t7.setLayoutX(670);
                t7.setLayoutY(280);
                t7.setPrefHeight(30);
                t7.setPrefWidth(200);
                
                t8 = new TextField(login.last);
                t8.setLayoutX(1000);
                t8.setLayoutY(280);
                t8.setPrefHeight(30);
                t8.setPrefWidth(200);
                
                t9 = new TextField(login.address);
                t9.setLayoutX(300);
                t9.setLayoutY(320);
                t9.setPrefHeight(30);
                t9.setPrefWidth(200);
                
                t10 = new TextField(login.contact);
                t10.setLayoutX(670);
                t10.setLayoutY(320);
                t10.setPrefHeight(30);
                t10.setPrefWidth(200);
                
                t11 = new TextField(login.email);
                t11.setLayoutX(1000);
                t11.setLayoutY(320);
                t11.setPrefHeight(30);
                t11.setPrefWidth(200);
                
                root.getChildren().addAll(l31, l32, l33, t7, t8, t9, t10, t11, b19, l34, p4, p5, p6, b20);
            }
        });
        
        b19.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                try {
                    PreparedStatement ps = connect.prepareStatement("update user set firstname = ?, lastname = ?, address = ?, contact = ?, email = ? where userid = ?");
                    ps.setString(1, t7.getText());
                    login.first = t7.getText();
                    ps.setString(2, t8.getText());
                    login.last = t8.getText();
                    ps.setString(3, t9.getText());
                    login.address = t9.getText();
                    ps.setString(4, t10.getText());
                    login.contact = t10.getText();
                    ps.setString(5, t11.getText());
                    login.email = t11.getText();
                    ps.setString(6, login.user);
                    ps.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b18.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                Stage primaryStage = new Stage();
                Pane tmp = new Pane();
                tmp.getStylesheets().add(getClass().getResource("CSS1.css").toExternalForm());
                ImageView ti = new ImageView(new Image(Login.class.getResourceAsStream("files/eTicket.png")));
                Label tl1 = new Label(t6.getText());
                tl1.setLayoutX(940);
                tl1.setLayoutY(27);
                tl1.getStyleClass().addAll("my_customLabel3");
                Label tl2 = new Label(login.first + " " + login.last);
                tl2.setLayoutX(170);
                tl2.setLayoutY(295);
                tl2.getStyleClass().addAll("my_customLabel3");
                String a = "", b = "", c = "", d = "", e = "", f = "", g = "", h = "", i = "";
                try {
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("select * from ticketsbooked");
                    while (rs.next()) {
                        if (rs.getString("reservationid").equals(t6.getText())) {
                            a = rs.getString("flightno");
                            c = rs.getString("date");
                            if (rs.getString("ecotickets").equals("0")) {
                                h = "Business";
                                i = rs.getString("bustickets");
                            }
                            else {
                                h = "Economy";
                                i = rs.getString("ecotickets");
                            }
                            break;
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try {
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("select * from flight");
                    while (rs.next()) {
                        if (rs.getString("flightnumber").equals(a)) {
                            b = rs.getString("flightname");
                            d = rs.getString("source");
                            e = rs.getString("arrivaltimehours") + " : " + rs.getString("arrivaltimemin");
                            f = rs.getString("destination");
                            g = rs.getString("departuretimehours") + " : " + rs.getString("departuretimemin");
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Label tl3 = new Label(a);
                tl3.setLayoutX(200);
                tl3.setLayoutY(103);
                tl3.getStyleClass().addAll("my_customLabel3");
                
                Label tl4 = new Label(b);
                tl4.setLayoutX(595);
                tl4.setLayoutY(103);
                tl4.getStyleClass().addAll("my_customLabel3");
                
                Label tl5 = new Label(c);
                tl5.setLayoutX(930);
                tl5.setLayoutY(103);
                tl5.getStyleClass().addAll("my_customLabel3");
                
                Label tl6 = new Label(d);
                tl6.setLayoutX(240);
                tl6.setLayoutY(160);
                tl6.getStyleClass().addAll("my_customLabel3");
                
                Label tl7 = new Label(e);
                tl7.setLayoutX(610);
                tl7.setLayoutY(160);
                tl7.getStyleClass().addAll("my_customLabel3");
                
                Label tl8 = new Label(f);
                tl8.setLayoutX(240);
                tl8.setLayoutY(190);
                tl8.getStyleClass().addAll("my_customLabel3");
                
                Label tl9 = new Label(g);
                tl9.setLayoutX(610);
                tl9.setLayoutY(190);
                tl9.getStyleClass().addAll("my_customLabel3");
                
                Label tl10 = new Label(h);
                tl10.setLayoutX(170);
                tl10.setLayoutY(250);
                tl10.getStyleClass().addAll("my_customLabel3");
                
                Label tl11 = new Label(i);
                tl11.setLayoutX(590);
                tl11.setLayoutY(250);
                tl11.getStyleClass().addAll("my_customLabel3");
                
                tmp.getChildren().addAll(ti, tl1, tl2, tl3, tl4, tl5, tl6, tl7, tl8, tl9, tl10, tl11);
                Scene scene = new Scene (tmp, 1100, 470);
                primaryStage.setScene(scene);
                primaryStage.show();
            }
        });
        
        
        b20.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                if (p4.getText().equals(login.pass) && p6.getText().equals(p5.getText())) {
                    try {
                        PreparedStatement ps = connect.prepareStatement("update user set password = ? where userid = ?");
                        ps.setString(1, p5.getText());
                        ps.setString(2, login.user);
                        ps.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    p6.clear();
                    p4.clear();
                    p5.clear();
                }
            }
        });
    }
    
    public void addcol2 (Pane root) {
        col13 = new TableColumn("Reservation Id");
        col14 = new TableColumn("Flight No.");
        col15 = new TableColumn("Date");
        col16 = new TableColumn("Source");
        col17 = new TableColumn("Destination");
        col18 = new TableColumn("Tickets");
        col19 = new TableColumn("Class");
        
        col13.setMinWidth(150);
        col13.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("rid"));
        
        col14.setMinWidth(150);
        col14.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("flightno"));
        
        col15.setMinWidth(150);
        col15.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("date"));
        
        col16.setMinWidth(150);
        col16.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("source"));
        
        col17.setMinWidth(150);
        col17.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("destination"));
        
        col18.setMinWidth(150);
        col18.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("tickets"));
        
        col19.setMinWidth(150);
        col19.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("cls"));
    }
    
    public void callfunc(String flight, String dt, String tp, String src, String dest, Pane root) {
        root.getChildren().addAll(l11, l6, l7, l8, l9, l10);
        
        l12 = new Label(flight);
        l12.setLayoutX(520);
        l12.setLayoutY(250);
        l12.getStyleClass().addAll("my_customLabel3");
        
        l13 = new Label(dt);
        l13.setLayoutX(870);
        l13.setLayoutY(250);
        l13.getStyleClass().addAll("my_customLabel3");
        
        if (tp.equals("E"))
            tp = "Economy";
        else
            tp = "Business";
        
        l14 = new Label(tp);
        l14.setLayoutX(1120);
        l14.setLayoutY(250);
        l14.getStyleClass().addAll("my_customLabel3");
        
        l15 = new Label(src);
        l15.setLayoutX(520);
        l15.setLayoutY(280);
        l15.getStyleClass().addAll("my_customLabel3");
        
        l16 = new Label(dest);
        l16.setLayoutX(870);
        l16.setLayoutY(280);
        l16.getStyleClass().addAll("my_customLabel3");
        
        root.getChildren().addAll(l12, l13, l14, l15, l16, l17, combobox, b11);
    }
    
    public void getSeatFare(String a) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/abs", "root", "password");
        
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from flight");
        
        while (rs.next()) {
            if (rs.getString("flightnumber").equals(a)) {
                bclassseats = Integer.parseInt(rs.getString("businessclassseats"));
                bclassfare = Integer.parseInt(rs.getString("businessclassfare"));
                eclassseats = Integer.parseInt(rs.getString("economyclassseats"));
                eclassfare = Integer.parseInt(rs.getString("economyclassfare"));
                break;
            }
        }
    }
    
    public void getSeats(String a, String b, String c, String d) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/abs", "root", "password");
        
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from ticketsbooked");
        
        se1 = 0;
        sb1 = 0;
        se2 = 0;
        sb2 = 0;
        se3 = 0;
        sb3 = 0;
        
        while (rs.next()) {
            if (rs.getString("flightno").equals(a) && rs.getString("date").equals(b)) {
                se1 += Integer.parseInt(rs.getString("ecotickets"));
                sb1 += Integer.parseInt(rs.getString("bustickets"));
            }
            if (rs.getString("flightno").equals(a) && rs.getString("date").equals(c)) {
                se2 += Integer.parseInt(rs.getString("ecotickets"));
                sb2 += Integer.parseInt(rs.getString("bustickets"));
            }
            if (rs.getString("flightno").equals(a) && rs.getString("date").equals(d)) {
                se3 += Integer.parseInt(rs.getString("ecotickets"));
                sb3 += Integer.parseInt(rs.getString("bustickets"));
            }
        }
    }
    
    public void getFare(String a, String b, String c, String d) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/abs", "root", "password");
        
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from scheme");
        
        fe1 = eclassfare;
        fe2 = eclassfare;
        fe3 = eclassfare;
        
        fb1 = bclassfare;
        fb2 = bclassfare;
        fb3 = bclassfare;
        
        
        while (rs.next()) {
            if (rs.getString("flightno").equals(a) && rs.getString("date").equals(b)) {
                fe1 = Integer.parseInt(rs.getString("ecofare"));
                fb1 = Integer.parseInt(rs.getString("busfare"));
            }
            if (rs.getString("flightno").equals(a) && rs.getString("date").equals(c)) {
                fe2 = Integer.parseInt(rs.getString("ecofare"));
                fb2 = Integer.parseInt(rs.getString("busfare"));
            }
            if (rs.getString("flightno").equals(a) && rs.getString("date").equals(d)) {
                fe3 = Integer.parseInt(rs.getString("ecofare"));
                fb3 = Integer.parseInt(rs.getString("busfare"));
            }
        }
    }
    
    public void addcol(String a) throws Exception {
        
        col7 = new TableColumn(a+"\n  Business");
        col8 = new TableColumn(a+"\n   Economy");
        
        
        String b = "", c = "", d = "";
        
        b += a.charAt(0);
        b += a.charAt(1);
        
        c += a.charAt(3);
        c += a.charAt(4);
        
        d += a.charAt(6);
        d += a.charAt(7);
        d += a.charAt(8);
        d += a.charAt(9);
        
        int x = Integer.parseInt(b), y = Integer.parseInt(c), z = Integer.parseInt(d);
        
        if (x == 31 && y == 12) {
            z++;
            x = 1;
            y = 1;
        }
        else if (x == 31 && (y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12)) {
            x = 1;
            y++;
        }
        else if (x == 30 && (y == 4 || y == 6 || y == 9 || y == 11)) {
            x = 1;
            y++;
        }
        else if (x == 28 && y == 2) {
            x = 1;
            y++;
        }
        else
            x++;
        
        b = "";
        if (x < 10) {
            b += "0";
            b += Integer.toString(x);
        }
        else
            b += Integer.toString(x);
        b += "/";
        if (y < 10) {
            b += "0";
            b += Integer.toString(y);
        }
        else
            b += Integer.toString(y);
        b += "/";
        b += Integer.toString(z);
        date1 = b;
        
        col9 = new TableColumn(b+"\n  Business");
        col10 = new TableColumn(b+"\n   Economy");
        
        if (x == 31 && y == 12) {
            z++;
            x = 1;
            y = 1;
        }
        else if (x == 31 && (y == 1 || y == 3 || y == 5 || y == 7 || y == 8 || y == 10 || y == 12)) {
            x = 1;
            y++;
        }
        else if (x == 30 && (y == 4 || y == 6 || y == 9 || y == 11)) {
            x = 1;
            y++;
        }
        else if (x == 28 && y == 2) {
            x = 1;
            y++;
        }
        else
            x++;
        
        c = "";
        if (x < 10) {
            c += "0";
            c += Integer.toString(x);
        }
        else
            c += Integer.toString(x);
        c += "/";
        if (y < 10) {
            c += "0";
            c += Integer.toString(y);
        }
        else
            c += Integer.toString(y);
        c += "/";
        c += Integer.toString(z);
        
        date2 = c;
        
        getSeats(t4.getText(), a, b, c);
        getFare(t4.getText(), a, b, c);
        
        col11 = new TableColumn(c+"\n  Business");
        col12 = new TableColumn(c+"\n   Economy");
        
        
        col7.setMinWidth(120);
        col7.setCellValueFactory(new PropertyValueFactory<Booking, String>("b1"));
        
        col8.setMinWidth(120);
        col8.setCellValueFactory(new PropertyValueFactory<Booking, String>("e1"));
        
        col9.setMinWidth(120);
        col9.setCellValueFactory(new PropertyValueFactory<Booking, String>("b2"));
        
        col10.setMinWidth(120);
        col10.setCellValueFactory(new PropertyValueFactory<Booking, String>("e2"));
        
        col11.setMinWidth(120);
        col11.setCellValueFactory(new PropertyValueFactory<Booking, String>("b3"));
        
        col12.setMinWidth(120);
        col12.setCellValueFactory(new PropertyValueFactory<Booking, String>("e3"));
        
        table1.getColumns().addAll(col7, col8, col9, col10, col11, col12);
    }
    
    public Vector <String> showflights(String t1, String t2) throws Exception {
        Vector <String> v = new Vector <String>();
        
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/abs", "root", "password");
        
        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery("select * from flight");
        while (rs.next()) {
            if (rs.getString("source").equals(t1) && rs.getString("destination").equals(t2)) {
                v.add(rs.getString("flightnumber"));
                v.add(rs.getString("flightname"));
                v.add(rs.getString("source"));
                v.add(new String(rs.getString("departuretimehours") + ":" + rs.getString("departuretimemin")));
                v.add(rs.getString("destination"));
                v.add(new String(rs.getString("arrivaltimehours") + ":" + rs.getString("arrivaltimemin")));
            }
        }
        return v;
    }
    
    public void removepages(Pane root) {
        root.getChildren().clear();
        root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, b1, b2, b13, b15, b16, b17, b21, l38);
        
        t1.clear();
        t2.clear();
        t3.clear();
        t4.clear();
        t5.clear();
        t6.clear();
        p6.clear();
        p4.clear();
        p5.clear();
        combobox.getSelectionModel().selectFirst();
    }
    
    public void removepage1(Pane root) {
        root.getChildren().clear();
        root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, b1, b2, b13, b15, b16, b17, b21, l38);
        combobox.getSelectionModel().selectFirst();
        t4.clear();
        t5.clear();
        p6.clear();
        p4.clear();
        p5.clear();
        root.getChildren().addAll(bg5, l1, t1, t2, t3, b3);
    }
    
    public void removebelow(Pane root) {
        root.getChildren().clear();
        root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, b1, b2, b13, b15, b16, b17, b21, l38);
        root.getChildren().addAll(bg5, l1, t1, t2, t3, b3, bg6, s, t4, b4);
        combobox.getSelectionModel().selectFirst();
        t5.clear();
        p6.clear();
        p4.clear();
        p5.clear();
    }
}