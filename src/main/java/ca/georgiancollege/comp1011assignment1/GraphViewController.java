package ca.georgiancollege.comp1011assignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class GraphViewController implements Initializable {

    @FXML
    private BarChart<String, Integer> barChart;

    @FXML
    private CategoryAxis CategoryAxis;

    @FXML
    private NumberAxis NumberAxis;

    //Defining the OnCLick Action to Change the Scene.
    @FXML
    void LoadTableView(ActionEvent event) throws IOException {

        Parent part = FXMLLoader.load(getClass().getResource("Table-view.fxml"));
        Stage stage = new Stage();
        Scene scene = new Scene(part);
        stage.setScene(scene);
        stage.show();

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        //Initializing Series for mock data.
        XYChart.Series series1 = new XYChart.Series();

        series1.setName("2020");

        //Mock Data for BarChart

        series1.getData().add(new XYChart.Data("India", 12000));
        series1.getData().add(new XYChart.Data("Australia", 8000));
        series1.getData().add(new XYChart.Data("China", 98000));
        series1.getData().add(new XYChart.Data("Canada", 67000));
        series1.getData().add(new XYChart.Data("USA", 34000));

        //Adding data into the Chart
        barChart.getData().addAll(series1);


    }
}
