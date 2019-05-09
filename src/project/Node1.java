package project;

import java.util.Optional;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import project.Display;
import firstLaw.Arixtot;

public class Node1 extends Application{
	public Stage primaryStage;
	public void start1(Stage primaryStage) {
		AnchorPane root=new AnchorPane();
		
		Button button1=new Button("Expression Content");
		button1.setPrefHeight(120);
		button1.setPrefWidth(120);
		AnchorPane.setTopAnchor(button1, 100.0);
		AnchorPane.setLeftAnchor(button1, 250.0);
				
		Button button2=new Button("Start");
		button2.setPrefHeight(120);
		button2.setPrefWidth(120);
		AnchorPane.setTopAnchor(button2, 220.0);
		AnchorPane.setLeftAnchor(button2, 450.0);
		
		
		
		Button button3=new Button("Back");
		button3.setPrefHeight(120);
		button3.setPrefWidth(120);
		AnchorPane.setTopAnchor(button3, 340.0);
		AnchorPane.setLeftAnchor(button3, 650.00);
		
		
		
		Button button4=new Button("Exit");
		button4.setPrefHeight(120);
		button4.setPrefWidth(120);
		AnchorPane.setTopAnchor(button4, 460.0);
		AnchorPane.setLeftAnchor(button4, 850.0);
		
		
		button2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				Arixtot arixtot=new Arixtot();
				try {
					arixtot.TN_Arixtot(primaryStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		button3.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				Display dp=new Display();
				try {
					dp.display(primaryStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		button4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				showConfirmation();
			}
		});
		root.getChildren().addAll(button1,button2,button3,button4);
		
		Scene scene=new Scene(root,1400,700);
		
		primaryStage.setTitle("Newton's Law");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	private void showConfirmation() {
		Alert alert=new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirm Exit");
		alert.setHeaderText("Are you sure want to exit?");
		alert.setContentText("My Application");
		 
		Optional<ButtonType> option=alert.showAndWait();
		
		 if (option.get() == ButtonType.OK) {
	        	System.exit(0);
	        } else if (option.get() == ButtonType.CANCEL) {
	        	Node1 node = new Node1();
				node.start1(primaryStage);
	        }
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
