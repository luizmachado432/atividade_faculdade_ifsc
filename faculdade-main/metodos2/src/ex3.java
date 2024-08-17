import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println(calculadorDePerimetro(entrada));

    }
    static Double calculadorDePerimetro(Scanner entrada){
        System.out.println("digite o raio do circulo");
        double raio = entrada.nextDouble();
        double perimetro = 2*raio*3.14;
        return perimetro;
    }
}
