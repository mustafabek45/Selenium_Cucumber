package stepDefinitions;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinition {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon sayfasina gider")
    public void kullaniciAmazonSayfasinaGider() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //Driver.getDriver().findElement(By.xpath("(//*[@class='a-button-input'])[1]")).click();
        //Thread.sleep(2000);
    }


    @And("sayfayi kapatir")
    public void sayfayiKapatir() throws InterruptedException {
        Driver.closeDriver();
        //Thread.sleep(2000);
    }


    @Then("kullanici Selenium icin arama yapar")
    public void kullaniciSeleniumIcinAramaYapar() {
        amazonPage.aramaKutusu.sendKeys("Selenium" + Keys.ENTER);
    }

    @And("sonuclarin Selenium icerdigini test eder")
    public void sonuclarinSeleniumIcerdiginiTestEder() throws InterruptedException {
        String arananKelime = "Selenium";
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() throws InterruptedException {

        amazonPage.aramaKutusu.sendKeys("iphone" + Keys.ENTER);
    }

    @And("sonuclarin iphone icerdigini test eder")
    public void sonuclarinIphoneIcerdiginiTestEder() {
        String arananKelime = "iphone";
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Then("kullanici Nutella icin arama yapar")
    public void kullaniciNutellaIcinAramaYapar() throws InterruptedException {

        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }

    @And("sonuclarin Nutella icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() throws InterruptedException {
        String arananKelime = "Nutella";
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();

        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));
    }

    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String arananKelime) {
        amazonPage.aramaKutusu.sendKeys(arananKelime,Keys.ENTER);

    }

    @And("sonuclarin {string} icerdigini test eder")
    public void sonuclarinIcerdiginiTestEder(String arananKelime) {
        String actualAramaSonucStr = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucStr.contains(arananKelime));

    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String arananUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(arananUrl));
    }

    @When("Url'nin {string} icerdigini test edin")
    public void urlNinIcerdiginiTestEdin(String istenenUrl) {
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenUrl));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int beklemeSuresi)  {
        try {
            Thread.sleep(beklemeSuresi*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
