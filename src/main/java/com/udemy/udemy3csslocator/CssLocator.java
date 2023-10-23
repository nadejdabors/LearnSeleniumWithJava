package com.udemy.udemy3csslocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //Find element by css locator, tag#id
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");

        //using css selector without tag name, is not the best way because the id is matching with other elements
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("MacBook");

        // css with class combination tag.class
        // driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");

        //css selector without tag name
        //driver.findElement(By.cssSelector(".search-box-text")).sendKeys("MacBook");

        // tag with atributes tag[atribute(name = "atribute"]
        //driver.findElement((By.cssSelector("input[name=\"q\"]"))).sendKeys("MacBook");

        //css selector without tag name (input)
        //driver.findElement(By.cssSelector("[name=\"q\"]")).sendKeys("MacBook");

        //css selector with class and with atribute
        //driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("MacBook");
        driver.findElement(By.cssSelector(".search-box-text[name='q']")).sendKeys("MacBook");

    }
}
