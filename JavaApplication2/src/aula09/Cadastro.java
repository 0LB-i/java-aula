
package aula09;

/**
 *
 * @author gabriel.machado4
 */
public class Cadastro {
    private String user;
    private String eMail;
    private String senha;
    private int dia;
    private int mes;
    private int ano;
    private String sexo;

    public Cadastro(String user, String eMail, String senha, int dia, int mes, int ano, String sexo) {
        this.user = user;
        this.eMail = eMail;
        this.senha = senha;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.sexo = sexo;
    }
    
    public Cadastro() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}
