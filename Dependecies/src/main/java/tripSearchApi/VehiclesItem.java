package tripSearchApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class VehiclesItem{

	@JsonProperty("number")
	private Object number;

	@JsonProperty("picture_url")
	private List<Object> pictureUrl;

	@JsonProperty("vehicle_options")
	private List<Object> vehicleOptions;

	@JsonProperty("tumbnail_url")
	private List<Object> tumbnailUrl;

	@JsonProperty("model")
	private String model;

	@JsonProperty("id")
	private String id;

	@JsonProperty("type")
	private Object type;

	@JsonProperty("class")
	private String jsonMemberClass;

	@JsonProperty("capacity")
	private int capacity;

	public Object getNumber(){
		return number;
	}

	public List<Object> getPictureUrl(){
		return pictureUrl;
	}

	public List<Object> getVehicleOptions(){
		return vehicleOptions;
	}

	public List<Object> getTumbnailUrl(){
		return tumbnailUrl;
	}

	public String getModel(){
		return model;
	}

	public String getId(){
		return id;
	}

	public Object getType(){
		return type;
	}

	public String getJsonMemberClass(){
		return jsonMemberClass;
	}

	public int getCapacity(){
		return capacity;
	}
}