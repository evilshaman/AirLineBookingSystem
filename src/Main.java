package airlinebookingsystem;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    
    Pane root;
    Scene scene;
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        root = new Pane();
        Login login = new Login();
        Admin admin = new Admin();
        User user = new User();
        root.getStylesheets().add(getClass().getResource("CSS1.css").toExternalForm());
        scene = new Scene(root, 1350, 700);
        primaryStage.setTitle("Airline Booking System");
        
        login.loginLayout();
        admin.adminLayout();
        user.userLayout();
        
        //user.userFunction(root, user, login, admin);
        //admin.adminFunction(root, login, admin, user);
        login.login1(root, login, admin, user);
        
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
