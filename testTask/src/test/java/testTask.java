import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.Command;

import java.security.Key;
import java.util.Set;

public class testTask {

    public WebDriver driver;

    @Before
    public void startTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/vpetrov/chromedriver");
        driver = new ChromeDriver();
    }

    @Test
    public void FirstTest() throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to("https://www.market.yandex.ru");
        Thread.sleep(15000);

//        WebElement Market = driver.findElement(By.cssSelector("ul.services-new__list"));
//        Market.findElement(By.cssSelector("[data-id=market]")).click();
//        String currentTab = driver.getWindowHandle();
//        Set<String> handles = driver.getWindowHandles();
//        for(String actual: handles) {
//            if(!actual.equalsIgnoreCase(currentTab)) {
//                driver.switchTo().window(actual);
//                Thread.sleep(20000);
//            }
//        }
//        WebElement sandwich = driver.findElement(By.cssSelector("button._2AMPZ._3CFK9._2VvV8._3WgR5"));
//        sandwich.click();
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("li._1hPrb.CvDqK.cia-cs [id:97009095]")).click();
//        Thread.sleep(10000);

//        driver.findElement(By.cssSelector("button._2AMPZ._3CFK9._2VvV8._3WgR5")).click();
//        Thread.sleep(3000);
//        WebElement Smartphone = driver.findElement(By.cssSelector("li.CvDqK"));
//        Actions builder = new Actions(driver);
//        builder.moveToElement(Smartphone).perform();
//        Thread.sleep(3000);
//        WebElement Smartphone1 = driver.findElement(By.xpath("//a[@href='href=/catalog--smartfony/26893750/list?hid=91491']"));
//        Actions builder1 = new Actions(driver);
//        builder1.moveToElement(Smartphone1).click();

        driver.findElement(By.xpath("//button[@class='_2AMPZ._3CFK9._2VvV8._3WgR5']")).click();
        Thread.sleep(2000);
        WebElement sMenu = driver.findElement(By.xpath("//span[@class='_1UCDW'][contains(text(), 'Электроника')]"));
        Thread.sleep(2000);
        Actions actions = new Actions(driver);
        actions.moveToElement(sMenu).perform();
        Thread.sleep(2000);
        WebElement subsMenu = driver.findElement(By.xpath("//a[@class='egKyN _1mqvV _3kgUl'][contains(text(), 'Смартфоны')]"));
        actions.moveToElement(subsMenu).click().perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class='_2yK7W _1f2us'][@name='Цена до']")).sendKeys("20000");
        driver.findElement(By.xpath("//input[@class='_2yK7W _1d02b'][@name='Диагональ экрана (точно) от']")).sendKeys("3");


    }

    @After
    public void exit() {
        driver.quit();
        driver = null;
    }
}