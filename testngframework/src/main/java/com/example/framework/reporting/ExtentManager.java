package com.example.framework.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public final class ExtentManager {
    private ExtentManager() {
    }

    private static ExtentReports extent;

    public static ExtentReports getExtentReports() {
        if (extent == null) {
            ExtentSparkReporter reporter = new ExtentSparkReporter("extent-report.html");
            extent = new ExtentReports();
            extent.attachReporter(reporter);
        }
        return extent;
    }
}
