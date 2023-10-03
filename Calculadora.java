import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.println("Escolha a operação:");
                System.out.println("1. Soma");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Divisão");
                System.out.println("5. Sair");

                int escolha = scanner.nextInt();
                scanner.nextLine(); // Consuma a quebra de linha

                if (escolha == 5) {
                    System.out.println("Calculadora encerrada.");
                    break;
                }

                System.out.println("Digite o primeiro número:");
                double num1 = scanner.nextDouble();
                scanner.nextLine(); 

                System.out.println("Digite o segundo número:");
                double num2 = scanner.nextDouble();
                scanner.nextLine(); // 

                double resultado = 0;

                switch (escolha) {
                    case 1:
                        resultado = num1 + num2;
                        break;
                    case 2:
                        resultado = num1 - num2;
                        break;
                    case 3:
                        resultado = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            System.out.println("Erro: Divisão por zero!");
                        }
                        break;
                    default:
                        System.out.println("Escolha inválida! Escolha de 1 a 5!");
                }

                System.out.println("Resultado: " + resultado);
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Certifique-se de inserir números válidos.");
                scanner.nextLine(); 
            }
        }

        scanner.close();
    }
}