package com.qvision.screenplay.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class EjemploStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor santiago = Actor.named("Santiago");

    @Before
    public void setup() {
        santiago.whoCan(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^that Santiago opens WordPress website$")
    public void thatSantiagoOpensWordPressWebsite() {
        /*
        Aca ya se puede interactuar con el navegador dado que santiago tiene la habilidad de navegar con chrome
         */
    }
}
