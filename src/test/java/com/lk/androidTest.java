package com.lk;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class androidTest {
    
    static AppiumDriver driver;

    public static void main(String[] args) throws MalformedURLException {
        openMobileApp();
        
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Cancel\"]\r\n")).click();
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Continue with Google\"]")).click();
    }

    public static void openMobileApp() throws MalformedURLException {
        // Set capabilities using DesiredCapabilities
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Logesh S21 FE");
        cap.setCapability("udid", "RZCWB04A9FZ");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "14");
        cap.setCapability("automationName", "UiAutomator2");
        cap.setCapability("appPackage", "com.reddit.frontpage");
        cap.setCapability("appActivity", "com.reddit.launch.main.MainActivity");

        System.out.println("App Started");

        
        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver(url, cap);

       
    }
    
}
