package Methods;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Method {

    WebDriver driver;
    WebDriverWait waitElement;
    Actions act; //Object of Actions class


    public Method(WebDriver driver){
        this.driver=driver;
        waitElement=new WebDriverWait(driver, Duration.ofSeconds(10L));
        act= new Actions(driver);

    }
    public void waitUntilElementAppearsAndClick(String elementId){
        waitElement.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId))).click();

    }
    public void waitUntilElementAppearsAndClickCss(String elementId){
        waitElement.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId))).click();

    }
    public void waitUntilElementAppearsAndClickXpath(String elementId){
        waitElement.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementId))).click();

    }
    public void writeText(String elementId,String text){
        waitElement.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId))).sendKeys(text);

    }
    public void writeTextCss(String elementId,String text){
        waitElement.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId))).sendKeys(text);

    }
    public void writeTextEnter(String elementId,String text){
        waitElement.until(ExpectedConditions.presenceOfElementLocated(By.id(elementId))).sendKeys(text, Keys.ENTER);

    }
    public void writeTextEnterCssEnter(String elementId,String text){
        waitElement.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementId))).sendKeys(text, Keys.ENTER);

    }
    public void addFavoritiesProductXpath(String elemetId){
        waitElement.until(ExpectedConditions.elementToBeClickable(By.xpath(elemetId))).click();
    }

    public void removeFavoritiesProductXpath(String elementId){
        waitElement.until(ExpectedConditions.elementToBeClickable(By.xpath(elementId))).click();
    }
    public void moveElement(String elementId){
        act.moveToElement(driver.findElement(By.xpath(elementId)));
        act.perform();

    }
    public void logout(String elementId){
        waitElement.until(ExpectedConditions.elementToBeClickable(By.xpath(elementId))).click();

    }

}
