package Modules;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Function {
    WebDriver driver = new FirefoxDriver();
    Elements d = new Elements();

    public Function(){
        System.setProperty("webdriver.firefox.driver", "/home/boot/Dokumenty/geckodriver");
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public void login(String login, String password){
        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(login);
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
        driver.findElement(By.xpath("//button")).click();
    }

    public void hide_menu(){
        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-chevron-left\"]")).click();
    }
    public void show_menu(){
        driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-chevron-right\"]")).click();
    }
    public void change_tab(String tab){
        driver.findElement(By.linkText(tab)).click();
    }
    public void create_user(String firstName, String middleName, String lastName, String id, boolean haveLogin, boolean pass) throws InterruptedException {
        driver.findElement(By.xpath(d.get("addEmployee"))).click();
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> driver.findElement(By.xpath(d.get("addFirstName"))));
        element.sendKeys(firstName);
        driver.findElement((By.xpath(d.get("addMiddleName")))).sendKeys(middleName);
        driver.findElement((By.xpath(d.get("addLastName")))).sendKeys(lastName);
        Thread.sleep(1000);
        if(!id.equals("0")){
            driver.findElement(By.xpath(d.get("addID"))).sendKeys(id);
        }
        if(haveLogin) {
            driver.findElement(By.xpath(d.get("createLogin"))).click();
            Thread.sleep(200);
            if(pass) {
                create_account(firstName + lastName, middleName+"213769", middleName+"213769", true);
            }
            else{
                create_account(firstName + lastName, middleName+"213769", lastName, true);
            }
        }
        driver.findElement((By.xpath("//button[@type='submit']"))).click();
    }
    public void create_account(String username, String pass, String pass2, boolean en){
        driver.findElement(By.xpath(d.get("addUsername"))).sendKeys(username);
        driver.findElement(By.xpath(d.get("addPassword"))).sendKeys(pass);
        driver.findElement(By.xpath(d.get("confirmPassword"))).sendKeys(pass2);
        if(en) driver.findElement(By.xpath(d.get("statusEn"))).click();
        else driver.findElement(By.xpath(d.get("statusDis"))).click();
    }
    public void logout(){
        driver.findElement(By.xpath(d.get("userDropdown"))).click();
        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10)).until(driver -> driver.findElement(By.xpath(d.get("logout"))));
        element.click();
    }
    public void newTab(String url){
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url);
    }
    public void closeTab(){
        driver.close();
    }
    public void bye(){
        driver.quit();
    }

}
