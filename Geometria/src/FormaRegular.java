public abstract class FormaRegular extends FiguraGeometrica
{
    private float lado;

    // metodo construtor
    public FormaRegular(String nome, float lado)
    {
        super(nome);
        this.lado = lado;
    }

    // metodos getters e setters
    public float getLado()
    {
        return lado;
    }

    public void setLado(float lado)
    {
        this.lado = lado;
    }
}
