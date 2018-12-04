package UserInterface;

import java.util.HashMap;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class ScreenController {
	private HashMap<String, Pane> Screens = new HashMap<>();

	public ScreenController() {
	}

	public void addScreen(String name, Pane pane) {
		Screens.put(name, pane);
	}

	public void removeScreen(String name) {
		Screens.remove(name);
	}

	public void activate(String name) {
		Main.stage.setScene(new Scene(Screens.get(name)));
	}

}