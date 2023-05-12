import nopcommerce.demo.reg.base.BasePage;
import nopcommerce.demo.reg.pages.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterTestPage {

    WebDriver driver;
    BasePage basePage;
    Properties prop = new Properties();
    RegisterPage RegisterPage;

   @Test(priority = 1)
    public void openBrowser(){
        basePage = new BasePage();
        prop = basePage.initialiseProperties();
        String webEngine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(webEngine);
       //driver.get(prop.getProperty());
        driver.get(prop.getProperty("url"));
        RegisterPage = new RegisterPage(driver);

        }
     @Test(priority = 2)
    public void registrationTest(){
        RegisterPage.clickOnRegisterLink();
        RegisterPage.getPageTitle();
        RegisterPage.doRegistration(prop.getProperty("firstname"),prop.getProperty("lastname"),prop.getProperty("dateOfBirth"),prop.getProperty("monthOfBirth"),prop.getProperty("yearOfBirth"),prop.getProperty("email"),prop.getProperty("companyName"),prop.getProperty("password"),prop.getProperty("confirmPassword"));

    }

    @Test(priority = 3)
    public void closeBrowser(){
        driver.close();
    }




}
