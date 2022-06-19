module ca.georgiancollege.comp1011assignment1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgiancollege.comp1011assignment1 to javafx.fxml;
    exports ca.georgiancollege.comp1011assignment1;
}