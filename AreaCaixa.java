import java.util.Scanner;

/**
 * Cálculo da Área Total de uma Caixa (Paralelepípedo)
 * Fórmula: A = 2 * (comp*larg + larg*alt + comp*alt)
 */
public class AreaCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("   CÁLCULO DA ÁREA DA CAIXA");
        System.out.println("   (Paralelepípedo)");
        System.out.println("========================================");

        System.out.print("Digite o comprimento (cm): ");
        double comprimento = scanner.nextDouble();

        System.out.print("Digite a largura (cm): ");
        double largura = scanner.nextDouble();

        System.out.print("Digite a altura (cm): ");
        double altura = scanner.nextDouble();

        double area = 2 * (comprimento * largura + largura * altura + comprimento * altura);

        System.out.println();
        System.out.printf("Comprimento : %.2f cm%n", comprimento);
        System.out.printf("Largura     : %.2f cm%n", largura);
        System.out.printf("Altura      : %.2f cm%n", altura);
        System.out.printf("Área Total  : %.2f cm²%n", area);
        System.out.println("========================================");

        scanner.close();
    }
}
