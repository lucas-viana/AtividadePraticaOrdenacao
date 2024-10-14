/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepraticaordenacao.model;

/**
 *
 * @author lucas
 * @param <T>
 */
public class BubbleSort<T extends Comparable> {
    private long contaComparacoes=0;

    public long getContaComparacoes() {
        return contaComparacoes;
    }
     public void troca(T[] v, int i, int j){
        T temp = v[i];
        v[i] = v[j];
        v[j] = temp;
    }
    
    public T[] sort(T[] c){
        int n = c.length;
        this.contaComparacoes=0;
        for(int fase = 1; fase < n; fase++){
            for(int j=0; j<n-fase;j++){
                if(c[j].compareTo(c[j+1])> 0){
                    this.contaComparacoes++;
                    troca((T[]) c,j,j+1);
                }
            }
//            if(!ordenado){
//                System.out.println("Ordenado");
//                break;
//            }
        }
         return (T[]) c;
    }
}
