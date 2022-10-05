package io.github.slazurin.mvpspy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class MVPSpyApp {
    public static void main(String[] args) {
        FirefoxOptions options = new FirefoxOptions();
        // options.setHeadless(true);
        WebDriver driver = new FirefoxDriver(options);
        driver.get("https://www.google.com");
    }
}
