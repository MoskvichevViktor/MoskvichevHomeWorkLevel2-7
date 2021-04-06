package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("MyChat");
        primaryStage.setScene(new Scene(root, 500, 350));
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> {
            Controller controller = loader.getController();
            controller.disconnect();
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
