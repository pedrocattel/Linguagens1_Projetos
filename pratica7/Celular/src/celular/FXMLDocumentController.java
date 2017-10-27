/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celular;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;

/**
 *
 * @author pedrocattel
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TableView<Contato> tableContato;
    @FXML
    private TableColumn<Contato, String> columnNome;
    @FXML
    private TableColumn<Contato, String> columnNumero;
    @FXML
    private TextField txtPesquisar;
    @FXML
    private TextField nameTxt;
    @FXML
    private TextField txtRemover;
    @FXML
    private Button cadastrarBtn;
    @FXML
    private Button deleteBtn;
    @FXML
    private TextField numberTxt;
    private final ListaDeContatos listaCompleta = new ListaDeContatos();
    private final ObservableList<Contato> contatoData = FXCollections.observableArrayList();
    private Stage dialogStage;

    public void cadastrarBtn(ActionEvent event) {
        this.Adicionar();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
