// Classe de dominio - Entidade que recebe os comandos de teste

package exceptions;

public class Financiamento {
    
    public double valorTotal;
    public double entrada;
    public int parcelas;
    
    // construtor:
    // throw new RuntimeException substitui o println, pois aqui estamos testando
    // uma execeção
    
    public Financiamento(double valorTotal, double entrada, int parcelas){
        
        // testes antes da execução:
        
        if(entrada <  valorTotal * 0.2){
           throw new RuntimeException("A entrada deve ser de pelo menos 20% do valor total");
           
        }else if (parcelas < 6){
           throw new RuntimeException("O numero minimo de parcelas deve ser 6");
        }else { // passado pelos testes, posso ter a adesão dos valores:
  
        this.valorTotal=valorTotal;
        this.entrada=entrada;
        this.parcelas=parcelas;
        
    }
        
    }// metodos:
    
        public double calculaPrestacao(){
            double valorFinanciado = valorTotal - entrada;
            double valorPrestacao = valorFinanciado / parcelas;
            return valorPrestacao;
            
        }
    }

     
 







