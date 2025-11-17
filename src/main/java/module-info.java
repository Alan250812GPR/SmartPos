module com.smart.smartpos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.smart.smartpos to javafx.fxml;
    exports com.smart.smartpos;
}