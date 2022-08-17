
package aula04;

/**
 *
 * @author gabriel.machado4
 */
public class TestePessoa {
    public static void main(String[] args) {
        
        pessoa objPessoa1 = new pessoa();
        objPessoa1.modificarNome("Gabriel");
        
        System.out.println(objPessoa1.imprimir());
        
        
    }
}
