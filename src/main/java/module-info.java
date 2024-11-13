module com.example.module9csc325 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.module9csc325 to javafx.fxml;
    exports com.example.module9csc325;
}