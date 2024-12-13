public class Pentagono extends FormaRegular
{
    // metodo construtor
    public Pentagono(String nome, float lado)
    {
        super(nome, lado);
    }

    // metodos
    public float calcularApotema()
    {
        return getLado() / (2 * (float)Math.tan(36 * (float)Math.PI/180));
    }// metodo para calcular a apotema do pentagono
    @Override
    public float calcularArea()
    {
        return ((5 * getLado()) * calcularApotema()) / 2;
    }// metodo para calcular a area do Pentagono

    @Override
    public float calcularPerimetro()
    {
        return getLado() * 5;
    }// metodo para calcular o perimetro do Pentagono

    @Override
    public String getType() {
        return "Pentagono";
    }
}
