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
        Produto banana = new Produto(); 
        Produto energetico = new Produto();  
        Produto arroz = new Produto();  
        Produto chocolate = new Produto();  
        Produto leite = new Produto();  
        Produto abacaxi = new Produto();  
        Caixa caixa = new Caixa();
        
        
        banana.setNome("banana");
        banana.setTipo(2);
        banana.setValor(0.99);
        energetico.setNome("energetico");
        energetico.setTipo(3);
        energetico.setValor(5.49);
        arroz.setNome("arroz");
        arroz.setTipo(1);
        arroz.setValor(20);
        chocolate.setNome("chocolate");
        chocolate.setTipo(1);
        chocolate.setValor(4.50);
        leite.setNome("leite");
        leite.setTipo(3);
        leite.setValor(3.73);
        abacaxi.setNome("abacaxi");
        abacaxi.setTipo(2);
        abacaxi.setValor(2.40);
        
      caixa.calculaValorFinal(banana, 3);
       
      System.out.println("valor: " + caixa.calculaValorFinal(banana, 3));
      System.out.println("valor: " + caixa.calculaValorFinal(energetico, 7));
      System.out.println("valor: " + caixa.calculaValorFinal(arroz, 1));
      System.out.println("valor: " + caixa.calculaValorFinal(chocolate, 20));
      System.out.println("valor: " + caixa.calculaValorFinal(leite, 3));
      System.out.println("valor: " + caixa.calculaValorFinal(abacaxi, 4));
        
      
    }

    

  
    
}
