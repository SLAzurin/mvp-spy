package io.github.slazurin.mvpspy.executors;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.slazurin.mvpspy.common.SpyExecutor;
import io.github.slazurin.mvpspy.options.Options;

public class Straw extends SpyExecutor {
    public Straw(WebDriver wd) {
        super(wd);
    }

    @Override
    public void run() {
        WebDriver wd = new FirefoxDriver(Options.getFFOptions());

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
