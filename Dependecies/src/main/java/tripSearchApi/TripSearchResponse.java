package tripSearchApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TripSearchResponse{

	@JsonProperty("vehicle_options")
	private Object vehicleOptions;

	@JsonProperty("trips")
	private List<TripsItem> trips;

	@JsonProperty("vehicles")
	private List<VehiclesItem> vehicles;

	@JsonProperty("locations")
	private List<LocationsItem> locations;

	@JsonProperty("carriers")
	private List<CarriersItem> carriers;

	@JsonProperty("pages_info")
	private PagesInfo pagesInfo;

	@JsonProperty("points")
	private List<PointsItem> points;

	@JsonProperty("segments")
	private List<SegmentsItem> segments;

	public Object getVehicleOptions(){
		return vehicleOptions;
	}

	public List<TripsItem> getTrips(){
		return trips;
	}

	public List<VehiclesItem> getVehicles(){
		return vehicles;
	}

	public List<LocationsItem> getLocations(){
		return locations;
	}

	public List<CarriersItem> getCarriers(){
		return carriers;
	}

	public PagesInfo getPagesInfo(){
		return pagesInfo;
	}

	public List<PointsItem> getPoints(){
		return points;
	}

	public List<SegmentsItem> getSegments(){
		return segments;
	}
}