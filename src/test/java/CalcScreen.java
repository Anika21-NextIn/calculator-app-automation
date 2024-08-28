import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {

    @FindBy(id="com.google.android.calculator:id/clr")
    WebElement btnClear;
    AndroidDriver driver;

    public CalcScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String calcSeries(String series){
        for (char item : series.toCharArray()) {
            WebElement button = driver.findElement(getCalculatorLocatorId(item));
            button.click();
        }
        WebElement equalButton = driver.findElement(getCalculatorLocatorId('='));
        equalButton.click();

        WebElement resultElement = driver.findElement(By.id("com.google.android.calculator:id/result_final"));
        return  resultElement.getText();
    }

    private By getCalculatorLocatorId(char value) {
        switch (value) {
            case '0': return By.id("com.google.android.calculator:id/digit_0");
            case '1': return By.id("com.google.android.calculator:id/digit_1");
            case '2': return By.id("com.google.android.calculator:id/digit_2");
            case '3': return By.id("com.google.android.calculator:id/digit_3");
            case '4': return By.id("com.google.android.calculator:id/digit_4");
            case '5': return By.id("com.google.android.calculator:id/digit_5");
            case '6': return By.id("com.google.android.calculator:id/digit_6");
            case '7': return By.id("com.google.android.calculator:id/digit_7");
            case '8': return By.id("com.google.android.calculator:id/digit_8");
            case '9': return By.id("com.google.android.calculator:id/digit_9");
            case '+': return By.id("com.google.android.calculator:id/op_add");
            case '-': return By.id("com.google.android.calculator:id/op_sub");
            case '*': return By.id("com.google.android.calculator:id/op_mul");
            case '/': return By.id("com.google.android.calculator:id/op_div");
            case '=': return By.id("com.google.android.calculator:id/eq");
            default: throw new IllegalArgumentException("Invalid character: " + value);
        }
    }

//    public void digitPrefix(int num){
//        driver.findElement(By.id("com.google.android.calculator:id/digit_"+num)).click();
//    }
}