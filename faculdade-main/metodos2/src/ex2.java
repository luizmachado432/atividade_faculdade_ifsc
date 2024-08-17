import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(calculadorDeArea(entrada));
    }
    static double calculadorDeArea(Scanner entrada){
        System.out.println("Digite o tamanho dos lados do quadrado: ");
        double lado = entrada.nextDouble();
        double area = lado * lado;

        return area;
    }
}
