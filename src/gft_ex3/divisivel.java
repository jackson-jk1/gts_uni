/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft_ex3;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class divisivel {
     public static void main(String[] args) throws Exception {
    int valor1;
    Scanner sc1 = new Scanner(System.in);
    System.out.println("digite um valor");
    valor1 = sc1.nextInt();
     
    
   if(valor1 % 3 == 0 && valor1 % 7 == 0  )
      {
     System.out.println("divissivel por 3,7");
    
     }
   else if(valor1 % 3 == 0 && valor1 % 6 == 0  )
      {
     System.out.println("divissivel por 3,7");
     }
      else if(valor1 % 3 == 0 && valor1 % 7 == 0 && valor1 % 6 == 0   ){
           
    System.out.println("divissivel por 3,6,7");
   }
      else if(valor1 % 3 == 0 ){
     System.out.println("divissivel por 3");
    }
      else  if(valor1 % 7 == 0){
         System.out.println("divissivel por 7");
    }
      else if(valor1 % 6 == 0){
         System.out.println("divissivel por 6");
    }
    
     }
     
}
 

