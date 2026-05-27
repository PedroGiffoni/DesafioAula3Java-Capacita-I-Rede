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
public class desafio2 {
    public void executarDesafio2(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Desafio 2: Programa que recebe nome e notas do aluno, devolve a média e sinaliza se foi aprovado ou reprovado:");
        double[] notas = new double [3];
        double somaNotas = 0;
        
        System.out.println("Digite o nome do aluno: ");
        String aluno = ler.nextLine();
        
        for (int i = 0; i < notas.length; i++) {
            
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
        System.out.println("---------------------");
        System.out.println("Resultado Programa 2: ");
        System.out.println("Média: " + media);
        
        if(media>=7){
            System.out.println("Status: Aluno " + aluno + " foi aprovado");
        }else {

            System.out.println("Status: Aluno " + aluno + " foi reprovado");
        }
        System.out.println("__________________");
        System.out.println("Retornando ao menu");
        System.out.println("__________________");
        System.out.println("");
    }
}
