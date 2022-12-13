package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HomePage {

    public HomePage() {


            PageFactory.initElements(BrowserUtils.getDriver(), this);
        }
        @FindBy(className = "info-box-one")
        public List<WebElement> contactInfo;

        @FindBy(id = "dropdownMenu1")
        public WebElement englishBtn;

        @FindBy(xpath = "//div[contains(@class, 'six-item-carousel')]")
        public WebElement listOfCompany;
    }