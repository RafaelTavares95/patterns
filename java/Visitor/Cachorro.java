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
public class Cachorro implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void aceitarVisitante(AnimalVisitor visitor) {
        visitor.visit(this);
    }
    
}
