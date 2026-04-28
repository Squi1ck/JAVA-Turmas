import java.util.Set;

public class Professor {
    private int numero;
    private int anoProprio;
    private String nomeProprio;
    private String nomeApelido;

    public Professor(int numero, int anoProprio, String nomeProprio, String nomeApelido) {
        this.numero = numero;
        this.anoProprio = anoProprio;
        this.nomeProprio = nomeProprio;
        this.nomeApelido = nomeApelido;
    }

    public Professor() {
        this.numero = 0;
        this.anoProprio = 0;
        this.nomeProprio = "";
        this.nomeApelido = "";
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getAnoProprio() {
        return anoProprio;
    }
    public void setAnoProprio(int anoProprio) {
        this.anoProprio = anoProprio;
    }
    public String getNomeProprio() {
        return nomeProprio;
    }
    public void setNomeProprio(String nomeProprio) {
        this.nomeProprio = nomeProprio;
    }
    public String getNomeApelido() {
        return nomeApelido;
    }
    public void setNomeApelido(String nomeApelido) {
        this.nomeApelido = nomeApelido;
    }

    @Override
    public String toString() {
        return "Professor [numero=" + numero + ", anoProprio=" + anoProprio + ", nomeProprio=" + nomeProprio
                + ", nomeApelido=" + nomeApelido + "]";
    }

    public String getNomeCompleto() {
        return nomeProprio + " " + nomeApelido;
        
    }
    /*public int getIdade() {
        return Idade;
        
    }*/
    
}
