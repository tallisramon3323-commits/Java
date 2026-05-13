/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidade.prova;

/**
 *
 * @author Windows
 */
public class ProvaFinalFafifo extends ProvaFinalUniversidade{

    @Override
    public boolean habilitadoRealizarProva(){

        return !provaUniversidade.aprovado();
    }

}
