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
public class Processador implements Componente{

    private final double potencia;
    private final String nome;
    
    public Processador(String nome, double potencia) {
        this.potencia = potencia;
        this.nome = nome;
    }
    
    public void addComponente(Componente comp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void informacoes() {
        System.out.println("Processador " + nome + " com potência de " + potencia + "Ghz");
    }
    
}
