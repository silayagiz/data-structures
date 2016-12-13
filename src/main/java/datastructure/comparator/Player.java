/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.comparator;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author silayagiz
 */
public class Player {
    private String playerName;
    private double score;

    public Player() {
    }

    public Player(String playerName, double score) {
        this.playerName = playerName;
        this.score = score;
    }
    
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    public List<Player> comparePlayer(List <Player> playerList)
    {
        Comparator<Player> groupByComparator = Comparator.comparing(Player::getScore)
                                                    .thenComparing(Player::getPlayerName);
        playerList.sort(groupByComparator);
        
                return playerList;
                        
    }
    
    
}
