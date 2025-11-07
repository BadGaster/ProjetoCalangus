package auto_sheet;

import javafx.application.Application; 
import javafx.fxml.FXMLLoader; 
import javafx.scene.Parent; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 

public class Main extends Application{

    @Override
    public void start(Stage primoStage) throws Exception{ 
        Parent root = FXMLLoader.load(getClass().getResource("auto_sheet.fxml")); 
        primoStage.setTitle("Hello World!");
        primoStage.setScene(new Scene(root, 400, 300)); 
        primoStage.show(); 
    }

    public static void main(String[] args) {
        launch(args);
    }
}
