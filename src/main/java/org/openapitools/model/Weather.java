package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.WeatherCity;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Weather
 */

public class Weather   {
  @JsonProperty("city")
  private WeatherCity city;

  @JsonProperty("dt")
  private Integer dt;

  @JsonProperty("temp")
  private String temp;

  public Weather city(WeatherCity city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  @ApiModelProperty(value = "")

  @Valid

  public WeatherCity getCity() {
    return city;
  }

  public void setCity(WeatherCity city) {
    this.city = city;
  }

  public Weather dt(Integer dt) {
    this.dt = dt;
    return this;
  }

  /**
   * Get dt
   * @return dt
  */
  @ApiModelProperty(value = "")


  public Integer getDt() {
    return dt;
  }

  public void setDt(Integer dt) {
    this.dt = dt;
  }

  public Weather temp(String temp) {
    this.temp = temp;
    return this;
  }

  /**
   * Get temp
   * @return temp
  */
  @ApiModelProperty(value = "")


  public String getTemp() {
    return temp;
  }

  public void setTemp(String temp) {
    this.temp = temp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Weather weather = (Weather) o;
    return Objects.equals(this.city, weather.city) &&
        Objects.equals(this.dt, weather.dt) &&
        Objects.equals(this.temp, weather.temp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, dt, temp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Weather {\n");
    
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    dt: ").append(toIndentedString(dt)).append("\n");
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

