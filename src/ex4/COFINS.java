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
public class COFINS implements Imposto{
    private double valor;

    public double getValor() {
        return valor;
    }
    
    @Override
    public void calculaImposto(double valor) {
     if (valor > 12000)
     {
     this.valor = (valor * 8) / 100;
     
     }else{
     
     this.valor = 0;}
    
    }
}
