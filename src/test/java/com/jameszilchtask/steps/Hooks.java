package com.jameszilchtask.steps;

import com.jameszilchtask.utils.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    private static WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverFactory.getDriver();
        driver.manage().window().maximize();
        driver.get("https://zilch.com/uk/");
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
