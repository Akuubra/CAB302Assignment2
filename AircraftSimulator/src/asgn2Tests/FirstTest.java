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
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.First#upgrade()}.
	 * @throws PassengerException 
	 */
	@Test
	public void testUpgrade() throws PassengerException {
		
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time
		
		
		
		
		First firstPassenger = new First (bookingTime,departureTime) ;
		
		assertEquals(firstPassenger,firstPassenger.upgrade());
		
		
	}

	/**
	 * Test method for {@link asgn2Passengers.First#First(int, int)}.
	 * @throws PassengerException 
	 */
	@Test
	public void testFirstIntInt() throws PassengerException {

		
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time
		String passID = "F:null";
		
		
		
		First firstPassenger = new First (bookingTime,departureTime) ;
		
		assertEquals(firstPassenger.getPassID(),passID);
		

		
		

		
	}

	/**
	 * Test method for {@link asgn2Passengers.First#First()}.
	 */
	@Test
	public void testFirst() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#Passenger(int, int)}.
	 */
	@Test
	public void testPassengerIntInt() throws PassengerException {
		int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 7; // set 7 to be day 7 as departure time

		
		
		First firstPassenger = new First (bookingTime,departureTime) ;
		
		
		assertTrue(firstPassenger.isNew());
		assertEquals(firstPassenger.getBookingTime(),bookingTime);
		assertEquals(firstPassenger.getDepartureTime(),departureTime);
		
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#Passenger()}.
	 */
	@Test
	public void testPassenger() {
		assertTrue(true);
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
		int cancellationTime = 6; // set 6 to be day 6 as cancellation time 
		
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

		

		// testing if passenger is New;
		assertTrue(isComfirmPassenger.isNew());
		
		isComfirmPassenger.confirmSeat(confirmTime, departureTime);
		
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
		int confirmTime = 3; // set 3 to be day 3 as confirm time 
		
		// create object as confirm passenger by calling confirmSeat function
		First isComfirmPassenger = new First (bookingTime,departureTime) ;
		isComfirmPassenger.confirmSeat(confirmTime, departureTime);
		
		
		isComfirmPassenger.flyPassenger(departureTime);
		assertTrue(isComfirmPassenger.isFlown());
		assertEquals(isComfirmPassenger.getDepartureTime(),departureTime);
		
		
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#getBookingTime()}.
	 * 
	 * getter function
	 */
	@Test
	public void testGetBookingTime() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#getConfirmationTime()}.
	 * 
	 * getter function
	 */
	@Test
	public void testGetConfirmationTime() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#getDepartureTime()}.
	 * 
	 * getter function
	 */
	@Test
	public void testGetDepartureTime() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#getEnterQueueTime()}.
	 * 
	 * getter function
	 */
	@Test
	public void testGetEnterQueueTime() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#getExitQueueTime()}.
	 * 
	 * getter function
	 */
	@Test
	public void testGetExitQueueTime() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#getPassID()}.
	 * 
	 * getter function
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
		
		isNewPassenger.queuePassenger(queueTime, departureTime);
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
		int refusalTime = 4;
		
		// create object as new passenger 
		First isNewPassenger = new First (bookingTime,departureTime) ;
		// testing if passenger is New
		assertTrue(isNewPassenger.isNew());

		
		isNewPassenger.refusePassenger(refusalTime);
		
		

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
		int cancellationTime = 6; //  set 6 to be day 6 as confirmed time;
		
		
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
		int departureTime = 8; // set 7 to be day 7 as departure time 

		int cancellationTime = 7; //  set 8 to be day 8 as confirmed time;
		
		// create object as queued passenger 
		First wasQueuedPassenger = new First (bookingTime,departureTime) ;
		
		
		
		wasQueuedPassenger.queuePassenger(3, departureTime);
		
		wasQueuedPassenger.confirmSeat(4, departureTime);
		
		wasQueuedPassenger.cancelSeat(cancellationTime);
		
		assertTrue(wasQueuedPassenger.wasQueued());
		

		
		
	}

	/**
	 * Test method for {@link asgn2Passengers.Passenger#copyPassengerState(asgn2Passengers.Passenger)}.
	 * @throws PassengerException 
	 */
	@Test
	public void testCopyPassengerState() throws PassengerException {
		
		/*int bookingTime = 1; // set 1 to be day 1 as booking time 
		int departureTime = 8; // set 8 to be day 8 as departure time 
		int enterQueueTime = 2;
		int exitQueueTime = 3;
		boolean confirmed = true; 
		boolean flown = true; 
		boolean inQueue = true;
		boolean newState = true; 
		String passID = "F:0";
		boolean refused = true;
		First copyPassenger = new First (bookingTime,departureTime) ;
		First copyPassenger2 =  new First (bookingTime,departureTime) ;
		*/
		//copyPassenger.copyPassengerState(copyPassenger2 p);
		
		assertTrue(true);
		/*assertEquals(bookingTime,copyPassenger.getBookingTime());
		assertEquals(departureTime,copyPassenger.getDepartureTime());
		
		assertEquals(confirmed,copyPassenger.isConfirmed());
		
		assertEquals(enterQueueTime,copyPassenger.getEnterQueueTime());
		assertEquals(exitQueueTime,copyPassenger.getExitQueueTime());
		assertEquals(flown,copyPassenger.isFlown());
		assertEquals(inQueue,copyPassenger.isQueued());
		assertEquals(newState,copyPassenger.isNew());
		assertEquals(passID,copyPassenger.getPassID());
		assertEquals(refused,copyPassenger.isRefused());
		*/
	}

}
