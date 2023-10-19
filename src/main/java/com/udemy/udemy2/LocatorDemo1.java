package com.udemy.udemy2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorDemo1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.automationpractice.pl/index.php?");
        driver.manage().window().maximize();
        /*
        driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
        driver.findElement(By.name("submit_search")).click();

        //link test we use title name
        driver.findElement(By.linkText("Printed Chiffon Dress")).click();
        // driver.findElement(By.partialLinkText("Printed Chiffon")).click();

        */

        //Finding number of sliders on home page
        List<WebElement> sliders = driver.findElements(By.className("homeslider-container"));
        System.out.println("Number of sliders" + sliders.size());

        //Find total number of images in home page
        List<WebElement> images = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images: " + images.size());

        //Find total number of links
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total number of images: " + links.size());

    }
}
