package tripSearchApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RouteItem{

	@JsonProperty("point_id")
	private String pointId;

	@JsonProperty("arrival_date_time")
	private Object arrivalDateTime;

	@JsonProperty("distance")
	private int distance;

	@JsonProperty("departure_date_time")
	private String departureDateTime;

	@JsonProperty("check_point")
	private boolean checkPoint;

	@JsonProperty("vehicle_id")
	private Object vehicleId;

	@JsonProperty("is_hub")
	private boolean isHub;

	@JsonProperty("platform")
	private String platform;

	public String getPointId(){
		return pointId;
	}

	public Object getArrivalDateTime(){
		return arrivalDateTime;
	}

	public int getDistance(){
		return distance;
	}

	public String getDepartureDateTime(){
		return departureDateTime;
	}

	public boolean isCheckPoint(){
		return checkPoint;
	}

	public Object getVehicleId(){
		return vehicleId;
	}

	public boolean isIsHub(){
		return isHub;
	}

	public String getPlatform(){
		return platform;
	}
}