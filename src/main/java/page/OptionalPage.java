package page;

import org.openqa.selenium.By;

public class OptionalPage extends BasePage{
    private By addId = locate("id/image");


    public SearchPage add(){

        return new SearchPage();
    }

    public SearchPage addAgain(){

        return new SearchPage();
    }

    public OptionalPage remove(){

        return this;
    }

}
