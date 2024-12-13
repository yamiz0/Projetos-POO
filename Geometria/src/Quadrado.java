public class Quadrado extends FormaRegular
{
    // metodo construtor
    public Quadrado(String nome, float lado)
    {
        super(nome, lado);
    }

    // metodos
    @Override
    public float calcularArea()
    {
        return getLado() * getLado();
    }// metodo para calcular a area do quadrado

    @Override
    public float calcularPerimetro()
    {
        return 4 * getLado();
    }// metodo para calcular o perimetro do quadrado

    @Override
    public String getType() {
        return "Quadrado";
    }
}
