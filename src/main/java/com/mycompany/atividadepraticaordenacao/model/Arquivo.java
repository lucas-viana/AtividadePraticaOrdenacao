/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadepraticaordenacao.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Arquivo {

    public static ArrayList<Candidato> ReadFile(String arquivoCSV) {
        String linha;
        ArrayList<Candidato> candidatos = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try (BufferedReader br = new BufferedReader(new FileReader(arquivoCSV))) {

            while ((linha = br.readLine()) != null) {
                // Quebra a linha por vírgulas
                String[] dados = linha.split(",");

                // Mapeia os dados
                int id = Integer.parseInt(dados[0]);
                String nome = dados[1];
                LocalDate data = LocalDate.parse(dados[2], formatter);
                double nota = Double.parseDouble(dados[3]);

                // Cria o objeto Candidato e adiciona à lista
                Candidato candidato = new Candidato(id, nome, data, nota);
                candidatos.add(candidato);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return candidatos;
    }
}
