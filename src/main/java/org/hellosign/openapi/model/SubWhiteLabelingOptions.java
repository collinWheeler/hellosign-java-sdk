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
 * An array of elements and values serialized to a string, to be used to customize the app&#39;s signer page. (Only applies to some API plans)  Take a look at our [white labeling guide](/api/reference/white-labeling/) to learn more.
 */
@ApiModel(description = "An array of elements and values serialized to a string, to be used to customize the app's signer page. (Only applies to some API plans)  Take a look at our [white labeling guide](/api/reference/white-labeling/) to learn more.")
@JsonPropertyOrder({
    SubWhiteLabelingOptions.JSON_PROPERTY_HEADER_BACKGROUND_COLOR,
    SubWhiteLabelingOptions.JSON_PROPERTY_LEGAL_VERSION,
    SubWhiteLabelingOptions.JSON_PROPERTY_LINK_COLOR,
    SubWhiteLabelingOptions.JSON_PROPERTY_PAGE_BACKGROUND_COLOR,
    SubWhiteLabelingOptions.JSON_PROPERTY_PRIMARY_BUTTON_COLOR,
    SubWhiteLabelingOptions.JSON_PROPERTY_PRIMARY_BUTTON_COLOR_HOVER,
    SubWhiteLabelingOptions.JSON_PROPERTY_PRIMARY_BUTTON_TEXT_COLOR,
    SubWhiteLabelingOptions.JSON_PROPERTY_PRIMARY_BUTTON_TEXT_COLOR_HOVER,
    SubWhiteLabelingOptions.JSON_PROPERTY_SECONDARY_BUTTON_COLOR,
    SubWhiteLabelingOptions.JSON_PROPERTY_SECONDARY_BUTTON_COLOR_HOVER,
    SubWhiteLabelingOptions.JSON_PROPERTY_SECONDARY_BUTTON_TEXT_COLOR,
    SubWhiteLabelingOptions.JSON_PROPERTY_SECONDARY_BUTTON_TEXT_COLOR_HOVER,
    SubWhiteLabelingOptions.JSON_PROPERTY_TEXT_COLOR1,
    SubWhiteLabelingOptions.JSON_PROPERTY_TEXT_COLOR2
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubWhiteLabelingOptions {
  public static final String JSON_PROPERTY_HEADER_BACKGROUND_COLOR = "header_background_color";
  private String headerBackgroundColor = "#1A1A1A";

  /**
   * Gets or Sets legalVersion
   */
  public enum LegalVersionEnum {
    TERMS1("terms1"),
    
    TERMS2("terms2");

    private String value;

    LegalVersionEnum(String value) {
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
    public static LegalVersionEnum fromValue(String value) {
      for (LegalVersionEnum b : LegalVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_LEGAL_VERSION = "legal_version";
  private LegalVersionEnum legalVersion = LegalVersionEnum.TERMS1;

  public static final String JSON_PROPERTY_LINK_COLOR = "link_color";
  private String linkColor = "#00B3E6";

  public static final String JSON_PROPERTY_PAGE_BACKGROUND_COLOR = "page_background_color";
  private String pageBackgroundColor = "#F7F8F9";

  public static final String JSON_PROPERTY_PRIMARY_BUTTON_COLOR = "primary_button_color";
  private String primaryButtonColor = "#00B3E6";

  public static final String JSON_PROPERTY_PRIMARY_BUTTON_COLOR_HOVER = "primary_button_color_hover";
  private String primaryButtonColorHover = "#00B3E6";

  public static final String JSON_PROPERTY_PRIMARY_BUTTON_TEXT_COLOR = "primary_button_text_color";
  private String primaryButtonTextColor = "#FFFFFF";

  public static final String JSON_PROPERTY_PRIMARY_BUTTON_TEXT_COLOR_HOVER = "primary_button_text_color_hover";
  private String primaryButtonTextColorHover = "#FFFFFF";

  public static final String JSON_PROPERTY_SECONDARY_BUTTON_COLOR = "secondary_button_color";
  private String secondaryButtonColor = "#FFFFFF";

  public static final String JSON_PROPERTY_SECONDARY_BUTTON_COLOR_HOVER = "secondary_button_color_hover";
  private String secondaryButtonColorHover = "#FFFFFF";

  public static final String JSON_PROPERTY_SECONDARY_BUTTON_TEXT_COLOR = "secondary_button_text_color";
  private String secondaryButtonTextColor = "#00B3E6";

  public static final String JSON_PROPERTY_SECONDARY_BUTTON_TEXT_COLOR_HOVER = "secondary_button_text_color_hover";
  private String secondaryButtonTextColorHover = "#00B3E6";

  public static final String JSON_PROPERTY_TEXT_COLOR1 = "text_color1";
  private String textColor1 = "#808080";

  public static final String JSON_PROPERTY_TEXT_COLOR2 = "text_color2";
  private String textColor2 = "#FFFFFF";

  public SubWhiteLabelingOptions() { 
  }

  public SubWhiteLabelingOptions headerBackgroundColor(String headerBackgroundColor) {
    this.headerBackgroundColor = headerBackgroundColor;
    return this;
  }

   /**
   * Get headerBackgroundColor
   * @return headerBackgroundColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEADER_BACKGROUND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHeaderBackgroundColor() {
    return headerBackgroundColor;
  }


  @JsonProperty(JSON_PROPERTY_HEADER_BACKGROUND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeaderBackgroundColor(String headerBackgroundColor) {
    this.headerBackgroundColor = headerBackgroundColor;
  }


  public SubWhiteLabelingOptions legalVersion(LegalVersionEnum legalVersion) {
    this.legalVersion = legalVersion;
    return this;
  }

   /**
   * Get legalVersion
   * @return legalVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LEGAL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LegalVersionEnum getLegalVersion() {
    return legalVersion;
  }


  @JsonProperty(JSON_PROPERTY_LEGAL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegalVersion(LegalVersionEnum legalVersion) {
    this.legalVersion = legalVersion;
  }


  public SubWhiteLabelingOptions linkColor(String linkColor) {
    this.linkColor = linkColor;
    return this;
  }

   /**
   * Get linkColor
   * @return linkColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINK_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLinkColor() {
    return linkColor;
  }


  @JsonProperty(JSON_PROPERTY_LINK_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkColor(String linkColor) {
    this.linkColor = linkColor;
  }


  public SubWhiteLabelingOptions pageBackgroundColor(String pageBackgroundColor) {
    this.pageBackgroundColor = pageBackgroundColor;
    return this;
  }

   /**
   * Get pageBackgroundColor
   * @return pageBackgroundColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGE_BACKGROUND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPageBackgroundColor() {
    return pageBackgroundColor;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_BACKGROUND_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPageBackgroundColor(String pageBackgroundColor) {
    this.pageBackgroundColor = pageBackgroundColor;
  }


  public SubWhiteLabelingOptions primaryButtonColor(String primaryButtonColor) {
    this.primaryButtonColor = primaryButtonColor;
    return this;
  }

   /**
   * Get primaryButtonColor
   * @return primaryButtonColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIMARY_BUTTON_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryButtonColor() {
    return primaryButtonColor;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_BUTTON_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryButtonColor(String primaryButtonColor) {
    this.primaryButtonColor = primaryButtonColor;
  }


  public SubWhiteLabelingOptions primaryButtonColorHover(String primaryButtonColorHover) {
    this.primaryButtonColorHover = primaryButtonColorHover;
    return this;
  }

   /**
   * Get primaryButtonColorHover
   * @return primaryButtonColorHover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIMARY_BUTTON_COLOR_HOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryButtonColorHover() {
    return primaryButtonColorHover;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_BUTTON_COLOR_HOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryButtonColorHover(String primaryButtonColorHover) {
    this.primaryButtonColorHover = primaryButtonColorHover;
  }


  public SubWhiteLabelingOptions primaryButtonTextColor(String primaryButtonTextColor) {
    this.primaryButtonTextColor = primaryButtonTextColor;
    return this;
  }

   /**
   * Get primaryButtonTextColor
   * @return primaryButtonTextColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIMARY_BUTTON_TEXT_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryButtonTextColor() {
    return primaryButtonTextColor;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_BUTTON_TEXT_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryButtonTextColor(String primaryButtonTextColor) {
    this.primaryButtonTextColor = primaryButtonTextColor;
  }


  public SubWhiteLabelingOptions primaryButtonTextColorHover(String primaryButtonTextColorHover) {
    this.primaryButtonTextColorHover = primaryButtonTextColorHover;
    return this;
  }

   /**
   * Get primaryButtonTextColorHover
   * @return primaryButtonTextColorHover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRIMARY_BUTTON_TEXT_COLOR_HOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrimaryButtonTextColorHover() {
    return primaryButtonTextColorHover;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY_BUTTON_TEXT_COLOR_HOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimaryButtonTextColorHover(String primaryButtonTextColorHover) {
    this.primaryButtonTextColorHover = primaryButtonTextColorHover;
  }


  public SubWhiteLabelingOptions secondaryButtonColor(String secondaryButtonColor) {
    this.secondaryButtonColor = secondaryButtonColor;
    return this;
  }

   /**
   * Get secondaryButtonColor
   * @return secondaryButtonColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECONDARY_BUTTON_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecondaryButtonColor() {
    return secondaryButtonColor;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_BUTTON_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryButtonColor(String secondaryButtonColor) {
    this.secondaryButtonColor = secondaryButtonColor;
  }


  public SubWhiteLabelingOptions secondaryButtonColorHover(String secondaryButtonColorHover) {
    this.secondaryButtonColorHover = secondaryButtonColorHover;
    return this;
  }

   /**
   * Get secondaryButtonColorHover
   * @return secondaryButtonColorHover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECONDARY_BUTTON_COLOR_HOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecondaryButtonColorHover() {
    return secondaryButtonColorHover;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_BUTTON_COLOR_HOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryButtonColorHover(String secondaryButtonColorHover) {
    this.secondaryButtonColorHover = secondaryButtonColorHover;
  }


  public SubWhiteLabelingOptions secondaryButtonTextColor(String secondaryButtonTextColor) {
    this.secondaryButtonTextColor = secondaryButtonTextColor;
    return this;
  }

   /**
   * Get secondaryButtonTextColor
   * @return secondaryButtonTextColor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECONDARY_BUTTON_TEXT_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecondaryButtonTextColor() {
    return secondaryButtonTextColor;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_BUTTON_TEXT_COLOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryButtonTextColor(String secondaryButtonTextColor) {
    this.secondaryButtonTextColor = secondaryButtonTextColor;
  }


  public SubWhiteLabelingOptions secondaryButtonTextColorHover(String secondaryButtonTextColorHover) {
    this.secondaryButtonTextColorHover = secondaryButtonTextColorHover;
    return this;
  }

   /**
   * Get secondaryButtonTextColorHover
   * @return secondaryButtonTextColorHover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SECONDARY_BUTTON_TEXT_COLOR_HOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecondaryButtonTextColorHover() {
    return secondaryButtonTextColorHover;
  }


  @JsonProperty(JSON_PROPERTY_SECONDARY_BUTTON_TEXT_COLOR_HOVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecondaryButtonTextColorHover(String secondaryButtonTextColorHover) {
    this.secondaryButtonTextColorHover = secondaryButtonTextColorHover;
  }


  public SubWhiteLabelingOptions textColor1(String textColor1) {
    this.textColor1 = textColor1;
    return this;
  }

   /**
   * Get textColor1
   * @return textColor1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEXT_COLOR1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextColor1() {
    return textColor1;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_COLOR1)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextColor1(String textColor1) {
    this.textColor1 = textColor1;
  }


  public SubWhiteLabelingOptions textColor2(String textColor2) {
    this.textColor2 = textColor2;
    return this;
  }

   /**
   * Get textColor2
   * @return textColor2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TEXT_COLOR2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTextColor2() {
    return textColor2;
  }


  @JsonProperty(JSON_PROPERTY_TEXT_COLOR2)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTextColor2(String textColor2) {
    this.textColor2 = textColor2;
  }


  /**
   * Return true if this SubWhiteLabelingOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubWhiteLabelingOptions subWhiteLabelingOptions = (SubWhiteLabelingOptions) o;
    return Objects.equals(this.headerBackgroundColor, subWhiteLabelingOptions.headerBackgroundColor) &&
        Objects.equals(this.legalVersion, subWhiteLabelingOptions.legalVersion) &&
        Objects.equals(this.linkColor, subWhiteLabelingOptions.linkColor) &&
        Objects.equals(this.pageBackgroundColor, subWhiteLabelingOptions.pageBackgroundColor) &&
        Objects.equals(this.primaryButtonColor, subWhiteLabelingOptions.primaryButtonColor) &&
        Objects.equals(this.primaryButtonColorHover, subWhiteLabelingOptions.primaryButtonColorHover) &&
        Objects.equals(this.primaryButtonTextColor, subWhiteLabelingOptions.primaryButtonTextColor) &&
        Objects.equals(this.primaryButtonTextColorHover, subWhiteLabelingOptions.primaryButtonTextColorHover) &&
        Objects.equals(this.secondaryButtonColor, subWhiteLabelingOptions.secondaryButtonColor) &&
        Objects.equals(this.secondaryButtonColorHover, subWhiteLabelingOptions.secondaryButtonColorHover) &&
        Objects.equals(this.secondaryButtonTextColor, subWhiteLabelingOptions.secondaryButtonTextColor) &&
        Objects.equals(this.secondaryButtonTextColorHover, subWhiteLabelingOptions.secondaryButtonTextColorHover) &&
        Objects.equals(this.textColor1, subWhiteLabelingOptions.textColor1) &&
        Objects.equals(this.textColor2, subWhiteLabelingOptions.textColor2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headerBackgroundColor, legalVersion, linkColor, pageBackgroundColor, primaryButtonColor, primaryButtonColorHover, primaryButtonTextColor, primaryButtonTextColorHover, secondaryButtonColor, secondaryButtonColorHover, secondaryButtonTextColor, secondaryButtonTextColorHover, textColor1, textColor2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubWhiteLabelingOptions {\n");
    sb.append("    headerBackgroundColor: ").append(toIndentedString(headerBackgroundColor)).append("\n");
    sb.append("    legalVersion: ").append(toIndentedString(legalVersion)).append("\n");
    sb.append("    linkColor: ").append(toIndentedString(linkColor)).append("\n");
    sb.append("    pageBackgroundColor: ").append(toIndentedString(pageBackgroundColor)).append("\n");
    sb.append("    primaryButtonColor: ").append(toIndentedString(primaryButtonColor)).append("\n");
    sb.append("    primaryButtonColorHover: ").append(toIndentedString(primaryButtonColorHover)).append("\n");
    sb.append("    primaryButtonTextColor: ").append(toIndentedString(primaryButtonTextColor)).append("\n");
    sb.append("    primaryButtonTextColorHover: ").append(toIndentedString(primaryButtonTextColorHover)).append("\n");
    sb.append("    secondaryButtonColor: ").append(toIndentedString(secondaryButtonColor)).append("\n");
    sb.append("    secondaryButtonColorHover: ").append(toIndentedString(secondaryButtonColorHover)).append("\n");
    sb.append("    secondaryButtonTextColor: ").append(toIndentedString(secondaryButtonTextColor)).append("\n");
    sb.append("    secondaryButtonTextColorHover: ").append(toIndentedString(secondaryButtonTextColorHover)).append("\n");
    sb.append("    textColor1: ").append(toIndentedString(textColor1)).append("\n");
    sb.append("    textColor2: ").append(toIndentedString(textColor2)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (headerBackgroundColor != null) {
        if (isFileTypeOrListOfFiles(headerBackgroundColor)) {
            fileTypeFound = true;
        }

        if (headerBackgroundColor.getClass().equals(java.io.File.class) ||
            headerBackgroundColor.getClass().equals(Integer.class) ||
            headerBackgroundColor.getClass().equals(String.class) ) {
            map.put("header_background_color", headerBackgroundColor);
        } else if (isListOfFile(headerBackgroundColor)) {
            for(int i = 0; i< getListSize(headerBackgroundColor); i++) {
                map.put("header_background_color[" + i + "]", getFromList(headerBackgroundColor, i));
            }
        }
        else {
            map.put("header_background_color", JSON.getDefault().getMapper().writeValueAsString(headerBackgroundColor));
        }
    }
    if (legalVersion != null) {
        if (isFileTypeOrListOfFiles(legalVersion)) {
            fileTypeFound = true;
        }

        if (legalVersion.getClass().equals(java.io.File.class) ||
            legalVersion.getClass().equals(Integer.class) ||
            legalVersion.getClass().equals(String.class) ) {
            map.put("legal_version", legalVersion);
        } else if (isListOfFile(legalVersion)) {
            for(int i = 0; i< getListSize(legalVersion); i++) {
                map.put("legal_version[" + i + "]", getFromList(legalVersion, i));
            }
        }
        else {
            map.put("legal_version", JSON.getDefault().getMapper().writeValueAsString(legalVersion));
        }
    }
    if (linkColor != null) {
        if (isFileTypeOrListOfFiles(linkColor)) {
            fileTypeFound = true;
        }

        if (linkColor.getClass().equals(java.io.File.class) ||
            linkColor.getClass().equals(Integer.class) ||
            linkColor.getClass().equals(String.class) ) {
            map.put("link_color", linkColor);
        } else if (isListOfFile(linkColor)) {
            for(int i = 0; i< getListSize(linkColor); i++) {
                map.put("link_color[" + i + "]", getFromList(linkColor, i));
            }
        }
        else {
            map.put("link_color", JSON.getDefault().getMapper().writeValueAsString(linkColor));
        }
    }
    if (pageBackgroundColor != null) {
        if (isFileTypeOrListOfFiles(pageBackgroundColor)) {
            fileTypeFound = true;
        }

        if (pageBackgroundColor.getClass().equals(java.io.File.class) ||
            pageBackgroundColor.getClass().equals(Integer.class) ||
            pageBackgroundColor.getClass().equals(String.class) ) {
            map.put("page_background_color", pageBackgroundColor);
        } else if (isListOfFile(pageBackgroundColor)) {
            for(int i = 0; i< getListSize(pageBackgroundColor); i++) {
                map.put("page_background_color[" + i + "]", getFromList(pageBackgroundColor, i));
            }
        }
        else {
            map.put("page_background_color", JSON.getDefault().getMapper().writeValueAsString(pageBackgroundColor));
        }
    }
    if (primaryButtonColor != null) {
        if (isFileTypeOrListOfFiles(primaryButtonColor)) {
            fileTypeFound = true;
        }

        if (primaryButtonColor.getClass().equals(java.io.File.class) ||
            primaryButtonColor.getClass().equals(Integer.class) ||
            primaryButtonColor.getClass().equals(String.class) ) {
            map.put("primary_button_color", primaryButtonColor);
        } else if (isListOfFile(primaryButtonColor)) {
            for(int i = 0; i< getListSize(primaryButtonColor); i++) {
                map.put("primary_button_color[" + i + "]", getFromList(primaryButtonColor, i));
            }
        }
        else {
            map.put("primary_button_color", JSON.getDefault().getMapper().writeValueAsString(primaryButtonColor));
        }
    }
    if (primaryButtonColorHover != null) {
        if (isFileTypeOrListOfFiles(primaryButtonColorHover)) {
            fileTypeFound = true;
        }

        if (primaryButtonColorHover.getClass().equals(java.io.File.class) ||
            primaryButtonColorHover.getClass().equals(Integer.class) ||
            primaryButtonColorHover.getClass().equals(String.class) ) {
            map.put("primary_button_color_hover", primaryButtonColorHover);
        } else if (isListOfFile(primaryButtonColorHover)) {
            for(int i = 0; i< getListSize(primaryButtonColorHover); i++) {
                map.put("primary_button_color_hover[" + i + "]", getFromList(primaryButtonColorHover, i));
            }
        }
        else {
            map.put("primary_button_color_hover", JSON.getDefault().getMapper().writeValueAsString(primaryButtonColorHover));
        }
    }
    if (primaryButtonTextColor != null) {
        if (isFileTypeOrListOfFiles(primaryButtonTextColor)) {
            fileTypeFound = true;
        }

        if (primaryButtonTextColor.getClass().equals(java.io.File.class) ||
            primaryButtonTextColor.getClass().equals(Integer.class) ||
            primaryButtonTextColor.getClass().equals(String.class) ) {
            map.put("primary_button_text_color", primaryButtonTextColor);
        } else if (isListOfFile(primaryButtonTextColor)) {
            for(int i = 0; i< getListSize(primaryButtonTextColor); i++) {
                map.put("primary_button_text_color[" + i + "]", getFromList(primaryButtonTextColor, i));
            }
        }
        else {
            map.put("primary_button_text_color", JSON.getDefault().getMapper().writeValueAsString(primaryButtonTextColor));
        }
    }
    if (primaryButtonTextColorHover != null) {
        if (isFileTypeOrListOfFiles(primaryButtonTextColorHover)) {
            fileTypeFound = true;
        }

        if (primaryButtonTextColorHover.getClass().equals(java.io.File.class) ||
            primaryButtonTextColorHover.getClass().equals(Integer.class) ||
            primaryButtonTextColorHover.getClass().equals(String.class) ) {
            map.put("primary_button_text_color_hover", primaryButtonTextColorHover);
        } else if (isListOfFile(primaryButtonTextColorHover)) {
            for(int i = 0; i< getListSize(primaryButtonTextColorHover); i++) {
                map.put("primary_button_text_color_hover[" + i + "]", getFromList(primaryButtonTextColorHover, i));
            }
        }
        else {
            map.put("primary_button_text_color_hover", JSON.getDefault().getMapper().writeValueAsString(primaryButtonTextColorHover));
        }
    }
    if (secondaryButtonColor != null) {
        if (isFileTypeOrListOfFiles(secondaryButtonColor)) {
            fileTypeFound = true;
        }

        if (secondaryButtonColor.getClass().equals(java.io.File.class) ||
            secondaryButtonColor.getClass().equals(Integer.class) ||
            secondaryButtonColor.getClass().equals(String.class) ) {
            map.put("secondary_button_color", secondaryButtonColor);
        } else if (isListOfFile(secondaryButtonColor)) {
            for(int i = 0; i< getListSize(secondaryButtonColor); i++) {
                map.put("secondary_button_color[" + i + "]", getFromList(secondaryButtonColor, i));
            }
        }
        else {
            map.put("secondary_button_color", JSON.getDefault().getMapper().writeValueAsString(secondaryButtonColor));
        }
    }
    if (secondaryButtonColorHover != null) {
        if (isFileTypeOrListOfFiles(secondaryButtonColorHover)) {
            fileTypeFound = true;
        }

        if (secondaryButtonColorHover.getClass().equals(java.io.File.class) ||
            secondaryButtonColorHover.getClass().equals(Integer.class) ||
            secondaryButtonColorHover.getClass().equals(String.class) ) {
            map.put("secondary_button_color_hover", secondaryButtonColorHover);
        } else if (isListOfFile(secondaryButtonColorHover)) {
            for(int i = 0; i< getListSize(secondaryButtonColorHover); i++) {
                map.put("secondary_button_color_hover[" + i + "]", getFromList(secondaryButtonColorHover, i));
            }
        }
        else {
            map.put("secondary_button_color_hover", JSON.getDefault().getMapper().writeValueAsString(secondaryButtonColorHover));
        }
    }
    if (secondaryButtonTextColor != null) {
        if (isFileTypeOrListOfFiles(secondaryButtonTextColor)) {
            fileTypeFound = true;
        }

        if (secondaryButtonTextColor.getClass().equals(java.io.File.class) ||
            secondaryButtonTextColor.getClass().equals(Integer.class) ||
            secondaryButtonTextColor.getClass().equals(String.class) ) {
            map.put("secondary_button_text_color", secondaryButtonTextColor);
        } else if (isListOfFile(secondaryButtonTextColor)) {
            for(int i = 0; i< getListSize(secondaryButtonTextColor); i++) {
                map.put("secondary_button_text_color[" + i + "]", getFromList(secondaryButtonTextColor, i));
            }
        }
        else {
            map.put("secondary_button_text_color", JSON.getDefault().getMapper().writeValueAsString(secondaryButtonTextColor));
        }
    }
    if (secondaryButtonTextColorHover != null) {
        if (isFileTypeOrListOfFiles(secondaryButtonTextColorHover)) {
            fileTypeFound = true;
        }

        if (secondaryButtonTextColorHover.getClass().equals(java.io.File.class) ||
            secondaryButtonTextColorHover.getClass().equals(Integer.class) ||
            secondaryButtonTextColorHover.getClass().equals(String.class) ) {
            map.put("secondary_button_text_color_hover", secondaryButtonTextColorHover);
        } else if (isListOfFile(secondaryButtonTextColorHover)) {
            for(int i = 0; i< getListSize(secondaryButtonTextColorHover); i++) {
                map.put("secondary_button_text_color_hover[" + i + "]", getFromList(secondaryButtonTextColorHover, i));
            }
        }
        else {
            map.put("secondary_button_text_color_hover", JSON.getDefault().getMapper().writeValueAsString(secondaryButtonTextColorHover));
        }
    }
    if (textColor1 != null) {
        if (isFileTypeOrListOfFiles(textColor1)) {
            fileTypeFound = true;
        }

        if (textColor1.getClass().equals(java.io.File.class) ||
            textColor1.getClass().equals(Integer.class) ||
            textColor1.getClass().equals(String.class) ) {
            map.put("text_color1", textColor1);
        } else if (isListOfFile(textColor1)) {
            for(int i = 0; i< getListSize(textColor1); i++) {
                map.put("text_color1[" + i + "]", getFromList(textColor1, i));
            }
        }
        else {
            map.put("text_color1", JSON.getDefault().getMapper().writeValueAsString(textColor1));
        }
    }
    if (textColor2 != null) {
        if (isFileTypeOrListOfFiles(textColor2)) {
            fileTypeFound = true;
        }

        if (textColor2.getClass().equals(java.io.File.class) ||
            textColor2.getClass().equals(Integer.class) ||
            textColor2.getClass().equals(String.class) ) {
            map.put("text_color2", textColor2);
        } else if (isListOfFile(textColor2)) {
            for(int i = 0; i< getListSize(textColor2); i++) {
                map.put("text_color2[" + i + "]", getFromList(textColor2, i));
            }
        }
        else {
            map.put("text_color2", JSON.getDefault().getMapper().writeValueAsString(textColor2));
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

