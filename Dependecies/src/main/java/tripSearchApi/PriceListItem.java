package tripSearchApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PriceListItem{

	@JsonProperty("total")
	private int total;

	@JsonProperty("fee_amount")
	private Object feeAmount;

	@JsonProperty("tariff_code")
	private String tariffCode;

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
	private Object netAmount;

	@JsonProperty("discount_percentage")
	private Object discountPercentage;

	@JsonProperty("currency_code")
	private String currencyCode;

	public int getTotal(){
		return total;
	}

	public Object getFeeAmount(){
		return feeAmount;
	}

	public String getTariffCode(){
		return tariffCode;
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

	public Object getNetAmount(){
		return netAmount;
	}

	public Object getDiscountPercentage(){
		return discountPercentage;
	}

	public String getCurrencyCode(){
		return currencyCode;
	}
}