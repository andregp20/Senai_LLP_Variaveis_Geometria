import java.util.Scanner;

/**
 * Cálculo da Área Total de uma Pirâmide de Base Quadrada
 * Fórmula: A = base² + 2 * base * apótema
 * Apótema = sqrt((base/2)² + altura²)
 */
public class AreaPiramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   CÁLCULO DA ÁREA DA PIRÂMIDE");
        System.out.println("   (Base Quadrada)");
        System.out.println("========================================");

        System.out.print("Digite o lado da base (cm): ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura (cm): ");
        double altura = scanner.nextDouble();

        double apotema    = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(altura, 2));
        double areaBase   = Math.pow(base, 2);
        double areaLateral = 2 * base * apotema;
        double areaTotal  = areaBase + areaLateral;

        System.out.println();
        System.out.printf("Lado da base : %.2f cm%n", base);
        System.out.printf("Altura       : %.2f cm%n", altura);
        System.out.printf("Apótema      : %.4f cm%n", apotema);
        System.out.printf("Área Total   : %.2f cm²%n", areaTotal);
        System.out.println("========================================");

        scanner.close();
    }
}
