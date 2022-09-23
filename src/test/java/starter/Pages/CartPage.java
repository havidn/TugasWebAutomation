package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends PageObject{
    @Managed
    WebDriver driver = getDriver();
    private final By continueButton = By.id("continue-shopping");
    private final By numbercart = By.cssSelector("#shopping_cart_container > a > span");
    private final By removeButton = By.cssSelector("#remove-test\\.allthethings\\(\\)-t-shirt-\\(red\\)");
    private final By sortActive = By.className("inventory_item_name");
    private final By headerTittle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    public String getSelectedProduct(){
        return driver.findElement(sortActive).getAttribute("innerHTML");
    }
    public String getheaderTittle(){
        return driver.findElement(headerTittle).getText();
    }
    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public void clickRemove(){
        driver.findElement(removeButton).click();
    }
    public Object numberOfcart(){
        return driver.findElement(numbercart).getText();
    }
    public void continueBut(){
        driver.findElement(continueButton).click();
    }


}
