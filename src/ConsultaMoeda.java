import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ConsultaMoeda {

    private String apiKey;

    public ConsultaMoeda(String apiKey) {
        this.apiKey = apiKey;
    }

    public JsonObject obterTaxas() {

        String endereco = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/USD";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest requisicao = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .GET()
                .build();

        try {

            HttpResponse<String> resposta = client.send(
                    requisicao,
                    HttpResponse.BodyHandlers.ofString()
            );

            JsonElement elemento = JsonParser.parseString(resposta.body());
            JsonObject objectRoot = elemento.getAsJsonObject();

            return objectRoot.getAsJsonObject("conversion_rates");

        } catch (Exception e) {
            System.out.println("Erro ao consultar API: " + e.getMessage());
            return null;
        }
    }
}