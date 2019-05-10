package firstLaw;

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
import project.Node1;

public class ContentFirstLaw extends Application{
	private static final String CONTENT = "Nếu một vật không chịu tác dụng của lực nào hoặc chịu tác dụng của các lực có hợp lực bằng không thì nó giữ nguyên trạng thái đứng yên hoặc chuyển động thẳng đều.";
	private static final String CT = "CÔNG THỨC :";
	private static final Image IMAGE = new Image("/application/NewtonsLaws.jpg");
	
	public void content1(final Stage stage) throws Exception {
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
		
		Button button=new Button("Back");
		button.setPrefHeight(80);
		button.setPrefWidth(120);
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Node1 node1=new Node1();
				node1.start1(stage);
			}
		});
		//button.setStyle("-fx-position:400 700");

		VBox root = new VBox();
		root.setSpacing(30);
		root.setPadding(new Insets(30,0,0,0));
		
		root.getChildren().addAll(label1, label2, imageView_CT,button);

		ImageView image = new ImageView(IMAGE);
		image.setOpacity(0.3);//set độ mò của ảnh
		
		
		
		StackPane layout = new StackPane();
		layout.setStyle("-fx-padding: 10;");
		layout.getChildren().setAll(image, root);
		
		
		
	//	AnchorPane.setTopAnchor(button, 340.0);
	//	AnchorPane.setLeftAnchor(button, 650.00);
		
		Scene scene = new Scene(layout,1400,700);
		stage.setTitle("Content of first law");
		stage.setScene(scene);
		stage.show();
	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
