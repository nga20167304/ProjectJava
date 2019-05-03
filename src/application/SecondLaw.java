package application;

import java.io.InputStream;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.Line;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import javafx.util.Duration;


public class SecondLaw extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		Line line1=new Line(50,100,1400,100);
		line1.setStroke(Color.DARKGRAY);
		line1.setStrokeWidth(15);
		
		Line line2=new Line(50,200,1400,200);
		line2.setStroke(Color.DARKGRAY);
		line2.setStrokeWidth(15);
		
		
		String url="/application/car.png";
		Class<?> clazz=this.getClass();
		InputStream input1=clazz.getResourceAsStream(url);
		Image image1=new Image(input1);
		ImageView imageView1=new ImageView(image1);
		imageView1.setFitHeight(100);
		imageView1.setFitWidth(200);
		imageView1.setTranslateX(20);
		imageView1.setTranslateY(20);
		
		InputStream input2=getClass().getResourceAsStream("/application/car.png");
		Image image2=new Image(input2);
		ImageView imageView2=new ImageView(image2);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(200);
		imageView2.setTranslateX(20);
		imageView2.setTranslateY(120);
		
		
		AnchorPane root=new AnchorPane();
		
		Button button1=new Button("Start");
		button1.setPrefHeight(70);
		button1.setPrefWidth(120);
		
		AnchorPane.setTopAnchor(button1, 250.0);
		AnchorPane.setLeftAnchor(button1, 200.0);
		button1.setStyle("-fx-font:18 arial");
		
		HLineTo line_1=new HLineTo();
		line_1.setX(1300);

		MoveTo move1=new MoveTo();
		move1.setX(100);
		move1.setY(70);
		
		Path path1=new Path();
		path1.getElements().add(move1);
		path1.getElements().add(line_1);
				
		
		PathTransition pathT1=new PathTransition();
		pathT1.setDuration(Duration.millis(4000));
		pathT1.setPath(path1);
		pathT1.setNode(imageView1);
		pathT1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		HLineTo line_2=new HLineTo();
		line_2.setX(1300);

		MoveTo move2=new MoveTo();
		move2.setX(100);
		move2.setY(170);
		
		Path path2=new Path();
		path2.getElements().add(move2);
		path2.getElements().add(line_2);
				
		
		PathTransition pathT2=new PathTransition();
		pathT2.setDuration(Duration.millis(4000));
		pathT2.setPath(path2);
		pathT2.setNode(imageView2);
		pathT2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		
		button1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				pathT1.play();	
				pathT2.play();
			}
			
		});
		
		
		
		Line line3=new Line(50,400,1400,400);
		line3.setStroke(Color.DARKGRAY);
		line3.setStrokeWidth(15);
		
		Line line4=new Line(50,500,1400,500);
		line4.setStroke(Color.DARKGRAY);
		line4.setStrokeWidth(15);
		
		
		InputStream input3=getClass().getResourceAsStream("/application/car.png");
		Image image3=new Image(input3);
		ImageView imageView3=new ImageView(image3);
		imageView3.setFitHeight(100);
		imageView3.setFitWidth(200);
		imageView3.setTranslateX(20);
		imageView3.setTranslateY(320);
		
		
		HLineTo line_3=new HLineTo();
		line_3.setX(1300);

		MoveTo move3=new MoveTo();
		move3.setX(100);
		move3.setY(370);
		
		Path path3=new Path();
		path3.getElements().add(move3);
		path3.getElements().add(line_3);
				
		
		PathTransition pathT3=new PathTransition();
		pathT3.setDuration(Duration.millis(4000));
		pathT3.setPath(path3);
		pathT3.setNode(imageView3);
		pathT3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		
		Button button2=new Button("Next");
		button2.setPrefHeight(70);
		button2.setPrefWidth(120);
		
		AnchorPane.setTopAnchor(button2, 250.0);
		AnchorPane.setLeftAnchor(button2, 400.0);
		button2.setStyle("-fx-font:18 arial");
		
		
		button2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				pathT3.play();	
			}
			
		});
		root.getChildren().addAll(line1,line2,imageView1,imageView2,button1,line3,line4,imageView3,button2);
		Scene scene=new Scene(root,1400,700);
		
		primaryStage.setTitle("Seconds Newtons Laws");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
