package co.com.udea.pagosa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/hu-2.feature",
        glue = "co.com.udea.pagosa.stepdefinitions.metodospago",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class MetodoPagoReservaRunner {
    
}
