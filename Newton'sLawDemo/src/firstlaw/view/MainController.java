package firstlaw.view;

import java.io.IOException;

import firstlaw.Main;
import javafx.fxml.FXML;

public class MainController {
	private Main main;
	@FXML
	private void goView1() throws IOException {
		main.showView1();
	}

}
