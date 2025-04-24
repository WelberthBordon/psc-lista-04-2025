import java.util.Scanner;

public class IntervaloNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int fim = scanner.nextInt();

        for (int i = inicio; i <= fim; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}