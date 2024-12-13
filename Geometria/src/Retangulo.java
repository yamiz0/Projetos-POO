public class Retangulo extends FiguraGeometrica
{
    private float altura;
    private float base;

    // metodo construtor
    public Retangulo(String nome, float altura, float base)
    {
        super(nome);
        this.altura = altura;
        this.base = base;
    }

    // metodos getters e setters
    public float getAltura()
    {
        return altura;
    }
    public void setAltura(float altura)
    {
        this.altura = altura;
    }

    public float getBase()
    {
        return base;
    }

    public void setBase(float base)
    {
        this.base = base;
    }

    // metodos
    @Override
    public float calcularArea()
    {
        return base * altura;
    }// metodo para cacular a area do retangulo

    @Override
    public float calcularPerimetro()
    {
        return (base + altura) + (base + altura);
    }// metodo para calcular o perimetro do retangulo

    @Override
    public String getType() {
        return "Corinthains";
    }
}

