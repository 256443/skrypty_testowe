package pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class Guru99HomePage {
    WebDriver driver;
    By homePageUserName = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td")

    public Guru99HomePage(WebDriver driver){
        this.driver=driver;
    }
    public String getHomePageDashboardUserName(){
        return driver.findElement(homePageUserName).getText();
    }
}
