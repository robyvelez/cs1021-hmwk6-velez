/*
 * Course: FIXME
 * Winter 2019-20
 * Homework 6 - Validation
 * Name: FIXME
 * Created: FIXME
 */
package FIXME;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Program module that validates input when creating a new account for a system
 */
public class Validator extends Application {
    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Validator.fxml"));
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
