/**
 * 
 */
package asgn2Tests;

import static org.junit.Assert.*;

import org.junit.Test;

import asgn2Passengers.Business;
import asgn2Passengers.PassengerException;
import asgn2Passengers.Premium;

/**
 * @author Shayne
 *
 */
public class BusinessTest {

	/**
	 * Test method for {@link asgn2Passengers.Business#noSeatsMsg()}.
	 */
	@Test
	public void testNoSeatsMsg() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Business#upgrade()}.
	 */
	@Test
	public void testUpgrade() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link asgn2Passengers.Business#Business(int, int)}.
	 * @throws PassengerException 
	 */
	@Test
	public void testBusinessIntInt() throws PassengerException {
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time

		
		
		Business businessPassenger = new Business (bookingTime,departureTime) ;
		
		
		assertTrue(businessPassenger.isNew());
		assertEquals(businessPassenger.getBookingTime(),bookingTime);
		assertEquals(businessPassenger.getDepartureTime(),departureTime);
	}

	/**
	 * Test method for {@link asgn2Passengers.Business#Business()}.
	 */
	@Test
	public void testBusiness() {
		assertTrue(true);
	}

}
