package com.qvision.screenplay.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class OtroEjemploDeHabilidades {
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    @Before
    public void setup() {
        /*
        Esta primera linea nos brinda la habilidad por defecto de navegar con firefox, si especificamos chrome
        el serenity.conf o serenity.properties settea la habilidad con ese browser, en este caso no habria que especificar el driver.
         */
        OnStage.setTheStage(new OnlineCast());
        /*
        Si necesitamos mas habilidades las podamos realizar de la siguiente manera
         */
        Cast cast = new OnlineCast();
        cast.actorNamed("Santiago", BrowseTheWeb.with(hisBrowser), CallAnApi.at("Endpoint Servicio"));
        OnStage.setTheStage(cast);
        /*
        si necesitamos que todos los actores tengan las mismas habilidades
         */
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(hisBrowser), CallAnApi.at("Endpoint servicio")));

    }

}
