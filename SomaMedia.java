import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            soma += scanner.nextInt();
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + (soma / 5.0));
        scanner.close();
    }
}