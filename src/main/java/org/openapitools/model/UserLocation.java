package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UserLocation
 */

public class UserLocation   {
  @JsonProperty("latitute")
  private BigDecimal latitute;

  @JsonProperty("longitude")
  private BigDecimal longitude;

  public UserLocation latitute(BigDecimal latitute) {
    this.latitute = latitute;
    return this;
  }

  /**
   * Get latitute
   * minimum: -90
   * maximum: 90
   * @return latitute
  */
  @ApiModelProperty(value = "")

  @Valid
@DecimalMin("-90") @DecimalMax("90") 
  public BigDecimal getLatitute() {
    return latitute;
  }

  public void setLatitute(BigDecimal latitute) {
    this.latitute = latitute;
  }

  public UserLocation longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

  /**
   * Get longitude
   * minimum: -180
   * maximum: 180
   * @return longitude
  */
  @ApiModelProperty(value = "")

  @Valid
@DecimalMin("-180") @DecimalMax("180") 
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserLocation userLocation = (UserLocation) o;
    return Objects.equals(this.latitute, userLocation.latitute) &&
        Objects.equals(this.longitude, userLocation.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(latitute, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLocation {\n");
    
    sb.append("    latitute: ").append(toIndentedString(latitute)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

