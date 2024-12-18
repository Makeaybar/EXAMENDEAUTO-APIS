package com.nttdata.Task;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import org.junit.Assert;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GETConsultarPedido {

        public static void consultarPedido(Integer orden) {
            Response response = given()
                    .relaxedHTTPSValidation()
                    .baseUri("https://petstore.swagger.io/v2")
                    .get("/store/order/" + orden)
                    .then()
                    .extract().response();
            if (response.getBody() != null) {
                System.out.println("Response Body: " + response.getBody().asString());
            } else {
                System.out.println("La respuesta no tiene cuerpo");
            }

            Assert.assertEquals(200, response.getStatusCode());
        }
    }