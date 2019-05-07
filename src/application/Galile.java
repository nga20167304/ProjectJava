package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Galile extends Application{
	public void start(Stage primaryStage) {
		AnchorPane root=new AnchorPane();
		
		Line line1=new Line(100,150,300,100);
		line1.setStroke(Color.DARKGRAY);
		line1.setStrokeWidth(15);
		
		Line line2=new Line(100,200,1400,200);
		line2.setStroke(Color.DARKGRAY);
		line2.setStrokeWidth(15);
		
		Line line3=new Line(100,100,1400,100);
		line3.setStroke(Color.DARKGRAY);
		line3.setStrokeWidth(15);
		
		Line line4=new Line(100,200,1400,200);
		line4.setStroke(Color.DARKGRAY);
		line4.setStrokeWidth(15);
		
		Line line5=new Line(100,100,1400,100);
		line5.setStroke(Color.DARKGRAY);
		line5.setStrokeWidth(15);
		
		Line line6=new Line(100,200,1400,200);
		line6.setStroke(Color.DARKGRAY);
		line6.setStrokeWidth(15);
		
		root.getChildren().addAll(line1,line2,line3,line4,line5,line6);
		
		
		Scene scene=new Scene(root,1400,700);
		
		primaryStage.setTitle("Galileo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
