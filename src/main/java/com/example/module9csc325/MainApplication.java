package com.example.module9csc325;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/module9csc325/hello-view.fxml"));
        Parent root = loader.load();

        primaryStage.setTitle("Garment Simulator");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); //This will launch my application and when you choose a Garment Type all of them will watch.
    }
}
