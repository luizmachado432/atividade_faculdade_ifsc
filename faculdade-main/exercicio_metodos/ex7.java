public class ex7 {
    public static void main(String[] args) {
        String palavra = "cavalhoVoador";
        System.out.println(PalavraInvertid(palavra));
    }

    static String PalavraInvertid(String palavra) {
        String PalavraInvertida = "";
        for (int i = palavra.length() -1; i >=0; i--) {
            PalavraInvertida = PalavraInvertida + palavra.charAt(i);
        }
        return PalavraInvertida;
    }

}
