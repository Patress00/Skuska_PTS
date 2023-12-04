package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Student\\Desktop\\Zatko_SKUSKA_\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://ais2.ukf.sk");

        try {


            WebElement cookiesButton = driver.findElement(By.xpath("/html/body/div[6]/button[1]"));
            cookiesButton.click();



            Thread.sleep(2000);
            WebElement meno = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[1]/form/div/div/div/table/tbody/tr[1]/td[2]/input"));
            meno.sendKeys("306454");

            Thread.sleep(2000);
            WebElement heslo = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div/div[1]/div[1]/form/div/div/div/table/tbody/tr[2]/td[2]/input"));
            heslo.sendKeys("0010032737");
            heslo.submit();

            WebElement video = driver.findElement(By.xpath("/html/body/app-root/div/div[1]/div[3]/app-banner/div/div/section/mat-expansion-panel/div/div/iframe"));
            video.click();

            Thread.sleep(7000);
            video.click();

            WebElement user = driver.findElement(By.xpath("/html/body/app-root/lib-app-header/nav/div[3]/a/span"));
            user.click();

            WebElement odhlas = driver.findElement(By.xpath("/html/body/app-root/lib-app-header/nav/div[3]/div/a"));
            odhlas.click();
            Thread.sleep(2000);
            driver.close();




        }catch (Exception e){

            e.printStackTrace();
        }
    }

}



