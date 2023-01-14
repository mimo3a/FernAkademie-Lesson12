package bs4;




import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class textFarbeFXMLController {
	
	@FXML private Label ausgabe;
	@FXML private ComboBox<String> auswahl;
	@FXML private CheckBox gross;
	
	
	@FXML protected void beenden(ActionEvent event) {
		Platform.exit();
	}

	@FXML protected void grossKlick(ActionEvent event) {
		if(gross.isSelected())
			ausgabe.setFont(new Font(36));
		else
			ausgabe.setFont(new Font(24));
	}
	@FXML protected void buntKlick(ActionEvent event) {
		auswahl.setDisable(false);
	}
	@FXML protected void einfarbigKlick(ActionEvent event) {
		auswahl.setDisable(true);
		auswahl.getSelectionModel().selectFirst();
		ausgabe.setTextFill(Color.BLACK);
	}
	
	@FXML protected void auswahlNeu(ActionEvent event) {
		String tempAuswahl = auswahl.getSelectionModel().getSelectedItem().toString();
		
		if(tempAuswahl.equals("Schwarz"))
			ausgabe.setTextFill(Color.BLACK);
		if(tempAuswahl.equals("Rot"))
			ausgabe.setTextFill(Color.RED);
		if(tempAuswahl.equals("Gruin"))
			ausgabe.setTextFill(Color.GREEN);
		if(tempAuswahl.equals("Blau"))
			ausgabe.setTextFill(Color.BLUE);
		if(tempAuswahl.equals("Rosa"))
			ausgabe.setTextFill(Color.PINK);
		if(tempAuswahl.equals("Gelb"))
			ausgabe.setTextFill(Color.YELLOW);
	}
	@FXML void initialize() {
		auswahl.getItems().addAll("Schwarz", "Rot", "Gruin", "Blau", "Rosa", "Gelb");
		auswahl.getSelectionModel().selectFirst();
	}
}
