/*
 *
 * @author Ian Oliveira
 */

public class CD extends Produto
{
    private int faixas;

    // metodos construtores

    public CD()
    {
    }

    public CD(String nome, float preco, int faixas)
    {
        super(nome, preco);
        this.faixas = faixas;
    }

    // metodos getter e setters

    public int getFaixas() {
        return faixas;
    }

    public void setFaixas(int faixas) {
        this.faixas = faixas;
    }

    // metodo toString

    @Override
    public String toString() {
        return super.toString() + "\n" + "Faixas: " + faixas;
    }
}
