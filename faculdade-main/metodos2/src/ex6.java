import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" O divisor comum de é = "+ calculadorDeDivisor(sc));
    }
    static int calculadorDeDivisor(Scanner sc){
        System.out.println("digite os 2 numeros ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int divisorComum =0;
        int divisor = 0;

        while (n1 > divisor ){
            while (n2 > divisor ){
            divisor ++;

            if (n1%divisor == 0 ){
                if (n2%divisor == 0){
                    divisorComum = divisor;
                }
            }
        }
            break;
    }
        return divisorComum;
    }
}
