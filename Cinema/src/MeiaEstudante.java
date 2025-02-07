public class MeiaEstudante extends Ingresso{
    private int matricula;
    private String instituicao;

    // metodo construtor

    public MeiaEstudante(String assento, Sessao sessao, int matricula, String instituicao) {
        super(assento, sessao);
        this.matricula = matricula;
        this.instituicao = instituicao;
    }

    // metodos getters e setters

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    // metodo toString

    @Override
    public void imprimir() {
        System.out.printf("Assento: %s \n", getAssento());
        System.out.println("-- Sessão -- " + "\n" + getSessao().toString());
        System.out.printf("Matricula: %s \n", matricula);
        System.out.printf("Intituição: %s \n", instituicao);
        System.out.println(" ");
    }
}
