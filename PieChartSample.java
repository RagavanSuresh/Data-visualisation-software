import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.stage.Stage;

public class PieChartSample extends Application
{

    public void start(Stage stage) throws Exception
    {
        Scene scene = new Scene(new Group());
        stage.setTitle("Student Mark Pie Chart");
        stage.setWidth(500);
        stage.setHeight(500);

        
        ArrayList<PieChart.Data> datas = new ArrayList<PieChart.Data>();
        Filing f = new Filing(); 
        ArrayList<String[]> temp = f.exportdata();
        for(int i=0;i<temp.size();i++)
        {
            String[] temp1 = temp.get(i);
            int tempint = Integer.parseInt(temp1[2]);
            tempint = tempint/10;
            datas.add(new PieChart.Data(temp1[0], tempint));
        }
        ObservableList<PieChart.Data> piechartdata = FXCollections.observableArrayList(datas);

        final PieChart chart = new PieChart(piechartdata);
        chart.setTitle("Student Mark Analysis");

        ((Group) scene.getRoot()).getChildren().add(chart);
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
        
    }
}
