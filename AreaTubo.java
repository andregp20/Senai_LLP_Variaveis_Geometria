import java.util.Scanner;

/**
 * Cálculo da Área Total de um Tubo (Cilindro)
 * Fórmula: A = 2 * π * raio * (raio + altura)
 */
public class AreaTubo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   CÁLCULO DA ÁREA DO TUBO");
        System.out.println("   (Cilindro)");
        System.out.println("========================================");

        System.out.print("Digite o raio (cm): ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a altura (cm): ");
        double altura = scanner.nextDouble();

        double areaLateral = 2 * Math.PI * raio * altura;
        double areaTampas  = 2 * Math.PI * Math.pow(raio, 2);
        double areaTotal   = areaLateral + areaTampas;

        System.out.println();
        System.out.printf("Raio            : %.2f cm%n", raio);
        System.out.printf("Altura          : %.2f cm%n", altura);
        System.out.printf("Área Lateral    : %.2f cm²%n", areaLateral);
        System.out.printf("Área das Tampas : %.2f cm²%n", areaTampas);
        System.out.printf("Área Total      : %.2f cm²%n", areaTotal);
        System.out.println("========================================");

        scanner.close();
    }
}
