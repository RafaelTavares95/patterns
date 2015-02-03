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
public class ImagemGimp implements ImagemComFiltroImp{

    public void aplicarFiltro(String filtro) {
        System.out.println("Imagem do GIMP com filtro " + filtro);
    }
    
}
