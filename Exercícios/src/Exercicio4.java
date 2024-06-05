import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro lado do triângulo: ");
        int lado1 = scanner.nextInt();
        System.out.print("Digite o segundo lado do triângulo: ");
        int lado2 = scanner.nextInt();
        System.out.print("Digite o terceiro lado do triângulo: ");
        int lado3 = scanner.nextInt();
        
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados formam um triângulo válido.");
        } else {
            System.out.println("Os lados não formam um triângulo válido.");
        }
    }
}
