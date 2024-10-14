/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepraticaordenacao.model;

import java.time.LocalDate;

/**
 *
 * @author lucas
 */
public class Candidato implements Comparable<Candidato>{
    private int identificador;
    private String nome;
    private LocalDate dataNascimento;
    private Double nota;

    public Candidato(int identificador, String nome, LocalDate dataNascimento, Double nota) {
        this.identificador = identificador;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nota = nota;
    }

    
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
    
    
    @Override
    public int compareTo(Candidato outroCandidato) {
        int comparaNota = this.nota.compareTo(outroCandidato.getNota());
        if(comparaNota == 0) return this.dataNascimento.compareTo(outroCandidato.dataNascimento);
        if(this.getNota() < outroCandidato.getNota()) return -1;
        if(this.getNota() > outroCandidato.getNota()) return 1;
        return 0;
    }
    
    @Override
    public String toString() {
        return "Candidato " +
                "ID=" + this.getIdentificador() +
                ", nome='" + nome + '\'' +
                ", data de nascimento=" + this.getDataNascimento() +
                ", nota=" + nota;
    }
}
