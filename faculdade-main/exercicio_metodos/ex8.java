public class ex8 {
    public static void main(String[] args) {
        String palavra = "cavalhoAlado";
        System.out.println(palindromo(palavra));
    }


    static boolean palindromo(String palavra) {
        boolean simNao = false;
        String palavraComparacao = PalavraInvertid(palavra);
        if(palavra.equalsIgnoreCase(palavraComparacao)){
            simNao = true;
        }
        return simNao;
    }


    static String PalavraInvertid(String palavra) {
        String PalavraInvertida = "";
        for (int i = palavra.length() -1; i >=0; i--) {
            PalavraInvertida = PalavraInvertida + palavra.charAt(i);
        }
        return PalavraInvertida;
    }


}
