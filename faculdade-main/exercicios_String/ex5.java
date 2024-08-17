public class ex5 {
    public static void main(String[] args) {

        String palavra = "cavalo";
        int numerosVogais= 0;
        System.out.println(contaVogais(palavra,numerosVogais));
    }

    static int contaVogais (String palavra, int numerosVogais){
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                numerosVogais++;
            }
        }
        return numerosVogais;
    }
}
