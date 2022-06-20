package ca.georgiancollege.comp1011assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;

public class GraphViewController {

    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis CategoryAxis;

    @FXML
    private NumberAxis NumberAxis;

    @FXML
    void LoadTableView(ActionEvent event) {

    }

}
