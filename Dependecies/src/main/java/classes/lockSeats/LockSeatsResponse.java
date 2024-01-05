package classes.lockSeats;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LockSeatsResponse{

	@JsonProperty("passengers")
	private List<PassengersItem> passengers;

	@JsonProperty("trip_id")
	private String tripId;

	@JsonProperty("trip_date")
	private String tripDate;

	@JsonProperty("passenger_count")
	private int passengerCount;

	@JsonProperty("seats")
	private List<SeatsItem> seats;

	public List<PassengersItem> getPassengers(){
		return passengers;
	}

	public String getTripId(){
		return tripId;
	}

	public String getTripDate(){
		return tripDate;
	}

	public int getPassengerCount(){
		return passengerCount;
	}

	public List<SeatsItem> getSeats(){
		return seats;
	}
}