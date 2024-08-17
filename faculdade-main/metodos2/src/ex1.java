import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(calculadorDeArea(entrada));
    }

    static double calculadorDeArea(Scanner entrada){
        System.out.println("Digite um valor para largura: ");
        double largura = entrada.nextDouble();
        System.out.println("Digite um valor para altura: ");
        double altura = entrada.nextDouble();
        double area = largura * altura;

        return area;
    }

}
