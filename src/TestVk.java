import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestVk {

    WebDriver driver;
    WebElement loginForm;
    WebElement passForm;

    @Test
    public void logInVk() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.get("http://www.vk.com");
        Thread.sleep(3000);
        loginForm = driver.findElement(By.id("quick_email"));
        loginForm.sendKeys("lithium02@mail.ru");
        passForm = driver.findElement(By.id("quick_pass"));
        passForm.sendKeys("2");
        passForm.submit();
    }




}
