package Conversor;

import java.util.Scanner;

public class ConversorDeTemperatura { // Classe principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //
        int opcao; // Declara a variável que armazenará a escolha do menu

        // Início do laço que exibe o menu e executa as conversões até o usuário escolher sair
        do {
            // Exibe o menu de opções
            System.out.println("\n=== Escolha uma das opções ===\n");
            System.out.println("1 - Celsius para Fahrenheit");
            System.out.println("2 - Fahrenheit para Celsius");
            System.out.println("0 - Sair");
            System.out.println("\nDigite a opção desejada:");

            opcao = scanner.nextInt(); // Lê a opção escolhida pelo usuário

            // Estrutura switch para tratar a escolha do usuário
            switch (opcao) {

                case 0: // Caso o usuário escolha sair
                    System.out.println("Você saiu com sucesso.");
                    break;

                case 1: // Conversão de Celsius para Fahrenheit
                    System.out.println("Digite a temperatura em Celsius: ");
                    double celsius = scanner.nextDouble(); // Lê a temperatura em Celsius
                    double fahrenheit = (celsius * 9 / 5) + 32; // Converte para Fahrenheit
                    System.out.println(celsius + " graus Celsius é igual a " + fahrenheit + " graus Fahrenheit.");
                    break;

                case 2: // Conversão de Fahrenheit para Celsius
                    System.out.println("Digite a temperatura em Fahrenheit: ");
                    fahrenheit = scanner.nextDouble(); // Lê a temperatura em Fahrenheit
                    celsius = (fahrenheit - 32) * 5 / 9; // Converte para Celsius
                    System.out.println(fahrenheit + " graus Fahrenheit é igual a " + celsius + " graus Celsius.");
                    break;

                default: // Caso o usuário digite uma opção inválida
                    System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 0.");
                    break;
            }
        } while (opcao != 0); // Continua exibindo o menu até o usuário escolher sair (opção 0)

        scanner.close(); // Fecha o scanner para liberar os recursos
    }
}
