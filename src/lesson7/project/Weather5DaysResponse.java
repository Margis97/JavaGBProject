package lesson7.project;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.ArrayList;

public class Weather5DaysResponse {

    @JsonIgnoreProperties(ignoreUnknown = true)
    private ArrayList<DailyForecast> dailyForecasts = new ArrayList<>();

    public ArrayList<DailyForecast> getDailyForecasts() {
        return dailyForecasts;
    }

    @JsonSetter("DailyForecasts")
    public void setDailyForecasts(ArrayList<DailyForecast> dailyForecasts) {
        this.dailyForecasts = dailyForecasts;
    }

    public Weather5DaysResponse() {

    }

    @Override
    public String toString() {
        return "City: " + ApplicationGlobalState.getInstance().getSelectedCity() + " " + dailyForecasts;
    }

}


