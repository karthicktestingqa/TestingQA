package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumBase.ProjectSpecifiedMethods;
import utils.ConstantData;

public class LoginPage extends ProjectSpecifiedMethods{
	
	public LoginPage enterUserName() {
		WebElement element = driver.findElement(By.xpath("//input[@id='identifierId']"));
		element.clear();
		element.sendKeys(ConstantData.UserName);
		return new LoginPage();
	}
public LoginPage enterPassWord() {
	WebElement element = driver.findElement(By.xpath("//input[@name='password']"));
	element.clear();
	element.sendKeys(ConstantData.PassWord);
	return new LoginPage();
}
public LoginPage clickNext() {
	driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
	return new LoginPage();
}
public LoginPage clickSubmit() {
	driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
	System.out.println("Successfully logged into = " + driver.getTitle());
	return new LoginPage();
}

}
