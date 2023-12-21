import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Controller extends Main {

    @FXML
    private ImageView image2;

    @FXML
    private ImageView image;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private AnchorPane demo;

    @FXML
    private Text text;

    @FXML
    private Text title_text;

    @FXML
    private BorderPane title;

    @FXML
    public void initialize() throws Exception {
        button1.setOnAction(actionEvent -> {
            Stage stage1 = new Stage();
            try {
                view1(stage1);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        button2.setOnAction(actionEvent -> {
            Stage stage2 = new Stage();
            try {
                view2(stage2);
            } catch (Exception e){
                throw new RuntimeException(e);
            }
        });

    }


}
