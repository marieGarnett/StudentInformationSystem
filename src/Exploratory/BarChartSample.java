package Exploratory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.*;
import javax.swing.JOptionPane;

public class BarChartSample extends Application {
    final static String austria = "Austria";
    final static String brazil = "Brazil";
    final static String france = "France";
      
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public void setA() {
        try{
            String sql = "SELECT COUNT(Admision_ID) FROM admission";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                int seta1 = rs.getInt(1);
                
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    @Override
    public void start(Stage stage) {
        stage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc = new BarChart<>(xAxis,yAxis);
        bc.setTitle("Country Summary");
        xAxis.setLabel("Country");
        yAxis.setLabel("Value");
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2003");
        
        series1.getData().add(new XYChart.Data(austria, 6)); //seta
        series1.getData().add(new XYChart.Data(brazil, 1));
        series1.getData().add(new XYChart.Data(france, 1));
        XYChart.Series series2 = new XYChart.Series();
        series2.setName("2004");
        series2.getData().add(new XYChart.Data(austria, 5));
        series2.getData().add(new XYChart.Data(brazil, 4));  
        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1, series2);
        stage.setScene(scene);
        stage.show();
    } 
    public static void main(String[] args) {
        launch(args);
    }
} 