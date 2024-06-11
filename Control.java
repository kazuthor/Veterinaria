
/**
 * Write a description of class Control here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class Control {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnAgregar;

    @FXML
    private Button btnMostrar;

    @FXML
    private Button btnSalir;

    @FXML
    private Label lblDatosMascotas;

    @FXML
    private Label lblEdad;

    @FXML
    private Label lblEspecie;

    @FXML
    private Label lblNombre;

    @FXML
    private Label lblRaza;

    @FXML
    private Label lblRegistroMascotas;

    @FXML
    private TextArea txtAreaResultados;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtEspecie;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtRaza;
    
    private Mascota mascota;
    
    

    @FXML
    void Agregar(ActionEvent event) {
        
    }

    @FXML
    void Mostrar(ActionEvent event) {
        
    }

    @FXML
    void Salir(ActionEvent event) {
        
    }

    @FXML
    void initialize() {
        assert btnAgregar != null : "fx:id=\"btnAgregar\" was not injected: check your FXML file 'MascotaVista.fxml'.";
        assert btnMostrar != null : "fx:id=\"btnMostrar\" was not injected: check your FXML file 'MascotaVista.fxml'.";
        assert btnSalir != null : "fx:id=\"btnSalir\" was not injected: check your FXML file 'MascotaVista.fxml'.";
        assert lblDatosMascotas != null : "fx:id=\"lblDatosMascotas\" was not injected: check your FXML file 'MascotaVista.fxml'.";
        assert lblEdad != null : "fx:id=\"lblEdad\" was not injected: check your FXML file 'MascotaVista.fxml'.";
        assert lblEspecie != null : "fx:id=\"lblEspecie\" was not injected: check your FXML file 'MascotaVista.fxml'.";
        assert lblNombre != null : "fx:id=\"lblNombre\" was not injected: check your FXML file 'MascotaVista.fxml'.";
        assert lblRaza != null : "fx:id=\"lblRaza\" was not injected: check your FXML file 'MascotaVista.fxml'.";
        assert lblRegistroMascotas != null : "fx:id=\"lblRegistroMascotas\" was not injected: check your FXML file 'MascotaVista.fxml'.";
        assert txtAreaResultados != null : "fx:id=\"txtAreaResultados\" was not injected: check your FXML file 'MascotaVista.fxml'.";
        assert txtEdad != null : "fx:id=\"txtEdad\" was not injected: check your FXML file 'MascotaVista.fxml'.";
        assert txtEspecie != null : "fx:id=\"txtEspecie\" was not injected: check your FXML file 'MascotaVista.fxml'.";
        assert txtNombre != null : "fx:id=\"txtNombre\" was not injected: check your FXML file 'MascotaVista.fxml'.";
        assert txtRaza != null : "fx:id=\"txtRaza\" was not injected: check your FXML file 'MascotaVista.fxml'.";

    }

}

