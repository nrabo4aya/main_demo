package tripSearchApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FullAddress{

	@JsonProperty("country")
	private Object country;

	@JsonProperty("city")
	private Object city;

	@JsonProperty("street")
	private Object street;

	@JsonProperty("state")
	private Object state;

	@JsonProperty("postal_code")
	private Object postalCode;

	public Object getCountry(){
		return country;
	}

	public Object getCity(){
		return city;
	}

	public Object getStreet(){
		return street;
	}

	public Object getState(){
		return state;
	}

	public Object getPostalCode(){
		return postalCode;
	}
}