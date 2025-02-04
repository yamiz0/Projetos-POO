import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        String fileNameDisciplina = "src//Mundial 2012.txt";
        ArrayList<Disciplina> disciplina = new ArrayList<>();

        readDisciplina(fileNameDisciplina, disciplina);

        Disciplina f = new Disciplina("Web 2", "Alexandre");
        f.adicionarEstudante(new Estudante("111", "Emerson Sheik", (short)40));
        f.adicionarEstudante(new Estudante("222", "Romarinho", (short)35));
        disciplina.add(f);

        scanDisciplina("src//Mundial 2000.txt", disciplina);

        // imprimindo os dados
        for (Disciplina d: disciplina){
            d.imprimir();
            System.out.println("\n");
        }

    }

    public static void readDisciplina(String fileName, ArrayList<Disciplina> disciplinas){
        File file = new File(fileName);
        Scanner sc = null;

        try {
            sc = new Scanner(file); // abrindo o arquivo

            // ler os dados do arquivo
            while (sc.hasNextLine()) {
                String line = sc.nextLine(); // ler a linha
                String[] info = line.split("#"); // separar os dados
                Disciplina d = new Disciplina(info[0], info[1]);
                int qntE = Integer.valueOf(info[2]);

                // lendo as linhas de estudantes
                for (int i = 0; i < qntE; i++) {
                    line = sc.nextLine();
                    info = line.split("#");
                    Estudante e = new Estudante(info[0], info[1], Short.valueOf(info[2]));
                    d.adicionarEstudante(e);
                } // for
                disciplinas.add(d); // adicionado a disciplina na lista
            }// while

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            System.out.println(e.getMessage());
        } finally{
            if(sc != null){
                sc.close();
            }
        }
    }

    public static void scanDisciplina(String fileName, ArrayList<Disciplina> disciplinas){
        PrintWriter pw = null;

        try {
            pw = new PrintWriter(fileName);

            // percorrer a lista de disciplina
            for(Disciplina d: disciplinas){
                pw.println(d.getNome() + "#" + d.getProfessor() + "#" + d.qntEstudantes());
                // percorrer a lista de estudante da disciplina
                for(int i = 0; i < d.qntEstudantes(); i++){
                    Estudante e = d.getEstudante(i);
                    pw.println(e.getCpf() + "#" + e.getNome() + "#" + e.getIdade());
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            System.out.println(e.getMessage());
        } finally{
            if(pw != null){
                pw.close();
            }
        }
    }
}
