import java.util.ArrayList;
import java.util.List;

class BasePorto {
    private String nome;
    private List<Barco> barcosAtracados;

    public BasePorto(String nome) {
        this.nome = nome;
        this.barcosAtracados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Barco> getBarcosAtracados() {
        return barcosAtracados;
    }

    public void setBarcosAtracados(List<Barco> barcosAtracados) {
        this.barcosAtracados = barcosAtracados;
    }

    public void atracarBarco(Barco barco) {
        barcosAtracados.add(barco);
        System.out.println(barco.getNome() + " atracado no " + nome);
    }

    public void desatracarBarco(Barco barco) {
        barcosAtracados.remove(barco);
        System.out.println(barco.getNome() + " desatracado do " + nome);
    }
}