package application;

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

public class SecondLaw extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		/*Circle cir = new Circle();
		cir.setFill(Color.BLUEVIOLET);//set màu sắc
		cir.setRadius(10);//set bán kính
		cir.setLayoutX(50);
		cir.setLayoutY(50);
		
		Circle cir2 = new Circle();
		cir2.setFill(Color.BLUEVIOLET);//set màu sắc
		cir2.setRadius(10);//set bán kính
		cir2.setLayoutX(50);
		cir2.setLayoutY(50);
		
		TranslateTransition transition = new TranslateTransition();
		transition.setDuration(Duration.millis(5000));
		transition.setToX(500);
		transition.setNode(cir);
		
		TranslateTransition transition2 = new TranslateTransition();
		transition2.setDuration(Duration.millis(3000));
		transition2.setToX(500);
		transition2.setNode(cir2);
		
		Button button = new Button("Start");
		
		VBox root = new VBox();
		root.getChildren().add(cir);
		root.getChildren().add(cir2);
		root.getChildren().add(button);
		
		Scene scene = new Scene(root,600,600);
		primaryStage.setTitle("Second Law");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				transition.play();
				transition2.play();
			}
			
		});*/
		Line line1=new Line(50,50,1400,50);
		line1.setStroke(Color.DARKGRAY);
		line1.setStrokeWidth(15);
		
		Line line2=new Line(50,150,1400,150);
		line2.setStroke(Color.DARKGRAY);
		line2.setStrokeWidth(15);
		
		
		String url="/application/car.jpg";
		Class<?> clazz=this.getClass();
		InputStream input=clazz.getResourceAsStream(url);
		Image image=new Image(input);
		ImageView imageView1=new ImageView(image);
		imageView1.setFitHeight(200);
		imageView1.setFitWidth(200);
		
		AnchorPane root=new AnchorPane();
		
		root.getChildren().addAll(line1,line2);
		Scene scene=new Scene(root,1400,700);
		
		primaryStage.setTitle("Seconds Newtons Laws");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
