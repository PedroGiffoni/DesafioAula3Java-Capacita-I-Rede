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
public class desafio1 {
    public void executarDesafio1(){
        Scanner lerNotas = new Scanner(System.in);
        System.out.println("Desafio 1: Programa que recebe 3 notas e devolve a média: ");
        System.out.println("_____________________________________________");
        double[] notas = new double[3];
        
        double somaNotas = 0;
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = lerNotas.nextDouble();
            
            while (notas[i] < 0 || notas[i] > 10) {

                System.out.println("Digite uma nota de 0 a 10.");

                System.out.print("Digite novamente a nota " + (i + 1) + ": ");

                notas[i] = lerNotas.nextDouble();
            }
            
            somaNotas += notas[i];
          
        }
        double media = somaNotas / notas.length;
        System.out.println("---------------------");
        System.out.println("Resultado Programa 1: ");
        System.out.println("Média: " + media);
        System.out.println("__________________");
        System.out.println("Retornando ao menu");
        System.out.println("__________________");
        System.out.println("");
    }
}
