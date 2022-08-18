
package aula04;

/**
 *
 * @author gabriel.machado4
 */
public class TestePessoa {
    public static void main(String[] args) {
        
        pessoa objPessoa1 = new pessoa();
        objPessoa1.setNome("Gabriel");
        
        System.out.println(objPessoa1.toString());
        
        objPessoa1.setCidade("São Paulo");
        System.out.println(objPessoa1.cidade);
        
        objPessoa1.setCidade("Tabaí");
        System.out.println(objPessoa1.cidade);
        
        objPessoa1.setIdade(19);
        System.out.println(objPessoa1.idade);
        
        objPessoa1.setNome("luíz");
        System.out.println(objPessoa1.nome);
        
        objPessoa1.setAluno(true);
        System.out.println(objPessoa1.aluno);
        objPessoa1.setAluno(false);
        System.out.println(objPessoa1.aluno);
        
    }
}
