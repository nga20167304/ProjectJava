package application;

import java.io.InputStream;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FirstLaw extends Application{
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Class<?> clazz = this.getClass();
		InputStream input = clazz.getResourceAsStream("/application/bàn.jpg");
		Image image = new Image(input);
		ImageView imageView = new ImageView(image);
		imageView.setFitHeight(200);
		imageView.setFitWidth(200);
		imageView.setTranslateX(600);
		imageView.setTranslateY(205);
		imageView.setPreserveRatio(true);
		
		Circle cir = new Circle();
		cir.setFill(Color.BLUEVIOLET);//set màu sắc
		cir.setRadius(10);//set bán kính
		cir.setLayoutX(50);
		cir.setLayoutY(50);
		
		TranslateTransition transition = new TranslateTransition();
		transition.setDuration(Duration.millis(5000));
		transition.setToX(1400);
		transition.setAutoReverse(false);
		transition.setCycleCount(Animation.INDEFINITE);
		transition.setNode(cir);
		
		Button button = new Button("Start");
		
		VBox root = new VBox();
		root.setSpacing(50);
		root.getChildren().addAll(imageView,cir,button);
		
		Scene scene = new Scene(root,1400,700);
		primaryStage.setTitle("First law");
		primaryStage.setScene(scene);
		
		//primaryStage.sizeToScene();
		//primaryStage.setFullScreen(true);
		primaryStage.show();
		
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				transition.play();				
			}
			
		});
	}
	public static void main(String[] args) {
		launch(args);
	}
}
