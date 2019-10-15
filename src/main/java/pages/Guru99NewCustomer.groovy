package pages

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver

class Guru99NewCustomer {
    WebDriver driver;
    By homePageTitleTab = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p");
    By nameTextBox = By.name("name");
    By genderFemale = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]");
    By genderMale = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]");
    By dateOfBirthTextBox = By.id("dob");
    By addressTextBox = By.name("addr");
    By cityTextBox = By.name("city");
    By stateTextBox = By.name("state");
    By pinTextBox = By.name("pinno")
    By telephoneTextBox = By.name("telephoneno")
    By emailTextBox = By.name("emailid");
    By passwordTextBox = By.name("password");
    By btnSubmit = By.name("sub");

    public Guru99NewCustomer(WebDriver driver){
        this.driver=driver;
    }

    public void setNameCustomer(String strName){
        this.driver.findElement(nameTextBox).sendKeys(strName);
    }

    public void setGenderFemale(){
        this.driver.findElement(genderFemale).click();
    }
    public void setGenderMale(){
        this.driver.findElement((genderMale)).click();
    }
    public void setDateOfBirth(String strDate){
        this.driver.findElement(dateOfBirthTextBox).sendKeys(strDate);
    }
    public void setAddress(String strAddress){
        this.driver.findElement(addressTextBox).sendKeys(strAddress);
    }
    public void setCity(String strCity){
        this.driver.findElement(cityTextBox).sendKeys(strCity);
    }
    public void setState(String strState){
        this.driver.findElement(stateTextBox).sendKeys(strState);
    }
    public void setPin(String strPin){
        this.driver.findElement(pinTextBox).sendKeys(strPin);
    }
    public void setTelephone(String strTelephone){
        this.driver.findElement(telephoneTextBox).sendKeys(strTelephone);
    }
    public void setEmail(String strEmail){
        this.driver.findElement(emailTextBox).sendKeys(strEmail);
    }
    public void setPassword(String strPassword){
        this.driver.findElement(passwordTextBox).sendKeys(strPassword);
    }
    public void clicSubmit(){
        this.driver.findElement(btnSubmit).click();
    }

    public String getNamePageTitle(){
        return driver.findElement(homePageTitleTab).getText();
    }
    public void createNewCustomerMale(String strName, String strDateOfBirth,String strAddres, String strCity, String strState, String strPin,
                                        String strTelephone, String strEmail, String strPassword){

        this.setNameCustomer(strName);
        this.setGenderMale();
        this.setDateOfBirth(strDateOfBirth);
        this.setAddress(strAddres);
        this.setCity(strCity);
        this.setState(strState);
        this.setPin(strPin);
        this.setTelephone(strTelephone);
        this.setEmail(strEmail);
        this.setPassword(strPassword);
        this.clicSubmit();
    }

    public void createNewCustomerFemale(String strName, String strDateOfBirth,String strAddres, String strCity, String strState, String strPin,
                                      String strTelephone, String strEmail, String strPassword){
        this.setNameCustomer(strName);
        this.setGenderFemale();
        this.setDateOfBirth(strDateOfBirth);
        this.setAddress(strAddres);
        this.setCity(strCity);
        this.setState(strState);
        this.setPin(strPin);
        this.setTelephone(strTelephone);
        this.setEmail(strEmail);
        this.setPassword(strPassword);
        this.clicSubmit();
    }
}
