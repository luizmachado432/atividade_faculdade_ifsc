import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(contador(input));
    }
    static int contador(Scanner input){
        System.out.println("digite um numero com mais de 2 casas:");
        int soma = 0;
        int num1 = input.nextInt();

        while (num1 != 0){
            if(num1%10!=0){
            int num2 = num1%10;
            soma = soma + num2;
            num1 = num1/10;
            }else
                break;
        }
            
        return soma;
    }
}
