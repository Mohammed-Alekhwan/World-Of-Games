/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import java.util.ArrayList;

/**
 *
 * @author klooo
 */
public class Customer {
    
    String userName;
    String Password;
    String Email;
    int Balance = 0;
    
    ArrayList <String> games = new ArrayList<>();
    ArrayList <String> cartGames = new ArrayList<>();
    ArrayList <Integer> prices = new ArrayList<>();
    
    
    public Customer(String userName, String Password, String email){
        
        this.userName = userName;
        this.Password = Password;
        this.Email = email;
        
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getBalance() {
        return Balance;
    }

    public void setBalance(int Balance) {
        this.Balance = Balance;
    }

    public ArrayList<String> getGames() {
        return games;
    }

    public void setGames(ArrayList<String> games) {
        this.games = games;
    }

    public ArrayList<String> getCartGames() {
        return cartGames;
    }

    public void setCartGames(ArrayList<String> cartGames) {
        this.cartGames = cartGames;
    }

    public ArrayList<Integer> getPrices() {
        return prices;
    }

    public void setPrices(ArrayList<Integer> prices) {
        this.prices = prices;
    }
    
    
}
