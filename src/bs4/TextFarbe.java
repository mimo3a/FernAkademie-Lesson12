package bs4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TextFarbe extends Application{

	

	@Override
	public void start(Stage  myStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("textFarbe.fxml"));
		Scene myScene = new Scene(root);
		myStage.setScene(myScene);
		myStage.setTitle("Farbig Text");
		myStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);

	}

}
