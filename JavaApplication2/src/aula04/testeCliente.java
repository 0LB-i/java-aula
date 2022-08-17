package aula04;

/**
 *
 * @author gabriel.machado4
 */
public class testeCliente {
    public static void main(String[] args) {
        String nome = "Gabriel";
        String cidade = "Tabaí";
        int idade = 19;
        
        String nome2 = "Samantha";
        String cidade2 = "Lajeado";
        int idade2 = 19;
        
        System.out.println("Meu nome é: "+nome+", moro em: "+cidade+", e tenho "+idade+" anos de idade.");
        System.out.println("O nome do meu colega é: "+nome2+", moro em: "+cidade2+", e tenho "+idade2+" anos de idade.");
        
        if(idade2 == idade){
            System.out.println("Nós temos a mesma idade.");
        }
        if(idade2 > idade){
            System.out.println(nome2+" é mais velha que "+nome);
        }
        if(idade > idade2){
            System.out.println(nome+" é mais velho que "+nome2);
        }
    }
}
