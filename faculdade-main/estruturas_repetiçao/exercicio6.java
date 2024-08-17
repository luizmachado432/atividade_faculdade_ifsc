import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner dia = new Scanner(System.in);

        System.out.println("Digite um numero correspondente a um dia da semana (1-7): ");
        int numero = dia.nextInt();
        switch (numero){
            case 1:
                System.out.printf("domingo: assistir um filminho");
            case 2:
                System.out.printf("segunda: caminhada");
            case 3:
                System.out.printf("terça: boliche");
            case 4:
                System.out.printf("quarta: corrida");
            case 5:
                System.out.printf("quinta: nataçao");
            case 6:
                System.out.printf("sexta: tenis");
            case 7:
                System.out.printf("pescar");
            default:
                System.out.printf("escolha um numero de 1 a 7");

        }
    }
}
