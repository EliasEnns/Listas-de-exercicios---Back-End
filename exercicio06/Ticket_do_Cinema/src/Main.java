import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criação do cinema e adição de filmes
        Cinema cinema = new Cinema();
        cinema.adicionarFilmes();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Que filme você deseja assistir?");
                String nomeFilme = scanner.nextLine();
                Filme filme = cinema.getFilmePorNome(nomeFilme);

                if (filme == null) {
                    throw new Exception("Filme não encontrado!");
                }

                System.out.println("Qual assento você deseja?");
                String assento = scanner.nextLine();

                System.out.println("Qual o seu nome?");
                String nomeCliente = scanner.nextLine();

                System.out.println("Qual a sua idade?");
                int idadeCliente = Integer.parseInt(scanner.nextLine());

                Cliente cliente = new Cliente(nomeCliente, idadeCliente);

                Ingresso ingresso = new Ingresso(cliente, filme, assento);
                cinema.venderIngresso(ingresso);

                System.out.println("Ingresso vendido com sucesso! " + filme.getNome() + " - " + assento + " - " + nomeCliente);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
