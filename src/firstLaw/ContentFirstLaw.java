package firstLaw;

import java.io.InputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import project.Node1;
import firstLaw.Arixtot;
import project.Display;

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
		imageView_CT.setFitWidth(450);//chieu dai
		
		Button btnBack = new Button("Back");
		btnBack.setStyle(
		        "-fx-background-radius: 5em; " +
		        "-fx-min-width: 100px; " +
		        "-fx-min-height: 100px; " +
		        "-fx-max-width: 100px; " +
		        "-fx-max-height: 100px; " +
		        "-fx-background-color: #E8D3E3;" +
		        "-fx-background-insets: 0px; " +
		        "-fx-padding: 0px;"+
		        "-fx-font-size: 2em;"
		);
		AnchorPane.setTopAnchor(btnBack, 580.0);
		AnchorPane.setLeftAnchor(btnBack, 300.0);
		Tooltip tooltip_back=new Tooltip("Go to previous page");
		btnBack.setTooltip(tooltip_back);
		
		Button btnIllus = new Button("Illustrate");
		btnIllus.setStyle(
		        "-fx-background-radius: 5em; " +
		        "-fx-min-width: 100px; " +
		        "-fx-min-height: 100px; " +
		        "-fx-max-width: 100px; " +
		        "-fx-max-height: 100px; " +
		        "-fx-background-color: #E8D3E3;" +
		        "-fx-background-insets: 0px; " +
		        "-fx-padding: 0px;"+
		        "-fx-font-size: 2em;"
		);
		AnchorPane.setTopAnchor(btnIllus, 580.0);
		AnchorPane.setLeftAnchor(btnIllus, 650.0);
		Tooltip tooltip_illus=new Tooltip("To illustrate first law");
		btnIllus.setTooltip(tooltip_illus);
		
		Button btnMenu = new Button("Menu");
		btnMenu.setStyle(
		        "-fx-background-radius: 5em; " +
		        "-fx-min-width: 100px; " +
		        "-fx-min-height: 100px; " +
		        "-fx-max-width: 100px; " +
		        "-fx-max-height: 100px; " +
		        "-fx-background-color: #E8D3E3;" +
		        "-fx-background-insets: 0px; " +
		        "-fx-padding: 0px;"+
		        "-fx-font-size: 2em;"
		);
		AnchorPane.setTopAnchor(btnMenu, 580.0);
		AnchorPane.setLeftAnchor(btnMenu, 1000.0);
		Tooltip tooltip_menu=new Tooltip("Go to main menu");
		btnMenu.setTooltip(tooltip_menu);
		
		btnBack.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				Node1 node1=new Node1();
				node1.start1(stage);
			}
		});
		
		btnIllus.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Arixtot arix = new Arixtot();
				try {
					arix.TN_Arixtot(stage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		btnMenu.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				// TODO Auto-generated method stub
				Display menu = new Display();
				try {
					menu.display(stage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		Line line = new Line(0,100,1400,100);
		line.setStroke(Color.DARKGRAY);
		line.setStrokeWidth(5);
		AnchorPane.setTopAnchor(line, 550.0);
		
		AnchorPane anchorPane = new AnchorPane();
		anchorPane.getChildren().addAll(line, btnBack, btnIllus,btnMenu);
		

		VBox root = new VBox();
		root.setSpacing(30);
		root.setPadding(new Insets(30,0,0,0));
		
		root.getChildren().addAll(label1, label2,imageView_CT, label3);

		ImageView image = new ImageView(IMAGE);
		image.setOpacity(0.3);//set độ mò của ảnh				
		
		StackPane layout = new StackPane();
		layout.setStyle("-fx-padding: 10;");
		layout.getChildren().setAll(image, root, anchorPane);
		
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
