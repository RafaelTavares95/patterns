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
public abstract class AutoridadeResponsavel {
    protected AutoridadeResponsavel next;
    protected IdAutoridade idDaAutoridadeResponsavel;

    public AutoridadeResponsavel(IdAutoridade id) {
        this.next = null;
        this.idDaAutoridadeResponsavel = id; 
    }
    
    public void setNext(AutoridadeResponsavel auto) {
        if (next == null) {
            next = auto;
        } else {
            next.setNext(auto);
        }
    }
    
    public void registrarOcorrencia(IdAutoridade id) throws Exception {
    if (verificaId(id)) {
        registroOcorrencia();
    } else {
        if (next == null) {
            throw new Exception("Autoridade não cadastrada");
        }
        next.registrarOcorrencia(id);
    }
}
 
    private boolean verificaId(IdAutoridade id) {
        if (idDaAutoridadeResponsavel == id) {
            return true;
        }
            return false;
    }
 
    protected abstract void registroOcorrencia();
}
