/*
 * Course: FIXME
 * Winter 2019-20
 * Homework 6 - Validation
 * Name: FIXME
 * Created: FIXME
 */
package FIXME;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Controller for the Create New Login scene
 */
public class ValidatorController implements Initializable {


    /**
     * Initializes variables before displaying scene
     *
     * Instantiates a new Database object and assigns listeners to the text property
     * of the email and password TextFields
     *
     * @param location unused
     * @param resources unused
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        database = new Database();
        email.textProperty().addListener((obs, oldText, newText) -> update());
        password.textProperty().addListener((obs, oldText, newText) -> update());
    }

    /**
     * Handler for the Add Button, attempts to add the contents of the form to the database
     */
    @FXML
    private void addLogin() {
		// TODO
    }

    /**
     * Handler for the Cancel Button. Clears all the TextFields and disables the Add Button
     */
    @FXML
    private void cancel() {
        // TODO
    }

    /**
     * Handler for the email and password fields. If both fields are not empty, the Add Button is
     * enabled. If either or both fields are empty, the Add Button is disabled
     */
    @FXML
    private void update() {
		// TODO
}
