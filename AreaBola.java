import java.util.Scanner;

/**
 * Cálculo da Área Total de uma Bola (Esfera)
 * Fórmula: A = 4 * π * raio²
 */
public class AreaBola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   CÁLCULO DA ÁREA DA BOLA");
        System.out.println("   (Esfera)");
        System.out.println("========================================");

        System.out.print("Digite o raio (cm): ");
        double raio = scanner.nextDouble();

        double area = 4 * Math.PI * Math.pow(raio, 2);

        System.out.println();
        System.out.printf("Raio : %.2f cm%n", raio);
        System.out.printf("π    : %.6f%n", Math.PI);
        System.out.printf("Área : %.2f cm²%n", area);
        System.out.println("========================================");

        scanner.close();
    }
}
