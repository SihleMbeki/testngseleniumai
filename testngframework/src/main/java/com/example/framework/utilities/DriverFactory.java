package com.example.framework.utilities;

import org.openqa.selenium.WebDriver;

public final class DriverFactory {
    private static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<>();

    private DriverFactory() {
    }

    public static void setDriver(WebDriver driver) {
        DRIVER.set(driver);
    }

    public static WebDriver getDriver() {
        return DRIVER.get();
    }

    public static void unload() {
        DRIVER.remove();
    }
}
