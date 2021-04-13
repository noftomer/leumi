import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Base {
    protected WebDriver driver=null;
    private long timeOut=30;
    private TimeUnit tu=TimeUnit.SECONDS;
    private String userName="JohhDow";
    private String password="24601";
    protected MainPage mp;

    @BeforeClass()
    public void initBrowser(){
        driver=initWebDriver(DriverType.CHROME);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(timeOut, tu);
        driver.manage().timeouts().implicitlyWait(timeOut, tu);
        driver.manage().timeouts().setScriptTimeout(timeOut, tu);

    }
    @AfterClass()
    public void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }
    @BeforeMethod
    public void startTC(){
        driver.get("https://mail.google.com/mail/u/0/#inbox");
        LoginPage lp=new LoginPage(driver);
        lp.enterDetails(userName,password);
        mp=new MainPage(driver);
    }
    @AfterMethod
    public void endTC(){
        driver.manage().deleteAllCookies();
        mp.exitFromGmail();
    }
    private WebDriver initWebDriver(DriverType type){
        switch (type){
            case CHROME:
                System.setProperty("","");
                driver=new ChromeDriver();
                break;

            case FIREFOX:
                break;
            case IE:
                break;
            case EDGE:
                break;

        }
        return driver;
    }
}
