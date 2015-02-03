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
        Memoria m = new Memoria(4);
        Processador p = new Processador("Intel", 2.4);
        PlacaMae pm = new PlacaMae("ASUS");
        
        pm.addComponente(m);
        pm.addComponente(p);
        pm.informacoes();
    }
}
