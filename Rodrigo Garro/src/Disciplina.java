import javax.swing.*;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String professor;
    private ArrayList<Estudante> Estudantes = new ArrayList<>();

    // metodo construtor
    public Disciplina(String nome, String professor) {
        this.nome = nome;
        this.professor = professor;
    }

    // metodos getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getProfessor() {
        return professor;
    }
    public void setProfessor(String professor) {
        this.professor = professor;
    }

    // metodos
    public void adicionarEstudante(Estudante e){
        Estudantes.add(e);
    }// metodo para adicionar um estudante a lista

    public void removerEstudante(int i){
        Estudantes.remove(i);
    }// metodo para remover um estudante da lista

    public int qntEstudantes(){
        return Estudantes.size();
    }// metodo para retonar a quantidade de estudantes da lista

    Estudante getEstudante(int i){
        return Estudantes.get(i);
    }

    // metodo toString
    public void imprimir(){
        System.out.println("Disciplina: " + nome + "\n" + "Professor: " + professor + "\n" + "-Estudantes-");
        for (Estudante e : Estudantes){
            e.imprimir();
        }
    }
}
