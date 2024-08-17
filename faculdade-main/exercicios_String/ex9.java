import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int [3];
        System.out.println(fill(numeros,sc));
    }

    static int fill(int numeros, Scanner sc){
        for(int i = 0; i < numeros; i++) {
            numeros[i]=sc.nextInt();

        }

        return numeros;
    }
}
