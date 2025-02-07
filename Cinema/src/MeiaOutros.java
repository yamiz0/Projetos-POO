public class MeiaOutros extends Ingresso{
    private String observacao;

    // metodo construtor

    public MeiaOutros(String assento, Sessao sessao, String observacao) {
        super(assento, sessao);
        this.observacao = observacao;
    }

    // metodos getters e setters

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    // metodo toString

    @Override
    public void imprimir() {
        System.out.printf("Assento: %s \n", getAssento());
        System.out.println("-- Sessão -- " + "\n" + getSessao().toString());
        System.out.printf("Observação: %s \n", observacao);
        System.out.println(" ");

    }
}
