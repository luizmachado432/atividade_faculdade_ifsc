import java.util.Scanner;

public class exercicio_5 {
    public static void main(String[] args) {

        Scanner frase = new Scanner(System.in);
        System.out.println("digite uma frase pra substituir os espaços: ");

        String palavra= frase.nextLine();

        String palavra_min = palavra.toLowerCase();

        String substituido = palavra_min.replace( " ", "-" );

        System.out.println(substituido);
    }
}
