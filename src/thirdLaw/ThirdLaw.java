package thirdLaw;

import java.io.InputStream;


import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import project.Node3;

public class ThirdLaw extends Application{
	public void thirdLaw(Stage primaryStage) {
		
		AnchorPane root=new AnchorPane();
		
		InputStream input1=getClass().getResourceAsStream("/thirdLaw/start.jpg");
		Image image1=new Image(input1);
		ImageView imageView1=new ImageView(image1);
		imageView1.setFitHeight(30);
		imageView1.setFitWidth(30);
		imageView1.setCache(true);
		imageView1.setPreserveRatio(true);
		
		InputStream input2=getClass().getResourceAsStream("/thirdLaw/pause.jpg");
		Image image2=new Image(input2);
		ImageView imageView2=new ImageView(image2);
		imageView2.setFitHeight(30);
		imageView2.setFitWidth(30);
		imageView2.setCache(true);
		imageView2.setPreserveRatio(true);
		
		
		Circle cir = new Circle();
		cir.setFill(Color.BLUEVIOLET);
		cir.setRadius(20);
		cir.setLayoutX(80);
		cir.setLayoutY(80);
		cir.setTranslateX(400);
		cir.setTranslateY(200);
		
		TranslateTransition transition = new TranslateTransition();
		transition.setDuration(Duration.millis(3000));
		transition.setToX(1200);
		transition.setAutoReverse(true);
		transition.setCycleCount(2);
		transition.setNode(cir);
		
		Line line=new Line(1300,50,1300,400);
		line.setStroke(Color.DARKGRAY);
		line.setStrokeWidth(20);
		
		Button button1 = new Button("Start");
		button1.setPrefHeight(70);
		button1.setPrefWidth(120);
		
		AnchorPane.setTopAnchor(button1, 400.0);
		AnchorPane.setLeftAnchor(button1, 200.0);
		button1.setStyle("-fx-font:18 arial");
		button1.setGraphic(imageView1);
		
		
		Button button2 = new Button("Pause");
		button2.setPrefHeight(70);
		button2.setPrefWidth(120);
		AnchorPane.setTopAnchor(button2, 400.0);
		AnchorPane.setLeftAnchor(button2, 400.0);
		button2.setStyle("-fx-font:18 arial");
		button2.setGraphic(imageView2);
		
		Button button3=new Button("Back");
		button3.setPrefHeight(70);
		button3.setPrefWidth(120);
		
		AnchorPane.setTopAnchor(button3, 400.0);
		AnchorPane.setLeftAnchor(button3, 600.0);
		button3.setStyle("-fx-font:18 arial");
		
		button1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				transition.play();		
			}
			
		});
		
		button2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				transition.pause();		
			}
			
		});
		button3.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Node3 node=new Node3();
				node.start3(primaryStage);
			}
		});
		
		
		
		root.getChildren().addAll(cir,line,button1,button2,button3);
		
		
		Scene scene=new Scene(root,1400,700);
		primaryStage.setTitle("Third Newton Law");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	
}
