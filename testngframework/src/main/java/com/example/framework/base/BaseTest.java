package com.example.framework.base;

import com.example.framework.utilities.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    @BeforeMethod
    public void setUp() {
        // Driver setup can be extended for real browsers
        DriverFactory.setDriver(null);
    }

    @AfterMethod
    public void tearDown() {
        DriverFactory.unload();
    }
}
