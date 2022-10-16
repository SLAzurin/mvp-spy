package io.github.slazurin.mvpspy.common;

import org.openqa.selenium.WebDriver;

public abstract class SpyExecutor implements Runnable {
    protected WebDriver wd;

    public SpyExecutor(WebDriver wd) {
        this.wd = wd;
    }
}