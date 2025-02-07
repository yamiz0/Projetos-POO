public class Sala {
    private String nome;
    private int numAssentos;
    private String tipoTela;

    // metodo construtor

    public Sala(String nome, int numAssentos, String tipoTela) {
        this.nome = nome;
        this.numAssentos = numAssentos;
        this.tipoTela = tipoTela;
    }

    // metodos getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumAssentos() {
        return numAssentos;
    }

    public void setNumAssentos(int numAssentos) {
        this.numAssentos = numAssentos;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    // metodo toString

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "Numero de assentos: " + numAssentos + "\n" + "Tipo de tela: " + tipoTela + "\n";
    }
}
