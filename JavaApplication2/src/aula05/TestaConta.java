
package aula05;

/**
 *
 * @author gabriel.machado4
 */
public class TestaConta {
    public static void main(String[] args) {
      
        Conta objConta1 = new Conta("Gabriel", 1, 2000,500);
        Conta objConta2 = new Conta("Isabella", 2, 1500, 500);
        
        System.out.println("Saldo da conta 1: "+objConta1.getSaldoConta());
        System.out.println("Saldo da conta 2: "+objConta2.getSaldoConta()+"\n");
        
        
        //Depositar R$ 100 na conta1
        
        double novoSaldo = objConta1.getSaldoConta() + 100;
        objConta1.setSaldoConta(novoSaldo);
        
        System.out.println("Saldo da conta 1: "+objConta1.getSaldoConta()+"\n");
        
        //Sacar R$ 400 na conta2
        
        novoSaldo = objConta2.getSaldoConta() -400;
        objConta2.setSaldoConta(novoSaldo);
        System.out.println("Saldo da conta 2: "+objConta2.getSaldoConta()+"\n");
        
        
        //Transferir R$ 100 da conta1 para a conta2
        
        double novoSaldoConta1 = objConta1.getSaldoConta() -100;
        double novoSaldoConta2 = objConta2.getSaldoConta() +100;
        objConta1.setSaldoConta(novoSaldoConta1);
        objConta2.setSaldoConta(novoSaldoConta2);
        
        System.out.println("Saldo da conta 1: "+objConta1.getSaldoConta());
        System.out.println("Saldo da conta 2: "+objConta2.getSaldoConta()+"\n");
        
        //Depositar R$ 100  na conta 1
        
        System.out.println("Depositar R$ 100  na conta 1: ");
        objConta1.depositar(100);
        System.out.println("Saldo da conta 1: "+objConta1.getSaldoConta()+"\n");
        
        //Sacar R$ 100  na conta 2
        
        System.out.println("Sacar R$ 200  na conta 2: ");
        objConta2.sacar(200);
        System.out.println("Saldo da conta 2: "+objConta2.getSaldoConta()+"\n");
        
        //Trasnferir R$ 200 da conta 1 para conta 2 usando o savar e depositar
        
        System.out.println("Transferir R$ 200  da conta 1 para conta 2: ");
        if(objConta1.sacar(200)){
            objConta2.depositar(200);
            System.out.println("Saldo da conta 1: "+objConta1.getSaldoConta());
            System.out.println("Saldo da conta 2: "+objConta2.getSaldoConta()+"\n");
        }else{
            System.out.println("Sem saldo para o valor requisitado. \n");
        }
        
        //Trasnferir R$ 500 da conta 1 para conta 2
        
        System.out.println("Transferir R$ 500  da conta 1 para conta 2: ");
        System.out.println("Saldo da conta 1: "+objConta1.getSaldoConta());
        System.out.println("Saldo da conta 2: "+objConta2.getSaldoConta());
        
        objConta1.tranferir(500, objConta2);
        
        
        System.out.println("Saldo da conta 1: "+objConta1.getSaldoConta());
        System.out.println("Saldo da conta 2: "+objConta2.getSaldoConta()+"\n");
        
        System.exit(0);
    }   
}
