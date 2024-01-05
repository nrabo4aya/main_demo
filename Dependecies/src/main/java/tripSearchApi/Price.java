package tripSearchApi;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Price{

	@JsonProperty("total")
	private int total;

	@JsonProperty("fee_amount")
	private int feeAmount;

	@JsonProperty("netto")
	private int netto;

	@JsonProperty("original_amount")
	private Object originalAmount;

	@JsonProperty("discount_value")
	private Object discountValue;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("net_original_amount")
	private Object netOriginalAmount;

	@JsonProperty("net_amount")
	private int netAmount;

	@JsonProperty("discount_percentage")
	private Object discountPercentage;

	@JsonProperty("currency_code")
	private String currencyCode;

	@JsonProperty("tariffs")
	private List<TariffsItem> tariffs;

	public int getTotal(){
		return total;
	}

	public int getFeeAmount(){
		return feeAmount;
	}

	public int getNetto(){
		return netto;
	}

	public Object getOriginalAmount(){
		return originalAmount;
	}

	public Object getDiscountValue(){
		return discountValue;
	}

	public String getCurrency(){
		return currency;
	}

	public Object getNetOriginalAmount(){
		return netOriginalAmount;
	}

	public int getNetAmount(){
		return netAmount;
	}

	public Object getDiscountPercentage(){
		return discountPercentage;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}

	public List<TariffsItem> getTariffs(){
		return tariffs;
	}
}