/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;



/**
 *
 * @author usuario
 */
public class ICMS implements Imposto {
   private double valor;

    public double getValor() {
        return valor;
    }

    @Override
    public void calculaImposto(double valor) {
       this.valor = (valor * 30) / 100;
    }
 
   
  
 
      
}
