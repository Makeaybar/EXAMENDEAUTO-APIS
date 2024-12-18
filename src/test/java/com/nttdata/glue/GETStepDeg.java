package com.nttdata.glue;

import com.nttdata.Task.GETConsultarPedido;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.junit.Assert;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GETStepDeg {
        @When("consulto un pedido de orden {int}")
        public void consultoUnPedidoDeOrden(Integer orden) {
            GETConsultarPedido.consultarPedido(orden);
        }

    @When("^consulto la mascota con ID (\\d+) y petId (\\d+)$")
    public void consultoLaMascotaConID(Integer id, Integer petId) {
        POSTConsultarMascota.crearPedido(id,petId);
    }
}

