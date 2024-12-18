package com.easemytrip.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BusTicketPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	public BusTicketPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}

	By SelectCountry = By.xpath("(//*[@class=\"_downroarw\"])[2]");
	By SelectDropdown = By.cssSelector("div#divCCaption.caption");
	By SelectIndia = By.cssSelector("#lanCountry > div > div > div.list > div.item.ccaption.IN");
	By SelectBus = By.cssSelector("#homepagemenuUL > li.bus.mainMenu");
	By SelectFrom = By.xpath("//*[@id=\"txtSrcCity\"]");
	By DropdownMenu = By.xpath("(//*[@class=\"ng-binding ng-scope\"])[2]");
	By SelectTo = By.xpath("//*[@id=\"txtDesCity\"]");
	By SelectDropMenu = By.xpath("(//*[@class=\"ng-binding ng-scope\"])[1]");
	By DepartDate = By.xpath("//*[@id=\"datepicker\"]");
	By SelectCalendar = By.xpath("(//*[@class=\"ui-state-default\"])[21]");
    By SearchBtn = By.id("srcbtn");
    By ShowBuses = By.xpath("(//*[@class=\"bs-title\"])[3]");
    By SelectSeats = By.linkText("Select Seats");
    By BookSeat = By.id("selSeatU10");
    By BoardingPoint = By.id("bd75998");
    By DroppingPoint = By.id("dp");
    By Continue = By.linkText("Continue");
    By NoInsurance = By.xpath("//*[@id=\"InsAcko\"]/div[4]/div[3]/label/span");
    By EnterEmail = By.xpath("//*[@id=\"trvlEmail\"]");
    By ContinueButton = By.xpath("//*[@id=\"idForJS\"]/div[3]/div[7]/div/div[2]/div[2]/form/div/div[9]/span");
    By MobileNum = By.id("TrvlMobileNo");
    By ContinueBooking = By.cssSelector("#second-continue > input[type=submit]");
    
    public void selectCountryLink() {
    	WebElement countryElement = wait.until(ExpectedConditions.elementToBeClickable(SelectCountry));
        countryElement.click();
    }
    public void selectDropDown() {
    	WebElement dropdownElement = wait.until(ExpectedConditions.elementToBeClickable(SelectDropdown));
        dropdownElement.click();
    }
    public void selectIndia() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); 
    	WebElement indiaElement = wait.until(ExpectedConditions.elementToBeClickable(SelectIndia));
        indiaElement.click();
//        indiaElement.sendKeys("India");
    }
    public void selectBus() {
    	WebElement busElement = wait.until(ExpectedConditions.elementToBeClickable(SelectBus));
        busElement.click();
    }
    public void selectDropdownMenu() {
    	WebElement dropElement = wait.until(ExpectedConditions.elementToBeClickable(DropdownMenu));
        dropElement.click();
    }
    public void selectFrom() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	WebElement fromElement = wait.until(ExpectedConditions.elementToBeClickable(SelectFrom));
        fromElement.click();
//        fromElement.sendKeys("Hyderabad");
    }
    public void selectDropMenu() {
    	WebElement downElement = wait.until(ExpectedConditions.elementToBeClickable(SelectDropMenu));
    	downElement.click();
    }
    public void selectTo() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	WebElement toElement = wait.until(ExpectedConditions.elementToBeClickable(SelectTo));
        toElement.click();
//        toElement.sendKeys("Bangalore");
    }
    public void selectCalendar() {
    	WebElement calendarElement = wait.until(ExpectedConditions.elementToBeClickable(SelectCalendar));
    	calendarElement.click();
    }
    public void departDate() {
    	WebElement departElement = wait.until(ExpectedConditions.elementToBeClickable(DepartDate));
        departElement.click();
//        departElement.sendKeys("22");
    }
    public void searchButton() {
    	WebElement searchElement = wait.until(ExpectedConditions.elementToBeClickable(SearchBtn));
        searchElement.click();
    }
    public void showBuses() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	WebElement busesElement = wait.until(ExpectedConditions.elementToBeClickable(ShowBuses));
    	busesElement.click();
    }
    public void selectSeats() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	WebElement seatsElement = wait.until(ExpectedConditions.elementToBeClickable(SelectSeats));
        seatsElement.click();
    }
    public void bookingSeat() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	WebElement seatElement = wait.until(ExpectedConditions.elementToBeClickable(BookSeat));
        seatElement.click();
    }
    public void boardingPoint() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	WebElement boardingElement = wait.until(ExpectedConditions.elementToBeClickable(BoardingPoint));
        boardingElement.click();
    }
    public void droppingPoint() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    	WebElement droppingElement = wait.until(ExpectedConditions.elementToBeClickable(DroppingPoint));
        droppingElement.click();
    }
    public void selectContinue() {
    	WebElement continueElement = wait.until(ExpectedConditions.elementToBeClickable(Continue));
        continueElement.click();
    }
    public void selectInsurance() {
    	WebElement insuranceElement = wait.until(ExpectedConditions.elementToBeClickable(NoInsurance));
        insuranceElement.click();
    }
    public void enterEmail() {
    	WebElement emailElement = wait.until(ExpectedConditions.elementToBeClickable(EnterEmail));
        emailElement.click();
        emailElement.sendKeys("ravirao123@gmail.com");
    }
    public void continueButton() {
    	WebElement buttonElement = wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
        buttonElement.click();
    }
    public void enterMobileNum() {
    	WebElement mobilenumElement = wait.until(ExpectedConditions.elementToBeClickable(MobileNum));
        mobilenumElement.click();
        mobilenumElement.sendKeys("9966554422");
    }
    public void continueBooking() {
    	WebElement bookingElement = wait.until(ExpectedConditions.elementToBeClickable(ContinueBooking));
        bookingElement.click();
    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    	
    


