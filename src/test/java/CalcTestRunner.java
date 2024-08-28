import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalcTestRunner extends Setup{

    @Test(priority = 1, description = "Do Series_1")
    public void doSeries_1(){
        CalcScreen calcScreen = new CalcScreen(driver);
        int resActual = calcScreen.doSeries_1(1,0,5,6);
        System.out.println(resActual);
        Assert.assertEquals(resActual, 100);
    }
    @Test(priority = 2, description = "Do Series_2")
    public void doSeries_2(){
        CalcScreen calcScreen = new CalcScreen(driver);
        int resActual = calcScreen.doSeries_2(5,0,1,2);
        System.out.println(resActual);
        Assert.assertEquals(resActual, 25);
    }

    @AfterMethod
    public void clearScreen(){
        CalcScreen calcScreen=new CalcScreen(driver);
        calcScreen.btnClear.click();
    }



}