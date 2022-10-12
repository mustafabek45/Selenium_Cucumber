package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.Driver;

public class HepsiBuradaStepDefinition {
    @Given("kullanici {string} sayfasina giderr")
    public void kullaniciSayfasinaGiderr(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);
    }
}
