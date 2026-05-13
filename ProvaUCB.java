/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 *
 * @author Windows
 */
public class ProvaUCB extends ProvaUniversidade {
    
    public ProvaUCB(){

        pesoAv1 = 1;
        pesoAv2 = 1;
        pesoAv3 = 1;
        mediaMinima = 7;
    }

    @Override
    public double calcularMedia(){

        return (notaAv1 + notaAv2 + notaAv3) / 3;
    }

    @Override
    public ProvaFinalUniversidade getProvaFinalUniversidade(){

        return new ProvaAV3UCB();
    }

}
