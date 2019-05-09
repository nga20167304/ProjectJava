package application;


import javafx.application.Application;
import javafx.stage.Stage;
import project.Display;

public class Main extends Application {	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Display play=new Display();
		play.display(primaryStage);
	}
}
