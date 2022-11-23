package Calling;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Call {
    private static String query;
    public static void GetFoodByName() {
       try {
           HttpRequest request = HttpRequest.newBuilder()
                   .uri(URI.create("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/food/search?query="+query+"&offset=0&number=1"))
                   .header("X-RapidAPI-Key", "28ca9e41f4msh0a7cc03115bcc91p135a40jsne709641fb97c")
                   .header("X-RapidAPI-Host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
                   .method("GET", HttpRequest.BodyPublishers.noBody())
                   .build();
           HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());

           //declarative programming style
           var result = response.body();
           var res = result.split(",");
           Arrays.stream(res)
                   .forEach(item -> System.out.println(item.toString()));
       } catch (IOException e) {
           throw new RuntimeException(e);
       } catch (InterruptedException e) {
           throw new RuntimeException(e);
       }
    }
}
