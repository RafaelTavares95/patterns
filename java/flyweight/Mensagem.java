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
public class Mensagem extends MensagemFlyweight{

    protected String tipoMens;
    
    public Mensagem(String tipo) {
        tipoMens = tipo;
    }

    
    @Override
    public void mostraMensagem() {
        System.out.println("Mensagem do tipo: " + tipoMens);
    }

    
}
