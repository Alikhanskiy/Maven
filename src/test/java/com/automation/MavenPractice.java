package com.automation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MavenPractice {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().setup();
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com");
        driver.quit();

    }
}
