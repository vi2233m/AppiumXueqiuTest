import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import page.MainPage;
import page.OptionalPage;
import page.SearchPage;
import page.StockEditPage;

public class OptionalTest {

    static MainPage mainPage;
    static OptionalPage optionalPage;
    static SearchPage searchPage;
    static StockEditPage stockEditPage;

    @BeforeAll
    static void beforeAll(){
        mainPage = MainPage.start();
        optionalPage = mainPage.gotoOpational();
        searchPage = new SearchPage();
        stockEditPage = new StockEditPage();
    }

//    @Test
//    void add(){
//        optionalPage.gotoSearch();
//        searchPage.search("gldq");
//        searchPage.addSelected();
//        searchPage.cancel();
//    }

    @ParameterizedTest
    @CsvSource({"gldq, 格力电器","tsla, 特斯拉","zgly, 中国铝业"})
    void remove(String stockShort, String stockName){
        optionalPage.gotoSearch().search(stockShort).addSelected();
        searchPage.cancel();
        assert(stockName.equals(optionalPage.getStockList().get(0)));
        mainPage.gotoOpational().longPress().stick().longPress().remove();
    }

}
