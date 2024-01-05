package tripSearchApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rate{

	@JsonProperty("cleanless")
	private Object cleanless;

	@JsonProperty("votes_count")
	private Object votesCount;

	@JsonProperty("punctuality")
	private Object punctuality;

	@JsonProperty("avg_rating")
	private Object avgRating;

	@JsonProperty("politeness")
	private Object politeness;

	@JsonProperty("technical_condition")
	private Object technicalCondition;

	public Object getCleanless(){
		return cleanless;
	}

	public Object getVotesCount(){
		return votesCount;
	}

	public Object getPunctuality(){
		return punctuality;
	}

	public Object getAvgRating(){
		return avgRating;
	}

	public Object getPoliteness(){
		return politeness;
	}

	public Object getTechnicalCondition(){
		return technicalCondition;
	}
}