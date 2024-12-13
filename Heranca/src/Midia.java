/*
 *
 * @author Ian Oliveira
 */

public class Midia extends Produto
{
    private String artista;

    // metodos construtores

    public Midia()
    {
    }

    public Midia(String nome, float preco, String artista)
    {
        super(nome, preco);
        this.artista = artista;
    }

    // metodos getters e setters

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    // metodo toString

    @Override
    public String toString() {
        return super.toString() + "\n" + "Artista: " + artista;
    }
}
