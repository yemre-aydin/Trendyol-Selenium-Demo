package Pages;

import Methods.Method;
import org.openqa.selenium.WebDriver;

public class FavoritiesPage extends Method {

    public final String addFavorities="//div[@class='prdct-cntnr-wrppr']/div[3]//i[@class='fvrt-btn']";
    public final String favoritiesButton="//p[.='Favorilerim']";
    public final String removeFavorities="//div[@class='ufvrt-btn-wrppr']";
    public final String controlFavorities="https://www.trendyol.com/Hesabim/Favoriler";
    public final String controlEmptyFavorities="//div[@class='empty-favorites']/i[@class='i-heart-orange']";
    public FavoritiesPage(WebDriver driver) {
        super(driver);
    }
}
