package secondLaw;

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
import secondLaw.Arrow;


public class SecondLaw extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		Line line1=new Line(100,100,1400,100);
		line1.setStroke(Color.DARKGRAY);
		line1.setStrokeWidth(15);
		
		Line line2=new Line(100,200,1400,200);
		line2.setStroke(Color.DARKGRAY);
		line2.setStrokeWidth(15);
		
		
		String url="/application/car.png";
		Class<?> clazz=this.getClass();
		InputStream input1=clazz.getResourceAsStream(url);
		Image image1=new Image(input1);
		ImageView imageView1=new ImageView(image1);
		imageView1.setFitHeight(100);
		imageView1.setFitWidth(200);
		imageView1.setTranslateX(70);
		imageView1.setTranslateY(20);
		
		InputStream input2=getClass().getResourceAsStream("/application/car.png");
		Image image2=new Image(input2);
		ImageView imageView2=new ImageView(image2);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(200);
		imageView2.setTranslateX(70);
		imageView2.setTranslateY(120);
		
		Arrow arrow1 = new Arrow(0,80,50,80);
		Arrow arrow2 = new Arrow(0,180,50,180);
		arrow2.setStrokeWidth(5);
		
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
		move1.setX(170);
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
		move2.setX(170);
		move2.setY(170);
		
		Path path2=new Path();
		path2.getElements().add(move2);
		path2.getElements().add(line_2);
				
		
		PathTransition pathT2=new PathTransition();
		pathT2.setDuration(Duration.millis(3000));
		pathT2.setPath(path2);
		pathT2.setNode(imageView2);
		pathT2.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		HLineTo line_1_1=new HLineTo();
		line_1_1.setX(70);

		MoveTo move1_1=new MoveTo();
		move1_1.setX(0);
		move1_1.setY(80);
		
		Path path1_1=new Path();
		path1_1.getElements().add(move1_1);
		path1_1.getElements().add(line_1_1);
				
		
		PathTransition pathT1_1=new PathTransition();
		pathT1_1.setDuration(Duration.millis(2000));
		pathT1_1.setPath(path1_1);
		pathT1_1.setNode(arrow1);
		pathT1_1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		HLineTo line_2_1=new HLineTo();
		line_2_1.setX(70);

		MoveTo move2_1=new MoveTo();
		move2_1.setX(0);
		move2_1.setY(180);
		
		Path path2_1=new Path();
		path2_1.getElements().add(move2_1);
		path2_1.getElements().add(line_2_1);
				
		
		PathTransition pathT2_1=new PathTransition();
		pathT2_1.setDuration(Duration.millis(2000));
		pathT2_1.setPath(path2_1);
		pathT2_1.setNode(arrow2);
		pathT2_1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		button1.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				//pathT1.play();	
				//pathT2.play();
				pathT1_1.play();
				pathT2_1.play();
				button1.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						// TODO Auto-generated method stub
						pathT1.play();	
						pathT2.play();
					}
					
				});
			}
			
		});
		
		
		Line line3=new Line(100,400,1400,400);
		line3.setStroke(Color.DARKGRAY);
		line3.setStrokeWidth(15);
		
		Line line4=new Line(100,500,1400,500);
		line4.setStroke(Color.DARKGRAY);
		line4.setStrokeWidth(15);
		
		
		InputStream input3=getClass().getResourceAsStream("/application/car.png");
		Image image3=new Image(input3);
		ImageView imageView3=new ImageView(image3);
		imageView3.setFitHeight(100);
		imageView3.setFitWidth(200);
		imageView3.setTranslateX(70);
		imageView3.setTranslateY(320);
		
		InputStream input4=getClass().getResourceAsStream("/application/car2.png");
		Image image4=new Image(input4);
		ImageView imageView4=new ImageView(image4);
		imageView4.setFitHeight(80);
		imageView4.setFitWidth(160);
		imageView4.setTranslateX(90);
		imageView4.setTranslateY(420);
		
		
		HLineTo line_3=new HLineTo();
		line_3.setX(1300);

		MoveTo move3=new MoveTo();
		move3.setX(170);
		move3.setY(370);
		
		Path path3=new Path();
		path3.getElements().add(move3);
		path3.getElements().add(line_3);
				
		
		PathTransition pathT3=new PathTransition();
		pathT3.setDuration(Duration.millis(4000));
		pathT3.setPath(path3);
		pathT3.setNode(imageView3);
		pathT3.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		HLineTo line_4=new HLineTo();
		line_4.setX(1300);

		MoveTo move4=new MoveTo();
		move4.setX(170);
		move4.setY(460);
		
		Path path4=new Path();
		path4.getElements().add(move4);
		path4.getElements().add(line_4);
				
		
		PathTransition pathT4=new PathTransition();
		pathT4.setDuration(Duration.millis(5000));
		pathT4.setPath(path4);
		pathT4.setNode(imageView4);
		pathT4.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		
		Button button2=new Button("Next");
		button2.setPrefHeight(70);
		button2.setPrefWidth(120);
		
		AnchorPane.setTopAnchor(button2, 250.0);
		AnchorPane.setLeftAnchor(button2, 400.0);
		button2.setStyle("-fx-font:18 arial");
		
		Arrow arrow3 = new Arrow(0,380,50,380);
		Arrow arrow4 = new Arrow(0,480,50,480);
		
		
		HLineTo line_3_1=new HLineTo();
		line_3_1.setX(70);

		MoveTo move3_1=new MoveTo();
		move3_1.setX(0);
		move3_1.setY(380);
		
		Path path3_1=new Path();
		path3_1.getElements().add(move3_1);
		path3_1.getElements().add(line_3_1);
				
		
		PathTransition pathT3_1=new PathTransition();
		pathT3_1.setDuration(Duration.millis(2000));
		pathT3_1.setPath(path3_1);
		pathT3_1.setNode(arrow3);
		pathT3_1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		HLineTo line_4_1=new HLineTo();
		line_4_1.setX(70);

		MoveTo move4_1=new MoveTo();
		move4_1.setX(0);
		move4_1.setY(480);
		
		Path path4_1=new Path();
		path4_1.getElements().add(move4_1);
		path4_1.getElements().add(line_4_1);
				
		
		PathTransition pathT4_1=new PathTransition();
		pathT4_1.setDuration(Duration.millis(2000));
		pathT4_1.setPath(path4_1);
		pathT4_1.setNode(arrow4);
		pathT4_1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		
		button2.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				pathT3_1.play();
				pathT4_1.play();
				button2.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						// TODO Auto-generated method stub
						pathT3.play();	
						pathT4.play();
					}
					
				});
				
				
			}
			
		});
		root.getChildren().addAll(line1,line2,imageView1,imageView2,button1);
		root.getChildren().addAll(line3,line4,imageView3,imageView4,button2);
		root.getChildren().addAll(arrow1,arrow2,arrow3,arrow4);
		
		Scene scene=new Scene(root,1400,700);
		
		primaryStage.setTitle("Seconds Newtons Laws");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
