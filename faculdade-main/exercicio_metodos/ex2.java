public class ex2 {
    public static void main(String[] args) {
        int[] numeros = {3, 2, 5};
        int soma = 0;
        System.out.println(contaNumero(numeros, soma));
    }
    static int contaNumero(int[] numeros, int soma) {
        for (int i = 0; i < numeros.length; i++) {
            soma = soma + numeros[i];
        }
        return soma;
    }
}
