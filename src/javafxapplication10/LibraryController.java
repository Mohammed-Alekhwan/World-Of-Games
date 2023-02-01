/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import java.io.File;
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
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author klooo
 */
public class LibraryController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    Customer c;
    int index;

    @FXML
    private Pane pane1;
    @FXML
    private ImageView img1;
    @FXML
    private Label label1;
    @FXML
    private Pane pane5;
    @FXML
    private ImageView img5;
    @FXML
    private Label label5;
    @FXML
    private Pane pane6;
    @FXML
    private ImageView img6;
    @FXML
    private Label label6;
    @FXML
    private Pane pane7;
    @FXML
    private ImageView img7;
    @FXML
    private Label label7;
    @FXML
    private Pane pane2;
    @FXML
    private ImageView img2;
    @FXML
    private Label label2;
    @FXML
    private Pane pane3;
    @FXML
    private ImageView img3;
    @FXML
    private Label label3;
    @FXML
    private Pane pane4;
    @FXML
    private ImageView img4;
    @FXML
    private Label label4;
    @FXML
    private Pane pane8;
    @FXML
    private ImageView img8;
    @FXML
    private Label label8;
    @FXML
    private Label libraryEmbty;
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

    private void logout(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login_Page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toCart(MouseEvent event) throws IOException {
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
    private void toWallet(MouseEvent event) throws IOException {
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
    private void toadventure(MouseEvent event) throws IOException {
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
    private void toAction(MouseEvent event) throws IOException {
        
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
    private void toHorror(MouseEvent event) throws IOException {
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
    private void toRole(MouseEvent event) throws IOException {
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
    private void toSimulation(MouseEvent event) throws IOException {
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
    private void toStrategy(MouseEvent event) throws IOException {
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
    private void toSports(MouseEvent event) throws IOException {
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
    private void toMMO(MouseEvent event) throws IOException {
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
        userLabel.setText("welcome "+ c.userName);
    }
    
    public void loadGames()
    {
        
        int size = c.games.size();
        
        if(size > 0){
            libraryEmbty.setVisible(false);
            pane1.setVisible(true);
            label1.setText(c.games.get(0));
            File file = new File("src\\javafxapplication10\\images\\"+c.games.get(0)+".jpg");
            Image image = new Image (file.toURI().toString());
            img1.setImage(image);
        }
        
        if(size > 1){
            
            pane2.setVisible(true);
            label2.setText(c.games.get(1));
            File file = new File("src\\javafxapplication10\\images\\"+c.games.get(1)+".jpg");
            Image image = new Image (file.toURI().toString());
            img2.setImage(image);
        }
        
        if(size > 2){
            
            pane3.setVisible(true);
            label3.setText(c.games.get(2));
            File file = new File("src\\javafxapplication10\\images\\"+c.games.get(2)+".jpg");
            Image image = new Image (file.toURI().toString());
            img3.setImage(image);
        }
        
        if(size > 3){
            
            pane4.setVisible(true);
            label4.setText(c.games.get(3));
            File file = new File("src\\javafxapplication10\\images\\"+c.games.get(3)+".jpg");
            Image image = new Image (file.toURI().toString());
            img4.setImage(image);
        }
        
        if(size > 4){
            
            pane5.setVisible(true);
            label5.setText(c.games.get(4));
            File file = new File("src\\javafxapplication10\\images\\"+c.games.get(4)+".jpg");
            Image image = new Image (file.toURI().toString());
            img5.setImage(image);
        }
        
        if(size > 5){
            
            pane6.setVisible(true);
            label6.setText(c.games.get(5));
            File file = new File("src\\javafxapplication10\\images\\"+c.games.get(5)+".jpg");
            Image image = new Image (file.toURI().toString());
            img6.setImage(image);
        }
        
        if(size > 6){
            
            pane7.setVisible(true);
            label7.setText(c.games.get(6));
            File file = new File("src\\javafxapplication10\\images\\"+c.games.get(6)+".jpg");
            Image image = new Image (file.toURI().toString());
            img7.setImage(image);
        }
        
        if(size > 7){
            
            pane8.setVisible(true);
            label8.setText(c.games.get(7));
            File file = new File("src\\javafxapplication10\\images\\"+c.games.get(7)+".jpg");
            Image image = new Image (file.toURI().toString());
            img8.setImage(image);
        }
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
