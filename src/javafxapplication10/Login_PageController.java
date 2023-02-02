/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
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
public class Login_PageController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    ArrayList <Customer> users = new ArrayList<>();
    int index = -1;
    

    @FXML
    private Button button_login;
    @FXML
    private Label label_button_fp;
    @FXML
    private Label label_login;
    @FXML
    private JFXPasswordField text2;
    @FXML
    private JFXTextField text1;
    @FXML
    private JFXCheckBox checkbox_1;
    @FXML
    private Label incorrectLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void login(ActionEvent event)throws IOException{
        
        String userName = text1.getText();
        String password = text2.getText();
        
        
        index = login(users,userName, password);
        
        if(index == -1)
        {
            incorrectLabel.setVisible(true);
        }else{
        
        incorrectLabel.setVisible(false);    
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Library.fxml"));	
	root = loader.load();
        LibraryController library = loader.getController();
        
        library.getCustomer(users.get(index), index);
        library.setUserLabel();
        library.loadGames();
        library.setBalance();
            
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
        }
        
    }

    @FXML
    private void toSignup() throws IOException{

        System.out.println("ccc");
        
    }
    
    
    public void getCustomer (Customer c)
    {
        users.add(c);
    }
    
    public void getList()
    {
        
    }
    
    
    public static int login(List <Customer> accounts ,String ID, String PW) 
    {
        for(int i = 0; i<accounts.size(); i++)
        {
            if(accounts.get(i).getUserName().equals(ID) && 
                    accounts.get(i).getPassword().equals(PW))
            {
                return i; // that mean ID and PW are correct
            }

        }

        return -1; // ID or PW is not correct
    }
    
    public void updateList(Customer c, int index)
    {
        users.add(c);
    }

    @FXML
    private void close(MouseEvent event) {
        System.exit(0);
    }
    
    
}
