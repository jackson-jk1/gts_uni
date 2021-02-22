/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft_ex2;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Cubo {
    public static void main(String[] args) throws Exception {
    int valor1;
    int valor2;
    try{
    System.out.println("caso segundo valor do intervalo seja mairo que 15 o programa sera encerrado"); 
    System.out.println("primeiro valor deve ser maior que o segundo");
    Scanner sc1 = new Scanner(System.in);
    System.out.println("digite o primeiro valor");
    valor1 = sc1.nextInt();
    System.out.println("digite o segundo valor");
    valor2 = sc1.nextInt();
    if(valor2 > 15 || valor1 > 15){
      throw new Exception();
      
    }else{
      for(int i = (valor1+1); i < valor2; i++){
       System.out.println("o cubo do intervalo  :" + i + " é " + ((i*i)*i));
    }
    }
    
    }catch(Exception ex){
        System.out.println("numero nao permitido");
    }
}}
