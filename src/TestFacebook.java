import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFacebook {

    WebDriver driver;
    WebElement loginForm;
    WebElement passForm;
    String currentUrl;

    @BeforeTest
    public void setUp() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
    }

    @AfterTest
    public void tearDown() {
        //driver.quit();
    }

    @Test
    public void logInToFacebook() {
        loginForm = driver.findElement(By.id("email"));
        loginForm.sendKeys("antonina.testing@gmail.com");
        passForm = driver.findElement(By.id("pass"));
        passForm.sendKeys("mytest1ng");
        passForm.submit();
        currentUrl = driver.getCurrentUrl();
        //Assert, check that test passed successfully
        Assert.assertTrue(currentUrl.contains("abra"));
    }

    @Test (dependsOnMethods = {"logInToFacebook"})
    public void loadUserProfile() {

     }

    @Test (dependsOnMethods = {"loadUserProfile"})
    public void addHomeTown() {

    }


}
