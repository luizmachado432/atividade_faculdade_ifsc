public class ex3 {
    public static void main(String[] args) {
        int[] notas = {5,2,7,5};
        double media = 0;
        System.out.println(calcularMedia(notas, media ));

    }

    static double calcularMedia(int[] notas, double media) {
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];

        }
        media = media / notas.length;
        return media;
    }

}
