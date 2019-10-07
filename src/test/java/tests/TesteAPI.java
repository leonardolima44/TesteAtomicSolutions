package tests;


import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

public class TesteAPI {
    @Test
    public void Teste() {
        String uriBase = "https://jsonplaceholder.typicode.com/todos/1";
        given() //Dado que eu pesquisei
                .relaxedHTTPSValidation()
                .when() // Quando eu consultar
                .get(uriBase)
                .then() // A API mostra o dado consultado
                .statusCode(200) // O status http retornado foi 200
                .contentType(ContentType.JSON) // O response foi retornado no formato JSON
                .body("userId", is(1)) // A chave “userId” possui exatamente o valor “1”
                .body("title", containsString("delectus aut autem")); //A chave "title” contém o valor “delectus aut autem”

    }

}