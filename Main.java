package com.ea;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ayodeji\\Desktop\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.florida4less.co.uk/");
        driver.findElement(By.xpath("//*[@id=\"layout\"]/div[1]/header/div[4]/nav/ul/li[1]/a"));
        driver.findElement(By.xpath("//*[@id=\"layout\"]/div[1]/header/div[4]/nav/ul/li[2]/a"));
        driver.close();



    }


}
