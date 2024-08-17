import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("digite sua idade para saber sua faixa etaria: ");
        int idade = entrada.nextInt();
        switch (idade){
            case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17:
                System.out.printf("menor de idade");
                break;
            case 18,19,20,21,22,23,24,25:
                System.out.printf("maior de idade");
                break;

            case 26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59:
                System.out.printf("adulto");
                break;
            default:
                System.out.printf("idoso");

        }
    }
}
