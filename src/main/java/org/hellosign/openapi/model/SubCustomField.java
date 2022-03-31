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
 * An array defining values and options for custom fields. Required when defining pre-set values in &#x60;form_fields_per_document&#x60; or [Text Tags](https://app.hellosign.com/api/textTagsWalkthrough#TextTagIntro).
 */
@ApiModel(description = "An array defining values and options for custom fields. Required when defining pre-set values in `form_fields_per_document` or [Text Tags](https://app.hellosign.com/api/textTagsWalkthrough#TextTagIntro).")
@JsonPropertyOrder({
    SubCustomField.JSON_PROPERTY_NAME,
    SubCustomField.JSON_PROPERTY_EDITOR,
    SubCustomField.JSON_PROPERTY_REQUIRED,
    SubCustomField.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubCustomField {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EDITOR = "editor";
  private String editor;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required = false;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public SubCustomField() { 
  }

  public SubCustomField name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name, or \&quot;Field Label,\&quot; of the custom field (the field&#39;s API ID can be used here as well).
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name, or \"Field Label,\" of the custom field (the field's API ID can be used here as well).")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public SubCustomField editor(String editor) {
    this.editor = editor;
    return this;
  }

   /**
   * The RoleName allowed to edit the custom field (optional, but required if &#x60;required &#x3D; true&#x60;).  **Note**: Editable &#x60;custom_fields&#x60; are only supported for single signer requests or the first signer of ordered signature requests. If more than one signer is assigned to the unordered signature request, any editor value is ignored and the field will not be editable.
   * @return editor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The RoleName allowed to edit the custom field (optional, but required if `required = true`).  **Note**: Editable `custom_fields` are only supported for single signer requests or the first signer of ordered signature requests. If more than one signer is assigned to the unordered signature request, any editor value is ignored and the field will not be editable.")
  @JsonProperty(JSON_PROPERTY_EDITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEditor() {
    return editor;
  }


  @JsonProperty(JSON_PROPERTY_EDITOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEditor(String editor) {
    this.editor = editor;
  }


  public SubCustomField required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * A boolean describing if this field is required
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean describing if this field is required")
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequired() {
    return required;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequired(Boolean required) {
    this.required = required;
  }


  public SubCustomField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the custom field
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The value of the custom field")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this SubCustomField object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubCustomField subCustomField = (SubCustomField) o;
    return Objects.equals(this.name, subCustomField.name) &&
        Objects.equals(this.editor, subCustomField.editor) &&
        Objects.equals(this.required, subCustomField.required) &&
        Objects.equals(this.value, subCustomField.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, editor, required, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubCustomField {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    editor: ").append(toIndentedString(editor)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (name != null) {
        if (isFileTypeOrListOfFiles(name)) {
            fileTypeFound = true;
        }

        if (name.getClass().equals(java.io.File.class) ||
            name.getClass().equals(Integer.class) ||
            name.getClass().equals(String.class) ) {
            map.put("name", name);
        } else if (isListOfFile(name)) {
            for(int i = 0; i< getListSize(name); i++) {
                map.put("name[" + i + "]", getFromList(name, i));
            }
        }
        else {
            map.put("name", JSON.getDefault().getMapper().writeValueAsString(name));
        }
    }
    if (editor != null) {
        if (isFileTypeOrListOfFiles(editor)) {
            fileTypeFound = true;
        }

        if (editor.getClass().equals(java.io.File.class) ||
            editor.getClass().equals(Integer.class) ||
            editor.getClass().equals(String.class) ) {
            map.put("editor", editor);
        } else if (isListOfFile(editor)) {
            for(int i = 0; i< getListSize(editor); i++) {
                map.put("editor[" + i + "]", getFromList(editor, i));
            }
        }
        else {
            map.put("editor", JSON.getDefault().getMapper().writeValueAsString(editor));
        }
    }
    if (required != null) {
        if (isFileTypeOrListOfFiles(required)) {
            fileTypeFound = true;
        }

        if (required.getClass().equals(java.io.File.class) ||
            required.getClass().equals(Integer.class) ||
            required.getClass().equals(String.class) ) {
            map.put("required", required);
        } else if (isListOfFile(required)) {
            for(int i = 0; i< getListSize(required); i++) {
                map.put("required[" + i + "]", getFromList(required, i));
            }
        }
        else {
            map.put("required", JSON.getDefault().getMapper().writeValueAsString(required));
        }
    }
    if (value != null) {
        if (isFileTypeOrListOfFiles(value)) {
            fileTypeFound = true;
        }

        if (value.getClass().equals(java.io.File.class) ||
            value.getClass().equals(Integer.class) ||
            value.getClass().equals(String.class) ) {
            map.put("value", value);
        } else if (isListOfFile(value)) {
            for(int i = 0; i< getListSize(value); i++) {
                map.put("value[" + i + "]", getFromList(value, i));
            }
        }
        else {
            map.put("value", JSON.getDefault().getMapper().writeValueAsString(value));
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
