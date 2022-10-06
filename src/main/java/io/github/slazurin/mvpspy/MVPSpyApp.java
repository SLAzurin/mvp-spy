package io.github.slazurin.mvpspy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.slazurin.mvpspy.options.Options;
import io.github.slazurin.mvpspy.options.OptionsParser;

public class MVPSpyApp {
    public static void main(String[] args) {
        Options options = OptionsParser.parseEnv();

        WebDriver driver = new FirefoxDriver(options.getFFOptions());
        driver.get("https://discord.com/channels/696817239810244700/936748569786990642");
    }
}
