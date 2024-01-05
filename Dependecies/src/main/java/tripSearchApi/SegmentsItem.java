package tripSearchApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SegmentsItem{

	@JsonProperty("location_id_to")
	private String locationIdTo;

	@JsonProperty("arrival_date_time")
	private String arrivalDateTime;

	@JsonProperty("arrival_date_time_iso")
	private String arrivalDateTimeIso;

	@JsonProperty("is_back_trip")
	private boolean isBackTrip;

	@JsonProperty("classes")
	private List<ClassesItem> classes;

	@JsonProperty("is_regular")
	private boolean isRegular;

	@JsonProperty("free_booking_enable")
	private boolean freeBookingEnable;

	@JsonProperty("travel_time")
	private String travelTime;

	@JsonProperty("platform")
	private String platform;

	@JsonProperty("carrier_id")
	private String carrierId;

	@JsonProperty("number")
	private String number;

	@JsonProperty("departure_point_id")
	private String departurePointId;

	@JsonProperty("trip_type")
	private String tripType;

	@JsonProperty("route")
	private List<RouteItem> route;

	@JsonProperty("location_id_from")
	private String locationIdFrom;

	@JsonProperty("departure_date_time")
	private String departureDateTime;

	@JsonProperty("departure_date_time_iso")
	private String departureDateTimeIso;

	@JsonProperty("resource_id")
	private String resourceId;

	@JsonProperty("id")
	private String id;

	@JsonProperty("vehicle_id")
	private String vehicleId;

	@JsonProperty("arrival_point_id")
	private String arrivalPointId;

	@JsonProperty("has_hub")
	private boolean hasHub;

	public String getLocationIdTo(){
		return locationIdTo;
	}

	public String getArrivalDateTime(){
		return arrivalDateTime;
	}

	public String getArrivalDateTimeIso(){
		return arrivalDateTimeIso;
	}

	public boolean isIsBackTrip(){
		return isBackTrip;
	}

	public List<ClassesItem> getClasses(){
		return classes;
	}

	public boolean isIsRegular(){
		return isRegular;
	}

	public boolean isFreeBookingEnable(){
		return freeBookingEnable;
	}

	public String getTravelTime(){
		return travelTime;
	}

	public String getPlatform(){
		return platform;
	}

	public String getCarrierId(){
		return carrierId;
	}

	public String getNumber(){
		return number;
	}

	public String getDeparturePointId(){
		return departurePointId;
	}

	public String getTripType(){
		return tripType;
	}

	public List<RouteItem> getRoute(){
		return route;
	}

	public String getLocationIdFrom(){
		return locationIdFrom;
	}

	public String getDepartureDateTime(){
		return departureDateTime;
	}

	public String getDepartureDateTimeIso(){
		return departureDateTimeIso;
	}

	public String getResourceId(){
		return resourceId;
	}

	public String getId(){
		return id;
	}

	public String getVehicleId(){
		return vehicleId;
	}

	public String getArrivalPointId(){
		return arrivalPointId;
	}

	public boolean isHasHub(){
		return hasHub;
	}
}