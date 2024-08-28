import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {
    @FindBy(id="com.google.android.calculator:id/op_add")
    WebElement btnAdd;
    @FindBy(id="com.google.android.calculator:id/op_sub")
    WebElement btnSub;
    @FindBy(id="com.google.android.calculator:id/op_mul")
    WebElement btnMul;
    @FindBy(id="com.google.android.calculator:id/op_div")
    WebElement btnDiv;
    @FindBy(id="com.google.android.calculator:id/eq")
    WebElement btnEqual;
    @FindBy(id="com.google.android.calculator:id/result_final")
    WebElement txtResult;
    @FindBy(id = "com.google.android.calculator:id/clr")
    WebElement btnClear;

    AndroidDriver driver;


    public CalcScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public int doSeries_1(int num1, int num2, int num3, int num4){
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnDiv.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnMul.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num3)).click();
        btnSub.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnAdd.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num4)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnEqual.click();
        return Integer.parseInt(txtResult.getText());
    }

    public int doSeries_2(int num1, int num2, int num3, int num4){

        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnAdd.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num3)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnSub.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num4)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnMul.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num4)).click();
        btnAdd.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num3)).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
        btnDiv.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num4)).click();
        btnEqual.click();
        return Integer.parseInt(txtResult.getText());

    }
}