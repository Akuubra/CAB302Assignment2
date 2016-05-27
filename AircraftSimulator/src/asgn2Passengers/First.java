/**
 * 
 */
package asgn2Passengers;

/**
 * @author hogan
 *
 */
public class First extends Passenger {

	/**
	 * First Constructor (Partially Supplied) 
	 * Passenger is created in New state, later given a Confirmed First Class reservation, 
	 * Queued, or Refused booking if waiting list is full. 
	 * 
	 * @param bookingTime <code>int</code> day of the original booking. 
	 * @param departureTime <code>int</code> day of the intended flight.  
	 * @throws PassengerException if invalid bookingTime or departureTime 
	 * @see asgnPassengers.Passenger#Passenger(int,int)
	 */
	public First(int bookingTime, int departureTime) throws PassengerException {
		if((bookingTime < 0) || (departureTime <=0) || (departureTime < bookingTime))
		{
			throw new PassengerException("Booking Time is out of range or Departure Time is our of range");
		}
		super.bookingTime = bookingTime;
		super.departureTime = departureTime;
		super.newState = true;
		//Call here 
		this.passID = "F:" + this.passID;
	}
	
	/**
	 * Simple constructor to support {@link asgn2Passengers.Passenger#upgrade()} in other subclasses
	 */
	protected First() {

	}

	@Override
	public String noSeatsMsg() {
		return "No seats available in First";
	}


	@Override
	public Passenger upgrade() {
		
		return this;
		//Think about it :) 
	}
}
