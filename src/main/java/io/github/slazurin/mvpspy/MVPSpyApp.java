package io.github.slazurin.mvpspy;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.slazurin.mvpspy.options.Options;
import io.github.slazurin.mvpspy.options.OptionsParser;

public class MVPSpyApp {
    public static void main(String[] args) {
        Options options = OptionsParser.parseEnv();

        WebDriver wd = new FirefoxDriver(options.getFFOptions());

        wd.get("https://discord.com/channels/696817239810244700/936748569786990642");

        try {
            new WebDriverWait(wd, Duration.ofMinutes(5))
                .until(ExpectedConditions.urlToBe("https://discord.com/channels/696817239810244700/936748569786990642"));
            
        } catch (TimeoutException e) {
            System.out.println("Failed to wait");
            System.exit(1);
        }
        System.out.println("Fun begins");
        wd.close();
    }
}
