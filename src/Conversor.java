public class Conversor {

    public static double converter(double valor, double taxaOrigem, double taxaDestino) {

        double valorEmUsd = valor / taxaOrigem;

        return valorEmUsd * taxaDestino;
    }
}