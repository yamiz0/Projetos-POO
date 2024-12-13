import java.text.Normalizer;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // criando uma lista de Figuras Geometricas
        ArrayList<FiguraGeometrica> lista = new ArrayList<>();

        // adicionando as Figuras
        lista.add(new Pentagono("Rodrigo Garro", 10f));
        lista.add(new Circulo("Yuri Alberto", 2f));
        lista.add(new Quadrado("Memphis Depay", 5f));
        lista.add(new Retangulo("Hugo Neneca", 3f, 5f));
        lista.add(new TrianguloEquilatero("Andre Carillo", 5f));
        lista.add(new TrianguloRetangulo("Breno Bidon", 3f, 5f));

        // imprimindo os dados
        for(int i = 0; i < lista.size(); i++)
        {
            System.out.println(lista.get(i));
            System.out.println(" ");
        }
    }
}