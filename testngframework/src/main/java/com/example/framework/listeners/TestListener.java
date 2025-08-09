package com.example.framework.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
        // placeholder for onTestStart
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // placeholder for onTestSuccess
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // placeholder for onTestFailure
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // placeholder for onTestSkipped
    }

    @Override
    public void onStart(ITestContext context) {
        // placeholder for onStart
    }

    @Override
    public void onFinish(ITestContext context) {
        // placeholder for onFinish
    }
}
