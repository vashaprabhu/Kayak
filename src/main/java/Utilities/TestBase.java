package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public WebDriver driver;
	static Properties prop;
	
	public WebDriver openBrowser() throws IOException {
		prop = new Properties();
		
		String sDataFilePath = System.getProperty("user.dir")+"\\data.properties";
		FileInputStream file = new FileInputStream(sDataFilePath);
		prop.load(file);
		String sBrowser = prop.getProperty("browser");
		if(sBrowser.contains("ch"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(sBrowser.contains("fi"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	public String openURL() throws IOException {
		prop = new Properties();
		
		String sDataFilePath = System.getProperty("user.dir")+"\\data.properties";
		FileInputStream file = new FileInputStream(sDataFilePath);
		prop.load(file);
		String urlAddress = prop.getProperty("url");
		return urlAddress;
		
	}
	
	public String getDestinyPlace() throws IOException {
		prop = new Properties();
		
		String sDataFilePath = System.getProperty("user.dir")+"\\data.properties";
		FileInputStream file = new FileInputStream(sDataFilePath);
		prop.load(file);
		String destination = prop.getProperty("destinationPlace");
		return destination;
		
	}
	
	public int getNumber() throws IOException {
		prop = new Properties();
		
		String sDataFilePath = System.getProperty("user.dir")+"\\data.properties";
		FileInputStream file = new FileInputStream(sDataFilePath);
		prop.load(file);
		int flightNumber =Integer.parseInt((prop.getProperty("resultNum")));
		return flightNumber;
		
	}
	
	public String getCities() throws IOException {
		prop = new Properties();
		
		String sDataFilePath = System.getProperty("user.dir")+"\\data.properties";
		FileInputStream file = new FileInputStream(sDataFilePath);
		prop.load(file);
		String cities =prop.getProperty("bothCities");
		return cities;
		
	}
	
	public void close() {
		driver.close();
		
	}
	

}
