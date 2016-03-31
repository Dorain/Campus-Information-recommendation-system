import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Location extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Campus Goodies");
        
       // GridPane location = new GridPane();
        //Scene scene = new Scene(location);
		//primaryStage.setScene(scene);
        
        
        
        primaryStage.setScene(new Scene(new Panel(), 620, 650));
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }

}
