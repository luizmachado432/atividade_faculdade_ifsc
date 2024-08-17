import java.util.Locale;
import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        System.out.println("digita sua palavra pra contar vogais: ");
        Scanner entrada = new Scanner(System.in);
        int contador = 0;
        String palavra = entrada.nextLine();
        String palavra_min =palavra.toLowerCase();

        for (int i = 0; i < palavra.length(); i++) {

            if (palavra.charAt(i) == 'a') {
                contador++;
            }
            else if (palavra.charAt(i) == 'e') {
                contador++;
            }
            else if (palavra.charAt(i) == 'i') {
                contador++;
            }
            else if (palavra.charAt(i) == 'o') {
                contador++;
            }
            else if (palavra.charAt(i) == 'u') {
                contador++;
            }

        }
        System.out.println(contador);
    }

}
