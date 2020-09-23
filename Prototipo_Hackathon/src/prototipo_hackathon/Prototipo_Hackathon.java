package prototipo_hackathon;

import Database.Database;
import java.net.URL;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Tekanx
 */
public class Prototipo_Hackathon extends Application {
    // Global variables
    static Database db = new Database();
    
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        URL fxmlPrimeraEscena = getClass().getClassLoader().getResource("fxmlFiles/IngresoUsuario.fxml");
        FXMLLoader escenaIngreso = new FXMLLoader(fxmlPrimeraEscena);
        
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(escenaIngreso.load()));
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        db.DataBaseConnection();
        System.out.println("LAUNCHING APPLICATION AND FRAMES!!!");
        launch(args);
    }
    
}
