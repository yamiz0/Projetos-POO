/*
 *
 * @author Ian Oliveira
 */

public class Produto
{
    private String nome;
    private float preco;

    // metodos construtores

    public Produto()
    {
    }

    public Produto(String nome, float preco) {
        this.nome = nome;
        if(preco < 0)
        {
            System.out.println("Preco invalido!");
        }
        else {
            this.preco = preco;
        }
    }

    // metodos getter e setters

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public float getPreco()
    {
        return preco;
    }

    public void setPreco(float preco)
    {
        if(preco < 0)
        {
            System.out.println("Preco invalido!");
        }
        else {
            this.preco = preco;
        }
    }

    // metodo toString

    @Override
    public String toString() {
        return "Nome: " + nome + "\n" + "Preco: " + "R$" + preco;
    }
}
