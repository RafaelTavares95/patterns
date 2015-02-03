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
public class Memoria implements Componente{

    private final int capacidade;
    
    public Memoria(int capacidade) {
        this.capacidade = capacidade;
    }

    public void addComponente(Componente comp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void informacoes() {
        System.out.println("Memória ram de " + capacidade + "GB!");
    }
    
}
