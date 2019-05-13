package project;


import java.util.Optional;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import project.Display;
import secondLaw.SecondLaw;
import secondLaw.ContentSecondLaw;

public class Node2 extends Application{
	public Stage primaryStage;
	public void start2(Stage primaryStage) {
		AnchorPane root=new AnchorPane();
		root.setId("newtons2");
		
		Button button1=new Button("Expression Content");
		button1.setPrefHeight(80);
		button1.setPrefWidth(180);
		AnchorPane.setTopAnchor(button1, 400.0);
		AnchorPane.setLeftAnchor(button1, 250.0);
		button1.setStyle("-fx-font:16 arial");
		
		Button button2=new Button("Start");
		button2.setPrefHeight(80);
		button2.setPrefWidth(120);
		AnchorPane.setTopAnchor(button2, 400.0);
		AnchorPane.setLeftAnchor(button2, 460.0);
		button2.setStyle("-fx-font:16 arial");
		
		
		Button button3=new Button("Back");
		button3.setPrefHeight(80);
		button3.setPrefWidth(120);
		AnchorPane.setTopAnchor(button3, 400.0);
		AnchorPane.setLeftAnchor(button3, 800.0);
		button3.setStyle("-fx-font:16 arial");
		
		
		Button button4=new Button("Exit");
		button4.setPrefHeight(80);
		button4.setPrefWidth(120);
		AnchorPane.setTopAnchor(button4, 400.0);
		AnchorPane.setLeftAnchor(button4, 950.0);
		button4.setStyle("-fx-font:16 arial");
		
		button1.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				ContentSecondLaw content2=new ContentSecondLaw();
				try {
					content2.content2(primaryStage);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
		button2.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
				SecondLaw secondLaw=new SecondLaw();
				try {
					secondLaw.secondLaw(primaryStage);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		button3.setOnAction(new EventHandler<ActionEvent>(){
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
		
		button4.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {
				showConfirmation();
			}
		});
		
		/*InputStream input=getClass().getResourceAsStream("/application/newton2.jpg");
		Image image=new Image(input);
		ImageView imageView=new ImageView(image);
		imageView.setFitHeight(150);
		imageView.setFitWidth(1200);
		imageView.setTranslateX(90);
		imageView.setTranslateY(190);
		imageView.setOpacity(0.3);
		root.getChildren().add(imageView);*/

		
		root.getChildren().addAll(button1,button2,button3,button4);
		Scene scene=new Scene(root,1400,700);
		scene.getStylesheets().addAll(this.getClass().getResource("/application/style.css").toExternalForm());
		
		
		
		primaryStage.setTitle("Newton's 2nd Law");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	private void showConfirmation() {
		Alert alert=new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirm Exit");
		alert.setHeaderText("Are you sure want to exit?");
		alert.setContentText("My Application");
		 
		Optional<ButtonType> option=alert.showAndWait();
		
		 if (option.get() == ButtonType.OK) {
	        	System.exit(0);
	        } else if (option.get() == ButtonType.CANCEL) {
	        	Node1 node = new Node1();
				node.start1(primaryStage);
	        }
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
