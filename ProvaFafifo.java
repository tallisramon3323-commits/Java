/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 *
 * @author Windows
 */
public class ProvaFafifo extends ProvaUniversidade{

    public ProvaFafifo(){

        pesoAv1 = 1;
        pesoAv2 = 1;
        pesoAv3 = 3;

        mediaMinima = 6;
    }

    @Override
    public double calcularMedia(){

        return ((notaAv1 * pesoAv1)
                + (notaAv2 * pesoAv2)
                + (notaAv3 * pesoAv3))
                / (pesoAv1 + pesoAv2 + pesoAv3);
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade(){

        return new ProvaFinalFafifo();
    }

}
