package com.smart.smartpos;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField UserField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;
    @FXML
    private Hyperlink forgotPasswordLink;
    @FXML
    private Hyperlink signUpLink;

    @FXML
    public void initialize() {
        if (loginButton != null) {
            loginButton.setOnAction(event -> handleLoginButtonAction());
        }
    }

    private void handleLoginButtonAction() {
        String email = UserField.getText();
        String password = passwordField.getText();
        System.out.println("Email: " + email + ", Password: " + password);
    }

    @FXML
    private void onSignUpClick() {
        System.out.println("Sign Up clicked!");
    }
}