package tripSearchApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TariffsItem{

	@JsonProperty("description_tariff")
	private Object descriptionTariff;

	@JsonProperty("end_date")
	private Object endDate;

	@JsonProperty("note")
	private String note;

	@JsonProperty("refund_conditions")
	private List<Object> refundConditions;

	@JsonProperty("code")
	private String code;

	@JsonProperty("cost")
	private int cost;

	@JsonProperty("free_booking")
	private boolean freeBooking;

	@JsonProperty("commissions")
	private List<CommissionsItem> commissions;

	@JsonProperty("name")
	private Object name;

	@JsonProperty("is_exclusive_price")
	private boolean isExclusivePrice;

	@JsonProperty("id")
	private Object id;

	@JsonProperty("start_date")
	private String startDate;

	public Object getDescriptionTariff(){
		return descriptionTariff;
	}

	public Object getEndDate(){
		return endDate;
	}

	public String getNote(){
		return note;
	}

	public List<Object> getRefundConditions(){
		return refundConditions;
	}

	public String getCode(){
		return code;
	}

	public int getCost(){
		return cost;
	}

	public boolean isFreeBooking(){
		return freeBooking;
	}

	public List<CommissionsItem> getCommissions(){
		return commissions;
	}

	public Object getName(){
		return name;
	}

	public boolean isIsExclusivePrice(){
		return isExclusivePrice;
	}

	public Object getId(){
		return id;
	}

	public String getStartDate(){
		return startDate;
	}
}