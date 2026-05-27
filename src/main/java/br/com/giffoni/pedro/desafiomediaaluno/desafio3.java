/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.giffoni.pedro.desafiomediaaluno;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class desafio3 {
    public void executarDesafio3(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Dasafio3: Programa que recebe a quantidade de notas q deseja inserir, recebe as notas, calcula a media e diz se foi aprovado ou reprovado");
        System.out.println("__________________________________");
        System.out.print("Quantas notas deseja inserir? ");
        int quantidadeDeNotas = ler.nextInt();
                
        double[] notas = new double[quantidadeDeNotas];
        
        double somaNotas = 0;
        
        for(int i = 0; i < notas.length; i++){
            System.out.print("Digite a nota " + (i + 1) + ": ");
            
            notas[i] = ler.nextDouble();
            
            while (notas[i] < 0 || notas[i] > 10) {

                System.out.println("Digite uma nota de 0 a 10.");

                System.out.print("Digite novamente a nota " + (i + 1) + ": ");

                notas[i] = ler.nextDouble();
            }
            somaNotas += notas[i];
        }
        
        double media = somaNotas / notas.length;
        
        System.out.print("Digite a média mínima: ");
        double mediaMinima = ler.nextDouble();
        
        System.out.println("---------------------");
        System.out.println("Resultado Programa 3: ");
        System.out.println("Média: " + media);   
        
            if (media >= mediaMinima) {
            System.out.println("Status: Aprovado");
            } else {
            System.out.println("Status: Reprovado");
        }
        System.out.println("__________________");
        System.out.println("Retornando ao menu");
        System.out.println("__________________");
        System.out.println("");
    }
}
