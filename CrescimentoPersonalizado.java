import java.util.Scanner;

public class CrescimentoPersonalizado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int populacaoA, populacaoB, anos = 0;
        double taxaA, taxaB;

        System.out.print("Digite a população inicial do país A: ");
        populacaoA = scanner.nextInt();

        System.out.print("Digite a taxa de crescimento anual do país A (%): ");
        taxaA = scanner.nextDouble() / 100;

        System.out.print("Digite a população inicial do país B: ");
        populacaoB = scanner.nextInt();

        System.out.print("Digite a taxa de crescimento anual do país B (%): ");
        taxaB = scanner.nextDouble() / 100;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
        }

        System.out.println("Número de anos necessários: " + anos);
        scanner.close();
    }
}