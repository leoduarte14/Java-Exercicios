import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        
        if (numero >= 0) {
            System.out.println("A raiz quadrada do número é: " + Math.sqrt(numero));
        } else {
            System.out.println("O quadrado do número é: " + (numero * numero));
        }
    }
}
