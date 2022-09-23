package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;



public class InventoryPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();


    private final By numberchart = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    private final By sortingDropDown = By.className("product_sort_container");
    private final By headerTittle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By chartIcon = By.cssSelector("#shopping_cart_container > a");
    private final By sortActive = By.className("active_option");


    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public String getheaderTittle(){
        return driver.findElement(headerTittle).getText();
    }
    public Boolean isChartVisible(){
        return driver.findElement(chartIcon).isDisplayed();
    }

    public void selectItem(String item) {
        driver.findElement(By.id(item)).click();
    }
    public void selectProduct(String product){
        driver.findElement(By.id(product)).click();
    }

    public String getNumber() {
        return driver.findElement(numberchart).getText();
    }

    public void selectSortBy(String sortBy){
        Select dropdown = new Select(driver.findElement(sortingDropDown));
        dropdown.selectByVisibleText(sortBy);
    }
    public String getActiveSort(){
        return driver.findElement(sortActive).getAttribute("innerHTML");
    }

    public void clickCharticon() {
        driver.findElement(chartIcon).click();
    }
}
