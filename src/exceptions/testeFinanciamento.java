// Obs: A logica de execucao deve ser inserida na camada de dominio (entidade), 
// nao apenas na parte de teste

package exceptions;

public class testeFinanciamento {
    
    public static void main(String[] args) {
        
        double valorTotal = 1000.0;
        double entrada = 250.0;
        int parcelas = 5;
        
        try {
            
            Financiamento f1 = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println(f1.calculaPrestacao());
        
        }catch (RuntimeException excp){
            System.out.println(excp.getMessage());
        }
        
    }
    
}
