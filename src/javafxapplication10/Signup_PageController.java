/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author klooo
 */
public class Signup_PageController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    File file = new File("users.txt");
    

    @FXML
    private Button button_signup;
    @FXML
    private Label label_login;
    @FXML
    private JFXPasswordField text3;
    @FXML
    private JFXTextField text2;
    @FXML
    private JFXTextField text1;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signup(ActionEvent event) throws IOException {
        
        String userName = text1.getText();
        String email = text2.getText();
        String password = text3.getText();
        
        Customer c = new Customer(userName, password, email);
        write(userName, password, email);
        
        
        
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login_Page.fxml"));	
	root = loader.load();
        Login_PageController login = loader.getController();
        
        login.getCustomer(c);
        
        JOptionPane.showMessageDialog(null, "account created");
        //root = FXMLLoader.load(getClass().getResource("Login_Page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
        
    }

    @FXML
    private void close(MouseEvent event) {
        System.exit(0);
    }
    
    public void write (String user, String password, String email) throws IOException
    {
        FileWriter fw = new FileWriter(file);
        
        fw.write(user+" "+ password+"  "+ email );
        fw.close();
    }
    
}
