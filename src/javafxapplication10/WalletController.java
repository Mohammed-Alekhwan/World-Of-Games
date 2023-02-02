/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author klooo
 */
public class WalletController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    Customer c;
    int index;
    Random rand = new Random();
    int OTP;

    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Text userLabel;
    @FXML
    private Label BalanceLable;
    @FXML
    private JFXTextField text1;
    @FXML
    private JFXTextField text2;
    @FXML
    private Label b_s;
    @FXML
    private Label b_f;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void logout(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("Login_Page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toCart(MouseEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Cart.fxml"));	
	root = loader.load();
        CartController cart = loader.getController();
        
        cart.getCustomer(c, index);
        cart.setUserLabel();
        cart.loadCart();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toLibrary(MouseEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Library.fxml"));	
	root = loader.load();
        LibraryController library = loader.getController();
        
        library.getCustomer(c, index);
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

    @FXML
    private void toAdventure(MouseEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Adventure.fxml"));	
	root = loader.load();
        AdventureController adventure = loader.getController();
        
        adventure.getCustomer(c, index);
        adventure.setUserLabel();
        adventure.setBalance();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toAction(MouseEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Action.fxml"));	
	root = loader.load();
        ActionController action = loader.getController();
        
        action.getCustomer(c, index);
        action.setUserLabel();
        action.setBalance();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toHorror(MouseEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Horror.fxml"));	
	root = loader.load();
        HorrorController horror = loader.getController();
        
        horror.getCustomer(c, index);
        horror.setUserLabel();
        horror.setBalance();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toRole(MouseEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("RolePlaying.fxml"));	
	root = loader.load();
        RolePlayingController role = loader.getController();
        
        role.getCustomer(c, index);
        role.setUserLabel();
        role.setBalance();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void Simulation(MouseEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Simulation.fxml"));	
	root = loader.load();
        SimulationController simulation = loader.getController();
        
        simulation.getCustomer(c, index);
        simulation.setUserLabel();
        simulation.setBalance();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toStrategy(MouseEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Strategy.fxml"));	
	root = loader.load();
        StrategyController strategy = loader.getController();
        
        strategy.getCustomer(c, index);
        strategy.setUserLabel();
        strategy.setBalance();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toSports(MouseEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Sports.fxml"));	
	root = loader.load();
        SportsController sports = loader.getController();
        
        sports.getCustomer(c, index);
        sports.setUserLabel();
        sports.setBalance();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toMMO(MouseEvent event)throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MMO.fxml"));	
	root = loader.load();
        MMOController mmo = loader.getController();
        
        mmo.getCustomer(c, index);
        mmo.setUserLabel();
        mmo.setBalance();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }
    
    public void getCustomer(Customer c , int index)
    {
        this.c = c;
        this.index = index;
    }
    
    public void setUserLabel(){
        userLabel.setText("Welcome "+ c.userName);
    }
    
    public void loadWallet(){
        BalanceLable.setText("Current Balance: "+c.Balance);
    }

    private void exitStore(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void toLogin(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Login_Page.fxml"));	
	root = loader.load();
        Login_PageController login = loader.getController();
        
        login.updateList( c, index);
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void addFunds(ActionEvent event) throws IOException {
        
        try{
        String funds = text1.getText();
        String code = text2.getText();
        
        int f = Integer.parseInt(funds);
        int co = Integer.parseInt(code);
        
        if (co == OTP)
        {
            c.Balance = f;
            b_f.setVisible(false);
            b_s.setVisible(true);
            loadWallet();
            
        }else{
            b_s.setVisible(false);
            b_f.setVisible(true);
        }
        } catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "please enter a number !!");
        }
        
        
    }

    @FXML
    private void sendOTP(ActionEvent event) {
        
        try{
        String funds = text1.getText();
        OTP =  rand.nextInt((9999 - 1000) + 1) + 1000;
        
        JOptionPane.showMessageDialog(null, "OTP CODE: "+OTP);
        } catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "please enter a number !!");
        }
        
    }

    @FXML
    private void extiStore(ActionEvent event) {
    }

    @FXML
    private void close(MouseEvent event) {
        System.exit(0);
    }
    
    
    public void noVisible()
    {
        b_s.setVisible(false);
        b_f.setVisible(false);
    }
    
}
