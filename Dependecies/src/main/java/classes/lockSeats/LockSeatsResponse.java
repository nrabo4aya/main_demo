package classes.lockSeats;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LockSeatsResponse{

	@JsonProperty("lockseats_id")
	private String lockseatsId;

	@JsonProperty("required_fields")
	private RequiredFields requiredFields;

	@JsonProperty("baggage")
	private Object baggage;

	@JsonProperty("expires_in")
	private int expiresIn;

	public String getLockseatsId(){
		return lockseatsId;
	}

	public RequiredFields getRequiredFields(){
		return requiredFields;
	}

	public Object getBaggage(){
		return baggage;
	}

	public int getExpiresIn(){
		return expiresIn;
	}
}