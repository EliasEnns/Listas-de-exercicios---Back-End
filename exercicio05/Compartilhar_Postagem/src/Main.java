import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o título da postagem:");
            String titulo = scanner.nextLine();

            System.out.println("Digite a descrição da postagem:");
            String descricao = scanner.nextLine();

            System.out.println("Digite o tipo da postagem (texto, imagem, video):");
            String tipo = scanner.nextLine();

            Postagem postagem = new Postagem(titulo, descricao, tipo);

            // Testando MyBook
            MyBook myBook = new MyBook();
            System.out.println("\n--- Testando MyBook ---");
            myBook.compartilharPostagem(postagem);
            myBook.compartilharImagem(postagem);
            myBook.compartilharVideo(postagem);

            // Testando Fotogram
            Fotogram fotogram = new Fotogram();
            System.out.println("\n--- Testando Fotogram ---");
            fotogram.compartilharPostagem(postagem); // Gera exceção
            fotogram.compartilharImagem(postagem);
            fotogram.compartilharVideo(postagem);

            // Testando AnyTube
            AnyTube anyTube = new AnyTube();
            System.out.println("\n--- Testando AnyTube ---");
            anyTube.compartilharPostagem(postagem);
            anyTube.compartilharImagem(postagem); // Gera exceção
            anyTube.compartilharVideo(postagem);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
