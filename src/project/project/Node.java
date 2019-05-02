package project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class Node extends Application{
	public void start(Stage stage) {
		AnchorPane root=new AnchorPane();
		
		
		Button button1=new Button("Bắt đầu");
		button1.setPrefHeight(70);
		AnchorPane.setTopAnchor(button1, 30.0);
		AnchorPane.setLeftAnchor(button1, 200.0);
		AnchorPane.setRightAnchor(button1, 200.0);
		
		
		Button button2=new Button("Quay lại");
		button2.setPrefHeight(70);
		AnchorPane.setTopAnchor(button2, 120.0);
		AnchorPane.setLeftAnchor(button2, 200.00);
		AnchorPane.setRightAnchor(button2,200.0);
		
		
		Button button3=new Button("Kết thúc");
		button3.setPrefHeight(70);
		AnchorPane.setTopAnchor(button3, 210.0);
		AnchorPane.setLeftAnchor(button3, 200.0);
		AnchorPane.setRightAnchor(button3, 200.0);
		
		
		root.getChildren().addAll(button1,button2,button3);
		
		Scene scene=new Scene(root,600,310);
		
		stage.setTitle("�?ịnh luật Newtons");
		stage.setScene(scene);
		stage.show();
		
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
