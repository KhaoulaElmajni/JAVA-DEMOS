package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.logging.Level;


public class UserLayoutController implements Initializable {



    @FXML
    private TextField fieldnom;
    @FXML
    private TextField fieldprenom;
    @FXML
    private TextField fieldadresse;
    @FXML
    private TextField fieldlogin;
    @FXML
    private PasswordField fieldpassword;
    @FXML
    private TextField fieldsearch;


    @FXML
    private TableView<User> tableView;
    @FXML
    private TableColumn<User,String> nom;
    @FXML
    private TableColumn<User,String> prenom;
    @FXML
    private TableColumn<User,String> adresse;
    @FXML
    private TableColumn<User,String> login;
    ObservableList<User> list = FXCollections.observableArrayList(
            new User("khaoula","elmajni","551 PAM SB","elmajnikhaoula99@gmail.com","xxx"),
            new User("ahmed","elmajni","551 PAM SB","elmajnikhaoula99@gmail.com","xxx"),
            new User("ziad","elmajni","551 PAM SB","elmajnikhaoula99@gmail.com","xxx"),
            new User("fatiha","elmajni","551 PAM SB","elmajnikhaoula99@gmail.com","xxx"),
            new User("yassine","elmajni","551 PAM SB","elmajnikhaoula99@gmail.com","xxx"),
            new User("rania","elmajni","551 PAM SB","elmajnikhaoula99@gmail.com","xxx"),
            new User("zineb","elmajni","551 PAM SB","elmajnikhaoula99@gmail.com","xxx"),
            new User("khadija","elmajni","551 PAM SB","elmajnikhaoula99@gmail.com","xxx"),
            new User("jamila","elmajni","551 PAM SB","elmajnikhaoula99@gmail.com","xxx")
    );


    @FXML
    private Button add;
    @FXML
    private Button delete;
    @FXML
    private Button search;
    @FXML
    private Button save;
    @FXML
    private Button sort;



    //fonctions de CRUD

    public void addUser(){

        if(fieldnom == null || fieldnom.getText().isEmpty()||
                fieldprenom == null || fieldprenom.getText().isEmpty() ||
                fieldadresse == null || fieldadresse.getText().isEmpty()||
                fieldlogin == null || fieldlogin.getText().isEmpty()||
                fieldpassword == null || fieldpassword.getText().isEmpty()
        ){
            if (fieldnom == null || fieldnom.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING,"WARNINIG", ButtonType.OK);

                alert.setContentText("name field is empty");
                alert.initModality(Modality.APPLICATION_MODAL);
                alert.showAndWait();
                if (alert.getResult() == ButtonType.OK){
                    alert.close();
                }
            }
            if (fieldprenom == null || fieldprenom.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING,"WARNINIG", ButtonType.OK);

                alert.setContentText("prenom field is empty");
                alert.initModality(Modality.APPLICATION_MODAL);
                alert.showAndWait();
                if (alert.getResult() == ButtonType.OK){
                    alert.close();
                }
            }
            if (fieldadresse == null || fieldadresse.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING,"WARNINIG", ButtonType.OK);

                alert.setContentText("adresse field is empty");
                alert.initModality(Modality.APPLICATION_MODAL);
                alert.showAndWait();
                if (alert.getResult() == ButtonType.OK){
                    alert.close();
                }
            }
            if (fieldlogin == null || fieldlogin.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING,"WARNINIG", ButtonType.OK);

                alert.setContentText("login field is empty");
                alert.initModality(Modality.APPLICATION_MODAL);
                alert.showAndWait();
                if (alert.getResult() == ButtonType.OK){
                    alert.close();
                }
            }
            if (fieldpassword == null || fieldpassword.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING,"WARNINIG", ButtonType.OK);

                alert.setContentText("password field is empty");
                alert.initModality(Modality.APPLICATION_MODAL);
                alert.showAndWait();
                if (alert.getResult() == ButtonType.OK){
                    alert.close();
                }
            }
        }else {

            String nom=fieldnom.getText();
            String prenom=fieldprenom.getText();
            String adresse=fieldadresse.getText();
            String login=fieldlogin.getText();
            String password=fieldpassword.getText();

            fieldnom.clear();
            fieldprenom.clear();
            fieldadresse.clear();
            fieldlogin.clear();
            fieldpassword.clear();

            list.add(new User(nom,prenom,adresse,login,password));
            tableView.setItems(list);
        }
    }
    public void deleteUser(){
        delete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int index = tableView.getSelectionModel().getSelectedIndex();
                if(index >=0){
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.initModality(Modality.WINDOW_MODAL);
                    alert.setTitle("Delete \"" + tableView.getSelectionModel().getSelectedItem().getNom() + "\"?");
                    alert.setHeaderText("Delete \"" + tableView.getSelectionModel().getSelectedItem().getNom() + "\"?");
                    alert.setContentText("Are you sure you want to delete this user?");
                    alert.initModality(Modality.APPLICATION_MODAL);
                    Optional<ButtonType> result = alert.showAndWait();
                    if (result.get() == ButtonType.OK) {
                        tableView.getItems().remove(index);
                    } else {

                    }
                }
                else{
                    Alert alert = new Alert(Alert.AlertType.WARNING);
                    alert.setContentText("Veuillez selectionner un élément svp!!!");
                    alert.show();
                }

            }
        });
    }


    public void searchUser(){
        String search=fieldsearch.getText();

    }
    public void sortUsers(){

        nom.setSortType(TableColumn.SortType.ASCENDING);
        tableView.getSortOrder().add(nom);
        tableView.sort();

    }




    public void saveUser(){
        Stage secondaryStage = new Stage();
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Users Table");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.home")));
        if (list.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR,"EMPTY TABLE",ButtonType.OK);
            alert.initModality(Modality.APPLICATION_MODAL);
            alert.showAndWait();
            if (alert.getResult() == ButtonType.OK){
                alert.close();
            }
        }else {
            File file = fileChooser.showSaveDialog(secondaryStage);
            if (file != null)
                saveFile(tableView.getItems(),file);
        }
    }

    private void saveFile(ObservableList<User> items, File file) {
        try{
            BufferedWriter outWriter = new BufferedWriter(new FileWriter(file));
            for (User user: items) {
                outWriter.write(user.toString());
                outWriter.newLine();
            }
            System.out.println(items.toString());
            outWriter.close();
        }catch (IOException e){
            Alert alert = new Alert(Alert.AlertType.ERROR,"OOOPS!!!",ButtonType.OK);
            alert.setContentText("Sorry, An error has occured");
            alert.showAndWait();
            if (alert.getResult() == ButtonType.OK){
                alert.close();
            }
        }
    }


    public TextField getFieldnom() {
        return fieldnom;
    }

    public void setFieldnom(TextField fieldnom) {
        this.fieldnom = fieldnom;
    }

    public TextField getFieldprenom() {
        return fieldprenom;
    }

    public void setFieldprenom(TextField fieldprenom) {
        this.fieldprenom = fieldprenom;
    }

    public TextField getFieldadresse() {
        return fieldadresse;
    }

    public void setFieldadresse(TextField fieldadresse) {
        this.fieldadresse = fieldadresse;
    }

    public TextField getFieldlogin() {
        return fieldlogin;
    }

    public void setFieldlogin(TextField fieldlogin) {
        this.fieldlogin = fieldlogin;
    }

    public TextField getFieldpassword() {
        return fieldpassword;
    }

    public void setFieldpassword(PasswordField  fieldpassword) {
        this.fieldpassword = fieldpassword;
    }

    public TextField getFieldsearch() {
        return fieldsearch;
    }

    public void setFieldsearch(TextField fieldsearch) {
        this.fieldsearch = fieldsearch;
    }

    public TableView getListview() {
        return tableView;
    }

    public void setListview(TableView tableView) {
        this.tableView = tableView;
    }

    public Button getAdd() {
        return add;
    }

    public void setAdd(Button add) {
        this.add = add;
    }

    public Button getDelete() {
        return delete;
    }

    public void setDelete(Button delete) {
        this.delete = delete;
    }

    public Button getSearch() {
        return search;
    }

    public void setSearch(Button search) {
        this.search = search;
    }

    public Button getSave() {
        return save;
    }

    public void setSave(Button save) {
        this.save = save;
    }

    public Button getSort() {
        return sort;
    }

    public void setSort(Button sort) {
        this.sort = sort;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
        prenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
        adresse.setCellValueFactory(new PropertyValueFactory<>("adresse"));
        login.setCellValueFactory(new PropertyValueFactory<>("login"));
        tableView.setItems(list);

        FilteredList<User> filteredList = new FilteredList<>(list,b->true);
        fieldsearch.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredList.setPredicate(user -> {
                //if filter text is empty display all users
                if (newValue == null || newValue.isEmpty()){
                    return true;
                }

                //compare name and lastname of every user with serchfield
                String lowerCaseFilter = newValue.toLowerCase();
                if (user.getNom().toLowerCase().indexOf(lowerCaseFilter) != -1){
                    return true; //filter matches nom
                }else if (user.getPrenom().toLowerCase().indexOf(lowerCaseFilter) != -1){
                    return true; //filter matches prenom
                }else if (user.getAdresse().toLowerCase().indexOf(lowerCaseFilter) != -1){
                    return true; //filter matches adresse
                }else if (user.getLogin().toLowerCase().indexOf(lowerCaseFilter) != -1){
                    return true; //filter matches login
                }
                else
                    return false;

            });

            //filterdList in sortedList
            SortedList<User> sortedList = new SortedList<>(filteredList);

            sortedList.comparatorProperty().bind(tableView.comparatorProperty());


            tableView.setItems(sortedList);
        });
    }
}
