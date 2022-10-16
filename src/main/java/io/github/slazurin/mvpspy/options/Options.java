package io.github.slazurin.mvpspy.options;

import org.openqa.selenium.firefox.FirefoxOptions;

public class Options {
    private static FirefoxOptions ffOptions;

    public static FirefoxOptions getFFOptions() {
        return ffOptions;
    }

    public static void setFFOptions(FirefoxOptions ffOptions) {
        Options.ffOptions = ffOptions;
    }

    private Options() {
    }
}
