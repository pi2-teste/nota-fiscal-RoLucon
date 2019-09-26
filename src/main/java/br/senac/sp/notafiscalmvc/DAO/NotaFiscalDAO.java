/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.DAO;

import br.senac.sp.notafiscalmvc.model.NotaFiscal;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class NotaFiscalDAO {
    private static ArrayList<NotaFiscal> listaNotas = new ArrayList<NotaFiscal>();
    
    public static boolean addNota(NotaFiscal nota) {
        
        listaNotas.add(nota);
        System.out.println("Agora lista geral");
        for (int i = 0; i < listaNotas.size(); i++) {
            NotaFiscal get = listaNotas.get(i);
            System.out.println(get.getNumNota());
            System.out.println(get.getValNota());
            
        }
        
        return true;
    }

}
