package tripSearchApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarriersItem{

	@JsonProperty("ogrn")
	private Object ogrn;

	@JsonProperty("physical_address")
	private String physicalAddress;

	@JsonProperty("trade_mark")
	private String tradeMark;

	@JsonProperty("egrul_egis")
	private String egrulEgis;

	@JsonProperty("legal_address")
	private String legalAddress;

	@JsonProperty("name")
	private String name;

	@JsonProperty("inn")
	private String inn;

	@JsonProperty("logo")
	private Object logo;

	@JsonProperty("id")
	private String id;

	@JsonProperty("full_address")
	private FullAddress fullAddress;

	@JsonProperty("mcc")
	private String mcc;

	@JsonProperty("sub_merchant_id")
	private String subMerchantId;

	public Object getOgrn(){
		return ogrn;
	}

	public String getPhysicalAddress(){
		return physicalAddress;
	}

	public String getTradeMark(){
		return tradeMark;
	}

	public String getEgrulEgis(){
		return egrulEgis;
	}

	public String getLegalAddress(){
		return legalAddress;
	}

	public String getName(){
		return name;
	}

	public String getInn(){
		return inn;
	}

	public Object getLogo(){
		return logo;
	}

	public String getId(){
		return id;
	}

	public FullAddress getFullAddress(){
		return fullAddress;
	}

	public String getMcc(){
		return mcc;
	}

	public String getSubMerchantId(){
		return subMerchantId;
	}
}