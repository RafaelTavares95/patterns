/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bridge;

/**
 *
 * @author Rafael
 */
public abstract class ImagemComFiltro {
    
    protected ImagemComFiltroImp imagem;

    public ImagemComFiltro(ImagemComFiltroImp i) {
        imagem = i;
    }
    
    public void aplicarFiltro(String filtro){
        imagem.aplicarFiltro(filtro);
    }
    
    public abstract void aplicar();
}
