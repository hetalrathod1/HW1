 import org.junit.Assert;
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Registration {
    protected static WebDriver driver;

    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "src\\Webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com");
        //maximise window
        driver.manage().window().maximize();
        // click on register for new user
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();
        //enter first name
        driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("hetal");
        // enter last name
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Rathod");
        // enter user email id
        driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("chirag12345@gmail.com");
        // enter password
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("123456");
        //enter confirm password
        driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("123456");
        // click on register
        driver.findElement(By.xpath("//input[@name='register-button']")).click();
        //actual result
        String actualRegistrationSuccessMessage = driver.findElement(By.xpath("//div[@class='result']")).getAttribute("Your registration completed");
       //expected n actual result
        Assert.assertEquals("user should be register successfully",actualRegistrationSuccessMessage);


    }
}

