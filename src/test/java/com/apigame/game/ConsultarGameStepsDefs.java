package com.apigame.game;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class ConsultarGameStepsDefs {


    @Steps
    ConsultarGame consultarGame;

    @When("tengo los parametros platform {string},category {string}")
    public void consultarGame(String platform,String category){
        consultarGame.consultarGame(platform,category);
    }


    @Then("el codigo de respuesta es {int}")
    public void elCodigoDeRespuestaEs(int statusCode) {
        restAssuredThat(response -> response.statusCode(statusCode));
    }
}
