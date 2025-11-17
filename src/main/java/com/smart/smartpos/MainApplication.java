package com.smart.smartpos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setResizable(false);

        try {
            Image icon = new Image(MainApplication.class.getResourceAsStream("app_icon.png"));

            stage.getIcons().add(icon);
        } catch (Exception e) {
            System.err.println("Error al cargar el ícono: " + e.getMessage());
        }

        stage.setTitle("SmartPos Login");
        stage.setScene(scene);
        stage.show();
    }
}

//mvn clean package
//java -jar nombre_del_archivo.jar