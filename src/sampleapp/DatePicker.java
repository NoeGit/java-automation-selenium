package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noe\\Documents\\Jar Files and Drivers\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/datepicker");

       WebElement dateField = driver.findElement(By.id("datepicker"));

       Thread.sleep(1000);
       dateField.sendKeys("05/05/2023");
       dateField.sendKeys(Keys.RETURN);

       driver.quit();


    }
}
