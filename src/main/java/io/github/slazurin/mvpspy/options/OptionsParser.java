package io.github.slazurin.mvpspy.options;

import java.io.File;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class OptionsParser {
    public static Options parseEnv() {
        Options ret = new Options();

        FirefoxOptions ffOptions = new FirefoxOptions();
        if (System.getenv("HEADLESS").equals("true")) {
            ffOptions.setHeadless(true);
        }

        FirefoxProfile ffProfile = new FirefoxProfile(new File(System.getenv("FF_PROFILE")));

        ffOptions.setProfile(ffProfile);

        ret.setFFOptions(ffOptions);

        return ret;
    }
}
