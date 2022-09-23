package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;
import static org.junit.Assert.*;


public class InventoryPageStepDef {
    InventoryPage inventoryPage;
    CartPage cartPage;
    @Then("I redirected to inventory page")
    public void IRedirectedtoInventoryPage(){
        assertEquals("https://www.saucedemo.com/inventory.html",inventoryPage.getUrl());
        assertEquals("PRODUCTS",inventoryPage.getheaderTittle());
        assertTrue(inventoryPage.isChartVisible());
    }
    @When("I click filter by {string}")
    public void i_click_filter_by(String string) {
        inventoryPage.selectSortBy(string);
    }

    @Then("Product filtered by {string}")
    public void product_filtered_by(String string) {

        assertEquals(string, inventoryPage.getActiveSort());
    }

    @When("I click cart icon")
    public void i_click_cart_icon() {
        inventoryPage.clickCharticon();

    }

    @Then("I redirected to chart page")
    public void i_redirected_to_chart_page() {
        assertEquals("YOUR CART",cartPage.getheaderTittle());
        assertEquals("https://www.saucedemo.com/cart.html",inventoryPage.getUrl());

    }

    @And("I already on cart page")
    public void i_already_on_cart_page() {
        inventoryPage.clickCharticon();
    }

    @When("I click remove item")
    public void i_click_remove_item() {
       cartPage.clickRemove();
    }



    @Then("Show {} item on cart page")
    public void show_item_on_chat_page(String number ) {
        assertEquals(number,cartPage.numberOfcart());
    }
    @And("I on cart page")
    public void i_on_cart_page() {
        inventoryPage.clickCharticon();
    }
    @When("I click Continue Shopping")
    public void i_click_continue_shopping() {
        cartPage.continueBut();
    }
    @When("I click on {string} tittle")
    public void i_click_on_product_tittle(String product){
        inventoryPage.selectProduct(product);
    }
}