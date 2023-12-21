package Main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;



public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Main/Demo.fxml"));
        AnchorPane root = loader.<AnchorPane>load();
        Controller controller = loader.getController();

        // Дополнительная настройка сцены и отображение окна
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("MRT");
        primaryStage.setResizable(false);

    }
}