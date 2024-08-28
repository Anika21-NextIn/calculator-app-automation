import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{

    @Test(description = "Calculate Series", dataProvider = "TestData", dataProviderClass = TestDataset.class)
    public void doSeries(String series, int resExpected){
        CalcScreen calcScreen = new CalcScreen(driver);
        String resActual = calcScreen.calcSeries(series);
        System.out.println(resActual);
        Assert.assertEquals(Integer.parseInt(resActual), resExpected);
    }

    @AfterMethod
    public void clearScreen(){
        CalcScreen calcScreen=new CalcScreen(driver);
        calcScreen.btnClear.click();
    }



}