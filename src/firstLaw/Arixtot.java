package firstLaw;

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
import javafx.stage.Stage;
import javafx.util.Duration;
import firstLaw.Galile;
import project.Node1;

public class Arixtot extends Application{
	
	public void TN_Arixtot(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Class<?> clazz = this.getClass();
		InputStream input = clazz.getResourceAsStream("/application/table.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(300);
		imageView.setFitWidth(300);
		imageView.setTranslateX(500);
		imageView.setTranslateY(130);
		imageView.setPreserveRatio(true);
		
		Circle cir = new Circle();
		cir.setFill(Color.BLUEVIOLET);
		cir.setRadius(10);
		cir.setLayoutX(50);
		cir.setLayoutY(50);
		cir.setTranslateX(500);
		cir.setTranslateY(185);
		
		TranslateTransition transition = new TranslateTransition();
		transition.setDuration(Duration.millis(2500));
		transition.setToX(700);
		transition.setNode(cir);
		
		Button button1 = new Button("Start");
		button1.setPrefHeight(100);
		button1.setPrefWidth(100);
		AnchorPane.setTopAnchor(button1, 450.0);
		AnchorPane.setLeftAnchor(button1, 400.0);
		button1.setStyle("-fx-font:20 arial");
		
		Button button2 = new Button("Next");
		button2.setPrefHeight(100);
		button2.setPrefWidth(100);
		AnchorPane.setTopAnchor(button2, 450.0);
		AnchorPane.setLeftAnchor(button2, 600.0);
		button2.setStyle("-fx-font:20 arial");
		
		Button button3 = new Button("Back");
		button3.setPrefHeight(100);
		button3.setPrefWidth(100);
		AnchorPane.setTopAnchor(button3, 450.0);
		AnchorPane.setLeftAnchor(button3, 800.0);
		button3.setStyle("-fx-font:20 arial");
		
		AnchorPane root=new AnchorPane();
		
		root.getChildren().addAll(imageView,cir,button1,button2,button3);
		
		Scene scene = new Scene(root,1400,700);
		primaryStage.setTitle("First law");
		primaryStage.setScene(scene);
		
		//primaryStage.sizeToScene();
		//primaryStage.setFullScreen(true);
		primaryStage.show();
		
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
				Galile galileo=new Galile();	
				galileo.Galileo(primaryStage);
			}
			
		});
		button3.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				Node1 node=new Node1();
				node.start1(primaryStage);
			}
			
		});
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
