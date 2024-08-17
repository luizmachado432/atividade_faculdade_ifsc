import java.util.Locale;
import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {

        Scanner frase = new Scanner(System.in);
        System.out.println("digite uma frase pra compactar: ");

        String compactador= frase.nextLine();

        String compactador_min = compactador.toLowerCase();

        String compactadp = compactador_min.replace( " ", "" );

        System.out.println(compactadp);

    }
}
