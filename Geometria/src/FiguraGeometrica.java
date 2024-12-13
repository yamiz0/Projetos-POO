public abstract class FiguraGeometrica
{
    private String nome;

    // metodo construtor
    public FiguraGeometrica(String nome)
    {
        this.nome = nome;
    }

    // metodos getters e setters
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }


    // metodos
    public abstract float calcularArea();

    public abstract float calcularPerimetro();
    public abstract String getType();

    // metodo toString
    @Override
    public String toString()
    {
        return "Nome: " + nome  + "\n" + "Figura: " +getType() + "\n" + "Area: " + calcularArea() + "\n" + "Perimetro: " + calcularPerimetro() + "\n";
    }
}
