package WebExercise;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class Utils extends BasePage {
    public void clickOnElement(By by) {
        driver.findElement(by).click();
    }

    public void waitForClickable(By by, int time) {
        WebDriverWait wait = new WebDriverWait(driver, time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public void EnterText(By by, String text){
        driver.findElement(by).sendKeys(text);
        waitForClickable(by, 40);
    }

    public static String getTextElement(By by)
    {
        String get_text = driver.findElement(by).getText();
        return get_text;}

   public void assertTextMessage(String message, String expected, By by)
    {
            String actual = getTextElement(by);
         //   Assert.assertEquals(message, expected, actual);
            assertEquals("", expected, actual);
    }
}
