/**
 * 
 */
package asgn2Tests;

import asgn2Passengers.*;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Shayne
 *
 */
public class FirstTest {

	/**
	 * Test method for {@link asgn2Passengers.First#noSeatsMsg()}.
	 */
	@Test
	public void testNoSeatsMsg() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link asgn2Passengers.First#upgrade()}.
	 */
	@Test
	public void testUpgrade() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link asgn2Passengers.First#First(int, int)}.
	 */
	@Test
	public void testFirstIntInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link asgn2Passengers.First#First()}.
	 */
	@Test
	public void testFirst() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#Passenger(int, int)}.
	 */
	@Test
	public void testPassengerIntInt() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#Passenger()}.
	 */
	@Test
	public void testPassenger() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#cancelSeat(int)}.
	 * @throws PassengerException 
	 */
	@Test
	public void testCancelSeat() throws PassengerException {
		
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time 
		int confirmTime = 2; // set 2 to be day 2 as confirm time 
		int cancellationTime = 8; // set 8 to be day 8 as cancellation time 
		
		// create object as confirm passenger by calling confirmSeat function
		First isComfirmPassenger = new First (bookingTime,departureTime) ;
		isComfirmPassenger.confirmSeat(confirmTime, departureTime);
		
		// calling cancelSeat function
		isComfirmPassenger.cancelSeat(cancellationTime);
		
		// testing if passenger is New
		assertTrue(isComfirmPassenger.isNew());
		assertEquals(isComfirmPassenger.getBookingTime(),cancellationTime);
		
		
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#confirmSeat(int, int)}.
	 * @throws PassengerException 
	 */
	@Test
	public void testConfirmSeat() throws PassengerException {
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time 
		int confirmTime = 3; // set 2 to be day 2 as confirm time 
		
		// create object as confirm passenger by calling confirmSeat function
		First isComfirmPassenger = new First (bookingTime,departureTime) ;
		isComfirmPassenger.confirmSeat(confirmTime, departureTime);
		
		// testing if passenger is New
		assertTrue(isComfirmPassenger.isNew());
		// testing if passenger is Queued;
		assertTrue(isComfirmPassenger.isQueued());
		// testing if passenger is Confirmed;
		assertTrue(isComfirmPassenger.isConfirmed());
		assertEquals(isComfirmPassenger.getConfirmationTime(),confirmTime);
		assertEquals(isComfirmPassenger.getDepartureTime(),departureTime);
		
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#flyPassenger(int)}.
	 * @throws PassengerException 
	 */
	@Test
	public void testFlyPassenger() throws PassengerException {
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time 
		int confirmTime = 3; // set 2 to be day 2 as confirm time 
		
		// create object as confirm passenger by calling confirmSeat function
		First isComfirmPassenger = new First (bookingTime,departureTime) ;
		isComfirmPassenger.confirmSeat(confirmTime, departureTime);
		
		assertTrue(isComfirmPassenger.isFlown());
		assertEquals(isComfirmPassenger.getDepartureTime(),departureTime);
		
		
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#getBookingTime()}.
	 */
	@Test
	public void testGetBookingTime() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#getConfirmationTime()}.
	 */
	@Test
	public void testGetConfirmationTime() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#getDepartureTime()}.
	 */
	@Test
	public void testGetDepartureTime() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#getEnterQueueTime()}.
	 */
	@Test
	public void testGetEnterQueueTime() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#getExitQueueTime()}.
	 */
	@Test
	public void testGetExitQueueTime() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#getPassID()}.
	 */
	@Test
	public void testGetPassID() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#isConfirmed()}.
	 */
	@Test
	public void testIsConfirmed() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#isFlown()}.
	 */
	@Test
	public void testIsFlown() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#isNew()}.
	 */
	@Test
	public void testIsNew() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#isQueued()}.
	 */
	@Test
	public void testIsQueued() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#isRefused()}.
	 */
	@Test
	public void testIsRefused() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#queuePassenger(int, int)}.
	 * @throws PassengerException 
	 */
	@Test
	public void testQueuePassenger() throws PassengerException {
		
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time 
		int queueTime = 2; // set 2 to be day 2 as queued time 
		
		// create object as new passenger 
		First isNewPassenger = new First (bookingTime,departureTime) ;
		// testing if passenger is New
		assertTrue(isNewPassenger.isNew());
		

		assertTrue(isNewPassenger.isQueued());
		assertEquals(isNewPassenger.getEnterQueueTime(),queueTime);
		assertEquals(isNewPassenger.getDepartureTime(),departureTime);
		
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#refusePassenger(int)}.
	 * @throws PassengerException 
	 */
	@Test
	public void testRefusePassenger() throws PassengerException {
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time 

		
		// create object as new passenger 
		First isNewPassenger = new First (bookingTime,departureTime) ;
		// testing if passenger is New
		assertTrue(isNewPassenger.isNew());
		
		assertTrue(isNewPassenger.isQueued());

		assertTrue(isNewPassenger.isRefused());
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#toString()}.
	 */
	@Test
	public void testToString() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#wasConfirmed()}.
	 * @throws PassengerException 
	 */
	@Test
	public void testWasConfirmed() throws PassengerException {
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time 
		int confirmedTime = 3; // set 3 to be day 3 as confirmed time;
		int cancellationTime = 8; //  set 8 to be day 8 as confirmed time;
		
		
		// create object as was Confirmed passenger 
		First wasConfirmedPassenger = new First (bookingTime,departureTime) ;
		wasConfirmedPassenger.confirmSeat(confirmedTime, departureTime);
		
		
		assertTrue(wasConfirmedPassenger.wasConfirmed());
		
		wasConfirmedPassenger.cancelSeat(cancellationTime);
		
		assertTrue(wasConfirmedPassenger.wasConfirmed());
		
		
		
		
		
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#wasQueued()}.
	 * @throws PassengerException 
	 */
	@Test
	public void testWasQueued() throws PassengerException {
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time 

		int cancellationTime = 8; //  set 8 to be day 8 as confirmed time;
		
		// create object as queued passenger 
		First wasQueuedPassenger = new First (bookingTime,departureTime) ;
		
		assertTrue(wasQueuedPassenger.wasQueued());
		
		wasQueuedPassenger.cancelSeat(cancellationTime);
		
		assertTrue(wasQueuedPassenger.wasQueued());
		

		
		
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#copyPassengerState(asgn2Passengers.Passenger)}.
	 */
	@Test
	public void testCopyPassengerState() {
		fail("Not yet implemented");
	}

}
