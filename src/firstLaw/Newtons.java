package firstLaw;

import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;
import firstLaw.Galile;

public class Newtons extends Application{
	public void start(Stage primaryStage) {
		
	}
	public void NewtonsLaw(Stage primaryStage) {
		AnchorPane root=new AnchorPane();
		
		Circle cir1 = new Circle();
		cir1.setFill(Color.BLUEVIOLET);
		cir1.setRadius(20);
		cir1.setLayoutX(80);
		cir1.setLayoutY(80);
		cir1.setTranslateX(80);
		cir1.setTranslateY(20);
		
		TranslateTransition transition1 = new TranslateTransition();
		transition1.setDuration(Duration.millis(3000));
		transition1.setToX(1200);
		transition1.setNode(cir1);
		
		Circle cir2 = new Circle();
		cir2.setFill(Color.BLUEVIOLET);
		cir2.setRadius(20);
		cir2.setLayoutX(80);
		cir2.setLayoutY(80);
		cir2.setTranslateX(80);
		cir2.setTranslateY(150);
		
		Button button1=new Button("Start");
		button1.setPrefHeight(100);
		button1.setPrefWidth(100);
		AnchorPane.setTopAnchor(button1, 550.0);
		AnchorPane.setLeftAnchor(button1, 350.0);
		button1.setStyle("-fx-font:20 arial");
		
		
		Button button2=new Button("Back");
		button2.setPrefHeight(100);
		button2.setPrefWidth(100);
		AnchorPane.setTopAnchor(button2, 550.0);
		AnchorPane.setLeftAnchor(button2, 550.0);
		button2.setStyle("-fx-font:20 arial");
		
		button1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				transition1.play();
			}
		});
		
		button2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Galile galileo=new Galile();	
				galileo.Galileo(primaryStage);
			}
		});
		
		root.getChildren().addAll(cir1,cir2);
		root.getChildren().addAll(button1,button2);
		
		Scene scene=new Scene(root,1400,700);
		
		primaryStage.setTitle("Newtons Law");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
