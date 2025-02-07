import java.util.ArrayList;

public class Sessao {
    private String horario;
    private Filme filme;
    private Sala sala;
    private ArrayList<Ingresso> ingressos = new ArrayList<>();

    // metodo construtor
    public Sessao(String horario, Filme filme, Sala sala) {
        this.horario = horario;
        this.filme = filme;
        this.sala = sala;
    }

    // metodos getters e setters

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    // metodo toString

    @Override
    public String toString() {
        return "Horario: " + horario + "\n" + "-- Filme --" + "\n" + filme.toString() + "-- Sala --" + "\n" + sala.toString();
    } // metodo toSring, que imprime apenas os dados da Sessão

    public void imprimir() {
        System.out.println("-- Sessão --" + "\n" + "Horario: " + horario + "\n" + "-- Filme --" + "\n" + filme.toString() + "-- Sala --" + "\n" + sala.toString() + "\n" + "-- Ingressos --");
        for (Ingresso i: ingressos){
            i.imprimir();
        }
    } // metodo para imprimir os dados da Sessão e o ingressos da lista

    // metodos

    public int assentosDisponiveis(){
        return sala.getNumAssentos() - ingressos.size();
    } // metodo para verificar a quantidade de assentos disponiveis na sessão

    public void venderIngressos(Ingresso ingresso){
        if(assentosDisponiveis() > 0){
            ingressos.add(ingresso);
        }
        else{
            System.out.println("Sessão está lotada");
        } // metodo para adicionar o ingresso na lista caso há assentos disponiveis
    }

}
