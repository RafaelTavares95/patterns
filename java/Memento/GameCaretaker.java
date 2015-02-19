/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Memento;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class GameCaretaker {
    protected ArrayList<GameMomento> estados;

    public GameCaretaker() {
        estados = new ArrayList<GameMomento>();
    }
    
    public void addMomento(GameMomento momento){
        estados.add(momento);
    }
    
    public GameMomento getUltimoCheckpoint(){
        if(estados.size() <= 1){
            return new GameMomento("GAME OVER \n");
        }
        GameMomento estadoSalvo = estados.get(estados.size() - 1);
        estados.remove(estados.size() - 1);
        return estadoSalvo;
    }
    
    
}
