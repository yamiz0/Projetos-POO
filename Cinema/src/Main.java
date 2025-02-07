import java.util.ArrayList;

/*
   @Ian Oliveira
*/
public class Main {
    public static void main(String[] agrs){
        // instanciando uma lista de sessoes
        ArrayList<Sessao> sessoes = new ArrayList<>();

        // instanciando as sessões e colocando na lista
        Sessao sessao1 = new Sessao("20:00", new Filme("Corinthians x Palmeiras", 2,"Esporte"),new Sala("Garro", 40, "IPS"));
        Sessao sessao2 = new Sessao("22:00", new Filme("Eternal Sunshine of The Spotless Mind", 2, "Romance"), new Sala("Clementine", 50, "OLED"));
        sessoes.add(sessao1);
        sessoes.add(sessao2);

        // adicionando ingressos na sessão 1
        sessao1.venderIngressos(new MeiaEstudante("4f", sessao1, 111, "IFMS"));
        sessao1.venderIngressos(new MeiaOutros("10f", sessao1,  "Rodrigo Garro"));
        sessao1.venderIngressos(new Inteira("4g", sessao1));

        // adicionando ingressos na sessão 2
        sessao2.venderIngressos(new MeiaEstudante("4f", sessao2, 222, "IFSP"));
        sessao2.venderIngressos(new MeiaOutros("10f", sessao2,  "Yuri Alberto"));
        sessao2.venderIngressos(new Inteira("4g", sessao2));

        // imprimindo as sessões e os ingressos
        sessao1.imprimir();
        System.out.println("\n");
        sessao2.imprimir();
        System.out.println(sessao1.assentosDisponiveis());
        System.out.println(sessao2.assentosDisponiveis());
    }
}