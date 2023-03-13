package Pages;

import Methods.Method;
import org.openqa.selenium.WebDriver;

public class LoginPage extends Method {

    public final String loginEmail="login-email";
    public final String loginPassword="login-password-input";
    public final String myAccount="//p[.='Hesabım']";
    public final String logout="//p[.='Çıkış Yap']";
    public final String controlLogin="https://www.trendyol.com/giris?cb=https%3A%2F%2Fwww.trendyol.com%2F";



    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
