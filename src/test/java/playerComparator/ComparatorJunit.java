/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playerComparator;

import datastructure.comparator.Application;
import datastructure.comparator.Player;
import datastructure.exception.DataStructureValidationException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author silayagiz
 */
public class ComparatorJunit {
    
    public ComparatorJunit() {
    }
    
    Player player = new Player();
    List <Player> playerList = new ArrayList<>();
    List<Player> comparedList = new ArrayList<>();
        
    
    @Before
    public void setUp() {
        
        
        
        
        Player player1 = new Player("ccc", 15);
        Player player2 = new Player("aaa", 15);
        Player player3 = new Player("bbb", 35);
        Player player4 = new Player("ddd", 50);
        Player player5 = new Player("ege", 5);
        //Player player6 = new Player("sila", 0);
        
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
        playerList.add(player5);
        //playerList.add(player6);
        
        
        comparedList.add(player5);
        comparedList.add(player2);
        comparedList.add(player1);
        comparedList.add(player3);
        comparedList.add(player4);
        //playerList.add(player6);
        
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
    }
    
    @Test
    public void comparatorTest() {
        List<Player> list = player.comparePlayer(playerList);
        assertEquals(list, comparedList);
    
    }
}
