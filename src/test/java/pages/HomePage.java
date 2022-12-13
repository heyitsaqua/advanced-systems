package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;


import javax.xml.xpath.XPath;
import java.awt.*;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(BrowserUtils.getDriver(), this);
    }



    @FindBy(xpath = "//*[contains(text(), 'Our Career Network')]")
    public WebElement Description;

    @FindBy(xpath = "//*[@class='theme-btn btn-style-two']")
    public WebElement ReadMoreBtn;


    @FindBy(xpath = "//*[contains(text(), 'Words from our Clients')]")
    public WebElement world;


    @FindBy(xpath = "//*[contains(text(), 'A bright career')]")
    public WebElement header1;

    @FindBy(xpath = "//*[contains(text(), 'Our Career Network')]")
    public WebElement text;

    @FindBy(xpath = "//div[@class = 'tp-caption']//h2[contains(text(), 'Think Big.')]")
    public WebElement thinkBigHeader;

    @FindBy(xpath = "/html/body/div[1]/section[1]/div/div[1]/div/ul/li[2]/div[4]/div/div/div/a")
    public WebElement readMoreBtn;


    //@FindBy(xpath = "//*[contains(text(), 'Read More')]")
    ///html/body/div[1]/section[1]/div/div[1]/div/ul/li[2]/div[4]/div/div/div/a

//Test 12
   // @FindBy(xpath = "//div[@class='owl-item']//div[contains(text(), 'These guys')]")
    //public List<WebElement> textMsg;

    //@FindBy(className = "info-box-one")
        //public List<WebElement> contactInfo;

        @FindBy(id = "dropdownMenu1")
        public WebElement englishBtn;

        @FindBy(xpath = "//div[contains(@class, 'six-item-carousel')]")
        public WebElement listOfCompany;
    }