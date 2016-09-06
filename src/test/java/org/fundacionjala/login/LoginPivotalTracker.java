package org.fundacionjala.login;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static junit.framework.Assert.assertEquals;

/**
 * Created by JimmyRomero on 9/6/2016.
 */
public class LoginPivotalTracker {
    WebDriver driver;
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://www.pivotaltracker.com/signin");
    }

    @Test
    public void test_login_pivotalTracker(){
        driver.findElement(By.id("credentials_username")).sendKeys("jimmy.romero@fundacion-jala.org");
        driver.findElement(By.name("action")).click();
        driver.findElement(By.id("credentials_password")).sendKeys("Deviljin0309");
        driver.findElement(By.name("action")).click();
        assertEquals("Dashboard - Pivotal Tracker", driver.getTitle());
    }
    @After
    public void driverClose(){
        driver.close();
    }
}
