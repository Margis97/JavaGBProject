package lesson7.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.Map;

public class WeatherResponse {

	@JsonIgnoreProperties(ignoreUnknown = true)
	private String weather;
	private Map<String, Measurement> values;

	static class Measurement {
		@JsonIgnoreProperties(ignoreUnknown = true)
		@JsonProperty("Value")
		private Double value;

		public Double getValue() {
			return value;
		}

		public void setValue(Double value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "" + value;
		}

	}

	public String getWeather() {
		return weather;
	}

	@JsonSetter("WeatherText")
	public void setWeather(String weather) {
		this.weather = weather;
	}

	public Map<String, Measurement> getValues() {
		return values;
	}

	@JsonSetter("Temperature")
	public void setValues(Map<String, Measurement> values) {
		this.values = values;
	}

	public WeatherResponse() {

	}

	@Override
	public String toString() {
		return "WeatherText='" + weather + '\'' + ", Temperature='" + values + '\'';
	}

}
