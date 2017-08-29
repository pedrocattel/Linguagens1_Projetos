/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularioaluno;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author pedrocattel
 */
public class FXMLDocumentController implements Initializable {
    
    private String nome;
    private String idade;
    private String rg;
    private String cpf;
    
    @FXML
    private Label label;
    
    @FXML
    private TextField txtN;
    
    @FXML
    private TextField txtE;
    
    @FXML
    private TextField txtR;
    
    @FXML
    private TextField txtC;
    
    @FXML
    private TextField txtI;
    
    @FXML
    private Button btnButton;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
    nome = txtN.getText();
    idade = txtI.getText();
    rg = txtR.getText();
    cpf = txtC.getText();
    System.out.println("Cadastro Efetuado com sucesso");    
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
