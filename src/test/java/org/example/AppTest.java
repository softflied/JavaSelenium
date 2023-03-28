package org.example;

import org.hamcrest.Factory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import javax.swing.plaf.PanelUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {


   public static void main(String[] args) {
       // testFirefox();
        testChrome();
    }


    @Test
    public void testFirefox()
    {
        UserAndPassword userAndPassword= new UserAndPassword();
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://webonline.cankaya.edu.tr/");
        driver.findElement(By.id("inputName")).sendKeys("c1928026");
        driver.findElement(By.id("inputPassword")).sendKeys("xcxcxcxcxc"+Keys.ENTER);

        boolean chech1 =  driver.findElement(By.id("inputName")).isDisplayed(); //Eğer şifre yanlışsa check1 true olmalı
        System.out.println("Şifre veya Kullanıcı adı yanlış girildiği için check1: " +chech1);
        assertTrue(chech1);

        driver.get("https://webonline.cankaya.edu.tr/");
        driver.findElement(By.id("inputName")).sendKeys("c1928026");
        driver.findElement(By.id("inputPassword")).sendKeys("Eyupozturk0."+Keys.ENTER);

        String name= driver.findElement(By.xpath("/html/body/div[4]/header[1]/div/div/div[2]/div/div/div[3]/div/ul[1]/li/a/span/span[1]")).getText();
        System.out.println(name);
        assertEquals(name,"Eyüp ÖZTÜRK");

        /*String  check = driver.findElement(By.className("welcome_userpicture defaultuserpic")).getText();
        System.out.println(check);*/
        //assertTrue(check);
        /* boolean chech2 =  driver.findElement(By.id("inputName")).isDisplayed(); //Eğer şifre yanlışsa check1 true olmalı
        System.out.println("Giriş başarlı olduğu için chech2");
        assertTrue(chech2);*/



    }







    @Factory
    public static Object[] testChrome()
    {
        UserAndPassword userAndPassword= new UserAndPassword();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://webonline.cankaya.edu.tr/");
        driver.findElement(By.id("inputName")).sendKeys("c1928026");
        driver.findElement(By.id("inputPassword")).sendKeys("xcxcxcxcxc"+Keys.ENTER);

        boolean chech1 =  driver.findElement(By.id("username")).isDisplayed(); //Eğer şifre yanlışsa check1 true olmalı
        System.out.println(chech1);
        assertTrue(chech1);

        driver.get("https://webonline.cankaya.edu.tr/");
        driver.findElement(By.id("inputName")).sendKeys("c1928026");
        driver.findElement(By.id("inputPassword")).sendKeys("Eyupozturk0."+Keys.ENTER);

        boolean chech2 =  driver.findElement(By.id("inputName")).isDisplayed(); //Eğer şifre yanlışsa check1 true olmalı
        System.out.println(chech2);
        assertFalse(chech2);



        return new Object[]{new AppTest()};
    }
}