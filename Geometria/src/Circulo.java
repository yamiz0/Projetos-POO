public class Circulo extends FiguraGeometrica
{
    private float raio;

    // metodo construtor
    public Circulo(String nome, float raio)
    {
        super(nome);
        this.raio = raio;
    }

    // metodos getters e setters
    public float getRaio()
    {
        return raio;
    }

    public void setRaio(float raio)
    {
        this.raio = raio;
    }

    // metodos
    @Override
    public float calcularArea() {
        return (float)Math.PI * (float)Math.pow(raio, 2);
    }// metodo para calcular a area do circulo

    @Override
    public float calcularPerimetro() {
        return (2 *(float)Math.PI) * raio;
    }// metodo para calcular o perimetro do circulo

    @Override
    public String getType() {
        return "Circulo";
    }

    // metodo toString
    @Override
    public String toString() {
        return super.toString() + "\n" + "Raio: " + raio;
    }
}
