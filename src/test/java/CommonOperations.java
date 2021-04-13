import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonOperations {
    private WebDriver driver;
    public CommonOperations(WebDriver driver){
        this.driver=driver;
    }
    public WebElement waitToClickableElement(By selector, WebDriver driver,long timeOutInSeconds) {
        WebDriverWait wait=new WebDriverWait(driver,timeOutInSeconds);
        return wait.until(ExpectedConditions.elementToBeClickable(selector));
    }
    public void validateUrl(String incomeMailUrl){
        Assert.assertEquals(driver.getCurrentUrl(),incomeMailUrl);
    }
}
