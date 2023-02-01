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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author klooo
 */
public class CartController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    Customer c;
    int index;
    
    int total = 0;

    @FXML
    private ImageView img2;
    @FXML
    private Label label2;
    @FXML
    private Label price2;
    @FXML
    private ImageView img3;
    @FXML
    private Label label3;
    @FXML
    private Label price3;
    @FXML
    private ImageView img4;
    @FXML
    private Label label4;
    @FXML
    private Label price4;
    @FXML
    private ImageView img5;
    @FXML
    private Label label5;
    @FXML
    private Label price5;
    @FXML
    private ImageView img1;
    @FXML
    private Label label1;
    @FXML
    private Label price1;
    @FXML
    private Label total_label;
    @FXML
    private Text userLabel;
    @FXML
    private Pane pane2;
    @FXML
    private Pane pane3;
    @FXML
    private Pane pane4;
    @FXML
    private Pane pane5;
    @FXML
    private Pane pane1;
    @FXML
    private Button purchaseButton;
    @FXML
    private Pane totalPane;
    @FXML
    private Label cartEmpty;
    @FXML
    private Label fundLabel;

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
    private void toWallet(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Wallet.fxml"));	
	root = loader.load();
        WalletController wallet = loader.getController();
        
        wallet.getCustomer(c, index);
        wallet.setUserLabel();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toLibrary(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Library.fxml"));	
	root = loader.load();
        LibraryController library = loader.getController();
        
        library.getCustomer(c, index);
        library.setUserLabel();
        library.loadGames();
        
        
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toAdventure(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Adventure.fxml"));	
	root = loader.load();
        AdventureController adventure = loader.getController();
        
        adventure.getCustomer(c, index);
        adventure.setUserLabel();
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
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toRole(MouseEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("RolePlaying.fxml"));	
	root = loader.load();
        RolePlayingController role = loader.getController();
        
        role.getCustomer(c, index);
        role.setUserLabel();
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
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        String css = this.getClass().getResource("Style.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void toStratigy(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Strategy.fxml"));	
	root = loader.load();
        StrategyController strategy = loader.getController();
        
        strategy.getCustomer(c, index);
        strategy.setUserLabel();
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
    
    public void loadCart()
    {
        int size = c.cartGames.size();
        
        if (size > 0)
        {
           
           cartEmpty.setVisible(false);
           purchaseButton.setVisible(true);
           totalPane.setVisible(true);
           pane1.setVisible(true);
           label1.setText(c.cartGames.get(0));
           price1.setText(String.valueOf(c.prices.get(0)));
           
           File file = new File("src\\javafxapplication10\\Cart images\\"+c.cartGames.get(0)+"+cart.jpg");
           Image image = new Image (file.toURI().toString());
           img1.setImage(image);
        }
        
        if (size> 1)
        {
           pane2.setVisible(true);
           label2.setText(c.cartGames.get(1));
           price2.setText(String.valueOf(c.prices.get(1)));
           
           File file = new File("src\\javafxapplication10\\Cart images\\"+c.cartGames.get(1)+"+cart.jpg");
           Image image = new Image (file.toURI().toString());
           img2.setImage(image);
        }
        
        if (size> 2)
        {
           pane3.setVisible(true);
           label3.setText(c.cartGames.get(2));
           price3.setText(String.valueOf(c.prices.get(2)));
           
           File file = new File("src\\javafxapplication10\\Cart images\\"+c.cartGames.get(2)+"+cart.jpg");
           Image image = new Image (file.toURI().toString());
           img3.setImage(image);
        }
        
        if (size> 3)
        {
           pane4.setVisible(true);
           label4.setText(c.cartGames.get(3));
           price4.setText(String.valueOf(c.prices.get(3)));
           
           File file = new File("src\\javafxapplication10\\Cart images\\"+c.cartGames.get(3)+"+cart.jpg");
           Image image = new Image (file.toURI().toString());
           img4.setImage(image);
        }
        
        if (size> 4)
        {
           pane5.setVisible(true);
           label5.setText(c.cartGames.get(4));
           price5.setText(String.valueOf(c.prices.get(4)));
           
           File file = new File("src\\javafxapplication10\\Cart images\\"+c.cartGames.get(4)+"+cart.jpg");
           Image image = new Image (file.toURI().toString());
           img5.setImage(image);
        }
        
        for (int i = 0; i<c.prices.size(); i++)
        {
            total+= c.prices.get(i);
        }
        
        total_label.setText("Total: "+total);
        
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
    private void purchase(MouseEvent event) throws IOException {
        
        if (c.Balance >= total)
        {
            fundLabel.setVisible(false);
            for(int i = 0; i<c.cartGames.size(); i++)
            {
                c.games.add(c.cartGames.get(i));
            }
            
            c.Balance = c.Balance - total;
            total =0;
            c.cartGames.clear();
            loadCart();
            JOptionPane.showMessageDialog(null, "Purchased successfully");
            toLibrary(event);
            
        }
        else{
            fundLabel.setVisible(true);
        }
    }

    @FXML
    private void close(MouseEvent event) {
        System.exit(0);
    }
    
}
