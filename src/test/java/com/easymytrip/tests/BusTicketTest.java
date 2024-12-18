package com.easymytrip.tests;

import org.testng.annotations.Test;

import com.easemytrip.pages.BasePage;
import com.easemytrip.pages.BusTicketPage;

public class BusTicketTest extends BasePage {
	
	BusTicketPage busticketpage;
	
	@Test
	public void BusTicketTest() {
		
		busticketpage = new BusTicketPage(driver);
		busticketpage.selectCountryLink();
		busticketpage.selectDropDown();
		busticketpage.selectIndia();
		busticketpage.selectBus();
		busticketpage.selectFrom();
		busticketpage.selectDropdownMenu();
		busticketpage.selectTo();
		busticketpage.selectDropMenu();
		busticketpage.departDate();
		busticketpage.selectCalendar();
		busticketpage.searchButton();
		busticketpage.showBuses();
		busticketpage.selectSeats();
		busticketpage.bookingSeat();
		busticketpage.boardingPoint();
		busticketpage.droppingPoint();
		busticketpage.selectContinue();
		busticketpage.selectInsurance();
		busticketpage.enterEmail();
		busticketpage.continueButton();
		busticketpage.enterMobileNum();
		busticketpage.continueBooking();
	}
	

}
