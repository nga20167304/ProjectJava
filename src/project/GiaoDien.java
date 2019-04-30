package project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
//import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GiaoDien extends Application{
	//private StackPane stackPane;
		public void start(Stage primaryStage) throws Exception{
			AnchorPane root=new AnchorPane();

			//Button 1
			Button button1=new Button("Định luật 1");
			button1.setPrefHeight(70);
			AnchorPane.setTopAnchor(button1, 30.0);
			AnchorPane.setLeftAnchor(button1, 200.0);
			AnchorPane.setRightAnchor(button1, 200.0);
			
			//Button 2
			Button button2=new Button("Định luật 2");
			button2.setPrefHeight(70);
			AnchorPane.setTopAnchor(button2, 120.0);
			AnchorPane.setLeftAnchor(button2, 200.00);
			AnchorPane.setRightAnchor(button2,200.0);
			
			
			//Button 3
			Button button3=new Button("Định luật 3");
			button3.setPrefHeight(70);
			AnchorPane.setTopAnchor(button3, 210.0);
			AnchorPane.setLeftAnchor(button3, 200.0);
			AnchorPane.setRightAnchor(button3, 200.0);
			
			root.getChildren().addAll(button1,button2,button3);
			
			button1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					
				}
			});
			Scene scene=new Scene(root,600,310);
			
			primaryStage.setTitle("Newtons laws");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		}
		
		public static void main(String[] args) {
			launch(args);
		}
}
