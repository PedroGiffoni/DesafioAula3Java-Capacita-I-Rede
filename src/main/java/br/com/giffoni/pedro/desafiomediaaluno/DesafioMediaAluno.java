/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.giffoni.pedro.desafiomediaaluno;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class DesafioMediaAluno {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
       int opcao = 0;
       
       while (opcao!= 4){
           System.out.println("______MENU______");
           System.out.println("Digite 1 para rodar o Desafio 1");
           System.out.println("Digite 2 para rodar o Desafio 2");
           System.out.println("Digite 3 para rodar o Desafio 3");
           System.out.println("Digite 4 para sair");
           
           System.out.println("Escolha uma opção conforme menu: ");
           opcao = ler.nextInt();
           
           switch (opcao) {
               case 1:
                   desafio1 tarefa1 = new desafio1();
                   tarefa1.executarDesafio1();                   
                   break;
                case 2:
                   desafio2 tarefa2 = new desafio2();
                   tarefa2.executarDesafio2();                   
                   break;  
                case 3:
                   desafio3 tarefa3 = new desafio3();
                   tarefa3.executarDesafio3();                   
                   break;
                case 4:
                   System.out.println("---------------------------- "); 
                   System.out.println("FECHANDO PROGRAMA! OBRIGADO! ");
                   System.out.println("---------------------------- "); 
                   break;  
                default: 
                    System.out.println("Opção inválida.");
           }
        }
    }
}
