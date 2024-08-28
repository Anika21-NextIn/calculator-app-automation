import org.testng.annotations.DataProvider;

public class TestDataset {
    @DataProvider(name = "TestData")
    public Object[][] getData(){
        return new Object[][]{
                {"100/10*5-10+60", 100},
                {"50+10-20*2+10/2", 25}
        };
    }
}