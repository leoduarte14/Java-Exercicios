import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero > 100) {
            System.out.println("O número é maior que 100.");
        } else {
            System.out.println("O dobro do número é: " + (numero * 2));
        }
    }
}
