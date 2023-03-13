package Pages;

import Methods.Method;
import org.openqa.selenium.WebDriver;

public class SearchPage extends Method {
    public final String controlSearch="https://www.trendyol.com/sr?q=Iphone&qt=Iphone&st=Iphone&os=1";
    public SearchPage(WebDriver driver) {
        super(driver);
    }
}
