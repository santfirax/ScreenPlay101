package com.qvision.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src//test//resources//features//log_in_wordpress.feature",
        glue = "com.qvision.screenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class LogInWordPressRunner {
}
