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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author pedrocattel
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button btnCadastrar;
    @FXML
    private TextField txtFName;
    @FXML
    private TextField txtFAge;
    @FXML
    private TextField txtFRg;
    @FXML
    private TextField txtFCpf;
    @FXML
    private Label lblCerto;
    private String nome;
    private String rg;
    private String cpf;
    private String idade;
    private String end;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Label lbl1;
    @FXML
    private TextField txtFieldEnd;
    @FXML
    ImageView image;
    
    @FXML
    image.setImage(new Image ("/Users/pedrocattel/Documents/Projetos/Git/Linguagens1_Projetos/pratica6/img.png"));
    
    @FXML
    private void btnCadastrarAction (ActionEvent event) {
  
    lblCerto.setText("Parabéns, cadastro concluído!!!");
    
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
