package secondLaw;

import java.io.InputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import project.Node2;

public class ContentSecondLaw extends Application{
	private static final String CONTENT = "Vector gia tốc của một vật luôn cùng hướng với lực tác dụng lên vật. Độ lớn của vector gia tốc tỉ lệ thuận với độ lớn của vector lực và tỉ lệ nghịch với khối lượng của vật.";
	private static final String GT = "Trong đó:\n"+"+)a: Gia tốc của vật.\n"+"+)Fhl: Tổng hợp lực tác dụng lên vật.\n"+"+)m: Khối lượng của vật";
	private static final String CT = "CÔNG THỨC :";
	private static final Image IMAGE = new Image("/application/NewtonsLaws.jpg");



	public void content2(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Label label1 = new Label(CONTENT);
		label1.setWrapText(true);
		label1.setStyle("-fx-font-family: \"Comic Sans MS\"; -fx-font-size: 25; -fx-text-fill: darkred;");
		
		Label label2 = new Label(CT);
		label2.setWrapText(true);
		label2.setStyle("-fx-font-family: \"Comic Sans MS\"; -fx-font-size: 25; -fx-text-fill: darkred;");
		
		Label label3 = new Label(GT);
		label3.setWrapText(true);
		label3.setStyle("-fx-font-family: \"Comic Sans MS\"; -fx-font-size: 25; -fx-text-fill: darkred;");
		
		InputStream input = getClass().getResourceAsStream("/secondLaw/CT2.png");
		Image image_CT = new Image(input);
		ImageView imageView_CT = new ImageView(image_CT);
		
		Button button=new Button("Back");
		button.setPrefHeight(80);
		button.setPrefWidth(120);
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Node2 node=new Node2();
				node.start2(stage);
			}
		});
		
		VBox root = new VBox();
		root.setSpacing(30);
		root.setPadding(new Insets(30,0,0,0));
		root.getChildren().addAll(label1, label2, imageView_CT, label3,button);
		
		ImageView image = new ImageView(IMAGE);
		image.setOpacity(0.3);//set độ mò của ảnh
		
		StackPane layout = new StackPane();
		layout.setStyle("-fx-padding: 10;");
		layout.getChildren().setAll(image, root);
		
		Scene scene = new Scene(layout,1400,700);
		stage.setTitle("Content of second law");
		stage.setScene(scene);
		stage.show();
	}



	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
