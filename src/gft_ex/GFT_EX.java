/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft_ex;
import gft_ex.Produto;

/**
 *
 * @author usuario
 */
public class GFT_EX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Produto banana = new Produto("banana",0.99,2); 
        Produto energetico = new Produto("energetico",5.49,3);  
        Produto arroz = new Produto("arroz",20,1);  
        Produto chocolate = new Produto("chocolate",4.50,1);  
        Produto leite = new Produto("leite",3.73,3);  
        Produto abacaxi = new Produto("abacaxi",2.40,2);  
        Caixa caixa = new Caixa();
        
        
       
      System.out.println("valor: " + caixa.calculaValorFinal(banana, 3));
      System.out.println("valor: " + caixa.calculaValorFinal(energetico, 7));
      System.out.println("valor: " + caixa.calculaValorFinal(arroz, 1));
      System.out.println("valor: " + caixa.calculaValorFinal(chocolate, 20));
      System.out.println("valor: " + caixa.calculaValorFinal(leite, 3));
      System.out.println("valor: " + caixa.calculaValorFinal(abacaxi, 4));
        
      
    }

    

  
    
}
