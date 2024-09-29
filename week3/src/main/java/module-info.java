module com.example.week3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.junit.jupiter.api;

    opens com.example.week3 to javafx.fxml;
    exports com.example.week3;
}
