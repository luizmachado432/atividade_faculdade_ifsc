import java.util.Date;
import java.util.Deque;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner teste = new Scanner(System.in);
        System.out.printf("digite um numero de 1 a 7 para saber seu correspondente no dia da semana: ");
        String n = teste.nextLine();
        System.out.println(n);

        switch (n){
            case "1":
                System.out.printf("domingo");
                break;
            case "2":
                System.out.printf("segunda");
                break;
            case "3":
                System.out.printf("terça");
                break;
            case "4":
                System.out.printf("quarta");
                break;
            case "5":
                System.out.printf("quinta");
                break;
            case "6":
                System.out.printf("sexta");
                break;
            case "7":
                System.out.printf("sabado");
                break;
            default:
                System.out.printf("escolha um numero dentro da margem");
                break;
        }

    }
}
