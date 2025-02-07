public class Inteira extends Ingresso{

    // metodo construtor

    public Inteira(String assento, Sessao sessao) {
        super(assento, sessao);
    }

    // metodo toString

    @Override
    public void imprimir() {
        System.out.printf("Assento: %s \n", getAssento());
        System.out.println("-- Sessão -- " + "\n" + getSessao().toString());
        System.out.println(" ");
    }
}
