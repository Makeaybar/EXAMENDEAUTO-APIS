package com.nttdata.glue;
import org.json.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.json.JSONObject;
import io.restassured.response.Response;
import io.restassured.RestAssured;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.given;


public class POSTConsultarMascota {

    public static void crearPedido(Integer id, Integer petId) {
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", id);
        requestBody.put("petId", petId);
        requestBody.put("quantity", 1);
        requestBody.put("shipDate", "2024-12-17T23:41:38.628Z");
        requestBody.put("status", "placed");
        requestBody.put("complete", true);

        Response response =
                given()
                .relaxedHTTPSValidation()
                .baseUri("https://petstore.swagger.io/v2")
                .header("accept", "application/json")
                .header("Content-Type", "application/json")
                .body(requestBody.toString())
                .post("/store/order")
                .thenReturn();

        if (response.getBody() != null) {
            System.out.println("Response Body: " + response.getBody().asString());
        } else {
            System.out.println("La respuesta no tiene cuerpo");
        }

        Assert.assertEquals(200, response.getStatusCode());
    }
}

