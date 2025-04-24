public class CrescimentoPopulacional {
    public static void main(String[] args) {
        int populacaoA = 80000, populacaoB = 200000, anos = 0;
        double taxaA = 0.03, taxaB = 0.015;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
        }

        System.out.println("Número de anos necessários: " + anos);
    }
}