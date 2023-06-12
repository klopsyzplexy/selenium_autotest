package Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Function {
    WebDriver driver = new FirefoxDriver();

    public Function(){
        System.setProperty("webdriver.firefox.driver", "/home/boot/Dokumenty/geckodriver");
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    public void login(String login, String password){
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(login);
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//button")).click();
    }

    public void hide_menu() throws InterruptedException {
        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-chevron-left\"]")).click();
        Thread.sleep(2000);

    }
    public void show_menu() throws InterruptedException{
        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-chevron-right\"]")).click();
        Thread.sleep(2000);
    }
    public void change_tab(String tab){
        driver.findElement(By.linkText(tab)).click();
    }
    public void create_user(String firstName, String middleName, String lastName, String id, boolean haveLogin) throws InterruptedException {
        driver.findElement(By.xpath("//*[contains(text(), 'Add')]")).click();
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> driver.findElement(By.xpath("//input[@name='firstName']")));
        element.sendKeys(firstName);
        driver.findElement((By.xpath("//input[@name='middleName']"))).sendKeys(middleName);
        driver.findElement((By.xpath("//input[@name='lastName']"))).sendKeys(lastName);
        if(id != "0"){
            driver.findElement(By.xpath("//*[contains(@class, 'input-field')]//*//input[@class='oxd-input oxd-input--active']")).sendKeys(id);
        }
        if(haveLogin) {
            driver.findElement(By.xpath("//*[contains(@class, 'switch-input')]")).click();
        }
        Thread.sleep(1000);
        driver.findElement((By.xpath("//button[@type='submit']"))).click();
    }
    public void bye(){
        driver.quit();
    }
    public void sendKeys(WebDriver driver, WebElement element, Duration timeout, String value){
        new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(value);
    }
}
