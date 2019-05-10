package thirdLaw;

import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContentThirdLaw extends Application{
	private static final String CONTENT = "Khi vật 1 tác dụng lên vật 2 một lực,thì vật 2 cũng tác dụng trở lại vật 1 một lực.Hai lực này là hai lực trực đối,cùng phương,ngược chiều,cùng độ lớn và điểm đặt khác nhau.";
	private static final String GT = "Trong đó:\n"+"+)F12: Lực do vật 1 tác dụng lên vật 2.\n"+"+)F21: Lực do vật 2 tác dụng lên vật 1.\n";
	private static final String CT = "CÔNG THỨC :";
	private static final Image IMAGE = new Image("https://studiousguy.com/wp-content/uploads/2018/09/Newtons-Laws.jpg");

	
	public void content3(Stage stage) throws Exception {
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
		
		InputStream input = getClass().getResourceAsStream("/thirdLaw/CT3.png");
		Image image_CT = new Image(input);
		ImageView imageView_CT = new ImageView(image_CT);
		
		VBox root = new VBox();
		root.setSpacing(30);
		root.setPadding(new Insets(30,0,0,0));
		root.getChildren().addAll(label1, label2, imageView_CT, label3);
		
		ImageView image = new ImageView(IMAGE);
		image.setOpacity(0.3);//set độ mò của ảnh
		
		StackPane layout = new StackPane();
		layout.setStyle("-fx-padding: 10;");
		layout.getChildren().setAll(image, root);
		
		Scene scene = new Scene(layout,1400,700);
		stage.setTitle("Content of third law");
		stage.setScene(scene);
		stage.show();
	}


	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
