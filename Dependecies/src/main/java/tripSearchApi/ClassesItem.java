package tripSearchApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ClassesItem{

	@JsonProperty("cancel_time")
	private int cancelTime;

	@JsonProperty("can_discount")
	private boolean canDiscount;

	@JsonProperty("reservation_enable")
	private boolean reservationEnable;

	@JsonProperty("deep_link_v2")
	private String deepLinkV2;

	@JsonProperty("reservation_lifetime")
	private int reservationLifetime;

	@JsonProperty("bus_options")
	private Object busOptions;

	@JsonProperty("stop_reservation_time")
	private Object stopReservationTime;

	@JsonProperty("sale_enable")
	private boolean saleEnable;

	@JsonProperty("return_enable")
	private boolean returnEnable;

	@JsonProperty("price_list")
	private List<PriceListItem> priceList;

	@JsonProperty("free_seats")
	private int freeSeats;

	@JsonProperty("price")
	private Price price;

	@JsonProperty("trip_options")
	private List<Object> tripOptions;

	@JsonProperty("seat_class_name_standardised")
	private String seatClassNameStandardised;

	@JsonProperty("class")
	private String jsonMemberClass;

	@JsonProperty("redirect_url")
	private String redirectUrl;

	@JsonProperty("deep_link")
	private String deepLink;

	public int getCancelTime(){
		return cancelTime;
	}

	public boolean isCanDiscount(){
		return canDiscount;
	}

	public boolean isReservationEnable(){
		return reservationEnable;
	}

	public String getDeepLinkV2(){
		return deepLinkV2;
	}

	public int getReservationLifetime(){
		return reservationLifetime;
	}

	public Object getBusOptions(){
		return busOptions;
	}

	public Object getStopReservationTime(){
		return stopReservationTime;
	}

	public boolean isSaleEnable(){
		return saleEnable;
	}

	public boolean isReturnEnable(){
		return returnEnable;
	}

	public List<PriceListItem> getPriceList(){
		return priceList;
	}

	public int getFreeSeats(){
		return freeSeats;
	}

	public Price getPrice(){
		return price;
	}

	public List<Object> getTripOptions(){
		return tripOptions;
	}

	public String getSeatClassNameStandardised(){
		return seatClassNameStandardised;
	}

	public String getJsonMemberClass(){
		return jsonMemberClass;
	}

	public String getRedirectUrl(){
		return redirectUrl;
	}

	public String getDeepLink(){
		return deepLink;
	}
}