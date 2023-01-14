package bs4;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Beispiel4 extends Application{

	@Override
	public void start(Stage myStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("fxml_beispiel4.fxml"));
		Scene myScene = new Scene(root, 400, 200);
//		myScene.getStylesheets().add("test.css");
		myStage.setScene(myScene);
		myStage.setTitle("Butons Spielerei");
		myStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
