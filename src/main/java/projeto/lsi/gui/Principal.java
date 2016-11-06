package projeto.lsi.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
;

public class Principal extends Application{

	@Override
	public void start(Stage stage) throws Exception {
		
		Parent noRaiz = FXMLLoader.load(getClass().getResource("MenuPrincipal.fxml"));
		Scene cena = new Scene(noRaiz);
		stage.setScene(cena);
		stage.setTitle("Login");
		stage.setResizable(false);
		stage.show();
		
	}

	
	
	
	public static void main(String[] args) {
		launch(args);
	
}	

}
