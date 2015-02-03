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
public class ImagemCartoon extends ImagemComFiltro{

    public ImagemCartoon(ImagemComFiltroImp i) {
        super(i);
    }

    @Override
    public void aplicar() {
        aplicarFiltro("cartoon");
    }
    
}
