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
public class Game {
    protected String game;
    public GameCaretaker caretaker;

    public Game() {
        game = new String();
        caretaker = new GameCaretaker();
    }
    
    public void jogar(String estadoGame){
        caretaker.addMomento(new GameMomento(game));
        game = estadoGame;
    }
    
    public void morrer(){
        game = caretaker.getUltimoCheckpoint().getEstado();
    }
    
    public void mostraGame(){
        System.out.println("ESTADO ATUAL DO JOGO");
        System.out.println(game);
    }
}
