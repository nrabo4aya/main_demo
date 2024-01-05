package tripSearchApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PointsItem{

	@JsonProperty("address")
	private String address;

	@JsonProperty("parent_id")
	private String parentId;

	@JsonProperty("name")
	private String name;

	@JsonProperty("point_latitude")
	private Object pointLatitude;

	@JsonProperty("id")
	private String id;

	@JsonProperty("point_longitude")
	private Object pointLongitude;

	public String getAddress(){
		return address;
	}

	public String getParentId(){
		return parentId;
	}

	public String getName(){
		return name;
	}

	public Object getPointLatitude(){
		return pointLatitude;
	}

	public String getId(){
		return id;
	}

	public Object getPointLongitude(){
		return pointLongitude;
	}
}