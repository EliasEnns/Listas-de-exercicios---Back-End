import java.util.ArrayList;
import java.util.List;

class Cinema {
    private List<Filme> filmesDisponiveis;
    private List<String> ingressosVendidos;

    public Cinema() {
        filmesDisponiveis = new ArrayList<>();
        ingressosVendidos = new ArrayList<>();
    }

    public void adicionarFilmes() {
        filmesDisponiveis.add(new Filme("Homem Aranha", 25.0, 12));
        filmesDisponiveis.add(new Filme("Mazzaropi - O Jeca Macumbeiro", 200.0, 10));
        filmesDisponiveis.add(new Filme("Todo Mundo Hispânico", 2.5, 18));
        filmesDisponiveis.add(new Filme("O Senhor dos Anéis", 40.0, 14));
        filmesDisponiveis.add(new Filme("Matrix", 35.0, 18));
    }

    public Filme getFilmePorNome(String nome) {
        for (Filme filme : filmesDisponiveis) {
            if (filme.getNome().equalsIgnoreCase(nome)) {
                return filme;
            }
        }
        return null;
    }

    public void venderIngresso(Ingresso ingresso) throws Exception {
        if (ingresso.getCliente().getIdade() < ingresso.getFilme().getIdadeMinima()) {
            throw new Exception("O ingresso não pode ser vendido pois sua idade não permite!");
        }

        if (ingressosVendidos.contains(ingresso.getAssento())) {
            throw new Exception("O ingresso não pode ser vendido pois o assento " + ingresso.getAssento() + " não está mais disponível!");
        }

        ingressosVendidos.add(ingresso.getAssento());
    }
}
