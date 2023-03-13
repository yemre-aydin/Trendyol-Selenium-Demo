package Pages;

import Methods.Method;
import org.openqa.selenium.WebDriver;

public class HomePage extends Method {

    public final String logIn=".account-user";
    public final String searchProduct="[placeholder='Aradığınız ürün, kategori veya markayı yazınız']";
    public final String controlHomePage="https://www.trendyol.com/";


    public HomePage(WebDriver driver) {
        super(driver);
    }
}
