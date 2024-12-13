/*
 *
 * @author Ian Oliveira
 */

public class Main
{
    public static void main(String[] args)
    {
        // instanciando um livro
        Livro l = new Livro("Sport", 1910f, "Renato Augusto", "111-22-33333-44-5");

        // instanciando uma midia
        Midia m = new Midia("Clube", 1977f, "Marcelinho Carioca");

        // instancinado um CD
        CD c = new CD("Corinthians", 2000f, 2012);

        // instanciando um DVD
        DVD d = new DVD("Paulista", 2015f, 1999);

        // imprimindo os dados
        System.out.println("---Livro---");
        System.out.println(l.toString());
        System.out.println("\n---Midia---");
        System.out.println(m.toString());
        System.out.println("\n---CD---");
        System.out.println(c.toString());
        System.out.println("\n---DVD---");
        System.out.println(d.toString());
    }
}