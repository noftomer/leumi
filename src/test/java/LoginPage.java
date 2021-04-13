import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage extends GenralPage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private long timeOut=30;
    private WebElement username(){
        return co.waitToClickableElement(By.cssSelector("#identifierId"),driver,timeOut);
    }
    private WebElement btnAfterUserName(){
        return co.waitToClickableElement(By.cssSelector("#identifierNext > div > button"),driver,timeOut);

    }

    private WebElement password(){
        return co.waitToClickableElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input"),driver,timeOut);
    }
    private WebElement btnAfterpassword(){
        return co.waitToClickableElement(By.cssSelector("#passwordNext > div > button"),driver,timeOut);

    }
//
    public void enterDetails(String userName, String password){
        try {
            username().sendKeys(userName);
            btnAfterUserName();
            password().sendKeys(password);
            btnAfterpassword();
        }
        catch (Exception e){
            //Here can be add logger
            Assert.fail(e.getMessage());

        }
    }
}
