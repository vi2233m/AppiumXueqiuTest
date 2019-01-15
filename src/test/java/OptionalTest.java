import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import page.MainPage;
import page.OptionalPage;
import page.SearchPage;

public class OptionalTest {

    static MainPage mainPage;
    static OptionalPage optionalPage;
    static SearchPage searchPage;

    @BeforeAll
    static void beforeAll(){
        mainPage = MainPage.start();
        optionalPage = mainPage.gotoOpational();
    }

    @Test
    void remove(){
        optionalPage.gotoSearch();
    }

}
