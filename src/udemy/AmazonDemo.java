package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AmazonDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/TjKhan/Desktop/PIIT/SELENIUM/WebDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

//        driver.findElement(By.cssSelector("#email")).sendKeys("email@address.com");
//        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("pass123456");//pass
//        driver.findElement(By.xpath("//input[@value='Log In']")).click();
//
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.quit();
    }
}
