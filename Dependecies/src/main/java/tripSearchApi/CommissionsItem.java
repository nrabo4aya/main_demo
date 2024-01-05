package tripSearchApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CommissionsItem{

	@JsonProperty("commission_name")
	private String commissionName;

	@JsonProperty("commission_value")
	private int commissionValue;

	public String getCommissionName(){
		return commissionName;
	}

	public int getCommissionValue(){
		return commissionValue;
	}
}