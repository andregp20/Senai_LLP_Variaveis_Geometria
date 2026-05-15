import java.util.Scanner;

/**
 * Cálculo da Área do Círculo
 * Fórmula: A = π * raio²
 */
public class AreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   CÁLCULO DA ÁREA DO CÍRCULO");
        System.out.println("========================================");

        System.out.print("Digite o raio (cm): ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println();
        System.out.printf("Raio : %.2f cm%n", raio);
        System.out.printf("π    : %.6f%n", Math.PI);
        System.out.printf("Área : %.2f cm²%n", area);
        System.out.println("========================================");

        scanner.close();
    }
}
