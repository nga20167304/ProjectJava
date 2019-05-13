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
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.HLineTo;
import javafx.scene.shape.Line;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import javafx.stage.Stage;
import javafx.util.Duration;
import firstLaw.Galile;
import project.Display;
import project.Node1;

public class Arixtot extends Application{
	private static final Image IMAGE = new Image("/application/NewtonsLaws.jpg");
	public void TN_Arixtot(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Class<?> clazz = this.getClass();
		InputStream input = clazz.getResourceAsStream("/application/table.png");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(400);
		imageView.setFitWidth(400);
		imageView.setTranslateX(450);
		imageView.setTranslateY(100);
		imageView.setPreserveRatio(true);
		
		InputStream input2=getClass().getResourceAsStream("/application/hand.png");
		Image image2=new Image(input2);
		ImageView imageView2=new ImageView(image2);
		imageView2.setFitHeight(100);
		imageView2.setFitWidth(100);
		imageView2.setTranslateX(350);
		imageView2.setTranslateY(190);
		
		HLineTo line_1=new HLineTo();
		line_1.setX(470);

		MoveTo move1=new MoveTo();
		move1.setX(380);
		move1.setY(240);
		
		Path path1=new Path();
		path1.getElements().add(move1);
		path1.getElements().add(line_1);
				
		
		PathTransition pathT1=new PathTransition();
		pathT1.setDuration(Duration.millis(4000));
		pathT1.setPath(path1);
		pathT1.setNode(imageView2);
		pathT1.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
		
		Circle cir = new Circle();
		cir.setFill(Color.BLUEVIOLET);
		cir.setRadius(20);
		cir.setLayoutX(50);
		cir.setLayoutY(50);
		cir.setTranslateX(480);
		cir.setTranslateY(185);
		
		TranslateTransition transition = new TranslateTransition();
		transition.setDuration(Duration.millis(2500));
		transition.setToX(700);
		transition.setNode(cir);
		
		Button button1 = new Button("Start");
		button1.setPrefHeight(80);
		button1.setPrefWidth(120);
		AnchorPane.setTopAnchor(button1, 600.0);
		AnchorPane.setLeftAnchor(button1, 400.0);
		button1.setStyle("-fx-font:20 arial");
		
		Button button2 = new Button("Next");
		button2.setPrefHeight(80);
		button2.setPrefWidth(120);
		AnchorPane.setTopAnchor(button2, 600.0);
		AnchorPane.setLeftAnchor(button2, 600.0);
		button2.setStyle("-fx-font:20 arial");
		
		Button button3 = new Button("Back");
		button3.setPrefHeight(80);
		button3.setPrefWidth(120);
		AnchorPane.setTopAnchor(button3, 600.0);
		AnchorPane.setLeftAnchor(button3, 800.0);
		button3.setStyle("-fx-font:20 arial");
		
		Button button4=new Button("Menu");
		button4.setPrefHeight(80);
		button4.setPrefWidth(120);
		AnchorPane.setTopAnchor(button4, 600.0);
		AnchorPane.setLeftAnchor(button4, 1000.0);
		button4.setStyle("-fx-font:20 arial");
		
		Line line1=new Line(0,550,1400,550);
		line1.setStroke(Color.DARKGRAY);
		
		ImageView image1 = new ImageView(IMAGE);
		image1.setOpacity(0.3);
		image1.setTranslateX(300);
		
		AnchorPane root=new AnchorPane();
		
		
		root.getChildren().addAll(imageView,cir,button1,button2,button3,button4,line1,imageView2);
		
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
				pathT1.play();
				button1.setOnAction(new EventHandler<ActionEvent>() {
					public void handle(ActionEvent event) {
						transition.play();	
					}
				});
							
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
	}
	
	public void setText() {
		Circle circle = new Circle();
		Text text = new Text("");
		text.setBoundsType(TextBoundsType.VISUAL);
		StackPane stack = new StackPane();
		stack.getChildren().addAll(circle, text);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
