package page;

import org.openqa.selenium.By;

public class StockEditPage extends BasePage{
    private By xpth_remove = By.xpath("//*[@text='删除']");
    private By xpth_stick = By.xpath("//*[@text='置顶']");
    private By xpth_modifyGroup = By.xpath("//*[@text='修改分组']");
    private By xpth_editAlll = By.xpath("//*[@text='编辑全部']");

    /**
     * 删除
     * @return
     */
    public OptionalPage remove(){
        find(xpth_remove).click();
        return new OptionalPage();
    }

    /**
     * 置顶
     * @return
     */
    public OptionalPage stick(){
        find(xpth_stick).click();
        return new OptionalPage();
    }

    /**
     * 修改分组
     * @return
     */
    public OptionalPage modifyGroup(){

        return new OptionalPage();
    }

    /**
     * 编辑全部
     * @return
     */
    public OptionalPage editAlll(){

        return new OptionalPage();
    }
}
