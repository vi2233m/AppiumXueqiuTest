package page;

import driver.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

public class OptionalPage extends BasePage{
    private By addId = locate("image");
    private By searchId = locate("action_create_cube");
    private By stockXpah = By.xpath("//*[contains(@resource-id, 'listview')]/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]");

    public SearchPage add(){
        find(addId).click();
        return new SearchPage();
    }

    public SearchPage gotoSearch(){
        find(searchId).click();
//        find(By.id("action_create_cube")).click();
        return new SearchPage();
    }

    public StockEditPage longPress(){
        TouchActions ta = new TouchActions(Driver.getCurrentDriver());
        AndroidElement el = (AndroidElement)find(stockXpah);
        ta.longPress(el).perform();//长按10s
        return new StockEditPage();
    }


}
