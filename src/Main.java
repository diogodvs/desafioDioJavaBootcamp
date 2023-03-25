import br.com.dio.desafio.*;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java",
                "Descricao curso java poo",
                10);

        Curso curso2 = new Curso("Curso nodeJs",
                "descrição curso de nodeJs",
                10);

        Mentoria mentoria1 = new Mentoria("Mentoria Java POO",
                "Mentoria para tirar duvidas sobre Java POO");

        Bootcamp bootcamp = new Bootcamp(
                "Bootcamp Back-End Developer",
                "Bootcamp abordará as tecnologias nodeJs e Java POO");
                bootcamp.getConteudos().add(curso1);
                bootcamp.getConteudos().add(curso2);
                bootcamp.getConteudos().add(mentoria1);

                Dev dev1 = new Dev("Diogo Silva");
                dev1.inscreverBootcamp(bootcamp);
                System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
                dev1.progredir();

                System.out.println("-");
                System.out.println("Conteudos Inscritos: " + dev1.getConteudosInscritos());
                System.out.println("Conteudos Concluidos: " + dev1.getConteudosConcluidos());
                System.out.println("XP: " + dev1.calcularTotalXp());

                System.out.println("-----------------");

                Dev dev2 = new Dev("Bianca Gomes");
                dev2.inscreverBootcamp(bootcamp);
                dev2.imprimirDev();

    }
}