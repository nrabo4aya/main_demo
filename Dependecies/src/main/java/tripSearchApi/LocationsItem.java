package tripSearchApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LocationsItem{

	@JsonProperty("country_code")
	private String countryCode;

	@JsonProperty("timezone")
	private String timezone;

	@JsonProperty("name")
	private String name;

	@JsonProperty("country_name")
	private String countryName;

	@JsonProperty("id")
	private String id;

	public String getCountryCode(){
		return countryCode;
	}

	public String getTimezone(){
		return timezone;
	}

	public String getName(){
		return name;
	}

	public String getCountryName(){
		return countryName;
	}

	public String getId(){
		return id;
	}
}