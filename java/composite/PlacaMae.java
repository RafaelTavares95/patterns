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
public class PlacaMae implements Componente{

    private final String nome;
    List<Componente> lista = new ArrayList<Componente>();

    public PlacaMae(String nome) {
        this.nome = nome;
    }
    
    public void addComponente(Componente comp) {
        lista.add(comp);
    }

    public void informacoes() {
        System.out.println("Este PC possui uma placa-mãe " + nome + " com os seguintes componentes:");
        for(Componente comp : lista){
            comp.informacoes();
        }
    }
    
}
