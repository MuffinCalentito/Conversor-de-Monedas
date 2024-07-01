import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BuscarMoneda {
    public Moneda buscarMoneda(String monedaIn, String monedaOut){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/c51a7cebca280a880ef5afd5/pair/"+monedaIn+"/"+monedaOut);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        }
        catch(Exception e){
            throw new RuntimeException("No se encontró la moneda");
        }
    }
}
