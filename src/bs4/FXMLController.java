package bs4;




import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class FXMLController {

	@FXML Button buttonDrehen;
	@FXML Button buttonZoomen; 
	@FXML Button multydrehen;
	@FXML Button multyzoomen;
	@FXML Label ausgabe;
	
	private boolean isZoomed;
	private double rotation;
	
	@FXML protected void rotateKlick(ActionEvent event) {
		rotation = rotation + 90;
		buttonDrehen.setRotate(rotation);
	} 
	
	@FXML protected void rotateMult(ActionEvent event) {
		RotateTransition autoRotation = new RotateTransition(Duration.millis(5000), multydrehen);
		autoRotation.setByAngle(360);
		autoRotation.setCycleCount(1);
		autoRotation.play();
	}
	
	@FXML protected void zoomKlick(ActionEvent event) {
		if(isZoomed == true) {
			buttonZoomen.setScaleX(1);
			buttonZoomen.setScaleY(1);
			isZoomed = false;
			
		}
		else {
			buttonZoomen.setScaleX(2);
			buttonDrehen.setScaleY(2);
			isZoomed = true;
		}
	}	
	
	@FXML protected void autoZoom(ActionEvent event) {
		ScaleTransition autoZoom = new ScaleTransition(Duration.millis(500), multyzoomen);
		autoZoom.setByX(3);
		autoZoom.setByY(3);
		autoZoom.setCycleCount(2);
		autoZoom.setAutoReverse(true);
		autoZoom.play();
		
	}
	@FXML protected void labelMausRein (MouseEvent event) {
		ausgabe.setScaleX(2);
		ausgabe.setScaleY(2);
		
	}
	
	@FXML protected void labelMausRaus(MouseEvent event) {
		ausgabe.setScaleX(1);
		ausgabe.setScaleY(1);
	}	
}
