module com.example.githubdemo4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.githubdemo4 to javafx.fxml;
    exports com.example.githubdemo4;
}