package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HomePage {
    public HomePage(){
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }

    @FindBy(xpath = "//li[text()='Stay Connected:']//following-sibling::li")
    public List<WebElement> mediaBtns2;

    @FindBy(xpath = "//li[text()='Stay Connected:']//following-sibling::li")
    public WebElement mediaBtns1;

    @FindBy(xpath = "//div[@class='client-testimonial-carousel owl-carousel owl-theme owl-loaded owl-drag']//following-sibling::div/div[@class='text']")
    public List<WebElement> peopleNames;

    @FindBy(xpath = "//i[@class='fa fa-facebook-square']")
    public WebElement facebookBtn;

    @FindBy(xpath = "//i[@class='fa fa-twitter-square']")
    public WebElement twitterBtn;

    @FindBy(xpath = "//i[@class='fa fa-google-plus-square']")
    public WebElement googleBtn;

    @FindBy(xpath = "//i[@class='fa fa-linkedin-square']")
    public WebElement linkedinBtn;
}
