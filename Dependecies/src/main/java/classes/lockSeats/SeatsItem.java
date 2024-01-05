package classes.lockSeats;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SeatsItem{

	@JsonProperty("segment_id")
	private String segmentId;

	@JsonProperty("class")
	private String jsonMemberClass;

	@JsonProperty("segment_seats")
	private List<SegmentSeatsItem> segmentSeats;

	public String getSegmentId(){
		return segmentId;
	}

	public String getJsonMemberClass(){
		return jsonMemberClass;
	}

	public List<SegmentSeatsItem> getSegmentSeats(){
		return segmentSeats;
	}
}