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
public class Policia extends AutoridadeResponsavel{

    public Policia() {
        super(IdAutoridade.POLICIA);
    }

    @Override
    protected void registroOcorrencia() {
        System.out.println("A ocorrência foi registrada pela Polícia!");
    }
    
}
