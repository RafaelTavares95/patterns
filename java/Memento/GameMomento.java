/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Memento;

/**
 *
 * @author Rafael
 */
public class GameMomento {
    protected String estadoGame;

    public GameMomento(String estadoGame) {
        this.estadoGame = estadoGame;
    }
    
    public String getEstado(){
        return estadoGame;
    }
}
