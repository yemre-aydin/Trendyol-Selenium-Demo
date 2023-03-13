package Tests;

import Pages.FavoritiesPage;
import Pages.HomePage;
import Pages.LoginPage;
import Methods.Method;
import Pages.SearchPage;
import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.By.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

public class TrendyolTest {

    private static WebDriver driver;
    private static Method page;
    private static HomePage homePage;
    private static LoginPage loginPage;
    private static FavoritiesPage favoritiesPage;
    private static SearchPage searchPage;



    static WebDriverWait wait;
    Actions act = new Actions(driver); //Object of Actions class



    @BeforeAll
     static void setup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        page =new Method(driver);
        homePage=new HomePage(driver);
        loginPage=new LoginPage(driver);
        favoritiesPage=new FavoritiesPage(driver);
        searchPage=new SearchPage(driver);
        driver.get("https://www.trendyol.com/");
        wait=new WebDriverWait(driver, Duration.ofSeconds(10L));
        wait.until(elementToBeClickable(id("onetrust-accept-btn-handler"))).click();

    }

    @org.junit.jupiter.api.Test
    void loginTest() throws InterruptedException {
       Assert.assertEquals(homePage.controlHomePage, driver.getCurrentUrl());
        page.waitUntilElementAppearsAndClickCss(homePage.logIn);//Click to login
        Assert.assertEquals(loginPage.controlLogin,driver.getCurrentUrl());//Control to Login page
        loginPage.writeText(loginPage.loginEmail, "kadir.alitest@gmail.com" );//write email
        loginPage.writeTextEnter(loginPage.loginPassword,"Test2023.");//write password
        Thread.sleep(2000);//waiting for page to open
        Assert.assertTrue(xpath(loginPage.myAccount).findElement(driver).isDisplayed());//Control to Success login


    }
    @org.junit.jupiter.api.Test
    void seaRchProduct() throws InterruptedException {
        page.writeTextEnterCssEnter(homePage.searchProduct, "Iphone");//search "iphone"
        Thread.sleep(2000);//waiting for page to open
        Assert.assertEquals(searchPage.controlSearch,driver.getCurrentUrl());//Control to search



    }
    @org.junit.jupiter.api.Test
    void favOritiesTest() throws InterruptedException {
        favoritiesPage.addFavoritiesProductXpath(favoritiesPage.addFavorities);//add product to favorites
        favoritiesPage.waitUntilElementAppearsAndClickXpath(favoritiesPage.favoritiesButton);//go to favorities page
        Assert.assertEquals(favoritiesPage.controlFavorities,driver.getCurrentUrl());//Control to Favories page
        favoritiesPage.removeFavoritiesProductXpath(favoritiesPage.removeFavorities);//removing product from favorites
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(xpath(favoritiesPage.controlEmptyFavorities)).isDisplayed());//Control to empty



    }
    @org.junit.jupiter.api.Test
    void logOutTest() throws InterruptedException {
        Thread.sleep(2000);
        loginPage.moveElement(loginPage.myAccount);//move to element "Hesabım button"
        loginPage.logout(loginPage.logout);//loguot
    }


    @AfterAll
    static void tearDown(){
        driver.close();
    }
}
