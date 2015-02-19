/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ChainOfResponsibility;

/**
 *
 * @author Rafael
 */
public class Loader {
    public static void main(String[] args) {
        AutoridadeResponsavel autoridade = new Policia();
        autoridade.setNext(new Bombeiros());
        autoridade.setNext(new DefesaCivil());
        autoridade.setNext(new Samu());
        
        try {
            autoridade.registrarOcorrencia(IdAutoridade.SAMU);
            autoridade.registrarOcorrencia(IdAutoridade.BOMBEIROS);
            autoridade.registrarOcorrencia(IdAutoridade.POLICIA);
            autoridade.registrarOcorrencia(IdAutoridade.DEFESACIVIL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
