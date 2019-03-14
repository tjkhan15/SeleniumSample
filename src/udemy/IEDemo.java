package udemy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IEDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver","/Users/TjKhan/Desktop/PIIT/SELENIUM/WebDrivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
