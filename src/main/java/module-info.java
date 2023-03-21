module com.example.factorymethod2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.factorymethod2 to javafx.fxml;
    exports com.example.factorymethod2;
}