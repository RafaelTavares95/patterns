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
public class Suco implements Bebida{

    private final int quantidade;
    private final String nome;
    
    public Suco(String nome, int quantidade) {
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public void informacoes() {
        System.out.println(quantidade + "Ml de suco de " + nome + "!");
    }
    
}
