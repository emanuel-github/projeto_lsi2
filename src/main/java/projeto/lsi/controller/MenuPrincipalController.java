package projeto.lsi.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

public class MenuPrincipalController implements Initializable{

	
	    @FXML
	    private MenuBar menuBarMenuPrincipal;

	    @FXML
	    private MenuItem menuItemSairContaUsuario;

	    @FXML
	    private MenuItem menuItemCartuchoServicos;

	    @FXML
	    private ImageView imagemMenuPrincipal;

	    @FXML
	    private MenuItem menuItemCadastrarCliente;

	    @FXML
	    private MenuItem menuItemLucroTotalRelatorios;

	    @FXML
	    private Menu menuServicos;

	    @FXML
	    private MenuItem menuItemTonerServicos;

	    @FXML
	    private Menu menuCliente;

	    @FXML
	    private MenuItem menuItemRecCartRelatorios;

	    @FXML
	    private MenuItem menuItemRecTonerRelatorios;

	    @FXML
	    private Menu menuUsuario;

	    @FXML
	    private MenuItem MenuItemConfContaUsuario;

	    @FXML
	    private MenuItem menuItemRecargaServicos;

	    @FXML
	    private MenuItem menuiItemPesquisarCliente;

	    @FXML
	    private Menu menuRelatorios;

	    @FXML
	    private MenuItem menuItemListaClientesRelatorios;

	    
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		sairUsuario();		
		
		
		
	}
	
	
	
	@FXML
	public void sairUsuario(){
		menuItemSairContaUsuario.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
				
			}
		});
	}
	
		
		
			
			
	
	
	
	

}
