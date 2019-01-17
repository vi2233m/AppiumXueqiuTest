package page;

import driver.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import javax.xml.bind.Element;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofMillis;

public class OptionalPage extends BasePage{
    private By addId = locate("image");
    private By searchId = locate("action_create_cube");
    private By stockXpah = By.xpath("//*[contains(@resource-id, 'listview')]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]");
//    private By xpath_stocklist = By.xpath("//*[@resource-id='portfolio_stockName']");
    private By xpath_stocklist = By.id("portfolio_stockName");

    public ArrayList<String> getStockList(){
        ArrayList<String> list = new ArrayList<>();
        for (AndroidElement e : Driver.getCurrentDriver().findElements(xpath_stocklist)){
            System.out.print("股票名称："+e.getText());
            list.add(e.getText());
        }
        return list;
    }

    public SearchPage add(){
        find(addId).click();
        return new SearchPage();
    }

    public SearchPage gotoSearch(){
        find(searchId).click();
        return new SearchPage();
    }

    public StockEditPage longPress(){

//        //长按方法一
//        MobileElement e= Driver.getCurrentDriver().findElement(stockXpah);
//        PointOption po=new PointOption();
//        po.withCoordinates(e.getLocation().getX(),e.getLocation().getY());
//        TouchAction action = new TouchAction(Driver.getCurrentDriver());
//        action.longPress(po).release().perform();

        // 长按方法二
        TouchAction touchAction = new TouchAction(Driver.getCurrentDriver());
        WebElement element1 = find(stockXpah);
        touchAction.longPress(longPressOptions().withElement(element(element1))
                .withDuration(Duration.ofMillis(1000))).release().perform();

        return new StockEditPage();
    }


}
