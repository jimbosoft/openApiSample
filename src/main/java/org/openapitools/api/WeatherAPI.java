package org.openapitools.api;

import org.openapitools.model.User;
import org.openapitools.model.Weather;
import org.openapitools.model.WeatherCity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import javax.validation.Valid;

@Controller
public class WeatherAPI implements LocalWeatherApi {
    @Override
    public ResponseEntity<Weather> localWeatherPost(@Valid User user) {
        Weather w = new Weather();
        WeatherCity wc = new WeatherCity();
        wc.cityId(42);
        wc.setName("Melbourne");
        w.setCity(wc);
        w.setDt(99);
        w.setTemp("24.38");

        return new ResponseEntity<Weather>(w, HttpStatus.OK);
    }
}
