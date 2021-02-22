/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Caucula {
      public static void main(String[] args) {
         System.out.println("digite um valor");
         Scanner sc1 = new Scanner(System.in); 
         
         int valor1 = sc1.nextInt();
          
         ICMS icms = new ICMS();
         IPI ipi = new IPI();
         COFINS cofins = new COFINS();
      
         icms.calculaImposto(valor1);
         ipi.calculaImposto(valor1);
         cofins.calculaImposto(valor1);
          
          System.out.println("Valor do ICMS é " + icms.getValor());
          System.out.println("Valor do IPI é " + ipi.getValor());
          System.out.println("Valor do COFINS é " + cofins.getValor());
          
             System.out.println("A soma dos impostos é de " + (icms.getValor()+ ipi.getValor() + cofins.getValor()));
         
      }
}
