package classes.lockSeats;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SegmentSeatsItem{

	@JsonProperty("tariff_code")
	private String tariffCode;

	@JsonProperty("seat_id")
	private Object seatId;

	@JsonProperty("passenger_num")
	private int passengerNum;

	public String getTariffCode(){
		return tariffCode;
	}

	public Object getSeatId(){
		return seatId;
	}

	public int getPassengerNum(){
		return passengerNum;
	}
}