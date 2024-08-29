//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;  // Import the Scanner class

import static java.lang.Boolean.FALSE;
import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
                                        // Comédia ou Drama
        String[][] filmeSugerido = {{"Spaceballs","Rick and Morty"},// Scifi
                                    {"Mazzaropi - O Jeca Macumbeiro","Ironclad"}};//Medieval

        int[] escolha = {0,0};
        boolean entradaValida = FALSE;

        try{
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Pergunta 1: Que ambientação você prefere?\n1. Sci-fi\n2. Medieval");

            int userInput = Integer.parseInt(myObj.nextLine());
            entradaValida = (userInput == 1) | (userInput == 2);
            if(!entradaValida){
                throw new RuntimeException("entrada inválida");
            }
            escolha[0] = userInput - 1;
        } catch (Exception e) {
            System.out.println("ah, sei lá, assiste Todo Mundo Hispânico, é bem legal");
            System.exit(0);
        }

        try{
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Pergunta 2: Que gênero você prefere?\n1. Comédia\n2. Drama");

            int userInput = Integer.parseInt(myObj.nextLine());
            entradaValida = (userInput == 1) | (userInput == 2);
            if(!entradaValida){
                throw new RuntimeException("entrada inválida");
            }
            escolha[1] = userInput - 1;
        } catch (Exception e) {
            System.out.println("ah, sei lá, assiste Todo Mundo Hispânico, é bem legal");
            System.exit(0);
        }

        System.out.println("Então você realmente deveria assistir: " + filmeSugerido[escolha[0]][escolha[1]]);


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}