import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];
        String[] arrays = frase.split("/");

        System.out.println("Imovel: " + arrays[0] + " R$" + arrays[1] + " " + arrays[2]);
    }
}

