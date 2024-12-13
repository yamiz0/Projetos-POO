public class TrianguloRetangulo extends Retangulo
{
    // metodo construtor
    public TrianguloRetangulo(String nome, float altura, float base)
    {
        super(nome, altura, base);
    }
    // metodos
    @Override
    public float calcularArea()
    {
        return getBase() * getAltura() / 2;
    }// calcula a area do triangulo retangulo

    public float pitagoras()
    {
        return (float)Math.sqrt(Math.pow(getBase(),2) + Math.pow(getAltura(), 2));
    }// metodo pitagoras para descobrir a hipotenusa do triangulo retangulo

    @Override
    public float calcularPerimetro()
    {
        return pitagoras() + getBase() + getAltura();
    }// metodo para calcular a area do perimetro

    @Override
    public String getType() {
        return "Triangulo Retangulo";
    }
}
