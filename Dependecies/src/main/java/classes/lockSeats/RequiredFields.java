package classes.lockSeats;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequiredFields{

	@JsonProperty("birthday")
	private boolean birthday;

	@JsonProperty("mailadress")
	private boolean mailadress;

	@JsonProperty("firstname")
	private boolean firstname;

	@JsonProperty("only_latin_symbols")
	private boolean onlyLatinSymbols;

	@JsonProperty("gender")
	private boolean gender;

	@JsonProperty("citizenship")
	private boolean citizenship;

	@JsonProperty("document")
	private boolean document;

	@JsonProperty("phonenumber")
	private boolean phonenumber;

	@JsonProperty("documenttype")
	private boolean documenttype;

	@JsonProperty("studentticket")
	private boolean studentticket;

	@JsonProperty("lastname")
	private boolean lastname;

	@JsonProperty("middlenames")
	private boolean middlenames;

	@JsonProperty("isic")
	private boolean isic;

	@JsonProperty("documentedate")
	private boolean documentedate;

	public boolean isBirthday(){
		return birthday;
	}

	public boolean isMailadress(){
		return mailadress;
	}

	public boolean isFirstname(){
		return firstname;
	}

	public boolean isOnlyLatinSymbols(){
		return onlyLatinSymbols;
	}

	public boolean isGender(){
		return gender;
	}

	public boolean isCitizenship(){
		return citizenship;
	}

	public boolean isDocument(){
		return document;
	}

	public boolean isPhonenumber(){
		return phonenumber;
	}

	public boolean isDocumenttype(){
		return documenttype;
	}

	public boolean isStudentticket(){
		return studentticket;
	}

	public boolean isLastname(){
		return lastname;
	}

	public boolean isMiddlenames(){
		return middlenames;
	}

	public boolean isIsic(){
		return isic;
	}

	public boolean isDocumentedate(){
		return documentedate;
	}
}