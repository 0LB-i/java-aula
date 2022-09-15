
package aula05;

/**
 *
 * @author gabriel.machado4
 */
public class Conta {
    private String nome;
    private int numConta;
    private double saldoConta;
    private double limiteChequeEspecial;

    public Conta(String nome, int numConta, double saldoConta, double limiteChequeEspecial) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldoConta = saldoConta;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public Conta() {
    }
    
    
    public void depositar(double valor){
        this.saldoConta += valor;
    }
    
    public boolean sacar(double valor){
        if((saldoConta+limiteChequeEspecial)>=valor){
        this.saldoConta -= valor;
        return true;}else{
           return false;
        }
        
    }
    
    public boolean tranferir(double valorTransferencia, Conta objContaDestino){
        if(this.sacar(valorTransferencia)){
            objContaDestino.depositar(valorTransferencia);
            return true;
    }else{
            return false;
        }
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    
    
    @Override
    public String toString() {
        return this.numConta + " - " + this.nome;
    }
    
}
