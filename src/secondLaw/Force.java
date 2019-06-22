package secondLaw;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Force extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		GridPane root = new GridPane();
		root.setPadding(new Insets(20));
	    root.setHgap(25);
	    root.setVgap(15);
	    
	    Label labelForce1 = new Label("Enter force of car 1:");
	    //đặt vào GridPane
	    root.add(labelForce1, 0, 0);
	    
	    Label labelF1 = new Label("F1");
	    TextField tfF1 = new TextField();
	    
	    Label labelForce2 = new Label("Enter force of car 2:");
	    
	    Label labelF2 = new Label("F2");	    
	    TextField tfF2 = new TextField();
	    
	    Button btnOk = new Button("OK");
	    
	    GridPane.setHalignment(labelF1, HPos.RIGHT);
	    root.add(labelF1, 0, 1);
	    GridPane.setHalignment(tfF1, HPos.LEFT);
	    root.add(tfF1, 1, 1);
	    root.add(labelForce2, 0, 2);
	    GridPane.setHalignment(labelF2, HPos.RIGHT);
	    root.add(labelF2, 0, 3);
	    GridPane.setHalignment(tfF2, HPos.LEFT);
	    root.add(tfF2, 1, 3);
	    GridPane.setHalignment(btnOk, HPos.RIGHT);
	    root.add(btnOk, 1, 4);
	    
	    Scene scene = new Scene(root, 300, 300);
	       primaryStage.setTitle("ENTER FORCE.");
	       primaryStage.setScene(scene);
	       primaryStage.show();
	}

}
