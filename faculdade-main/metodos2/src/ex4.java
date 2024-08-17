import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("a area do circulo vai ser "+ calcularArea(entrada));
    }

    static double calcularArea(Scanner entrada) {
        double perimetro = calculadorDePerimetro(entrada);
        double area = (perimetro*perimetro) / (4*3.14) ;
        return area;
    }

    static Double calculadorDePerimetro(Scanner entrada){
        System.out.println("digite o raio do circulo");
        double raio = entrada.nextDouble();
        double perimetro = 2*raio*3.14;
        return perimetro;
    }
}

