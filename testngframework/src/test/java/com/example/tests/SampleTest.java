package com.example.tests;

import com.example.datemodule.DateUtils;
import com.example.framework.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest extends BaseTest {

    @Test
    public void testCurrentDateIsNotNull() {
        String date = DateUtils.getCurrentDate();
        Assert.assertNotNull(date);
    }
}
