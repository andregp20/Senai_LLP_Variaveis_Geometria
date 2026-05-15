import java.util.Scanner;

/**
 * Cálculo da Área do Retângulo
 * Fórmula: A = base * altura
 */
public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   CÁLCULO DA ÁREA DO RETÂNGULO");
        System.out.println("========================================");

        System.out.print("Digite a base (cm): ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura (cm): ");
        double altura = scanner.nextDouble();

        double area = base * altura;

        System.out.println();
        System.out.printf("Base   : %.2f cm%n", base);
        System.out.printf("Altura : %.2f cm%n", altura);
        System.out.printf("Área   : %.2f cm²%n", area);
        System.out.println("========================================");

        scanner.close();
    }
}
