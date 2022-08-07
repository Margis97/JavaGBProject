package lesson7.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Night {
	@JsonIgnoreProperties(ignoreUnknown = true)
	@JsonProperty("IconPhrase")
	private String iconPhrase;

	@JsonSetter("IconPhrase")
	public void setIconPhrase(String iconPhrase) {
		this.iconPhrase = iconPhrase;
	}

	@Override
	public String toString() {
		return "" + iconPhrase;
	}
}
