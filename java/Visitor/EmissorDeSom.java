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
public class EmissorDeSom implements AnimalVisitor{

    @Override
    public void visit(Gato gato) {
        gato.emitirSom();
    }

    @Override
    public void visit(Cachorro cachorro) {
        cachorro.emitirSom();
    }
    
}
