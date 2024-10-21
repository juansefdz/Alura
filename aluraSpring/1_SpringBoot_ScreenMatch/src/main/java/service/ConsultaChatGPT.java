package service;



import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;
import io.github.cdimascio.dotenv.Dotenv;

public class ConsultaChatGPT {

    // Cargar las variables del archivo .env
    private final Dotenv dotenv = Dotenv.load();
    private final String URL_BASE = dotenv.get("API_KEY_OPENAI");


    public static String obtenerTraduccion(String texto) {
        OpenAiService service = new OpenAiService(System.getenv("API_KEY_OPENAI"));


        CompletionRequest requisicion = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduce a español el siguiente texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();


        var respuesta = service.createCompletion(requisicion);
        return respuesta.getChoices().get(0).getText();
    }
}