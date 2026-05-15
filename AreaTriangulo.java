import java.util.Scanner;

/**
 * Cálculo da Área do Triângulo
 * Fórmula: A = (base * altura) / 2
 */
public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   CÁLCULO DA ÁREA DO TRIÂNGULO");
        System.out.println("========================================");

        System.out.print("Digite a base (cm): ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura (cm): ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println();
        System.out.printf("Base   : %.2f cm%n", base);
        System.out.printf("Altura : %.2f cm%n", altura);
        System.out.printf("Área   : %.2f cm²%n", area);
        System.out.println("========================================");

        scanner.close();
    }
}
