package bs4;




import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class TextGrosFXMLController {

	@FXML private TextField ausgabe;
	private int schriftGros = 12;
	
	@FXML protected void grosserKlick(ActionEvent event) {
		if(schriftGros < 40) {
			schriftGros ++;
			ausgabe.setFont(new Font("System", schriftGros));
		}					
	} 
	
	@FXML protected void kleinerKlick(ActionEvent event) {
		if(schriftGros > 6) {
			schriftGros --;
			ausgabe.setFont(new Font("System", schriftGros));
		}
	}

}
