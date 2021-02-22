/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gft_ex;

/**
 *
 * @author usuario
 */
public class Caixa {
    private double valor;

    public Caixa() {
    }
    
   public double calculaValorFinal(Produto produto, int quantidade){
    
     this.valor = produto.getValor() * quantidade;
     if(produto.getTipo() == 1){
        this.valor = this.valor - ((this.valor * 10 ) / 100);
     }else if (produto.getTipo() == 2){
      this.valor = this.valor - ((this.valor * 20 ) / 100);
     }
     if (quantidade > 3){
      this.valor = this.valor - ((this.valor * 20 ) / 100);
     }
     return valor;
   }
    
}
