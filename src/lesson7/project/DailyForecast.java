package lesson7.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.sql.Date;
import java.util.Map;

public class DailyForecast {
    @JsonIgnoreProperties(ignoreUnknown = true)
    private Date date;
    private Map<String, Measurement> values;
    private Day day = new Day();
    private Night night = new Night();


    static class Measurement {
        @JsonIgnoreProperties(ignoreUnknown = true)
        @JsonProperty("Value")
        private Double value;

        public void setValue(Double value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return " " + value;
        }

    }

    @JsonSetter("Date")
    public void setDate(Date date) {
        this.date = date;
    }

    @JsonSetter("Temperature")
    public void setValues(Map<String, Measurement> values) {
        this.values = values;
    }

    @JsonSetter("Day")
    public void setDay(Day day) {
        this.day = day;
    }

    @JsonSetter("Night")
    public void setNight(Night night) {
        this.night = night;
    }

    public DailyForecast() {

    }

    @Override
    public String toString() {
        return "Date='" + date + '\'' + " Temperature='" + values + '\'' + " DayWeatherText='" + day + '\'' + ", NightWeatherText='" + night + '\'';
    }

}

