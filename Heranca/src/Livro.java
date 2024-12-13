/*
 *
 * @author Ian Oliveira
 */

public class Livro extends Produto
{
    private String autor;
    private String isbn;

    // metodos construtores

    public Livro()
    {
    }

    public Livro(String nome, float preco, String autor, String isbn)
    {
        super(nome, preco);
        this.autor = autor;
        this.isbn = isbn;
    }

    // metodos getters e setters

    public String getAutor()
    {
        return autor;
    }

    public void setAutor(String autor)
    {
        this.autor = autor;
    }

    public String getIsbn()
    {
        return isbn;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    // metodo toString

    @Override
    public String toString() {
        return super.toString() + "\n" + "Autor: " + autor + "\n" + "ISNB: " + isbn;
    }
}
