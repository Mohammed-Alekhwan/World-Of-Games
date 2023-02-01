/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import java.io.IOException;
import java.net.URL;
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

/**
 * FXML Controller class
 *
 * @author klooo
 */
public class MMOController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    Customer c;
    int index;

    @FXML
    private Button b1;
    @FXML
    private Button b5;
    @FXML
    private Button b6;
    @FXML
    private Button b7;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    private Button b4;
    @FXML
    private Button b8;
    @FXML
    private Text userLabel;
    @FXML
    private Label balanceLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void logout(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("Login_Page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void buttonClicked(ActionEvent event) {
        if(event.getSource() == b1)
        {
            // add game name
            c.cartGames.add("Final Fantasy XIV");
            // add game price
            c.prices.add(190);
            b1.setStyle("-fx-background-color: #1EF44A; -fx-background-radius:  20px;");
            b1.setText("added to cart");
        }
        
        if(event.getSource() == b2)
        {
            // add game name
            c.cartGames.add("Black Desert Online");
            // add game price
            c.prices.add(120);
            b2.setStyle("-fx-background-color: #1EF44A; -fx-background-radius:  20px;");
            b2.setText("added to cart");
        }
        
        if(event.getSource() == b3)
        {
            // add game name
            c.cartGames.add("Destiny 2");
            // add game price
            c.prices.add(80);
            b3.setStyle("-fx-background-color: #1EF44A; -fx-background-radius:  20px;"); 
            b3.setText("added to cart");
        }
        
        if(event.getSource() == b4)
        {
            // add game name
            c.cartGames.add("Neverwinter");
            // add game price
            c.prices.add(30);
            b4.setStyle("-fx-background-color: #1EF44A; -fx-background-radius:  20px;");
            b4.setText("added to cart");
        }
        
        if(event.getSource() == b5)
        {
            // add game name
            c.cartGames.add("The Elder Scrolls Online");
            // add game price
            c.prices.add(60);
            b5.setStyle("-fx-background-color: #1EF44A; -fx-background-radius:  20px;");
            b5.setText("added to cart");
        }
        
        if(event.getSource() == b6)
        {
            // add game name
            c.cartGames.add("ARK Survival Evolved");
            // add game price
            c.prices.add(130);
            b6.setStyle("-fx-background-color: #1EF44A; -fx-background-radius:  20px;");
            b6.setText("added to cart");
        }
        
        if(event.getSource() == b7)
        {
            // add game name
            c.cartGames.add("The Division 2");
            // add game price
            c.prices.add(130);
            b7.setStyle("-fx-background-color: #1EF44A; -fx-background-radius:  20px;");
            b7.setText("added to cart");
        }
        
        if(event.getSource() == b8)
        {
            // add game name
            c.cartGames.add("Skyforge");
            // add game price
            c.prices.add(20);
            b8.setStyle("-fx-background-color: #1EF44A; -fx-background-radius:  20px;");
            b8.setText("added to cart");
            
        }
    }

    @FXML
    private void toCart(MouseEvent event) throws IOException{
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
    private void toWallet(MouseEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Wallet.fxml"));	
	root = loader.load();
        WalletController wallet = loader.getController();
        
        wallet.getCustomer(c, index);
        wallet.setUserLabel();
        wallet.loadWallet();
        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toLibrary(MouseEvent event) throws IOException{
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
    private void toAdventure(MouseEvent event) throws IOException{
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
    private void toAction(MouseEvent event) throws IOException{
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
    private void toHorror(MouseEvent event) throws IOException{
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
    private void toRole(MouseEvent event) throws IOException{
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
    private void toSimulation(MouseEvent event) throws IOException{
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
    private void toStrategy(MouseEvent event) throws IOException{
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
    private void toSports(MouseEvent event) throws IOException{
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
    
    public void getCustomer(Customer c , int index)
    {
        this.c = c;
        this.index = index;
    }
    
    public void setUserLabel(){
        userLabel.setText("Welcome "+ c.userName);
    }

    @FXML
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
    private void close(MouseEvent event) {
        System.exit(0);
    }
    
    public void setBalance()
    {
        balanceLabel.setText("Your balance: "+ c.Balance);
    }
}
