import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MainPage extends GenralPage{

    private long timeOut=30;
    private String incomeMailUrl="https://mail.google.com/mail/u/0/#inbox";
    private String starMailUrl="https://mail.google.com/mail/u/0/#starred";
    private String sentMailUrl="https://mail.google.com/mail/u/0/#sent";
    private WebElement incomeMailElement(){
        return co.waitToClickableElement(By.cssSelector("#\\:15w > div > div.aio.UKr6le > span > a"),driver,timeOut);
    }

    private WebElement starMailElement(){
        return co.waitToClickableElement(By.xpath("//*[@id=\":15x\"]/div/div[2]/span/a"),driver,timeOut);
    }

    private WebElement sentMailElement(){
        return co.waitToClickableElement(By.cssSelector("#\\:161 > div > div.aio.UKr6le > span > a"),driver,timeOut);
    }
    private WebElement googleAccountElement() {
        return co.waitToClickableElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div[2]/div/a"),driver,timeOut);

    }
    private WebElement exitElement() {
        return co.waitToClickableElement(By.cssSelector("#gb_71"),driver,timeOut);

    }
    public MainPage(WebDriver driver) {
        super(driver);
    }
    public void incomeMail(){
        try{
            incomeMailElement().click();
            co.validateUrl(incomeMailUrl);
        }
        catch (Exception e){
            //Here can be add logger
            Assert.fail(e.getMessage());
        }
        catch (AssertionError ae){
            //Here can be add logger
            Assert.fail(ae.getMessage());

        }
    }
    public void starMail(){
        try{
            starMailElement().click();
            co.validateUrl(starMailUrl);
        }
        catch (Exception e){
            //Here can be add logger
            Assert.fail(e.getMessage());
        }
        catch (AssertionError ae){
            //Here can be add logger
            Assert.fail(ae.getMessage());

        }
    }
    public void sentMail(){
        try{
            sentMailElement().click();
            co.validateUrl(sentMailUrl);
        }
        catch (Exception e){
            //Here can be add logger
            Assert.fail(e.getMessage());
        }
        catch (AssertionError ae){
            //Here can be add logger
            Assert.fail(ae.getMessage());

        }
    }

    public void exitFromGmail() {
        try{
            googleAccountElement().click();
            exitElement().click();
        }
        catch (Exception e){
            //Here can be add logger
            Assert.fail(e.getMessage());
        }
    }


}
