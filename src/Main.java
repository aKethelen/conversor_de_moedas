import java.util.Scanner;
import com.google.gson.JsonObject;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String apiKey = "0c66f36539c0c307de32f796";

        ConsultaMoeda consulta = new ConsultaMoeda(apiKey);

        JsonObject taxas = consulta.obterTaxas();

        if (taxas == null) {
            System.out.println("Nao foi possivel obter as taxas de cambio.");
            scanner.close();
            return;
        }

        double ars = taxas.get("ARS").getAsDouble();
        double bob = taxas.get("BOB").getAsDouble();
        double brl = taxas.get("BRL").getAsDouble();
        double usd = taxas.get("USD").getAsDouble();

        int opcao = 0;

        while (opcao != 7) {

            System.out.println("\n*************************************************");
            System.out.println("Seja bem-vinda ao Conversor de Moedas");
            System.out.println("1 - Dolar => Peso argentino");
            System.out.println("2 - Peso argentino => Dolar");
            System.out.println("3 - Dolar => Real brasileiro");
            System.out.println("4 - Real brasileiro => Dolar");
            System.out.println("5 - Dolar => Peso boliviano");
            System.out.println("6 - Peso boliviano => Dolar");
            System.out.println("7 - Sair");
            System.out.println("*************************************************");

            System.out.print("Escolha uma opcao valida: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Digite apenas numeros.");
                scanner.nextLine();
                continue;
            }

            opcao = scanner.nextInt();

            if (opcao == 7) {
                System.out.println("Encerrando o programa...");
                break;
            }

            if (opcao < 1 || opcao > 7) {
                System.out.println("Opcao invalida.");
                continue;
            }

            System.out.print("Digite o valor que deseja converter: ");

            if (!scanner.hasNextDouble()) {
                System.out.println("Digite um valor numerico valido.");
                scanner.nextLine();
                continue;
            }

            double valor = scanner.nextDouble();
            double resultado = 0;

            switch (opcao) {

                case 1:
                    resultado = Conversor.converter(valor, usd, ars);
                    System.out.printf("Valor %.2f [USD] corresponde ao valor final de =>>> %.2f [ARS]%n",
                            valor, resultado);
                    break;

                case 2:
                    resultado = Conversor.converter(valor, ars, usd);
                    System.out.printf("Valor %.2f [ARS] corresponde ao valor final de =>>> %.2f [USD]%n",
                            valor, resultado);
                    break;

                case 3:
                    resultado = Conversor.converter(valor, usd, brl);
                    System.out.printf("Valor %.2f [USD] corresponde ao valor final de =>>> %.2f [BRL]%n",
                            valor, resultado);
                    break;

                case 4:
                    resultado = Conversor.converter(valor, brl, usd);
                    System.out.printf("Valor %.2f [BRL] corresponde ao valor final de =>>> %.2f [USD]%n",
                            valor, resultado);
                    break;

                case 5:
                    resultado = Conversor.converter(valor, usd, bob);
                    System.out.printf("Valor %.2f [USD] corresponde ao valor final de =>>> %.2f [BOB]%n",
                            valor, resultado);
                    break;

                case 6:
                    resultado = Conversor.converter(valor, bob, usd);
                    System.out.printf("Valor %.2f [BOB] corresponde ao valor final de =>>> %.2f [USD]%n",
                            valor, resultado);
                    break;

                default:
                    System.out.println("Opcao invalida.");
                    break;
            }
        }

        scanner.close();
    }
}