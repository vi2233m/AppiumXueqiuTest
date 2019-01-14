package page;

import driver.Driver;
import org.openqa.selenium.By;

public class ProfilePage {
    By login=By.xpath("//*[@text='点击登录']");

    public LoginPage gotoLogin(){
        Driver.getCurrentDriver().findElement(login).click();
        return new LoginPage();
    }
}
