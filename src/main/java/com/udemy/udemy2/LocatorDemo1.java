package com.udemy.udemy2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.automationpractice.pl/index.php?");
        driver.manage().window().maximize();

        driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
        driver.findElement(By.name("submit_search")).click();

        //link test
        driver.findElement(By.linkText("Printed Chiffon Dress")).click();
       // driver.findElement(By.partialLinkText("Printed Chiffon")).click();

    }
}
