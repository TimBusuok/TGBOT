package com.example.time;

import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import java.util.concurrent.TimeUnit;

public class TimerUpdate {
    private static long startTime = 0;
    private static boolean running = false;
    public static void start_time(Button start_time, Text time) {
        start_time.setOnAction(e -> {
            if (!running) {
                startTime = System.currentTimeMillis();
                running = true;
                updateTimer(time);
            }
        });
    }
    private static void updateTimer(Text text) {
        new Thread(() -> {
            while (running) {
                long elapsedTime = System.currentTimeMillis() - startTime;
                long seconds = TimeUnit.MILLISECONDS.toSeconds(elapsedTime) % 60;
                long minutes = TimeUnit.MILLISECONDS.toMinutes(elapsedTime) % 60;
                long millis = elapsedTime % 1000;

                text.setText(String.format("%02d:%02d:%03d", minutes, seconds, millis));

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

        public static void stop_time(Button stop_time){
            stop_time.setOnAction(e -> running = false);
        }

        public static void reset_time(Button reset_time,Text time){
            reset_time.setOnAction(e -> {
                running = false;
                startTime = 0;
                time.setText("00:00:000");
            });
        }
}
