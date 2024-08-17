public class ex4 {
    public static void main(String[] args) {

        int[] numeros = {4,19,3,8};
        int maiorNumero = numeros[0];
        System.out.println(pegaMaior(numeros, maiorNumero));
    }


    static int pegaMaior(int [] numeros, int maiorNumero){

        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }
        }
        return maiorNumero;
    }

}
