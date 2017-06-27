package javafx.example.vbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class VBoxExampleApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
        primaryStage.setTitle("VBox Layout Pane Example Application");
        primaryStage.setScene(new Scene(root, 600, 340));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
