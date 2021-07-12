package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkyBlue_BackgroundPage {
WebDriver driver;

public SkyBlue_BackgroundPage(WebDriver driver) {
	this.driver=driver;
}

@FindBy(xpath="//button[1][contains(text(),'Set SkyBlue Background')]") WebElement SkyBlueButton_Field;


public void skybluebuttonExist() {
	boolean buttonpresent=SkyBlueButton_Field.isDisplayed();
	System.out.println(buttonpresent);
}

public void clickingtheButton() {
	SkyBlueButton_Field.click();
}
public void validatetheColor() {
	String exceptedbgcolor="rgba(239, 239, 239, 1)";
	String actualbgcolor=SkyBlueButton_Field.getCssValue("background-color");
	System.out.println("BackGround color :"+actualbgcolor);
	Assert.assertEquals("verification  not success", exceptedbgcolor, actualbgcolor);
}

}
