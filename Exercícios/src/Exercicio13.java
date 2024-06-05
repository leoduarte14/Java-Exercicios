import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        System.out.print("Digite a categoria do cliente (1 - Comum, 2 - Associado, 3 - VIP): ");
        int categoria = scanner.nextInt();
        
        double valorFinal;
        
        switch (categoria) {
            case 1:
                valorFinal = valorCompra;
                break;
            case 2:
                valorFinal = valorCompra * 0.90;
                break;
            case 3:
                valorFinal = valorCompra * 0.80;
                break;
            default:
                valorFinal = valorCompra;
                System.out.println("Categoria inválida. Sem desconto aplicado.");
        }
        
        System.out.println("Valor final da compra: " + valorFinal);
    }
}
