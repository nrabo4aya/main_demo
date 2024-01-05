package tripSearchApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PagesInfo{

	@JsonProperty("page_number")
	private int pageNumber;

	@JsonProperty("page_uuid")
	private String pageUuid;

	@JsonProperty("expires_in")
	private String expiresIn;

	@JsonProperty("page_count")
	private int pageCount;

	public int getPageNumber(){
		return pageNumber;
	}

	public String getPageUuid(){
		return pageUuid;
	}

	public String getExpiresIn(){
		return expiresIn;
	}

	public int getPageCount(){
		return pageCount;
	}
}