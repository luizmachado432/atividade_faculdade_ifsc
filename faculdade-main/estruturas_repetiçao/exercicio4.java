import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner genero = new Scanner(System.in);
        System.out.printf("escolha um genero entre: \n terror=T \n comedia=C \n açao=A \n aventura=AV: ");
        String tipos = genero.nextLine();


        switch (tipos){
            case "T":
                System.out.printf("recomendo 'I.T a coisa'");
                break;
            case "C":
                System.out.printf("recomendo 'Gente grande 2'");
                break;
            case "A":
                System.out.printf("recomendo 'Esquadrao 6'");
                break;
            case "AV":
                System.out.printf("recomendo 'As aventuras de Pi'");
                break;
            default:
                System.out.printf("escolha um genero dentro do catalogo");







        }
    }
}
