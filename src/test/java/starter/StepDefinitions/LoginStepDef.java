package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;
import starter.Pages.LoginPage;

import static org.junit.Assert.*;

public class LoginStepDef {
    LoginPage loginPage ;
    InventoryPage inventoryPage;
    @Given("I am already on Log in page")
    public void IamAlreadyonLoginPage(){
        loginPage.open();
    }
    @When("I input username {string}")
    public void IinputUsername(String username){
        loginPage.InputUsername(username);
    }
    @And("I input password {string}")
    public void Iinputpassword(String password){
        loginPage.InputPassword(password);
    }
    @And("I click login button")
    public void IClickLoginButton (){
        loginPage.clickButton();

    }


    @Given("I already Logged in")
    public void IalreadyLoggedin(){
        loginPage.open();
        loginPage.InputUsername("standard_user");
        loginPage.InputPassword("secret_sauce");
        loginPage.clickButton();
    }

}
