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
public class Loader {
    public static void main(String[] args) {
        Game game = new Game();
        game.jogar("Inicio do jogo \n");
        game.jogar("Primeiro Checkpoint \n");
        game.mostraGame();
        game.morrer();
        game.mostraGame();
        game.morrer();
        game.mostraGame();
        
    }
}
