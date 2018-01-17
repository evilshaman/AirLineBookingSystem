package airlinebookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

public class Admin {
    
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13;
    private ImageView bg, bg1, bg2, bg3, bg4, bg5, img1, bg6, bg7, bg8, bg9, bg10, bg11, bg12;
    private Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15, l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27, l28, l29, l30, l31;
    private PasswordField p1, p2, p3, p4, p5, p6;
    private int cp, bg1added, l4added, l9added;
    private TextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19;
    private ToggleGroup group;
    private RadioButton domestic, international;
    private ComboBox combobox1, combobox2, combobox3, combobox4, combobox5, combobox6;
    private TableView<PassengerInfo> table;
    private ObservableList<PassengerInfo> data = FXCollections.observableArrayList();
    private ScrollPane s;
    TableColumn col1, col2, col3, col4, col5, col6, col7;
    
    private ObservableList<String> siteList = FXCollections.observableArrayList("00", "01", "02", "03", "04", "05", "06", "07",
                                                                        "08", "09", "10", "11", "12", "13", "14", "15",
                                                                        "16", "17", "18", "19", "20", "21", "22", "23");
    
    private ObservableList<String> siteList1 = FXCollections.observableArrayList("00", "01", "02", "03", "04", "05", "06", "07",
                                                                        "08", "09", "10", "11", "12", "13", "14", "15",
                                                                        "16", "17", "18", "19", "20", "21", "22", "23",
                                                                        "24", "25", "26", "27", "28", "29", "30", "31",
                                                                        "32", "33", "34", "35", "36", "37", "38", "39",
                                                                        "40", "41", "42", "43", "44", "45", "46", "47",
                                                                        "48", "49", "50", "51", "52", "53", "54", "55",
                                                                        "56", "57", "58", "59");
    
    public void adminLayout() {
        
        combobox1 = new ComboBox(siteList);
        combobox1.getSelectionModel().selectFirst();
        combobox1.setLayoutX(870);
        combobox1.setLayoutY(470);
        
        combobox2 = new ComboBox(siteList1);
        combobox2.getSelectionModel().selectFirst();
        combobox2.setLayoutX(940);
        combobox2.setLayoutY(470);
        
        combobox3 = new ComboBox(siteList);
        combobox3.getSelectionModel().selectFirst();
        combobox3.setLayoutX(730);
        combobox3.setLayoutY(470);
        
        combobox4 = new ComboBox(siteList1);
        combobox4.getSelectionModel().selectFirst();
        combobox4.setLayoutX(800);
        combobox4.setLayoutY(470);
        
        bg = new ImageView(new Image(Admin.class.getResourceAsStream("files/U.png")));
        bg.setX(0);
        bg.setY(0);
        
        bg1 = new ImageView(new Image(Admin.class.getResourceAsStream("files/moscow.jpg")));
        bg1.setX(0);
        bg1.setY(150);
        
        bg2 = new ImageView(new Image(Admin.class.getResourceAsStream("files/img.png")));
        bg2.setX(0);
        bg2.setY(100);
        
        bg3 = new ImageView(new Image(Admin.class.getResourceAsStream("files/AI.png")));
        bg3.setX(35);
        bg3.setY(5);
        
        bg4 = new ImageView(new Image(Admin.class.getResourceAsStream("files/maharaja.png")));
        bg4.setX(1250);
        bg4.setY(50);
        
        bg5 = new ImageView(new Image(Admin.class.getResourceAsStream("files/box1.png")));
        bg5.setX(350);
        bg5.setY(180);
        
        bg6 = new ImageView(new Image(Admin.class.getResourceAsStream("files/line.png")));
        bg6.setX(670);
        bg6.setY(245);

        bg7 = new ImageView(new Image(Admin.class.getResourceAsStream("files/box4.png")));
        bg7.setX(100);
        bg7.setY(180);
        
        bg10 = new ImageView(new Image(Admin.class.getResourceAsStream("files/box.png")));
        bg10.setX(870);
        bg10.setY(180);
        
        l1 = new Label("Welcome Admin");
        l1.setLayoutX(1110);
        l1.setLayoutY(75);
        l1.getStyleClass().addAll("my_customLabel3");
        
        b1 = new Button("Sign out");
        b1.setLayoutX(1100);
        b1.setLayoutY(125);
        b1.getStyleClass().addAll("button3");
        
        b13 = new Button("Home");
        b13.setLayoutX(1100);
        b13.setLayoutY(100);
        b13.getStyleClass().addAll("button3");
        
        b2 = new Button("New Airline Entry");
        b2.setLayoutX(0);
        b2.setLayoutY(100);
        b2.getStyleClass().addAll("button1");
        b2.setPrefHeight(58);
        b2.setPrefWidth(200);
        
        b3 = new Button("Edit Details");
        b3.setLayoutX(200);
        b3.setLayoutY(100);
        b3.getStyleClass().addAll("button1");
        b3.setPrefHeight(58);
        b3.setPrefWidth(200);
        
        b4 = new Button("View Status of Flight");
        b4.setLayoutX(400);
        b4.setLayoutY(100);
        b4.getStyleClass().addAll("button1");
        b4.setPrefHeight(58);
        b4.setPrefWidth(200);
        
        b5 = new Button("Passenger Info");
        b5.setLayoutX(600);
        b5.setLayoutY(100);
        b5.getStyleClass().addAll("button1");
        b5.setPrefHeight(58);
        b5.setPrefWidth(200);
        
        b6 = new Button("Change Password");
        b6.setLayoutX(800);
        b6.setLayoutY(100);
        b6.getStyleClass().addAll("button1");
        b6.setPrefHeight(58);
        b6.setPrefWidth(200);
        
        b7 = new Button("Submit");
        b7.setLayoutX(590);
        b7.setLayoutY(530);
        b7.getStyleClass().addAll("button2");
        b7.setPrefHeight(30);
        b7.setPrefWidth(200);
        
        l2 = new Label(" Change\nPassword");
        l2.setLayoutX(960);
        l2.setLayoutY(180);
        l2.getStyleClass().addAll("my_customLabel1");
        
        p1 = new PasswordField();
        p1.setPromptText("Old Password");
        p1.setLayoutX(920);
        p1.setLayoutY(320);
        p1.setPrefHeight(40);
        p1.setPrefWidth(260);
        
        p2 = new PasswordField();
        p2.setPromptText("New Password");
        p2.setLayoutX(920);
        p2.setLayoutY(380);
        p2.setPrefHeight(40);
        p2.setPrefWidth(260);
        
        p3 = new PasswordField();
        p3.setPromptText("Re-enter New Password");
        p3.setLayoutX(920);
        p3.setLayoutY(440);
        p3.setPrefHeight(40);
        p3.setPrefWidth(260);
        
        l3 = new Label("Password Changed Successfully !!");
        l3.setLayoutX(940);
        l3.setLayoutY(285);
        l3.getStyleClass().addAll("my_customLabel");
        l3.setTextFill(Color.web("green"));
        
        l4 = new Label("Enter all details !!");
        l4.setLayoutX(630);
        l4.setLayoutY(510);
        l4.getStyleClass().addAll("my_customLabel");
        l4.setTextFill(Color.web("red"));
        
        l5 = new Label("Incorrect details !!");
        l5.setLayoutX(985);
        l5.setLayoutY(285);
        l5.getStyleClass().addAll("my_customLabel");
        l5.setTextFill(Color.web("red"));
        
        l6 = new Label("Enter Flight Details");
        l6.setLayoutX(530);
        l6.setLayoutY(185);
        l6.getStyleClass().addAll("my_customLabel1");
        
        l7 = new Label("Arrival Time (hrs : min)");
        l7.setLayoutX(875);
        l7.setLayoutY(450);
        l7.getStyleClass().addAll("my_customLabel2");
        
        l8 = new Label("Departure Time (hrs : min)");
        l8.setLayoutX(725);
        l8.setLayoutY(450);
        l8.getStyleClass().addAll("my_customLabel2");
        
        l9 = new Label("Successfully Submitted");
        l9.setLayoutX(610);
        l9.setLayoutY(510);
        l9.getStyleClass().addAll("my_customLabel");
        l9.setTextFill(Color.web("green"));
        
        
        t1 = new TextField();
        t1.setPromptText("Flight Number");
        t1.setLayoutX(420);
        t1.setLayoutY(250);
        t1.setPrefHeight(30);
        t1.setPrefWidth(200);
        
        t2 = new TextField();
        t2.setPromptText("Flight Name");
        t2.setLayoutX(420);
        t2.setLayoutY(300);
        t2.setPrefHeight(30);
        t2.setPrefWidth(200);
        
        t3 = new TextField();
        t3.setPromptText("Source");
        t3.setLayoutX(420);
        t3.setLayoutY(350);
        t3.setPrefHeight(30);
        t3.setPrefWidth(200);
        
        t4 = new TextField();
        t4.setPromptText("Destination");
        t4.setLayoutX(420);
        t4.setLayoutY(400);
        t4.setPrefHeight(30);
        t4.setPrefWidth(200);
        
        t5 = new TextField();
        t5.setPromptText("Journey Distance in km");
        t5.setLayoutX(420);
        t5.setLayoutY(450);
        t5.setPrefHeight(30);
        t5.setPrefWidth(200);
        
        t6 = new TextField();
        t6.setPromptText("Number of seats in Business class");
        t6.setLayoutX(750);
        t6.setLayoutY(250);
        t6.setPrefHeight(30);
        t6.setPrefWidth(200);
        
        t7 = new TextField();
        t7.setPromptText("Fare of Business Class in Rupees");
        t7.setLayoutX(750);
        t7.setLayoutY(300);
        t7.setPrefHeight(30);
        t7.setPrefWidth(200);
        
        t8 = new TextField();
        t8.setPromptText("Number of seats in Economy class");
        t8.setLayoutX(750);
        t8.setLayoutY(350);
        t8.setPrefHeight(30);
        t8.setPrefWidth(200);
        
        t9 = new TextField();
        t9.setPromptText("Fare of Economy Class in Rupees");
        t9.setLayoutX(750);
        t9.setLayoutY(400);
        t9.setPrefHeight(30);
        t9.setPrefWidth(200);
        
        b8 = new Button("Submit");
                b8.setLayoutX(170);
                b8.setLayoutY(500);
                b8.getStyleClass().addAll("button2");
                b8.setPrefHeight(30);
                b8.setPrefWidth(200);
                
                b9 = new Button("Submit");
                b9.setLayoutX(550);
                b9.setLayoutY(500);
                b9.getStyleClass().addAll("button2");
                b9.setPrefHeight(30);
                b9.setPrefWidth(200);
                
                b10 = new Button("Submit");
                b10.setLayoutX(940);
                b10.setLayoutY(500);
                b10.getStyleClass().addAll("button2");
                b10.setPrefHeight(30);
                b10.setPrefWidth(200);
        
        b11 = new Button("Submit");
        b11.setLayoutX(800);
        b11.setLayoutY(250);
        b11.getStyleClass().addAll("button4");
        b11.setPrefHeight(18);
        b11.setPrefWidth(200);
        
        b12 = new Button("Change");
        b12.setLayoutX(960);
        b12.setLayoutY(500);
        b12.getStyleClass().addAll("button2");
        b12.setPrefHeight(18);
        b12.setPrefWidth(200);
                
        group = new ToggleGroup();
        domestic = new RadioButton("Domestic");
        domestic.setToggleGroup(group);
        international = new RadioButton("International");
        international.setToggleGroup(group);
        
        domestic.setLayoutX(420);
        domestic.setLayoutY(490);
        
        international.setLayoutX(520);
        international.setLayoutY(490);
        
    }
    
    public void adminFunction(Pane root, Login login, Admin admin, User user) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/abs", "root", "password");
        
        root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, l1, b1, b2, b3, b4, b5, b6, b13);
        
        
        b13.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e) {
                removepages(root);
            }
        });
        
        
        
        b1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e) {
                root.getChildren().clear();
                try {
                    login.login1(root, login, admin, user);
                } catch (Exception ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e) {
                removepages(root);
                root.getChildren().addAll(bg5, l6, t1, t2, t3, t4, international, domestic, bg6, t5);
                root.getChildren().addAll(combobox1, combobox2, combobox3, combobox4, l7, l8, t6, t7, t8, t9, b7);
            }
        });
        
        b3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e) {
                removepages(root);
                
                l10 = new Label("Cancel Flight");
                l10.setLayoutX(170);
                l10.setLayoutY(210);
                l10.getStyleClass().addAll("my_customLabel4");
                
                l11 = new Label("Delay in Flight");
                l11.setLayoutX(540);
                l11.setLayoutY(210);
                l11.getStyleClass().addAll("my_customLabel4");
                
                l12 = new Label("Change Price");
                l12.setLayoutX(940);
                l12.setLayoutY(210);
                l12.getStyleClass().addAll("my_customLabel4");
                
                bg8 = new ImageView(new Image(Admin.class.getResourceAsStream("files/line.png")));
                bg8.setLayoutX(440);
                bg8.setLayoutY(230);
               
                bg9 = new ImageView(new Image(Admin.class.getResourceAsStream("files/line.png")));
                bg9.setLayoutX(840);
                bg9.setLayoutY(230);
                
                t17 = new TextField();
                t17.setPromptText("Enter flight number");
                t17.setLayoutX(170);
                t17.setLayoutY(300);
                t17.setPrefHeight(30);
                t17.setPrefWidth(200);
                
                t10 = new TextField();
                t10.setPromptText("Enter date (dd/mm/yyyy)");
                t10.setLayoutX(170);
                t10.setLayoutY(350);
                t10.setPrefHeight(30);
                t10.setPrefWidth(200);
                
                t11 = new TextField();
                t11.setPromptText("Enter flight number");
                t11.setLayoutX(550);
                t11.setLayoutY(300);
                t11.setPrefHeight(30);
                t11.setPrefWidth(200);
                
                t12 = new TextField();
                t12.setPromptText("Enter date (dd/mm/yyyy)");
                t12.setLayoutX(550);
                t12.setLayoutY(350);
                t12.setPrefHeight(30);
                t12.setPrefWidth(200);
                
                t13 = new TextField();
                t13.setPromptText("Enter flight number");
                t13.setLayoutX(940);
                t13.setLayoutY(300);
                t13.setPrefHeight(30);
                t13.setPrefWidth(200);
                
                t14 = new TextField();
                t14.setPromptText("Enter date (dd/mm/yyyy)");
                t14.setLayoutX(940);
                t14.setLayoutY(350);
                t14.setPrefHeight(30);
                t14.setPrefWidth(200);
                
                t15 = new TextField();
                t15.setPromptText("New Price for Business class");
                t15.setLayoutX(940);
                t15.setLayoutY(400);
                t15.setPrefHeight(30);
                t15.setPrefWidth(200);
                
                t16 = new TextField();
                t16.setPromptText("New Price for Economy class");
                t16.setLayoutX(940);
                t16.setLayoutY(450);
                t16.setPrefHeight(30);
                t16.setPrefWidth(200);
                
                l13 = new Label("Delay Time (hrs : min)");
                l13.setLayoutX(550);
                l13.setLayoutY(400);
                l13.getStyleClass().addAll("my_customLabel");
                        
                combobox5 = new ComboBox(siteList);
                combobox5.getSelectionModel().selectFirst();
                combobox5.setLayoutX(550);
                combobox5.setLayoutY(430);

                combobox6 = new ComboBox(siteList1);
                combobox6.getSelectionModel().selectFirst();
                combobox6.setLayoutX(650);
                combobox6.setLayoutY(430);
                
                
                
                root.getChildren().addAll(bg7, l10, l11, l12, l13, bg8, bg9, b8, b9, b10, t17, t10, t11, t12, t13, t14, t15, t16, combobox5, combobox6);
            }
        });
        
        b8.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                String a = t17.getText();
                String b = t10.getText();
                try {
                    PreparedStatement ps = connect.prepareStatement("insert into cancelflight values(?, ?)");
                    ps.setString(1, a);
                    ps.setString(2, b);
                    ps.executeUpdate();
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
                t17.clear();
                t10.clear();
            }
        });
        
        b9.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                String a = t11.getText();
                String b = t12.getText();
                String c = (String) combobox5.getValue();
                String d = (String) combobox6.getValue();
                try {
                    PreparedStatement ps = connect.prepareStatement("insert into delay values (?, ?, ?)");
                    ps.setString(1, a);
                    ps.setString(2, b);
                    ps.setString(3, c+" : "+d);
                    ps.executeUpdate();
                    t11.clear();
                    t12.clear();
                    combobox5.getSelectionModel().selectFirst();
                    combobox6.getSelectionModel().selectFirst();
                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b6.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                removepages(root);
                
                l28 = new Label(" Change\nPassword");
                l28.setLayoutX(980);
                l28.setLayoutY(190);
                l28.getStyleClass().addAll("my_customLabel4");
                
                p4 = new PasswordField();
                p4.setPromptText("Current Password");
                p4.setLayoutX(960);
                p4.setLayoutY(320);
                p4.setPrefHeight(30);
                p4.setPrefWidth(200);
                
                p5 = new PasswordField();
                p5.setPromptText("New Password");
                p5.setLayoutX(960);
                p5.setLayoutY(370);
                p5.setPrefHeight(30);
                p5.setPrefWidth(200);
                
                p6 = new PasswordField();
                p6.setPromptText("Re-Enter New Password");
                p6.setLayoutX(960);
                p6.setLayoutY(420);
                p6.setPrefHeight(30);
                p6.setPrefWidth(200);
                
                root.getChildren().addAll(bg10, l28, p4, p5, p6, b12);
            }
        });
        
        
        b12.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                if (p4.getText().equals(login.pass) && p5.getText().equals(p6.getText())) {
                    login.pass = p5.getText();
                    
                    try {
                        PreparedStatement ps = connect.prepareStatement("update admin set password = ? where userid = ?");
                        ps.setString(1, p5.getText());
                        ps.setString(2, "admin");
                        ps.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    p4.clear();
                    p5.clear();
                    p6.clear();
                }
            }
        });
        
        b4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                removepages(root);
                l14 = new Label("View Status");
                l14.setLayoutX(550);
                l14.setLayoutY(190);
                l14.getStyleClass().addAll("my_customLabel1");
                
                t18 = new TextField();
                t18.setPromptText("Enter flight number");
                t18.setLayoutX(300);
                t18.setLayoutY(250);
                t18.setPrefHeight(30);
                t18.setPrefWidth(200);
                
                t19 = new TextField();
                t19.setPromptText("Enter date (dd/mm/yyyy)");
                t19.setLayoutX(550);
                t19.setLayoutY(250);
                t19.setPrefHeight(30);
                t19.setPrefWidth(200);
                
                root.getChildren().addAll(bg7, l14, t18, t19, b11);
            }
        });
        
        b5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                
                removepages(root);
                
                
                table = new TableView<PassengerInfo>();
                data = FXCollections.observableArrayList();
                    
                table.setEditable(true);
                table.setLayoutX(150);
                table.setLayoutY(270);
                table.setPrefSize(1050, 200);
                
                addcol(root);
                table.getColumns().addAll(col1, col2, col3, col4, col5, col6, col7);
                
                try {
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("select * from ticketsbooked");
                    
                    while (rs.next()) {
                        data.add(new PassengerInfo(rs.getString("reservationid"), rs.getString("userid"), rs.getString("flightno"), rs.getString("date"), rs.getString("ecotickets"), rs.getString("bustickets"), rs.getString("fare")));
                    }
                    table.setItems(data);
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
                s = new ScrollPane();
                s.setContent(table);
                s.setLayoutX(150);
                s.setLayoutY(270);
                s.setPrefSize(1050, 200);
                
                root.getChildren().addAll(bg7, s);
            }
        });
        
        
        
        b11.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                removepages(root);
                String a = t18.getText();
                String b = t19.getText();
                root.getChildren().addAll(bg7, l14, t18, t19, b11);
                int tmp = 0;
                
                
                try {
                    Statement st = connect.createStatement();
                    ResultSet rs = st.executeQuery("select * from cancelflight");
                    
                    
                    
                    while (rs.next()) {
                        if (rs.getString("flightno").equals(a) && rs.getString("date").equals(b)) {
                            tmp = 1;
                            break;
                        }
                    }
                    
                    
                    
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                if (tmp == 1) {
                        l15 = new Label("Flight has been Cancelled");
                        l15.setLayoutX(400);
                        l15.setLayoutY(350);
                        l15.getStyleClass().addAll("my_customLabel1");
                        root.getChildren().add(l15);
                    }
                    else {
                        
                        l16 = new Label("Flight Number :              " + a);
                        l16.setLayoutX(380);
                        l16.setLayoutY(300);
                        l16.getStyleClass().addAll("my_customLabel3");
                       
                    String c = "", d = "", e = "", f = "", g = "", h = "", i = "", j = "", k = "", l = "", m = "", n = "";
                       
                    try {
                        Statement st = connect.createStatement();
                        ResultSet rs = st.executeQuery("select * from flight");
                        while (rs.next()) {
                            if (rs.getString("flightnumber").equals(a)) {
                                c = rs.getString("flightname");
                                d = rs.getString("source");
                                e = rs.getString("destination");
                                f = rs.getString("distance");
                                g = rs.getString("flighttype");
                                h = rs.getString("businessclassseats");
                                i = rs.getString("businessclassfare");
                                j = rs.getString("economyclassseats");
                                k = rs.getString("economyclassfare");
                                m = rs.getString("arrivaltimehours") + " : " + rs.getString("arrivaltimemin");
                                n = rs.getString("departuretimehours") + " : " + rs.getString("departuretimemin");
                                break;
                            }
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        
                    try {    
                        Statement st = connect.createStatement();
                        ResultSet rs = st.executeQuery("select * from scheme");
                        while (rs.next()) {
                            if (rs.getString("flightno").equals(a) && rs.getString("date").equals(b)) {
                                i = rs.getString("busfare");
                                k = rs.getString("ecofare");
                            }
                        }
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    try {
                        Statement st = connect.createStatement();
                        ResultSet rs = st.executeQuery("select * from ticketsbooked");
                        
                        while (rs.next()) {
                            if (rs.getString("flightno").equals(a) && rs.getString("date").equals(b)) {
                                int p = Integer.parseInt(h);
                                p -= Integer.parseInt(rs.getString("bustickets"));
                                h = Integer.toString(p);
                                p = Integer.parseInt(j);
                                p -= Integer.parseInt(rs.getString("ecotickets"));
                                j = Integer.toString(p);
                            }
                        }
                        
                    } catch (SQLException ex) {
                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                        l17 = new Label("Flight Name :              " + c);
                        l17.setLayoutX(700);
                        l17.setLayoutY(300);
                        l17.getStyleClass().addAll("my_customLabel3");
                        
                        l18 = new Label("Source :                          " + d);
                        l18.setLayoutX(380);
                        l18.setLayoutY(350);
                        l18.getStyleClass().addAll("my_customLabel3");
                        
                        l19 = new Label("Destination :                   " + e);
                        l19.setLayoutX(380);
                        l19.setLayoutY(400);
                        l19.getStyleClass().addAll("my_customLabel3");
                        
                        l20 = new Label("Departure Time :         " + m);
                        l20.setLayoutX(700);
                        l20.setLayoutY(350);
                        l20.getStyleClass().addAll("my_customLabel3");
                        
                        l21 = new Label("Arrival Time :               " + n);
                        l21.setLayoutX(700);
                        l21.setLayoutY(400);
                        l21.getStyleClass().addAll("my_customLabel3");
                        
                        l22 = new Label("Distance :                       " + f);
                        l22.setLayoutX(380);
                        l22.setLayoutY(450);
                        l22.getStyleClass().addAll("my_customLabel3");
                        
                        l23 = new Label("Flight Type :                " + g);
                        l23.setLayoutX(700);
                        l23.setLayoutY(450);
                        l23.getStyleClass().addAll("my_customLabel3");
                        
                        l24 = new Label("Bussiness Class Tickets :  " + h);
                        l24.setLayoutX(380);
                        l24.setLayoutY(500);
                        l24.getStyleClass().addAll("my_customLabel3");
                        
                        l25 = new Label("Bussiness Class Fare :  " + i);
                        l25.setLayoutX(700);
                        l25.setLayoutY(500);
                        l25.getStyleClass().addAll("my_customLabel3");
                        
                        
                        
                        l26 = new Label("Economy Class Tickets :  " + j);
                        l26.setLayoutX(380);
                        l26.setLayoutY(550);
                        l26.getStyleClass().addAll("my_customLabel3");
                        
                        l27 = new Label("Economy Class Fare :   " + k);
                        l27.setLayoutX(700);
                        l27.setLayoutY(550);
                        l27.getStyleClass().addAll("my_customLabel3");
                        
                        
                        
                        
                    
                        root.getChildren().addAll(l16, l17, l18, l19, l20, l21, l22, l23, l24, l25, l26, l27);
                    }
            }
        });
        
        
        
        
        b10.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                String a = t13.getText();
                String b = t14.getText();
                String c = t15.getText();
                String d = t16.getText();
                try {
                    PreparedStatement ps = connect.prepareStatement("insert into scheme values (?, ?, ?, ?)");
                    ps.setString(1, a);
                    ps.setString(2, b);
                    ps.setString(3, c);
                    ps.setString(4, d);
                    ps.executeUpdate();
                    t13.clear();
                    t14.clear();
                    t15.clear();
                    t16.clear();
                } catch (SQLException ex) {
                    Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        b7.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent e1) {
                if ((group.getSelectedToggle() == null) || t9.getText().equals("") || t8.getText().equals("") || t7.getText().equals("") || t6.getText().equals("") || t5.getText().equals("") || t4.getText().equals("") || t1.getText().equals("") || t2.getText().equals("") || t3.getText().equals("")) {
                    if (l9added == 1) {
                        l9added = 0;
                        root.getChildren().remove(l9);
                    }
                    if (l4added == 0) {
                        l4added = 1;
                        root.getChildren().add(l4);
                    }
                }
                else {
                    String a = t1.getText();
                    String b = t2.getText();
                    String c = t3.getText();
                    String d = t4.getText();
                    String e = t5.getText();
                    String f = t6.getText();
                    String g = t7.getText();
                    String h = t8.getText();
                    String i = t9.getText();
                    String j;
                    if (group.getSelectedToggle().toString().length() == 55)
                        j = "Domestic";
                    else
                        j = "International";
                    String k = (String) combobox1.getValue();
                    String l = (String) combobox2.getValue();
                    String m = (String) combobox3.getValue();
                    String n = (String) combobox4.getValue();
                    PreparedStatement s1;
                    try {
                        s1 = connect.prepareStatement("insert into flight values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                        s1.setString(1, a);
                        s1.setString(2, b);
                        s1.setString(3, c);
                        s1.setString(4, d);
                        s1.setString(5, e);
                        s1.setString(6, j);
                        s1.setString(7, f);
                        s1.setString(8, g);
                        s1.setString(9, h);
                        s1.setString(10, i);
                        s1.setString(11, k);
                        s1.setString(12, l);
                        s1.setString(13, m);
                        s1.setString(14, n);
                        s1.executeUpdate();
                    } catch (Exception ex) {
                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    t1.clear();
                    t2.clear();
                    t3.clear();
                    t4.clear();
                    t5.clear();
                    t6.clear();
                    t7.clear();
                    t8.clear();
                    t9.clear();
                    combobox1.getSelectionModel().selectFirst();
                    combobox2.getSelectionModel().selectFirst();
                    combobox3.getSelectionModel().selectFirst();
                    combobox4.getSelectionModel().selectFirst();
                    if (l4added == 1) {
                        l4added = 0;
                        root.getChildren().remove(l4);
                    }
                    if (l9added == 0) {
                        l9added = 1;
                        root.getChildren().add(l9);
                    }
                }
            }
        });
    }
    
    public void addcol(Pane root) {
        col1 = new TableColumn("Reservation Id");
        col2 = new TableColumn("User Id");
        col3 = new TableColumn("Flight No.");
        col4 = new TableColumn("Date");
        col5 = new TableColumn("Economy Tickets");
        col6 = new TableColumn("Business Tickets");
        col7 = new TableColumn("Fare");
        
        col1.setMinWidth(150);
        col1.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("rid"));
        
        col2.setMinWidth(150);
        col2.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("userid"));
        
        col3.setMinWidth(150);
        col3.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("flightno"));
        
        col4.setMinWidth(150);
        col4.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("date"));
        
        col5.setMinWidth(150);
        col5.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("etickets"));
        
        col6.setMinWidth(150);
        col6.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("btickets"));
        
        col7.setMinWidth(150);
        col7.setCellValueFactory(new PropertyValueFactory<TerminateBooking, String>("fare"));
    }
    
    public void removepages(Pane root) {
        root.getChildren().clear();
        t1.clear();
        t2.clear();
        t3.clear();
        t4.clear();
        t5.clear();
        t6.clear();
        t7.clear();
        t8.clear();
        t9.clear();
        combobox1.getSelectionModel().selectFirst();
        combobox2.getSelectionModel().selectFirst();
        combobox3.getSelectionModel().selectFirst();
        combobox4.getSelectionModel().selectFirst();
        root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, l1, b1, b2, b3, b4, b5, b6, b13);
    }
    
}
