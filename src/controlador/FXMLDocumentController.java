/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import modelo.Vehiculo;

/**
 *
 * @author Francisco de Asís Domínguez Iceta. 1º DAW, IES Puerto de la Cruz
 */
enum TipoVehiculo{
    COCHE
}
public class FXMLDocumentController implements Initializable {
    
    private TipoVehiculo tipoVehiculo;
    private Vehiculo v;
    @FXML
    private ImageView ivCircuito;
    @FXML
    private Button btnCoche;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void cargarCoche(MouseEvent event) {
        tipoVehiculo = TipoVehiculo.COCHE;
    }
    
}
