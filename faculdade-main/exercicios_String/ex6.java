import java.util.Scanner;

class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o caractere a ser contado: ");
        char caracter = scanner.next().charAt(0); // Lê o primeiro caractere da entrada
        String palavra = "cavalovoador";

        int numerosLetras = contadorDeCaracteres(palavra, caracter);

        System.out.println("Número de ocorrências do caractere: " + numerosLetras);
    }

    static int contadorDeCaracteres(String palavra, char caracter) {
        int numerosLetras = 0;

        for (int i = 0; i < palavra.length(); i++) {
            if (caracter == palavra.charAt(i)) {
                numerosLetras++;
            }
        }

        return numerosLetras;
    }
}

