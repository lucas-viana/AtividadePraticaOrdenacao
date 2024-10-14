/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.atividadepraticaordenacao;

import com.mycompany.atividadepraticaordenacao.model.BubbleSort;
import com.mycompany.atividadepraticaordenacao.model.Arquivo;
import com.mycompany.atividadepraticaordenacao.model.Candidato;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class AtividadePraticaOrdenacao {

    public static void main(String[] args) throws IOException {

        ArrayList<Candidato> candidatos = Arquivo.ReadFile("C:/Users/lucas/Downloads/dadosConcurso.csv");
        for(Candidato candidato: candidatos){
            System.out.println(candidato);
        }
        BubbleSort bsort = new BubbleSort();
        Candidato[] v = new Candidato[candidatos.size()];
        for(int i=0; i<v.length; i++){
            v[i] = candidatos.get(i);
        }
        bsort.sort(v);
        
        for (Candidato vetCandidato : v) {
            System.out.println(vetCandidato);
        }
    }
}
