package io.github.slazurin.mvpspy.options;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Options {
    private FirefoxOptions ffOptions;
    private FirefoxProfile ffProfile;

    public FirefoxOptions getFFOptions() {
        return ffOptions;
    }

    public void setFFOptions(FirefoxOptions ffOptions) {
        this.ffOptions = ffOptions;
    }

    public FirefoxProfile getFFProfile() {
        return ffProfile;
    }

    public void setFFProfile(FirefoxProfile ffProfile) {
        this.ffProfile = ffProfile;
    }

    public Options() {
    }
}
