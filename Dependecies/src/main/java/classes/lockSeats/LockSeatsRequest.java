package classes.lockSeats;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class LockSeatsRequest {

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

	public List<PassengersItem> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<PassengersItem> passengers) {
		this.passengers = passengers;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String getTripDate() {
		return tripDate;
	}

	public void setTripDate(String tripDate) {
		this.tripDate = tripDate;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}

	public List<SeatsItem> getSeats() {
		return seats;
	}

	public void setSeats(List<SeatsItem> seats) {
		this.seats = seats;
	}
}