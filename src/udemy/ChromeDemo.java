package udemy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/TjKhan/Desktop/PIIT/SELENIUM/WebDrivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

//        System.out.println(driver.getPageSource());

        driver.get("https://www.yahoo.com/");
        driver.navigate().back();

        driver.quit();
    }
}
