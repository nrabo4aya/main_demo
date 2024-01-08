package classes.lockSeats;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SeatsItem{

	@JsonProperty("segment_id")
	private String segmentId;

	@JsonProperty("class")
	private String seatClass;

	@JsonProperty("segment_seats")
	private List<SegmentSeatsItem> segmentSeats;

	public String getSegmentId(){
		return segmentId;
	}

	public List<SegmentSeatsItem> getSegmentSeats(){
		return segmentSeats;
	}

	public void setSegmentId(String segmentId) {
		this.segmentId = segmentId;
	}

	public String getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(String seatClass) {
		this.seatClass = seatClass;
	}

	public void setSegmentSeats(List<SegmentSeatsItem> segmentSeats) {
		this.segmentSeats = segmentSeats;
	}
}