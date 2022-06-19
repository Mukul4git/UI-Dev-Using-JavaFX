package ca.georgiancollege.comp1011assignment1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;
import java.util.ResourceBundle;

public class TableViewController implements Initializable{

    @FXML
    private TableView<Country> tableView;

    @FXML
    private TableColumn<Country, String> Code;

    @FXML
    private TableColumn<Country, String> Continent;

    @FXML
    private TableColumn<Country, String> Name;

    @FXML
    private TableColumn<Country, Integer> Population;

    @FXML
    private TableColumn<Country, String> Region;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Code.setCellValueFactory(new PropertyValueFactory<>("Code"));
        Name.setCellValueFactory(new PropertyValueFactory<>("Name"));
        Continent.setCellValueFactory(new PropertyValueFactory<>("Continent"));
        Region.setCellValueFactory(new PropertyValueFactory<>("Region"));
        Population.setCellValueFactory(new PropertyValueFactory<>("Population"));



        // example with Mock Data


        ObservableList<Country> data = FXCollections.observableArrayList(
                new Country("IND", "India", "Asia", "Southern & Central Asia",12345000),
                new Country("US", "United States of America", "North America", "North America",12345000),
                new Country("CAN", "Canada", "North America", "North America",1234000),
                new Country("PAK", "India", "Asia", "Southern & Central Asia",145000),
                new Country("BRA", "Brazil", "Asia", "Southern & Central Asia",12345000)
        );

        tableView.getItems().addAll(data);


    }
}

