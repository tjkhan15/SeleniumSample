package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/TjKhan/Desktop/PIIT/SELENIUM/WebDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.findElement(By.id("username")).sendKeys("Hello, SalesForce!");
//        driver.findElement(By.id("password")).sendKeys("1234567890");
//        driver.findElement(By.className("button r4 wide primary")).click();
//        driver.findElement(By.xpath("//*[@id='Login']")).click();

//        driver.findElement(By.cssSelector("#email")).sendKeys("Hello, salesforce");
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("1234567890");
        driver.findElement(By.xpath("//*[@id='Login']")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());


        driver.quit();
    }
}
