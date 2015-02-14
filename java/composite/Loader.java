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
public class Loader {
    public static void main(String []args){
        Vodka v = new Vodka(40);
        Suco s = new Suco("Maçã", 100);
        Coquetel am = new Coquetel("Apple Martini");
        
        am.addBebida(v);
        am.addBebida(s);
        am.informacoes();
    }
}
