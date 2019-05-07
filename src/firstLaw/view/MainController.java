package firstLaw.view;

import java.io.IOException;

import firstLaw.Main;
import javafx.fxml.FXML;

public class MainController {
	//private Main main;
	@FXML
	private void goView1() throws IOException {
		Main.showView1();
	}

}
