package com.example.time;

import java.net.URL;
import java.util.ResourceBundle;

import com.almasb.fxgl.dev.Console;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import java.util.Timer;
import java.util.TimerTask;


public class HelloController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button button_time;

    @FXML
    private AnchorPane panel_time;

    @FXML
    private Text time;

    @FXML
    private AnchorPane timer;

    @FXML
    private Button button_stop;

    @FXML
    private Button reset_time;

    @FXML
    void initialize() {
        button_time.setOnAction(actionEvent -> {
                TimerUpdate.start_time(button_time,time);
            });
        button_stop.setOnAction(actionEvent -> {
                TimerUpdate.stop_time(button_stop);
            });
        reset_time.setOnAction(actionEvent -> {
            TimerUpdate.reset_time(reset_time,time);
        });
        };


    }



