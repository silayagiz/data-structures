/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import datastructure.exception.DataStructureValidationException;


/**
 *
 * @author silayagiz
 */
public class Application {
    
    public static void main(String[] args) throws DataStructureValidationException
    {
        Player player = new Player();
        List <Player> playerList = new ArrayList<>();
        
        Player player1 = new Player("ccc", 15);
        Player player2 = new Player("aaa", 15);
        Player player3 = new Player("bbb", 35);
        Player player4 = new Player("ddd", 50);
        Player player5 = new Player("ege", 5);
        Player player6 = new Player("sila", 0);
        
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
        playerList.add(player5);
        playerList.add(player6);
        
        Stream<Player> stream = playerList.stream();
        
        stream.forEach(p -> {
            if(p.getPlayerName() == "" || !p.getPlayerName().matches("[a-z]+")) {
                try {
                    throw new DataStructureValidationException("Invalid player name: " + p.getPlayerName());
                } catch (DataStructureValidationException ex) {
                    Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            if(p.getScore() <= 0 || p.getScore() >= 1000) {
                try {
                    throw new DataStructureValidationException("Invalid player score: " + p.getPlayerName() + " " + p.getScore());
                } catch (DataStructureValidationException ex) {
                    Logger.getLogger(Application.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        List<Player> list = player.comparePlayer(playerList);
        
        list.stream().forEach(p -> {
                  System.out.println(p.getPlayerName() + " " + p.getScore());
               });
        
        
        
        
        
    }
    
}
