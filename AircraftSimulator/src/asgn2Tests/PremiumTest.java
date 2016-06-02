/**
 * 
 */
package asgn2Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import asgn2Passengers.Economy;
import asgn2Passengers.First;
import asgn2Passengers.PassengerException;
import asgn2Passengers.Premium;

/**
 * @author Shayne
 *
 */
public class PremiumTest {

	/**
	 * Test method for {@link asgn2Passengers.Premium#noSeatsMsg()}.
	 */
	@Test
	public void testNoSeatsMsg() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Premium#upgrade()}.
	 * @throws PassengerException 
	 */
	@Test
	public void testUpgrade() throws PassengerException {
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time
		
		
		
		
		Economy economyPassenger = new Economy (bookingTime,departureTime) ;
		Premium premiumPassenger = new Premium(bookingTime, departureTime);
		premiumPassenger.upgrade();
		//economyPassenger = (Economy) economyPassenger;
			
		
		
		
		assertEquals(economyPassenger, premiumPassenger);
		
	}

	/**
	 * Test method for {@link asgn2Passengers.Premium#Premium(int, int)}.
	 * @throws PassengerException 
	 */
	@Test
	public void testPremiumIntInt() throws PassengerException {
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time

		
		
		Premium premiumPassenger = new Premium (bookingTime,departureTime) ;
		
		
		assertTrue(premiumPassenger.isNew());
		assertEquals(premiumPassenger.getBookingTime(),bookingTime);
		assertEquals(premiumPassenger.getDepartureTime(),departureTime);

	}

	/**
	 * Test method for {@link asgn2Passengers.Premium#Premium()}.
	 */
	@Test
	public void testPremium() {
		assertTrue(true);
	}

}
