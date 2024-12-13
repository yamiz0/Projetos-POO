/*
 *
 * @author Ian Oliveira
 */

public class DVD extends Produto
{
    private int duracao;

    // metodos construtores

    public DVD()
    {
    }

    public DVD(String nome, float preco, int duracao)
    {
        super(nome, preco);
        if(duracao < 0)
        {
            System.out.println("Duracao invalida!");
        }
        else
        {
            this.duracao = duracao;
        }
    }

    // metodos getters e setters

    public int getDuracao()
    {
        return duracao;
    }

    public void setDuracao(int duracao)
    {
        if(duracao < 0)
        {
            System.out.println("Duracao invalida!");
        }
        else
        {
            this.duracao = duracao;
        }
    }

    // metodo toString

    @Override
    public String toString() {
        return super.toString() + "\n" + "Duracao: " + duracao + " horas";
    }
}
