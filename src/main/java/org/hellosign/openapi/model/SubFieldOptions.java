/*
 * HelloSign API
 * HelloSign v3 API
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: apisupport@hellosign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.hellosign.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hellosign.openapi.JSON;


import org.hellosign.openapi.ApiException;
/**
 * This allows the requester to specify field options for a signature request.
 */
@ApiModel(description = "This allows the requester to specify field options for a signature request.")
@JsonPropertyOrder({
    SubFieldOptions.JSON_PROPERTY_DATE_FORMAT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubFieldOptions {
  /**
   * Allows requester to specify the date format (see list of allowed [formats](https://app.hellosign.com/api/reference#DateFormats))  **Note**: Only available for Premium and higher.
   */
  public enum DateFormatEnum {
    MMDDYYYY("MM / DD / YYYY"),
    
    MM_DD_YYYY("MM - DD - YYYY"),
    
    DDMMYYYY("DD / MM / YYYY"),
    
    DD_MM_YYYY("DD - MM - YYYY"),
    
    YYYYMMDD("YYYY / MM / DD"),
    
    YYYY_MM_DD("YYYY - MM - DD");

    private String value;

    DateFormatEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DateFormatEnum fromValue(String value) {
      for (DateFormatEnum b : DateFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DATE_FORMAT = "date_format";
  private DateFormatEnum dateFormat;

  public SubFieldOptions() { 
  }

  public SubFieldOptions dateFormat(DateFormatEnum dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Allows requester to specify the date format (see list of allowed [formats](https://app.hellosign.com/api/reference#DateFormats))  **Note**: Only available for Premium and higher.
   * @return dateFormat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Allows requester to specify the date format (see list of allowed [formats](https://app.hellosign.com/api/reference#DateFormats))  **Note**: Only available for Premium and higher.")
  @JsonProperty(JSON_PROPERTY_DATE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public DateFormatEnum getDateFormat() {
    return dateFormat;
  }


  @JsonProperty(JSON_PROPERTY_DATE_FORMAT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDateFormat(DateFormatEnum dateFormat) {
    this.dateFormat = dateFormat;
  }


  /**
   * Return true if this SubFieldOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubFieldOptions subFieldOptions = (SubFieldOptions) o;
    return Objects.equals(this.dateFormat, subFieldOptions.dateFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubFieldOptions {\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (dateFormat != null) {
        if (isFileTypeOrListOfFiles(dateFormat)) {
            fileTypeFound = true;
        }

        if (dateFormat.getClass().equals(java.io.File.class) ||
            dateFormat.getClass().equals(Integer.class) ||
            dateFormat.getClass().equals(String.class) ) {
            map.put("date_format", dateFormat);
        } else if (isListOfFile(dateFormat)) {
            for(int i = 0; i< getListSize(dateFormat); i++) {
                map.put("date_format[" + i + "]", getFromList(dateFormat, i));
            }
        }
        else {
            map.put("date_format", JSON.getDefault().getMapper().writeValueAsString(dateFormat));
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    return fileTypeFound ? map : new HashMap<>();
  }

  private boolean isFileTypeOrListOfFiles(Object obj) throws Exception {
    return obj.getClass().equals(java.io.File.class) || isListOfFile(obj);
  }

  private boolean isListOfFile(Object obj) throws Exception {
      return obj instanceof java.util.List && !isListEmpty(obj) && getFromList(obj, 0) instanceof java.io.File;
  }

  private boolean isListEmpty(Object obj) throws Exception {
    return (boolean) Class.forName(java.util.List.class.getName()).getMethod("isEmpty").invoke(obj);
  }

  private Object getFromList(Object obj, int index) throws Exception {
    return Class.forName(java.util.List.class.getName()).getMethod("get", int.class).invoke(obj, index);
  }

  private int getListSize(Object obj) throws Exception {
    return (int) Class.forName(java.util.List.class.getName()).getMethod("size").invoke(obj);
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
