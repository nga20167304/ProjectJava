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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import project.Node1;

public class ContentFirstLaw extends Application{
	private static final String CONTENT = "Nếu một vật không chịu tác dụng của lực nào hoặc chịu tác dụng của các lực có hợp lực bằng không thì nó giữ nguyên trạng thái đứng yên hoặc chuyển động thẳng đều.";
	private static final String CT = "CÔNG THỨC :";
	private static final String GT = "Trong đó :\n\n"+"+)ΣF: Tổng các lực tác dụng lên vật ";
	private static final Image IMAGE = new Image("/application/NewtonsLaws.jpg");
	
	public void content1(final Stage stage) throws Exception {
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
		label3.setTranslateX(500);
		
		
		InputStream input = getClass().getResourceAsStream("/firstLaw/CT1.png");
		Image image_CT = new Image(input);
		ImageView imageView_CT = new ImageView(image_CT);
		imageView_CT.setTranslateX(450);
		imageView_CT.setFitHeight(100);//chieu cao
		imageView_CT.setFitWidth(450);//chieu dai*/
		
		
		Button button=new Button("Back");
		button.setPrefHeight(80);
		button.setPrefWidth(120);
		button.setStyle("-fx-font:18 arial");
		AnchorPane.setTopAnchor(button, 600.0);
		AnchorPane.setLeftAnchor(button, 600.0);
		
		button.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Node1 node1=new Node1();
				node1.start1(stage);
			}
		});
		AnchorPane anchorPane = new AnchorPane();
		anchorPane.getChildren().add(button);
		

		VBox root = new VBox();
		root.setSpacing(30);
		root.setPadding(new Insets(30,0,0,0));
		
		root.getChildren().addAll(label1, label2,imageView_CT, label3);

		ImageView image = new ImageView(IMAGE);
		image.setOpacity(0.3);//set độ mò của ảnh
		
		
		
		StackPane layout = new StackPane();
		layout.setStyle("-fx-padding: 10;");
		layout.getChildren().setAll(image, root, anchorPane);
		
		
		
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
