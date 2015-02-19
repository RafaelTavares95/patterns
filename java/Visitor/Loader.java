/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Visitor;

/**
 *
 * @author Rafael
 */
public class Loader {
    public static void main(String[] args) {
        Animal dog = new Cachorro();
        Animal cat = new Gato();
        dog.aceitarVisitante(new EmissorDeSom());
        cat.aceitarVisitante(new EmissorDeSom());
    }
}
