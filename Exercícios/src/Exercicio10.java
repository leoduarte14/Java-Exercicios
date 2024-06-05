import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();
        System.out.print("Digite a operação (adição, subtração, multiplicação ou divisão): ");
        String operacao = scanner.next();
        
        switch (operacao) {
            case "adição":
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case "subtração":
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case "multiplicação":
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case "divisão":
                if (numero2 != 0) {
                    System.out.println("Resultado: " + (numero1 / numero2));
                } else {
                    System.out.println("Erro: Divisão por zero");
                }
                break;
            default:
                System.out.println("Operação inválida");
        }
    }
}
