
package aula04;

/**
 *
 * @author gabriel.machado4
 */
public class pessoa {
    public String nome;
    public String cidade;
    public int idade;
    public boolean aluno;
    
    public void modificarNome(String texto){
        nome = texto;
    }
    
    public String retornarNome(){
        return nome;
    }
    
    public void modificarCidade(String local){
        cidade = local;
    }
    
    public String retornarCidade(){
        return cidade;
    } 
    
    public void modificarIdade(int num){
        idade = num;
    }
    
    public int retornarIdade(){
        return idade;
    }
    
    public void modificarAluno(boolean um){
        aluno = um;
    }
    
    public boolean retornarAluno(){
        return aluno;
    }
    
    public String imprimir(){
        return "Cliente: "+nome+", idade: "+idade;
    }
}
