package HWCLASS08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class HW01 {

    //hw:
    //goto syntax hrms
    //login
    //click on recruitment
    //select a date on the calanader

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement userName = driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginBtn = driver.findElement(By.xpath("//input[@id='btnLogin']"));
        loginBtn.click();
        WebElement recruitBtn = driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']"));
        recruitBtn.click();

        WebElement calenderBtn = driver.findElement(By.xpath("//input[@id='candidateSearch_fromDate']"));
        calenderBtn.click();

        WebElement monthDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));

        Select sel = new Select(monthDropdown);
        sel.selectByVisibleText("Sep");

        WebElement yearDropdown = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));

        Select sel1 = new Select(yearDropdown);
        sel1.selectByVisibleText("2024");

        Thread.sleep(2000);
        List<WebElement> days = driver.findElements(By.xpath("/html/body/div[3]/table/tbody"));

        for(WebElement allDays: days){
            if (allDays.getText().equals("12")) {

                allDays.click();
            }
            }

        }
        }

