/**
 * 
 */
package asgn2Tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import asgn2Aircraft.*;
import asgn2Passengers.*;
import asgn2Aircraft.A380;
import asgn2Aircraft.AircraftException;

/**
 * @author Shayne
 *
 */
public class A380Test {

	/**
	 * Test method for {@link asgn2Aircraft.A380#A380(java.lang.String, int)}.
	 * @throws AircraftException 
	 */
	@Test
	public void testA380StringInt() throws AircraftException {
		
		/*super(flightCode, departureTime,FIRST,BUSINESS,PREMIUM,ECONOMY);
		if((flightCode == null) || (departureTime <=0)){
			throw new AircraftException("Flight code or Departure Time invalid");			
		*/
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Aircraft.A380#A380(java.lang.String, int, int, int, int, int)}.
	 */
	@Test
	public void testA380StringIntIntIntIntInt() {
		assertTrue(true);
		
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#Aircraft(java.lang.String, int, int, int, int, int)}.
	 * @throws AircraftException 
	 */
	@Test
	public void testAircraft() throws AircraftException {
		
		String flightCode= "A380";
		int departureTime = 8;
		int first = 14;
		int business = 64;
		int premium = 35;
		int economy = 371;
		
		A380 aircraft = new A380(flightCode,departureTime,first , business, premium, economy);
		
		assertTrue(aircraft.getPassengers().isEmpty());
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#cancelBooking(asgn2Passengers.Passenger, int)}.
	 * @throws PassengerException 
	 * @throws AircraftException 
	 */
	@Test
	public void testCancelBooking() throws PassengerException, AircraftException {
		
		String flightCode= "A380";
		int bookingTime = 1;
		int departureTime = 8;
		int cancellationTime = 7;
		int confirmationTime = 3;
		
		A380 cancelAircraft = new A380(flightCode,departureTime);
		First firstPassenger = new First (bookingTime,departureTime) ;

		cancelAircraft.confirmBooking(firstPassenger, confirmationTime);

		cancelAircraft.cancelBooking(firstPassenger,cancellationTime);
		

	}



	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#confirmBooking(asgn2Passengers.Passenger, int)}.
	 * @throws AircraftException 
	 * @throws PassengerException 
	 */
	@Test
	public void testConfirmBooking() throws AircraftException, PassengerException {
		
		String flightCode= "A380";
		int departureTime = 8;
		int confirmationTime = 3;
		int bookingTime = 1;

		
		A380 comfiredAircraft = new A380(flightCode,departureTime);
		First firstPassenger = new First (bookingTime,departureTime) ;
		
		comfiredAircraft.confirmBooking(firstPassenger, confirmationTime);
				
		

		
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#finalState()}.
	 */
	@Test
	public void testFinalState() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#flightEmpty()}.
	 * @throws AircraftException 
	 */
	@Test
	public void testFlightEmpty() throws AircraftException {
		
		
		String flightCode= "A380";
		int departureTime = 8;
		int first = 14;
		int business = 64;
		int premium = 35;
		int economy = 371;
		
		A380 aircraft = new A380(flightCode,departureTime,first , business, premium, economy);
		
		assertTrue(aircraft.getPassengers().isEmpty());
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#flightFull()}.
	 * @throws PassengerException 
	 * @throws AircraftException 
	 */
	@Test
	public void testFlightFull() throws PassengerException, AircraftException {
		String flightCode= "A380";
		
		int bookingTime = 1;
		int confirmationTime = 3;
		int departureTime = 8;
		int firstSeatSize = 14;
		int businessSeatSize = 64;
		int premiumSeatSize = 35;
		int econamySeatSize = 371;
		
		A380 aircraft = new A380(flightCode, departureTime);
		
		for (int i = 0; i < firstSeatSize; i++)
		{
			First firstPassenger = new First (bookingTime,departureTime) ;
			aircraft.confirmBooking(firstPassenger, confirmationTime);
		}
		
		for(int i = 0; i < businessSeatSize ; i++)
		{
			Business firstPassenger = new Business (bookingTime,departureTime) ;
			aircraft.confirmBooking(firstPassenger, confirmationTime);
		}
		
		for (int i = 0 ; i< premiumSeatSize; i ++)
		{
			Premium firstPassenger = new Premium (bookingTime,departureTime) ;
			aircraft.confirmBooking(firstPassenger, confirmationTime);
		}
		
		for (int i = 0; i < econamySeatSize; i ++)
		{
			Economy firstPassenger = new Economy (bookingTime,departureTime) ;
			aircraft.confirmBooking(firstPassenger, confirmationTime);
		}
		

		
		assertTrue(aircraft.flightFull());
	
	
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#flyPassengers(int)}.
	 * @throws PassengerException 
	 * @throws AircraftException 
	 */
	@Test
	public void testFlyPassengers() throws PassengerException, AircraftException {

		String flightCode= "A380";
		
		int bookingTime = 1;
		int confirmationTime = 3;
		int departureTime = 8;
		
		First firstPassenger = new First (bookingTime,departureTime) ;
		A380 aircraft = new A380(flightCode, departureTime);
		aircraft.confirmBooking(firstPassenger, confirmationTime);
		
		
		aircraft.flyPassengers(departureTime);
		

	
	
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#getBookings()}.
	 * @throws AircraftException 
	 * @throws PassengerException 
	 */
	@Test
	public void testGetBookings() throws AircraftException, PassengerException {
		String flightCode= "A380";
		
		int bookingTime = 1;
		int confirmationTime = 3;
		int departureTime = 8;
		
		First firstPassenger = new First (bookingTime,departureTime) ;
		A380 aircraft = new A380(flightCode, departureTime);
		aircraft.confirmBooking(firstPassenger, confirmationTime);
		
		aircraft.getBookings();
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#getNumBusiness()}.
	 */
	@Test
	public void testGetNumBusiness() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#getNumEconomy()}.
	 */
	@Test
	public void testGetNumEconomy() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#getNumFirst()}.
	 */
	@Test
	public void testGetNumFirst() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#getNumPassengers()}.
	 */
	@Test
	public void testGetNumPassengers() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#getNumPremium()}.
	 */
	@Test
	public void testGetNumPremium() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#getPassengers()}.
	 * @throws AircraftException 
	 */
	@Test
	public void testGetPassengers() throws AircraftException {
		
		
		String flightCode= "A380";
		int departureTime = 8;
		int first = 14;
		int business = 64;
		int premium = 35;
		int economy = 371;
		
		A380 aircraft = new A380(flightCode,departureTime,first , business, premium, economy);
		
		aircraft.getPassengers();
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#getStatus(int)}.
	 */
	@Test
	public void testGetStatus() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#hasPassenger(asgn2Passengers.Passenger)}.
	 * @throws PassengerException 
	 * @throws AircraftException 
	 */
	@Test
	public void testHasPassenger() throws PassengerException, AircraftException {

		String flightCode= "A380";
		
		int bookingTime = 1;
		int confirmationTime = 3;
		int departureTime = 8;
		

		
		First firstPassenger = new First (bookingTime,departureTime) ;
		A380 aircraft = new A380(flightCode, departureTime);
		aircraft.confirmBooking(firstPassenger, confirmationTime);
		
		assertTrue(aircraft.hasPassenger(firstPassenger));
	
	
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#initialState()}.
	 */
	@Test
	public void testInitialState() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#seatsAvailable(asgn2Passengers.Passenger)}.
	 * @throws PassengerException 
	 * @throws AircraftException 
	 */
	@Test
	public void testSeatsAvailable() throws PassengerException, AircraftException {
		
		String flightCode= "A380";
		
		int bookingTime = 1;
		int confirmationTime = 3;
		int departureTime = 8;
		

		
		First firstPassenger = new First (bookingTime,departureTime) ;
		A380 aircraft = new A380(flightCode, departureTime);
		aircraft.confirmBooking(firstPassenger, confirmationTime);
		
		assertTrue(aircraft.seatsAvailable(firstPassenger));
		
		
		
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#toString()}.
	 */
	@Test
	public void testToString() {
		assertTrue(true);
	}

	/**
	 * Test method for {@link asgn2Aircraft.Aircraft#upgradeBookings()}.
	 * @throws PassengerException 
	 * @throws AircraftException 
	 */
	@Test
	public void testUpgradeBookings() throws PassengerException, AircraftException {
		
		String flightCode= "A380";
		
		int bookingTime = 1;
		int confirmationTime = 3;
		int departureTime = 8;
		
		First firstPassenger = new First (bookingTime,departureTime) ;
		A380 aircraft = new A380(flightCode, departureTime);
		aircraft.confirmBooking(firstPassenger, confirmationTime);
		
		aircraft.upgradeBookings();
		
	}

}
