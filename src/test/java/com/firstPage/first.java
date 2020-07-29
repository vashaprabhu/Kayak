package com.firstPage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.TestBase;



public class first extends TestBase{
	
	public WebDriver driver; 
	
	public first(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@aria-label='Flights']")
	WebElement flightLink;
	
	public WebElement getFlights()
	{
		return flightLink;
	}  
	
	@FindBy(xpath = "//div[contains(@id, 'origin-airport-display')][@data-placeholder='From?']")
	WebElement arriavalPlace;
	
	public void getArrival() throws InterruptedException
	{

		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@id, 'origin-airport-display')][@data-placeholder='From?']")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", arriavalPlace);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(@id,'origin-airport-nearby')]"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//h2[@class='title dark']")).click();
	}  
	
	@FindBy(xpath = "//div[contains(@id, 'destination-airport')][@data-placeholder='To?']")
	WebElement destinationPlace;
	
	public void getDestiny() throws IOException, InterruptedException 
	{
		String place = getDestinyPlace();
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(destinationPlace));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", destinationPlace);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//input[contains(@id, 'destination-airport')][@smarty='true' and @aria-expanded='true']"))).sendKeys(place);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//ul[@class='flight-smarty']/li[1]")).click();

	}  
	
	@FindBy(xpath = "//div[contains(@id, 'dateRangeInput-display-start') and @aria-label='Departure date input']/div[@class='_iaf _iEU _iam _iai']")
	WebElement TravelDate;
	
	public WebElement getTravelDate() {
		return TravelDate;
	}
	
	@FindBy(xpath = "//div[@aria-label='August 11']")
	WebElement startDate;
	
	public WebElement getStartDate() {
		return startDate;
	}
	
	
	@FindBy(xpath = "//div[@aria-label='August 31']")
	WebElement endDate;
	
	public WebElement getEndDate() {
		return endDate;
	}
	
	@FindBy(xpath = "//div[contains(@id,'-button-wrapper')]/button[@type='submit']")
	WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}
	
}
