public abstract class Ingresso {
    private String assento;
    private Sessao sessao;

    // metodo construtor

    public Ingresso(String assento, Sessao sessao) {
        this.assento = assento;
        this.sessao = sessao;
    }

    // metodos getters e setters

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    // metodo toSring

    public abstract void imprimir();
}
