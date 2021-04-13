import org.openqa.selenium.WebDriver;

public abstract class GenralPage {
    protected WebDriver driver;

    protected CommonOperations co;
    public GenralPage(WebDriver driver){
        this.driver=driver;
        co=new CommonOperations(driver);
    }



}
