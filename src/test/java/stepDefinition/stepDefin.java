package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.firstPage.first;

import ResultPage.results;
import Utilities.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepDefin extends TestBase{
	
	public WebDriver driver = null;
	
	
	@Given("^connect to \"([^\"]*)\"$")
	public void connect_to(String sBrowser) throws Throwable {
		driver = openBrowser();
		
	}
	
	@When("^open \"([^\"]*)\"$")
	public void open(String sURL) throws Throwable {
		sURL = openURL();
		driver.get(sURL);
		
	}
	
	@Then("^click on \"([^\"]*)\" option$")
	public void click_on_option(String flights) throws Throwable {
		first f = new first(driver);
		WebElement flight = f.getFlights();
		flight.click();
		
	}
	
	@Then("^click origin enter \"([^\"]*)\"$")
	public void click_origin_enter(String startPlace) throws Throwable {
		first f = new first(driver);
		f.getArrival();
		
	    
	}
	
	@Then("^Click on destination enter \"([^\"]*)\"$")
	public void click_on_destination_enter(String endPlace) throws Throwable {
		first f = new first(driver);
		f.getDestiny();
		
	}

	@Then("^click on startDate$")
	public void click_on_startDate() throws Throwable {
		first f = new first(driver);
		f.getTravelDate().click();
		Thread.sleep(1000);
		
	}
	
	@Then("^select dates \"([^\"]*)\", \"([^\"]*)\"$")
	public void select_dates(String start, String end) throws Throwable {
		first f = new first(driver);
		f.getStartDate().click();
		Thread.sleep(1000);
		f.getEndDate().click();
		Thread.sleep(1000);
		
	}
	
	@Then("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		first f = new first(driver);
		f.getSearchButton().click();
		
	}
	
	@Then("^Close Covid Info Dialoug box$")
	public void close_Covid_Info_Dialoug_box() throws Throwable {
		results rs = new results(driver);
		rs.getCovidInfoClose();
		
	}
	
	@Then("^search result page will be visible$")
	public void search_result_page_will_be_visible() throws Throwable {
		results rs = new results(driver);
		rs.getResultPage().isDisplayed();	
		
	}
	
	@Then("^page contains result flights$")
	public void page_contains_result_flights() throws Throwable {
		results rs = new results(driver);
		int numberOfFlights = rs.getResultFlights();
		
		
	}
	
	@Then("^select Nth flight from resultpage$")
	public void select_Nth_flight_from_resultpage() throws Throwable {
		results rs = new results(driver);
		rs.getSelectedFlight();
		Thread.sleep(5000);
		
	}
	
	@Then("^start, end cities are same as entered$")
	public void start_end_cities_are_same_as_entered() throws Throwable {
		results rs = new results(driver);
		assertEquals(rs.getBothCities().toString(), getCities() );
		
	}
	
	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		close();
	}
	
	
	
	

		


}
