package tests

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import pages.Guru99NewCustomer

import java.util.concurrent.TimeUnit

class TestNewCustomer {
    WebDriver driver;
    Guru99NewCustomer objNewCustomer;

    @BeforeTest
    public void setup(){
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.demo.guru99.com/V4/manager/addcustomerpage.php");
    }

    @Test(priority = 0)
    public void test_add_new_customer_correct(){
        objNewCustomer = new Guru99NewCustomer(driver);
        String nameTitlePage = objNewCustomer.getNamePageTitle();
        Assert.assertTrue(nameTitlePage.toLowerCase().contains("add new customer"));

    }
}
