/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package composite;

/**
 *
 * @author Rafael
 */
public class Vodka implements Bebida{

    private final int quantidade;
    
    public Vodka(int quantidade) {
        this.quantidade = quantidade;
    }

    public void informacoes() {
        System.out.println(quantidade + "Ml de Vodka!");
    }
    
}
