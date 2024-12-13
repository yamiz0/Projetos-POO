public class TrianguloEquilatero extends FormaRegular
{
    // metodo construtor
    public TrianguloEquilatero(String nome, float lado)
    {
        super(nome, lado);
    }

    // metodos
    @Override
    public float calcularArea() {
        return ((float)Math.pow(getLado(),2) * (float)Math.sqrt(3))/4;
    }// metodo para calcular a area do triangulo equilatero

    @Override
    public float calcularPerimetro() {
        return getLado() + getLado() + getLado();
    }// metodo para calcular o perimetro do triangulo equilatero

    @Override
    public String getType() {
        return "Triangulo Equilatero";
    }
}
