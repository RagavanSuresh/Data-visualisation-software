import java.util.ArrayList;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class AreaChartSample extends Application
{
    ArrayList<String[]> datas = new ArrayList<String[]>();
    String[] names = new String[100];
    int[] marks = new int[100];

    public void assign()
    {    
        Filing f= new Filing();
        datas = f.exportdata();
        for(int i=0;i<datas.size();i++)
        {
            String[] temp = datas.get(i);
            int tempint = Integer.parseInt(temp[2]);
            names[i] = temp[0];
            marks[i] = tempint;
        }
        // for(int i=0;i<datas.size();i++)
        // {
        //     System.out.println(names[i]+"\t"+marks[i]);
        // }
        
    }

    
    public void start(Stage stage) throws Exception
    {
        stage.setTitle("Student Mark Analysis");
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis("Marks", 0, 620, 20);
        xAxis.setLabel("Students");
        //yAxis.setLabel("Marks");       
        
        final AreaChart<String,Number> areaChart = new AreaChart<String,Number>(xAxis,yAxis);
                
        areaChart.setTitle("Student marks analysis");
                                
        XYChart.Series<String,Number> series = new XYChart.Series<String,Number>();
        series.setName("Student Mark");
        assign();
        for(int i = 0;i<datas.size();i++)
        {
            series.getData().add(new XYChart.Data<String,Number>(names[i], marks[i]));
        }
        // series.getData().add(new XYChart.Data<String,Number>("Jan", 23));
        // series.getData().add(new XYChart.Data<String,Number>("Feb", 14));
        // series.getData().add(new XYChart.Data<String,Number>("Mar", 15));
        // series.getData().add(new XYChart.Data<String,Number>("Apr", 24));
        // series.getData().add(new XYChart.Data<String,Number>("May", 34));
        // series.getData().add(new XYChart.Data<String,Number>("Jun", 36));
        // series.getData().add(new XYChart.Data<String,Number>("Jul", 22));
        // series.getData().add(new XYChart.Data<String,Number>("Aug", 45));
        // series.getData().add(new XYChart.Data<String,Number>("Sep", 43));
        // series.getData().add(new XYChart.Data<String,Number>("Oct", 17));
        // series.getData().add(new XYChart.Data<String,Number>("Nov", 29));
        // series.getData().add(new XYChart.Data<String,Number>("Dec", 25));
        
        areaChart.getData().add(series);
        Scene scene  = new Scene(areaChart,800,600);
        stage.setScene(scene);
        stage.show();    
    }

    public static void main(String[] args)
    {
        launch(args);
    }
    
}
