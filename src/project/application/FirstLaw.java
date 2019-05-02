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
		imageView.setFitHeight(100);
		imageView.setFitWidth(100);
		imageView.setPreserveRatio(true);
//		imageView.set
		
		Circle cir = new Circle();
		cir.setFill(Color.BLUEVIOLET);//set màu sắc
		cir.setRadius(10);//set bán kính
		cir.setLayoutX(50);
		cir.setLayoutY(50);
		
		TranslateTransition transition = new TranslateTransition();
		transition.setDuration(Duration.millis(5000));
		transition.setToX(500);
		transition.setNode(cir);
		
		Button button = new Button("Start");
		
		VBox root = new VBox();
		root.setSpacing(50);
		root.getChildren().add(imageView);
		root.getChildren().add(cir);
		root.getChildren().add(button);
		
		Scene scene = new Scene(root,600,600);
		primaryStage.setTitle("First law");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				transition.play();				
			}
			
		});
	}

}
