/**
 * 
 */
package asgn2Passengers;

/**
 * @author hogan
 *
 */
public class Economy extends Passenger {

	/**
	 * Economy Constructor (Partially Supplied)
	 * Passenger is created in New state, later given a Confirmed Economy Class reservation, 
	 * Queued, or Refused booking if waiting list is full. 
	 * 
	 * @param bookingTime <code>int</code> day of the original booking. 
	 * @param departureTime <code>int</code> day of the intended flight.  
	 * @throws PassengerException if invalid bookingTime or departureTime 
	 * @see asgnPassengers.Passenger#Passenger(int,int)
	 */
	public Economy(int bookingTime,int departureTime) throws PassengerException {
		if((bookingTime < 0) || (departureTime <=0) || (departureTime < bookingTime))
		{
			throw new PassengerException("Booking Time is out of range or Departure Time is our of range");
		}
		super.bookingTime = bookingTime;
		super.departureTime = departureTime;
		super.newState = true;
		//Stuff here
		this.passID = "Y:" + this.passID;
	}
	
	@Override
	public String noSeatsMsg() {
		return "No seats available in Economy";
	}

	@Override
	public Passenger upgrade() {
		
		return this;
		//copyPassengerState(EconomyPassenger);
		//Passenger EconomyPassenger  = new Economy(this.bookingTime, this.departureTime);

	}
}
