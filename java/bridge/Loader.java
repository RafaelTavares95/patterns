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
public class Loader {

    public static void main(String []args){
        ImagemComFiltro imagem;
        imagem = new ImagemCartoon(new ImagemGimp());
        imagem.aplicar();
        imagem = new ImagemCartoon(new ImagemPhotoshop());
        imagem.aplicar();
        imagem = new ImagemHope(new ImagemPhotoshop());
        imagem.aplicar();
    }
}
