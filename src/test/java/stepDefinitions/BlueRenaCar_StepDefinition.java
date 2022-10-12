package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.BrcPage;
import utilities.Driver;

import java.security.Key;

public class BlueRenaCar_StepDefinition {
    BrcPage brcPage = new BrcPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("kullanici bluerentacar ana sayfasinda")
    public void kullaniciBluerentacarAnaSayfasinda(String istenenUrl) {
        Driver.getDriver().get(istenenUrl);

    }

    @Then("Login yazisina tiklar")
    public void loginYazisinaTiklar() {
        brcPage.loginButton.click();
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        brcPage.emailTextBox.sendKeys("gecersiz@gmail.com");
    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        actions.sendKeys(Keys.TAB).sendKeys("12345").perform();


    }

    @And("Login butonuna basar")
    public void loginButonunaBasar() {
        actions.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
    }

    @Then("sayfaya giris yapilamadigini kontrol eder")
    public void sayfayaGirisYapilamadiginiKontrolEder() {
        Assert.assertTrue(brcPage.ikinciLogin.isDisplayed());
    }

}
