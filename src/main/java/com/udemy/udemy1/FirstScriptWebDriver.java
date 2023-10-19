package com.udemy.udemy1;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScriptWebDriver {

    public static void main(String[] args) throws InterruptedException {
        //1)Launch the browser
        //ChromeDriver driver = new ChromeDriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //
        //2)Open url on the browser
        driver.get("https://opensource-demo.orangehrmlive.com");
        Thread.sleep(5000);

        //3)Provide username -- Admin
        driver.findElement(By.name("username")).sendKeys("Admin");

        //4)Provide password -- admin123
        driver.findElement(By.name("password")).sendKeys("dmin123");

        //5) Click on Submit button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        //6) Verify the title of dashboard page
        Thread.sleep(5000);
        String actualTitle = "";
        String expectationTitle = "Dashboard";

        try {
            actualTitle =  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
        }catch (NoSuchElementException e ){}

        if (actualTitle.equals(expectationTitle))
            System.out.println("Test passed");
        else
            System.out.println("Test failed");



    }


}
