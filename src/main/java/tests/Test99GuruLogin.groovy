package tests


import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.Assert
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import pages.Guru99HomePage
import pages.Guru99Login

import java.util.concurrent.TimeUnit

class Test99GuruLogin {
    WebDriver driver;
    Guru99Login objLogin;
    Guru99HomePage objHomePage;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://demo.guru99.com/V4/");
    }

    @Test(priority = 0)
    public void test_home_Page_correct(){
        //create login page object
        objLogin =  new Guru99Login(driver);
        //verify loginPageTitle
        String loginPageTitle = objLogin.getLoginTitle();
        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
        //login to application
        objLogin.loginToGuru99("mngr228592","SurUtYt");
        objHomePage = new Guru99HomePage(driver);
        //Verify home page
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mngr228592"));
    }


}
