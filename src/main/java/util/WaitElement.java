package util;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;

public class WaitElement {

    //首页上自选这类的按钮，坐标会随着页面加载发生变化，等位置固定后再点击
    public void waitAndFindElement(By element){
        WebElement e;
        Point p0;
        try {
            Driver.getCurrentDriver().findElement(element);
        }finally {
            e= Driver.getCurrentDriver().findElement(element);
            p0 = e.getLocation(); //获取到元素坐标
        }
        for (int i = 0; i < 5; i++) {
            e=Driver.getCurrentDriver().findElement(element);
            Point p1 = e.getLocation();
            System.out.println("****************************************************************************");
            System.out.println(p0.toString());
            System.out.println(p1.toString());
            if (p0.equals(p1)) {
                e.click();
                break;
            } else {
                p0 = p1;
                try {
                    sleep(1000);
                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
            }
        }

    }
}
