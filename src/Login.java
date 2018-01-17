package airlinebookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class Login  {
    
    private ImageView bg, bg1, bg2, bg3, bg4, bg5, img1;
    private Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15;
    private Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
    private TextField t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15;
    private PasswordField p1, p2, p3, p4, p5, p6;
    private ToggleGroup group;
    private RadioButton male, female;
    
    String user, first, last, pass, contact, email, address, sex, dob;
    
    private int b1pressed, b2pressed, b3pressed, page1, page2, l4added, page3, l6added, cp, l9added, l10added, l11added, l5added;

    public void loginLayout() {
        
        bg = new ImageView(new Image(Login.class.getResourceAsStream("files/url.png")));
        bg.setX(0);
        bg.setY(0);
        
        bg1 = new ImageView(new Image(Login.class.getResourceAsStream("files/TM.png")));
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
        
        bg5 = new ImageView(new Image(Login.class.getResourceAsStream("files/box.png")));
        bg5.setX(870);
        bg5.setY(170);
        
        b1 = new Button("Customer Login");
        b1.setLayoutX(100);
        b1.setLayoutY(100);
        b1.getStyleClass().addAll("button1");
        b1.setPrefHeight(58);
        b1.setPrefWidth(200);
        
        b2 = new Button("Operator Login");
        b2.setLayoutX(300);
        b2.setLayoutY(100);
        b2.getStyleClass().addAll("button1");
        b2.setPrefHeight(58);
        b2.setPrefWidth(200);
        
        b3 = new Button("Sign Up");
        b3.setLayoutX(500);
        b3.setLayoutY(100);
        b3.getStyleClass().addAll("button1");
        b3.setPrefHeight(58);
        b3.setPrefWidth(200);
        
        l1 = new Label("Welcome");
        l1.setLayoutX(975);
        l1.setLayoutY(180);
        l1.getStyleClass().addAll("my_customLabel1");
        
        t1 = new TextField();
        t1.setPromptText("User ID of customer");
        t1.setLayoutX(920);
        t1.setLayoutY(280);
        t1.setPrefHeight(40);
        t1.setPrefWidth(260);
        
        p1 = new PasswordField();
        p1.setPromptText("Password");
        p1.setLayoutX(920);
        p1.setLayoutY(350);
        p1.setPrefHeight(40);
        p1.setPrefWidth(260);
        
        b4 = new Button("Log In");
        b4.setLayoutX(970);
        b4.setLayoutY(420);
        b4.getStyleClass().addAll("button2");
        b4.setPrefHeight(30);
        b4.setPrefWidth(150);
        
        
        l2 = new Label("Welcome");
        l2.setLayoutX(975);
        l2.setLayoutY(180);
        l2.getStyleClass().addAll("my_customLabel1");
        
        t2 = new TextField();
        t2.setPromptText("User ID of operator");
        t2.setLayoutX(920);
        t2.setLayoutY(280);
        t2.setPrefHeight(40);
        t2.setPrefWidth(260);
        
        p2 = new PasswordField();
        p2.setPromptText("Password");
        p2.setLayoutX(920);
        p2.setLayoutY(350);
        p2.setPrefHeight(40);
        p2.setPrefWidth(260);
        
        b5 = new Button("Log In");
        b5.setLayoutX(970);
        b5.setLayoutY(420);
        b5.getStyleClass().addAll("button2");
        b5.setPrefHeight(30);
        b5.setPrefWidth(150);
        
        l3 = new Label("Sign Up");
        l3.setLayoutX(975);
        l3.setLayoutY(180);
        l3.getStyleClass().addAll("my_customLabel1");
        
        t3 = new TextField();
        t3.setPromptText("User name");
        t3.setLayoutX(920);
        t3.setLayoutY(280);
        t3.setPrefHeight(40);
        t3.setPrefWidth(260);
        
        t4 = new TextField();
        t4.setPromptText("First name");
        t4.setLayoutX(920);
        t4.setLayoutY(340);
        t4.setPrefHeight(40);
        t4.setPrefWidth(260);
        
        t5 = new TextField();
        t5.setPromptText("Last name");
        t5.setLayoutX(920);
        t5.setLayoutY(400);
        t5.setPrefHeight(40);
        t5.setPrefWidth(260);
        
        b6 = new Button("Next");
        b6.setLayoutX(950);
        b6.setLayoutY(520);
        b6.getStyleClass().addAll("button2");
        b6.setPrefHeight(30);
        b6.setPrefWidth(200);
        
        p3 = new PasswordField();
        p3.setPromptText("Password");
        p3.setLayoutX(920);
        p3.setLayoutY(460);
        p3.setPrefHeight(40);
        p3.setPrefWidth(260);
        
        l4 = new Label("Enter all details !!");
        l4.setLayoutX(985);
        l4.setLayoutY(240);
        l4.getStyleClass().addAll("my_customLabel");
        l4.setTextFill(Color.web("red"));
        
        l6 = new Label("Incorrect details !!");
        l6.setLayoutX(985);
        l6.setLayoutY(240);
        l6.getStyleClass().addAll("my_customLabel");
        l6.setTextFill(Color.web("red"));
        
        t6 = new TextField();
        t6.setPromptText("Address");
        t6.setLayoutX(920);
        t6.setLayoutY(260);
        t6.setPrefHeight(40);
        t6.setPrefWidth(260);
        
        t7 = new TextField();
        t7.setPromptText("Contact number");
        t7.setLayoutX(920);
        t7.setLayoutY(320);
        t7.setPrefHeight(40);
        t7.setPrefWidth(260);
        
        t8 = new TextField();
        t8.setPromptText("Email Id");
        t8.setLayoutX(920);
        t8.setLayoutY(380);
        t8.setPrefHeight(40);
        t8.setPrefWidth(260);
        
        t9 = new TextField();
        t9.setPromptText("Date of Birth (dd/mm/yyyy)");
        t9.setLayoutX(920);
        t9.setLayoutY(440);
        t9.setPrefHeight(40);
        t9.setPrefWidth(260);
        
        group = new ToggleGroup();
        male = new RadioButton("Male");
        male.setToggleGroup(group);
        female = new RadioButton("Female");
        female.setToggleGroup(group);
        
        male.setLayoutX(950);
        male.setLayoutY(490);
        
        female.setLayoutX(1050);
        female.setLayoutY(490);
        
        b7 = new Button("Submit");
        b7.setLayoutX(950);
        b7.setLayoutY(520);
        b7.getStyleClass().addAll("button2");
        b7.setPrefHeight(30);
        b7.setPrefWidth(200);
        
        l5 = new Label("   Signed Up\nSuccessfully !!");
        l5.setLayoutX(940);
        l5.setLayoutY(300);
        l5.getStyleClass().addAll("my_customLabel1");
        l5.setTextFill(Color.web("green"));
    }
    
    public void login1(Pane root, Login login, Admin admin, User users) throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/abs", "root", "password");
        
        root.getChildren().addAll(bg, bg1, bg2, bg3, bg4, b1, b2, b3);
        
        b1pressed = 0;
        b2pressed = 0;
        b3pressed = 0;
        page1 = 0;
        page2 = 0;
        page3 = 0;
        l4added = 0;
        l6added = 0;
        l5added = 0;
        
        b1.setOnAction(new EventHandler<ActionEvent>() {
             
            @Override
            public void handle(ActionEvent e) {
                if (b2pressed == 1) {
                    b2pressed = 0;
                    removeb2(root);
                }
                if (b3pressed == 1) {
                    b3pressed = 0;
                    removeb3(root);
                }
                if (b1pressed == 0) {
                    b1pressed = 1;
                    root.getChildren().addAll(bg5, l1, t1, p1, b4);
                }
            }
         });
        
        b2.setOnAction(new EventHandler<ActionEvent>() {
             
            @Override
            public void handle(ActionEvent e) {
                if (b1pressed == 1) {
                    b1pressed = 0;
                    removeb1(root);
                }
                if (b3pressed == 1) {
                    b3pressed = 0;
                    removeb3(root);
                }
                if (b2pressed == 0) {
                    b2pressed = 1;
                    root.getChildren().addAll(bg5, l2, t2, p2, b5);
                }
            }
         });
        
        b3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (b2pressed == 1) {
                    b2pressed = 0;
                    removeb2(root);
                }
                if (b1pressed == 1) {
                    b1pressed = 0;
                    removeb1(root);
                }
                if (b3pressed == 0 || page3 == 1) {
                    if (page3 == 1) {
                        root.getChildren().removeAll(bg5, l5, l3);
                    }
                    b3pressed = 1;
                    page1 = 1;
                    page3 = 0;
                    root.getChildren().addAll(bg5, l3, t3, t4, t5, p3, b6);
                }
            }
         });
        
        b6.setOnAction(new EventHandler<ActionEvent>() {
             
            @Override
            public void handle(ActionEvent e) {
                if (t3.getText().equals("") || t4.getText().equals("") || t5.getText().equals("") || p3.getText().equals("")) {
                    root.getChildren().addAll(l4);
                    l4added = 1;
                }
                else {
                    page1 = 0;
                    page2 = 1;
                    if (l4added == 1) {
                        root.getChildren().remove(l4);
                        l4added = 0;
                    }
                    user = t3.getText();
                    pass = p3.getText();
                    first = t4.getText();
                    last = t5.getText();
                    t3.clear();
                    t4.clear();
                    t5.clear();
                    p3.clear();
                    root.getChildren().removeAll(t3, t4, t5, p3, b6);
                    root.getChildren().addAll(t6, t7, t8, male, female, b7, t9);
                }
            }
        });
        
        b7.setOnAction(new EventHandler<ActionEvent>() {
             
            @Override
            public void handle(ActionEvent e) {
                if ((group.getSelectedToggle()==null) || t9.getText().equals("") || t6.getText().equals("") || t7.getText().equals("") || t8.getText().equals("")) {
                    root.getChildren().addAll(l4);
                    l4added = 1;
                }
                else {
                    page2 = 0;
                    page3 = 1;
                    if (l4added == 1) {
                        root.getChildren().remove(l4);
                        l4added = 0;
                    }
                    contact = t7.getText();
                    email = t8.getText();
                    address = t6.getText();
                    dob = t9.getText();
                    t9.clear();
                    t6.clear();
                    t7.clear();
                    t8.clear();
                    if (group.getSelectedToggle().toString().length() == 51)
                        sex = "Male";
                    else
                        sex = "Female";
                    PreparedStatement s1;
                    try {
                        s1 = connect.prepareStatement("insert into user values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
                        s1.setString(1, user);
                        s1.setString(2, first);
                        s1.setString(3, last);
                        s1.setString(4, pass);
                        s1.setString(5, address);
                        s1.setString(6, contact);
                        s1.setString(7, email);
                        s1.setString(8, sex);
                        s1.setString(9, dob);
                        s1.executeUpdate();
                    } catch (SQLException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                        
                    root.getChildren().removeAll(t6, t7, t8, male, female, b7, t9);
                    root.getChildren().add(l5);
                }
            }
        });
        
        b4.setOnAction(new EventHandler<ActionEvent>() {
             
            @Override
            public void handle(ActionEvent e) {
                if (t1.getText().equals("") || p1.getText().equals("")) {
                    l4added = 1;
                    root.getChildren().add(l4);
                }
                else {
                    int tmp = 0;
                    user = t1.getText();
                    pass = p1.getText();
                    Statement status;
                    ResultSet result;
                    try {
                        status = connect.createStatement();
                        result = status.executeQuery("select * from user");
                        while (result.next()) {
                            if (user.equals(result.getString("userid").toString()) && pass.equals(result.getString("password").toString())) {
                                if (l4added == 1) {
                                    l4added = 0;
                                    root.getChildren().remove(l4);
                                }
                                if (l6added == 1) {
                                    l6added = 0;
                                    root.getChildren().remove(l6);
                                }
                                root.getChildren().removeAll(bg5, l1, t1, p1, b4, bg, bg1, bg2, bg3, bg4, b1, b2, b3);
                                tmp = 1;
                                break;
                            }
                        }
                        if (tmp == 1) {
                            t1.clear();
                            p1.clear();
                            first = result.getString("firstname");
                                last = result.getString("lastname");
                                address = result.getString("address");
                                contact = result.getString("contact");
                                email = result.getString("email");
                                sex = result.getString("sex");
                                dob = result.getString("dob");
                            users.userFunction(root, users, login, admin);
                        }
                        else {
                            if (l6added == 0) {
                                l6added = 1;
                                if (l4added == 1) {
                                    l4added = 0;
                                    root.getChildren().remove(l4);
                                }
                                root.getChildren().add(l6);
                            }
                        }
                        
                    } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        
        b5.setOnAction(new EventHandler<ActionEvent>() {
             
            @Override
            public void handle(ActionEvent e) {
                if (t2.getText().equals("") || p2.getText().equals("")) {
                    l4added = 1;
                    root.getChildren().add(l4);
                }
                else {
                    int tmp = 0;
                    user = t2.getText();
                    pass = p2.getText();
                    Statement status;
                    ResultSet result;
                    try {
                        status = connect.createStatement();
                        result = status.executeQuery("select * from admin");
                        while (result.next()) {
                            if (user.equals(result.getString("userid").toString()) && pass.equals(result.getString("password").toString())) {
                                if (l4added == 1) {
                                    l4added = 0;
                                    root.getChildren().remove(l4);
                                }
                                if (l6added == 1) {
                                    l6added = 0;
                                    root.getChildren().remove(l6);
                                }
                                root.getChildren().removeAll(bg5, l2, t2, p2, b5, bg, bg1, bg2, bg3, bg4, b1, b2, b3);
                                
                                tmp = 1;
                                break;
                            }
                        }
                        if (tmp == 1) {
                            t2.clear();
                            p2.clear();
                            admin.adminFunction(root, login, admin, users);
                        }
                        else {
                            if (l6added == 0) {
                                l6added = 1;
                                if (l4added == 1) {
                                    l4added = 0;
                                    root.getChildren().remove(l4);
                                }
                                root.getChildren().add(l6);
                            }
                        }
                        
                    } catch (Exception ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
    }
    
    public void removeb1(Pane root) {
        t1.clear();
        p1.clear();
        if (l4added == 1) {
            l4added = 0;
            root.getChildren().remove(l4);
        }
        if (l6added == 1) {
            l6added = 0;
            root.getChildren().remove(l6);
        }
        root.getChildren().removeAll(bg5, l1, t1, p1, b4);
    }
    
    public void removeb2(Pane root) {
        t2.clear();
        p2.clear();
        if (l4added == 1) {
            l4added = 0;
            root.getChildren().remove(l4);
        }
        if (l6added == 1) {
            l6added = 0;
            root.getChildren().remove(l6);
        }
        root.getChildren().removeAll(bg5, l2, t2, p2, b5);
    }
    
    public void removeb3(Pane root) {
        if (page1 == 1) {
            if (l4added == 1) {
                root.getChildren().removeAll(l4);
                l4added = 0;
            }
            t3.clear();
            t4.clear();
            t5.clear();
            p3.clear();
            root.getChildren().removeAll(bg5, l3, t3, t4, t5, p3, b6);
            page1 = 0;
        }
        else if (page2 == 1) {
            page2 = 0;
            if (l4added == 1) {
                root.getChildren().removeAll(l4);
                l4added = 0;
            }
            t6.clear();
            t7.clear();
            t8.clear();
            t9.clear();
            root.getChildren().removeAll(bg5, t6, t7, t8, male, female, b7, l3, t9);
        }
        else {
            page3 = 0;
            root.getChildren().removeAll(bg5, l3, l5);
        }
    }   
}