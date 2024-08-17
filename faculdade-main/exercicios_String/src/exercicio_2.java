import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("digite sua palavra pra verificar se é um palindromo: ");

        String palavra = entrada.nextLine().toLowerCase().replace(" ", "");

        String palavraInvertida = new StringBuilder(palavra).reverse().toString().toLowerCase();

        boolean verdadeiroFalso = false;

        if (palavra.equals(palavraInvertida)) {
            verdadeiroFalso = true;
        }


        System.out.println(verdadeiroFalso);


    }
}
