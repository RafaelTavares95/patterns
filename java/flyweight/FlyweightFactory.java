/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flyweight;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class FlyweightFactory {
    protected ArrayList<MensagemFlyweight> pull;
 
    public enum Tipo {
        MORTE, DANO, TEMPO
    }

    public FlyweightFactory() {
        pull = new ArrayList<MensagemFlyweight>();
        pull.add(new Mensagem("O Personagem Morreu!"));
        pull.add(new Mensagem("O personagem sofreu dano!"));
        pull.add(new Mensagem("O tempo está acabando!"));
    }
    
    public MensagemFlyweight getFlyweight(Tipo mensg){
        switch(mensg){
            case MORTE:
                return pull.get(0);
            case DANO:
                return pull.get(1);
            default:
                return pull.get(2);
        }
    }
    
}
