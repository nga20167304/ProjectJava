package project;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import project.Node;

public class NoiDung extends Application{

	public void start1(Stage primaryStage) {
		AnchorPane root=new AnchorPane();
		
		
		Button button1=new Button("Nội dung biểu thức");
		button1.setPrefHeight(70);
		AnchorPane.setTopAnchor(button1, 30.0);
		AnchorPane.setLeftAnchor(button1, 200.0);
		AnchorPane.setRightAnchor(button1, 200.0);
		
		
		Button button2=new Button("Demo về định luật");
		button2.setPrefHeight(70);
		AnchorPane.setTopAnchor(button2, 200.0);
		AnchorPane.setLeftAnchor(button2, 200.0);
		AnchorPane.setRightAnchor(button2,200.0);
		
		
		root.getChildren().addAll(button1,button2);
		
		button2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				Node node=new Node();
				node.start2(primaryStage);
			}
		});
		Scene scene=new Scene(root,1400,700);
		
		primaryStage.setTitle("Định luật Newtons");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
