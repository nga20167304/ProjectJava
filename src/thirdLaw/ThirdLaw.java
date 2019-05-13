package thirdLaw;


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
import project.Display;
import project.Node3;

public class ThirdLaw extends Application{
	private static final Image IMAGE = new Image("/application/NewtonsLaws.jpg");
	public void thirdLaw(Stage primaryStage) {
		
		AnchorPane root=new AnchorPane();
		
		Circle cir = new Circle();
		cir.setFill(Color.BLUEVIOLET);
		cir.setRadius(20);
		cir.setLayoutX(80);
		cir.setLayoutY(80);
		cir.setTranslateX(400);
		cir.setTranslateY(200);
		
		TranslateTransition transition = new TranslateTransition();
		transition.setDuration(Duration.millis(3000));
		transition.setToX(1195);
		transition.setAutoReverse(true);
		transition.setCycleCount(2);
		transition.setNode(cir);
		
		Line line=new Line(1300,50,1300,400);
		line.setStroke(Color.DARKGRAY);
		line.setStrokeWidth(20);
		
		Button button1 = new Button("Start");
		button1.setPrefHeight(70);
		button1.setPrefWidth(120);
		
		AnchorPane.setTopAnchor(button1, 600.0);
		AnchorPane.setLeftAnchor(button1, 200.0);
		button1.setStyle("-fx-font:18 arial");
		
		
		
		Button button2 = new Button("Pause");
		button2.setPrefHeight(70);
		button2.setPrefWidth(120);
		AnchorPane.setTopAnchor(button2, 600.0);
		AnchorPane.setLeftAnchor(button2, 400.0);
		button2.setStyle("-fx-font:18 arial");
		
		
		Button button3=new Button("Back");
		button3.setPrefHeight(70);
		button3.setPrefWidth(120);
		
		AnchorPane.setTopAnchor(button3, 600.0);
		AnchorPane.setLeftAnchor(button3, 600.0);
		button3.setStyle("-fx-font:18 arial");
		
		
		Button button4=new Button("Menu");
		button4.setPrefHeight(70);
		button4.setPrefWidth(120);
		AnchorPane.setTopAnchor(button4, 600.0);
		AnchorPane.setLeftAnchor(button4, 800.0);
		button4.setStyle("-fx-font:20 arial");
		
		Line line1=new Line(0,550,1400,550);
		line1.setStroke(Color.DARKGRAY);
		
		ImageView image = new ImageView(IMAGE);
		image.setOpacity(0.3);//set độ mò của ảnh
		image.setTranslateX(300);
		
		
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
		
		
		root.getChildren().addAll(cir,line,button1,button2,button3,button4,line1,image);
			
		
		
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
