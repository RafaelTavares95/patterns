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
public interface AnimalVisitor {
    void visit(Gato gato);
    void visit(Cachorro cachorro);
}
