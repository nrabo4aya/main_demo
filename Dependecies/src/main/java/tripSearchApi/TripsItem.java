package tripSearchApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TripsItem{

	@JsonProperty("trip_id")
	private String tripId;

	@JsonProperty("rate")
	private Rate rate;

	@JsonProperty("back_trip")
	private List<Object> backTrip;

	@JsonProperty("trip_seats_map")
	private boolean tripSeatsMap;

	@JsonProperty("direct_trip")
	private List<String> directTrip;

	@JsonProperty("class")
	private String jsonMemberClass;

	public String getTripId(){
		return tripId;
	}

	public Rate getRate(){
		return rate;
	}

	public List<Object> getBackTrip(){
		return backTrip;
	}

	public boolean isTripSeatsMap(){
		return tripSeatsMap;
	}

	public List<String> getDirectTrip(){
		return directTrip;
	}

	public String getJsonMemberClass(){
		return jsonMemberClass;
	}
}