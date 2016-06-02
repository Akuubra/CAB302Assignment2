/**
 * 
 */
package asgn2Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import asgn2Passengers.Business;
import asgn2Passengers.Economy;
import asgn2Passengers.PassengerException;

/**
 * @author Shayne
 *
 */
public class EconomyTest {

	/**
	 * Test method for {@link asgn2Passengers.Economy#noSeatsMsg()}.
	 */
	@Test
	public void testNoSeatsMsg() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Economy#upgrade()}.
	 */
	@Test
	public void testUpgrade() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link asgn2Passengers.Economy#Economy(int, int)}.
	 * @throws PassengerException 
	 */
	@Test
	public void testEconomy() throws PassengerException {
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time
		
		Economy economyPassenger = new Economy (bookingTime,departureTime) ;
		
		assertTrue(economyPassenger.isNew());
		assertEquals(economyPassenger.getBookingTime(),bookingTime);
		assertEquals(economyPassenger.getDepartureTime(),departureTime);
	}
	

}
