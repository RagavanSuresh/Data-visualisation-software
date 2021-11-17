import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
//import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GUI extends Application
{

    public void start(Stage stage) throws Exception
    {
        Button areachart = new Button();
        Button linechart = new Button();
        Button piechart = new Button();
        Button barchart = new Button();
        Button scatterchart = new Button();
        Button writefile = new Button();

        writefile.setText("Write Data");
		writefile.setOnAction(new EventHandler<ActionEvent>()
        {

			public void handle(ActionEvent event)
            {
                Button addButton = new Button();
                Button clearButton = new Button();
                Label studentname = new Label();
                Label studentmark = new Label();
                Label studentgrade = new Label();
                TextField name = new TextField();
                TextField mark = new TextField();
                TextField grade = new TextField();
				GridPane secondPane = new GridPane();
                addButton.setText("Add Student");
                addButton.setOnAction(new EventHandler<ActionEvent>() {

                    public void handle(ActionEvent event)
                    {
                        Filing f = new Filing();
                        f.setName(name.getText());
                        int tempmark = Integer.parseInt(mark.getText());
                        f.setMark(tempmark);
                        int tempgrade = Integer.parseInt(grade.getText());
                        f.setGrade(tempgrade);
                        f.writefile();
                        
                    }
                });
                clearButton.setText("Clear screen");
                clearButton.setOnAction(new EventHandler<ActionEvent>() {

                    public void handle(ActionEvent event)
                    {
                        name.setText("");
                        mark.setText("");
                        grade.setText("");
                    }
                });
                studentname.setText("Enter Student's name: ");
                studentmark.setText("Enter Student's mark: ");
                studentgrade.setText("Enter Student's grade: ");
                name.setPrefColumnCount(15);
                mark.setPrefColumnCount(15);
                grade.setPrefColumnCount(15);
                GridPane.setConstraints(studentname,0,0);
                GridPane.setConstraints(name,1,0);
                GridPane.setConstraints(studentgrade,0,1);
                GridPane.setConstraints(grade,1,1);
                GridPane.setConstraints(studentmark,0,2);
                GridPane.setConstraints(mark,1,2);
                GridPane.setConstraints(addButton,1,3);
                GridPane.setConstraints(clearButton,0,3);
                secondPane.getChildren().add(studentgrade);
                secondPane.getChildren().add(studentname);
                secondPane.getChildren().add(studentmark);
                secondPane.getChildren().add(mark);
                secondPane.getChildren().add(grade);
                secondPane.getChildren().add(name);
                secondPane.getChildren().add(addButton);
                secondPane.getChildren().add(clearButton);
				Scene secondScene = new Scene(secondPane, 230, 100);
				Stage newWindow = new Stage();
				newWindow.setTitle("Data Insertion");
                newWindow.initModality(Modality.NONE);
				newWindow.setScene(secondScene);
				newWindow.show();
			}
		});

        scatterchart.setText("Scatter Chart Analysis");
		scatterchart.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event)
            {
				StackPane secondPane = new StackPane();
				Scene secondScene = new Scene(secondPane, 230, 100);
				Stage newWindow = new Stage();
				newWindow.setTitle("Area Chart");
                newWindow.initModality(Modality.NONE);
				newWindow.setScene(secondScene);
                ScatterChartSample s = new ScatterChartSample();
                try
                {
                    s.start(newWindow);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
				newWindow.show();
			}
		});


        barchart.setText("Bar Chart Analysis");
		barchart.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event)
            {
				StackPane secondPane = new StackPane();
				Scene secondScene = new Scene(secondPane, 230, 100);
				Stage newWindow = new Stage();
				newWindow.setTitle("Area Chart");
                newWindow.initModality(Modality.NONE);
				newWindow.setScene(secondScene);
                BarChartSample b = new BarChartSample();
                try
                {
                    b.start(newWindow);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
				newWindow.show();
			}
		});


        barchart.setText("Bar Chart Analysis");
		barchart.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event)
            {
				StackPane secondPane = new StackPane();
				Scene secondScene = new Scene(secondPane, 230, 100);
				Stage newWindow = new Stage();
				newWindow.setTitle("Area Chart");
                newWindow.initModality(Modality.NONE);
				newWindow.setScene(secondScene);
                BarChartSample b = new BarChartSample();
                try
                {
                    b.start(newWindow);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
				newWindow.show();
			}
		});


        piechart.setText("Pie Chart Analysis");
		piechart.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event)
            {
				StackPane secondPane = new StackPane();
				Scene secondScene = new Scene(secondPane, 230, 100);
				Stage newWindow = new Stage();
				newWindow.setTitle("Pie Chart");
                newWindow.initModality(Modality.NONE);
				newWindow.setScene(secondScene);
                PieChartSample p = new PieChartSample();
                try
                {
                    p.start(newWindow);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
				newWindow.show();
			}
		});


		areachart.setText("Area Chart Analysis");
		areachart.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event)
            {
				StackPane secondPane = new StackPane();
				Scene secondScene = new Scene(secondPane, 230, 100);
				Stage newWindow = new Stage();
				newWindow.setTitle("Area Chart");
                newWindow.initModality(Modality.NONE);
				newWindow.setScene(secondScene);
                AreaChartSample a = new AreaChartSample();
                try
                {
                    a.start(newWindow);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
				newWindow.show();
			}
		});

        linechart.setText("LineChart Analysis");
        linechart.setOnAction(new EventHandler<ActionEvent>(){

            public void handle(ActionEvent event)
            {
                StackPane secondPane = new StackPane();
                Scene secondScene = new Scene(secondPane,200,200);
                Stage newWindow = new Stage();
                newWindow.initModality(Modality.NONE);
                newWindow.setScene(secondScene);
                LineChartSample l = new LineChartSample();
                try
                {
                    l.start(newWindow);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }  
            }
            
        });
		GridPane root = new GridPane();
        GridPane.setConstraints(writefile, 0, 0);
        GridPane.setConstraints(linechart, 1, 0);
        GridPane.setConstraints(areachart, 0, 1);
        GridPane.setConstraints(barchart, 1, 1);
        GridPane.setConstraints(scatterchart, 0, 2);
        GridPane.setConstraints(piechart, 1, 2);
        root.getChildren().add(writefile);
        root.getChildren().add(scatterchart);
        root.getChildren().add(barchart);
        root.getChildren().add(linechart);
        root.getChildren().add(areachart);
        root.getChildren().add(piechart);
		Scene scene = new Scene(root, 450, 250);

	    stage.setTitle("MenuBar");
		stage.setScene(scene);
		stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
    
}
