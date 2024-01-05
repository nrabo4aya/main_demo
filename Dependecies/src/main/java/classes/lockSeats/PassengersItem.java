package classes.lockSeats;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassengersItem{

	@JsonProperty("passenger_age")
	private int passengerAge;

	@JsonProperty("passenger_num")
	private int passengerNum;

	public int getPassengerAge(){
		return passengerAge;
	}

	public int getPassengerNum(){
		return passengerNum;
	}
}