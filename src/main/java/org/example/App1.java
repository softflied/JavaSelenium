package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.LinkedList;

public class App1 {

    public App1()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\eyup\\Dropbox\\My PC (DESKTOP-UMFG62A)\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");

        //LinkedList<Integer> priceList = new LinkedList<>();
        WebDriver driver = new ChromeDriver();
      //  Application application = new Application(driver);
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com.tr/b?ie=UTF8&node=20467303031");


        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Sefiller Anonim yayıncılık" + Keys.ENTER);

        String price = driver.findElements(By.className("a-price-whole")).get(0).getText();
        System.out.println("AMAZON: "+price+",00 TL");


        driver.get("https://www.trendyol.com/");
        driver.findElement(By.className("vQI670rJ")).sendKeys("Sefiller Anonim yayıncılık" + Keys.ENTER);
        String price1 = driver.findElements(By.className("prc-box-dscntd")).get(0).getText();
        System.out.println("TRENDYOL: "+price1);


        driver.get("https://www.bkmkitap.com/");
        driver.findElement(By.id("live-search")).sendKeys("Sefiller Anonim yayıncılık" + Keys.ENTER);

        String price2 = driver.findElements(By.className("waw-content-basket")).get(0).getText();
        System.out.println("BKM KİTAP: "+price2);

        driver.close();

    }
}
