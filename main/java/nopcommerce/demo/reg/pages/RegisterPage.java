package nopcommerce.demo.reg.pages;

import nopcommerce.demo.reg.utilities.Constant;
import nopcommerce.demo.reg.utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;
    Utils utils;


 // Create page object/ Object repository in the form of by locator

    By registerLink = By.className("ico-register");
    By gender = By.className("male");
    By firstname = By.id("FirstName");
    By lastname = By.id("LastName");
    By dayOfBirth = By.name("DateOfBirthDay");
    By monthOfBirth = By.name("DateOfBirthMonth");
    By yearOfBirth = By.name("DateOfBirthYear");
    By email = By.id("Email");
    By company = By.xpath("//*[@id=\"Company\"]");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");

    // Create a constructor of page class

    public RegisterPage(WebDriver driver){
        this.driver = driver;
        utils = new Utils(driver);
    }

    // page Actions

    public void clickOnRegisterLink(){
        utils.doClick(registerLink);
    }
    public String getPageTitle(){
        return utils.waitForTitlePresent(10, Constant.REGISTER_PAGE_TITLE);
    }
    public void doRegistration(String Firstname,String Lastname,String DayOfBirth,String MonthOfBirth,String YearOfBirth,String Email,String CompanyName,String Password,String ConfirmPassword) {
        utils.doClick(gender);
        utils.doSendKey(firstname,Firstname);
        utils.doSendKey(lastname,Lastname);
        utils.doSendKey(dayOfBirth,DayOfBirth);
        utils.doSendKey(monthOfBirth,MonthOfBirth);
        utils.doSendKey(yearOfBirth,YearOfBirth);
        utils.doSendKey(email,Email);
        utils.doSendKey(company,CompanyName);
        utils.doSendKey(password,Password);
        utils.doSendKey(confirmPassword,ConfirmPassword);
        utils.doClick(registerButton);
    }












}
