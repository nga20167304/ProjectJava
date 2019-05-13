package firstLaw;

import java.io.InputStream;

import javafx.animation.PathTransition;
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
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;
import project.Display;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import firstLaw.Newtons;
//import firstLaw.Arixtot;

public class Galile extends Application{
	public void Galileo(Stage primaryStage) {
		AnchorPane root=new AnchorPane();
		
		String url="/firstLaw/galileo1.png";
		Class<?> clazz=this.getClass();
		InputStream input1=clazz.getResourceAsStream(url);
		Image image1=new Image(input1);
		ImageView imageView1=new ImageView(image1);
		imageView1.setFitHeight(150);
		imageView1.setFitWidth(1200);
		imageView1.setTranslateX(90);
		imageView1.setTranslateY(40);
		
		InputStream input2=getClass().getResourceAsStream("/firstLaw/galileo2.png");
		Image image2=new Image(input2);
		ImageView imageView2=new ImageView(image2);
		imageView2.setFitHeight(150);
		imageView2.setFitWidth(1200);
		imageView2.setTranslateX(90);
		imageView2.setTranslateY(190);
		
		InputStream input3=getClass().getResourceAsStream("/firstLaw/galileo3.png");
		Image image3=new Image(input3);
		ImageView imageView3=new ImageView(image3);
		imageView3.setFitHeight(150);
		imageView3.setFitWidth(1200);
		imageView3.setTranslateX(90);
		imageView3.setTranslateY(350);
		
		
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
		
		
		LineTo line1=new LineTo();
		line1.setX(500);
		line1.setY(70);
		
		LineTo line1_1=new LineTo();
		line1_1.setX(700);
		line1_1.setY(40);

		
		MoveTo move1=new MoveTo();
		move1.setX(80);
		move1.setY(20);
		
		Path path1=new Path();
		path1.getElements().add(move1);
		path1.getElements().add(line1);
		path1.getElements().add(line1_1);
				
		
		PathTransition pathT1=new PathTransition();
		pathT1.setDuration(Duration.millis(3000));
		pathT1.setPath(path1);
		pathT1.setNode(cir1);
		pathT1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		Circle cir2 = new Circle();
		cir2.setFill(Color.BLUEVIOLET);
		cir2.setRadius(20);
		cir2.setLayoutX(80);
		cir2.setLayoutY(80);
		cir2.setTranslateX(80);
		cir2.setTranslateY(150);
		
		TranslateTransition transition2 = new TranslateTransition();
		transition2.setDuration(Duration.millis(3000));
		transition2.setToX(1200);
		transition2.setNode(cir2);
		
		
		LineTo line2=new LineTo();
		line2.setX(450);
		line2.setY(220);
		
		LineTo line2_1=new LineTo();
		line2_1.setX(800);
		line2_1.setY(190);

		
		MoveTo move2=new MoveTo();
		move2.setX(80);
		move2.setY(150);
		
		Path path2=new Path();
		path2.getElements().add(move2);
		path2.getElements().add(line2);
		path2.getElements().add(line2_1);
				
		
		PathTransition pathT2=new PathTransition();
		pathT2.setDuration(Duration.millis(3000));
		pathT2.setPath(path2);
		pathT2.setNode(cir2);
		pathT2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		Circle cir3 = new Circle();
		cir3.setFill(Color.BLUEVIOLET);
		cir3.setRadius(20);
		cir3.setLayoutX(80);
		cir3.setLayoutY(80);
		cir3.setTranslateX(80);
		cir3.setTranslateY(300);
		
		TranslateTransition transition3 = new TranslateTransition();
		transition3.setDuration(Duration.millis(3000));
		transition3.setToX(1400);
		transition3.setNode(cir3);
		
		
		LineTo line3=new LineTo();
		line3.setX(550);
		line3.setY(380);
		
		HLineTo line3_1=new HLineTo();
		line3_1.setX(1400);
		
		MoveTo move3=new MoveTo();
		move3.setX(80);
		move3.setY(300);
		
		Path path3=new Path();
		path3.getElements().add(move3);
		path3.getElements().add(line3);
		path3.getElements().add(line3_1);
				
		
		PathTransition pathT3=new PathTransition();
		pathT3.setDuration(Duration.millis(3000));
		pathT3.setPath(path3);
		pathT3.setNode(cir3);
		pathT3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		Line line=new Line(0,550,1400,550);
		line.setStroke(Color.DARKGRAY);
		
		Button button1=new Button("Start");
		button1.setPrefHeight(80);
		button1.setPrefWidth(120);
		AnchorPane.setTopAnchor(button1, 600.0);
		AnchorPane.setLeftAnchor(button1, 350.0);
		button1.setStyle("-fx-font:20 arial");
		
		
		Button button2=new Button("Next");
		button2.setPrefHeight(80);
		button2.setPrefWidth(120);
		AnchorPane.setTopAnchor(button2, 600.0);
		AnchorPane.setLeftAnchor(button2, 550.0);
		button2.setStyle("-fx-font:20 arial");
		
		Button button3=new Button("Back");
		button3.setPrefHeight(80);
		button3.setPrefWidth(120);
		AnchorPane.setTopAnchor(button3, 600.0);
		AnchorPane.setLeftAnchor(button3, 750.0);
		button3.setStyle("-fx-font:20 arial");
		
		Button button4=new Button("Menu");
		button4.setPrefHeight(80);
		button4.setPrefWidth(120);
		AnchorPane.setTopAnchor(button4, 600.0);
		AnchorPane.setLeftAnchor(button4, 1000.0);
		button4.setStyle("-fx-font:20 arial");
		
		root.getChildren().addAll(imageView1,imageView2,imageView3);
		root.getChildren().addAll(button1,button2,button3,button4);
		root.getChildren().addAll(cir1,cir2,cir3,line);
		
		
		button1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				pathT1.play();
				pathT2.play();
				pathT3.play();
			}
		});
		
		button2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
								Newtons newtons=new Newtons();
								newtons.NewtonsLaw(primaryStage);
							}
		});
		
		
		button3.setOnAction(new EventHandler<ActionEvent>() {
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
		
		button4.setOnAction(new EventHandler<ActionEvent>() {
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
		Scene scene=new Scene(root,1400,700);
		
		primaryStage.setTitle("Galileo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public void start(Stage stage) {
		
	}
}
