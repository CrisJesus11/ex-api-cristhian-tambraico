package com.apigame.game;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class ConsultarGame {

    private static String SEARCH_GAMES = "https://www.freetogame.com/api/games";

    @Step("Crear game")
    public void consultarGame(String platform,String category){
        SerenityRest.given()
                .pathParam("platform",platform)
                .pathParam("category",category)
                .get(SEARCH_GAMES);
    }
}
