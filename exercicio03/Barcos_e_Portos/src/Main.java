import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando barcos
        Barco barco1 = new Barco("Barco 1", 2);
        Barco barco2 = new Barco("Barco 2", 5);
        Barco barco3 = new Barco("Barco 3", 7);
        Barco barco4 = new Barco("Barco 4", 12);
        Barco barco5 = new Barco("Barco 5", 20);

        // Criando portos
        PortoPequeno portoPequeno = new PortoPequeno("Porto Pequeno");
        PortoGrande portoGrande = new PortoGrande("Porto Grande");

        // Lista de barcos
        List<Barco> barcos = new ArrayList<>();
        barcos.add(barco1);
        barcos.add(barco2);
        barcos.add(barco3);
        barcos.add(barco4);
        barcos.add(barco5);

        // Tentando atracar barcos
        for (Barco barco : barcos) {
            portoPequeno.atracarBarco(barco); // Tenta primeiro no porto pequeno
            if (!portoPequeno.getBarcosAtracados().contains(barco)) {
                portoGrande.atracarBarco(barco); // Se não cabe, tenta no porto grande
            }
        }
    }
}