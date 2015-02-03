/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flyweight;

/**
 *
 * @author Rafael
 */
public class Loader {
    public static void main(String []args){
        FlyweightFactory factory = new FlyweightFactory();
        factory.getFlyweight(FlyweightFactory.Tipo.MORTE).mostraMensagem();
        factory.getFlyweight(FlyweightFactory.Tipo.DANO).mostraMensagem();
        factory.getFlyweight(FlyweightFactory.Tipo.TEMPO).mostraMensagem();
    }
}
