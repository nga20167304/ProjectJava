package firstLaw;

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

public class ContentFirstLaw extends Application{
	private static final String CONTENT = "Nếu một vật không chịu tác dụng của lực nào hoặc chịu tác dụng của các lực có hợp lực bằng không thì nó giữ nguyên trạng thái đứng yên hoặc chuyển động thẳng đều.";
	private static final String CT = "CÔNG THỨC :";
	private static final Image IMAGE = new Image("https://studiousguy.com/wp-content/uploads/2018/09/Newtons-Laws.jpg");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	@Override
	public void start(final Stage stage) throws Exception {
		// TODO Auto-generated method stub
		Label label1 = new Label(CONTENT);
		label1.setWrapText(true);
		label1.setStyle("-fx-font-family: \"Comic Sans MS\"; -fx-font-size: 25; -fx-text-fill: darkred;");
		
		Label label2 = new Label(CT);
		label2.setWrapText(true);
		label2.setStyle("-fx-font-family: \"Comic Sans MS\"; -fx-font-size: 25; -fx-text-fill: darkred;");
		
		InputStream input = getClass().getResourceAsStream("/firstLaw/CT1_remove.png");
		Image image_CT = new Image(input);
		ImageView imageView_CT = new ImageView(image_CT);
		
		VBox root = new VBox();
		root.setSpacing(30);
		root.setPadding(new Insets(30,0,0,0));
		root.getChildren().addAll(label1, label2, imageView_CT);
		
		ImageView image = new ImageView(IMAGE);
		image.setOpacity(0.3);//set độ mò của ảnh
		
		StackPane layout = new StackPane();
		layout.setStyle("-fx-padding: 10;");
		layout.getChildren().setAll(image, root);
		
		Scene scene = new Scene(layout,1400,700);
		stage.setTitle("Content of first law");
		stage.setScene(scene);
		stage.show();
	}

}
