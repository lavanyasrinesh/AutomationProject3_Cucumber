package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkyWhite_BackgroundPage {
	
	WebDriver driver;
	
	public SkyWhite_BackgroundPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(xpath="//button[2][contains(text(),'Set White Background')]") WebElement WhiteButton_Field;
	
	public void skyWhitebuttonExist() {
		boolean buttonpresent= WhiteButton_Field.isDisplayed();
		System.out.println(buttonpresent);
	}

	public void clickingtheButton() {
		WhiteButton_Field.click();
	}
	public void validatetheColor() {
		//String exceptedbgcolor="rgba(239, 239, 239, 1)";
		String actualbgcolor=WhiteButton_Field.getCssValue("background-color");
		System.out.println("BackGround color :"+actualbgcolor);
		//Assert.assertEquals("verification  not success", exceptedbgcolor, actualbgcolor);
	}
	

}
