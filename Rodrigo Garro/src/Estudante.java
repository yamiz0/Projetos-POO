public class Estudante {
    private String cpf;
    private String nome;
    private short idade;

    public Estudante(String cpf, String nome, short idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    void imprimir(){
        System.out.printf("%s - %S - %d anos\n",
                cpf, nome, idade);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }


}