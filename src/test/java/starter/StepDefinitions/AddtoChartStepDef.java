package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;
import starter.Pages.LoginPage;
import static org.junit.Assert.*;


public class AddtoChartStepDef {
    LoginPage loginPage ;
    InventoryPage inventoryPage;
    CartPage cartPage;
    @When("I select item {string}")
    public void Iselectitem(String item){
        inventoryPage.selectItem(item);
    }
    @Then("Show {string} on cart page")
    public void add1itemonchart(String produk){
        assertEquals(produk,cartPage.getSelectedProduct());

    }
    @And("I already add 2 product to cart")
    public void ialreadyaddproduct(){
        inventoryPage.selectItem("add-to-cart-test.allthethings()-t-shirt-(red)");
        inventoryPage.selectItem("add-to-cart-sauce-labs-bolt-t-shirt");

    }

}
