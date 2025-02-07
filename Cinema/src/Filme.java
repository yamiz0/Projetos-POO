public class Filme {
    private String titulo;
    private int duracao;
    private String genero;

    // metodo construtor
    public Filme(String titulo, int duracao, String genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }

    // metodos getters e setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // metodo toString

    @Override
    public String toString() {
        return "Titulo: " + titulo + "\n" + "Duração: " + duracao + "\n" + "Genero: " + genero + "\n";
    }
}
