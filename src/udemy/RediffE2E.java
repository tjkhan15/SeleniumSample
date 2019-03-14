package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RediffE2E {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/TjKhan/Desktop/PIIT/SELENIUM/WebDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rediff.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();

        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Hello, Rediff!");
        driver.findElement(By.cssSelector("input#password")).sendKeys("1234567890");
        driver.findElement(By.xpath("//input[contains(@name,'proceed')]")).click();

        driver.quit();
    }
}
