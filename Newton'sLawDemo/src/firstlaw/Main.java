package firstlaw;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
//import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {
	private Stage primaryStage;
	private static BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Fist Law");
		showMainView();
		showMainViewBegin();
	}
	
	private void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	private void showMainViewBegin() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("view/MainViewBegin.fxml"));
		AnchorPane mainViewBegin = loader.load();
		mainLayout.setCenter(mainViewBegin);
	}
	
	public static void showView1() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("threeview/View1.fxml"));
		AnchorPane view1 = loader.load();
		mainLayout.setCenter(view1);
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
