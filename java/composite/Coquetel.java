/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Coquetel implements Bebida{

    private final String nome;
    List<Bebida> lista = new ArrayList<Bebida>();

    public Coquetel(String nome) {
        this.nome = nome;
    }
    
    public void addBebida(Bebida dose) {
        lista.add(dose);
    }

    public void informacoes() {
        System.out.println("Coquetel " + nome + " com:");
        for(Bebida dose : lista){
            dose.informacoes();
        }
    }
    
}
