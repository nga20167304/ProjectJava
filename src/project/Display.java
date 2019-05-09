
package project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import project.Node1;

public class Display extends Application{
	
		public void display(Stage primaryStage) throws Exception{
			AnchorPane root=new AnchorPane();

			//Button 1
			Button button1=new Button("Newton's law 1");
			button1.setPrefHeight(150);
			button1.setPrefWidth(150);
			AnchorPane.setTopAnchor(button1, 270.0);
			AnchorPane.setLeftAnchor(button1, 300.0);
			button1.setId("law1");
			
			
			//Button 2
			Button button2=new Button("Newton's law 2");
			button2.setPrefHeight(150);
			button2.setPrefWidth(150);
			AnchorPane.setTopAnchor(button2, 270.0);
			AnchorPane.setLeftAnchor(button2, 500.0);
			button2.setId("law2");
			
			
			
			//Button 3
			Button button3=new Button("Newton's law 3");
			button3.setPrefHeight(150);
			button3.setPrefWidth(150);
			AnchorPane.setTopAnchor(button3, 270.0);
			AnchorPane.setLeftAnchor(button3, 700.0);
			button3.setId("law3");
			
			
			root.getChildren().addAll(button1,button2,button3);
			
			button1.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Node1 node = new Node1();
					node.start1(primaryStage);
				}
			});
			button2.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Node2 node = new Node2();
					node.start2(primaryStage);
				}
			});
			button3.setOnAction(new EventHandler<ActionEvent>() {
				public void handle(ActionEvent event) {
					Node3 node = new Node3();
					node.start3(primaryStage);
				}
			});
			Scene scene=new Scene(root,1400,700);
			
			primaryStage.setTitle("Newton's laws");
			primaryStage.setScene(scene);
			primaryStage.show();
			
			
		}
		
		@Override
		public void start(Stage arg0) throws Exception {
			// TODO Auto-generated method stub
			
		}
}
