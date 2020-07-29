package ResultPage;

import java.io.IOException;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.TestBase;

public class results extends TestBase {
	
public WebDriver driver; 
	
	public results(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[contains(@id, 'covid-loading-dialog-close')]")
	WebElement closeCovidInfo;
	
	public void getCovidInfoClose()
	{
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@id, 'covid-loading-dialog-close')]")));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", closeCovidInfo);
	}  
	
	@FindBy(xpath = "//main[contains(@id, 'pageContent')]")
	WebElement resultPage;
	
	public WebElement getResultPage() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//main[contains(@id, 'pageContent')]")));
		return resultPage;
	}
	
	
	@FindBy(xpath = "//div[@class='resultWrapper']")
	List<WebElement> resultFlights;
	
	public int getResultFlights() throws IOException, InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='resultWrapper']")));
		return resultFlights.size();
		
	}
	
	public void getSelectedFlight() throws IOException {
		int resultFor = getNumber();
		int i = 0;
		if(resultFlights.size() > 0 || resultFlights.size() >= resultFor)
		{
			i = resultFor;	
		}
		resultFlights.get(i).click();	
	
	}
	
	@FindBy(xpath = "//div[@class='resultWrapper']/div[contains(@id, 'detailsWrapper')][@aria-expanded='true']//section[contains(@id, 'details-leg-details')]/div[1]//div[@class='header']/div[@class='airports left']")
	WebElement startAndEndCities;
	
	public String getBothCities() {
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='resultWrapper']/div[contains(@id, 'detailsWrapper')][@aria-expanded='true']//section[contains(@id, 'details-leg-details')]/div[1]//div[@class='header']/div[@class='airports left']")));
		return startAndEndCities.getText();
	}

	

}
