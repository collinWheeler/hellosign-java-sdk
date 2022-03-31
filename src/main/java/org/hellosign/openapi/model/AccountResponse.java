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
import org.hellosign.openapi.model.AccountResponseQuotas;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.hellosign.openapi.JSON;


import org.hellosign.openapi.ApiException;
/**
 * AccountResponse
 */
@JsonPropertyOrder({
    AccountResponse.JSON_PROPERTY_ACCOUNT_ID,
    AccountResponse.JSON_PROPERTY_EMAIL_ADDRESS,
    AccountResponse.JSON_PROPERTY_IS_LOCKED,
    AccountResponse.JSON_PROPERTY_IS_PAID_HS,
    AccountResponse.JSON_PROPERTY_IS_PAID_HF,
    AccountResponse.JSON_PROPERTY_QUOTAS,
    AccountResponse.JSON_PROPERTY_CALLBACK_URL,
    AccountResponse.JSON_PROPERTY_ROLE_CODE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountResponse {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
  private String emailAddress;

  public static final String JSON_PROPERTY_IS_LOCKED = "is_locked";
  private Boolean isLocked;

  public static final String JSON_PROPERTY_IS_PAID_HS = "is_paid_hs";
  private Boolean isPaidHs;

  public static final String JSON_PROPERTY_IS_PAID_HF = "is_paid_hf";
  private Boolean isPaidHf;

  public static final String JSON_PROPERTY_QUOTAS = "quotas";
  private AccountResponseQuotas quotas;

  public static final String JSON_PROPERTY_CALLBACK_URL = "callback_url";
  private String callbackUrl;

  public static final String JSON_PROPERTY_ROLE_CODE = "role_code";
  private String roleCode;

  public AccountResponse() { 
  }

  public AccountResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AccountResponse emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Get emailAddress
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public AccountResponse isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsLocked() {
    return isLocked;
  }


  @JsonProperty(JSON_PROPERTY_IS_LOCKED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }


  public AccountResponse isPaidHs(Boolean isPaidHs) {
    this.isPaidHs = isPaidHs;
    return this;
  }

   /**
   * Get isPaidHs
   * @return isPaidHs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PAID_HS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPaidHs() {
    return isPaidHs;
  }


  @JsonProperty(JSON_PROPERTY_IS_PAID_HS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPaidHs(Boolean isPaidHs) {
    this.isPaidHs = isPaidHs;
  }


  public AccountResponse isPaidHf(Boolean isPaidHf) {
    this.isPaidHf = isPaidHf;
    return this;
  }

   /**
   * Get isPaidHf
   * @return isPaidHf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PAID_HF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPaidHf() {
    return isPaidHf;
  }


  @JsonProperty(JSON_PROPERTY_IS_PAID_HF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPaidHf(Boolean isPaidHf) {
    this.isPaidHf = isPaidHf;
  }


  public AccountResponse quotas(AccountResponseQuotas quotas) {
    this.quotas = quotas;
    return this;
  }

   /**
   * Get quotas
   * @return quotas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUOTAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountResponseQuotas getQuotas() {
    return quotas;
  }


  @JsonProperty(JSON_PROPERTY_QUOTAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuotas(AccountResponseQuotas quotas) {
    this.quotas = quotas;
  }


  public AccountResponse callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Get callbackUrl
   * @return callbackUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCallbackUrl() {
    return callbackUrl;
  }


  @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  public AccountResponse roleCode(String roleCode) {
    this.roleCode = roleCode;
    return this;
  }

   /**
   * Get roleCode
   * @return roleCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROLE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoleCode() {
    return roleCode;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleCode(String roleCode) {
    this.roleCode = roleCode;
  }


  /**
   * Return true if this AccountResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountResponse accountResponse = (AccountResponse) o;
    return Objects.equals(this.accountId, accountResponse.accountId) &&
        Objects.equals(this.emailAddress, accountResponse.emailAddress) &&
        Objects.equals(this.isLocked, accountResponse.isLocked) &&
        Objects.equals(this.isPaidHs, accountResponse.isPaidHs) &&
        Objects.equals(this.isPaidHf, accountResponse.isPaidHf) &&
        Objects.equals(this.quotas, accountResponse.quotas) &&
        Objects.equals(this.callbackUrl, accountResponse.callbackUrl) &&
        Objects.equals(this.roleCode, accountResponse.roleCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, emailAddress, isLocked, isPaidHs, isPaidHf, quotas, callbackUrl, roleCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountResponse {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    isPaidHs: ").append(toIndentedString(isPaidHs)).append("\n");
    sb.append("    isPaidHf: ").append(toIndentedString(isPaidHf)).append("\n");
    sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (accountId != null) {
        if (isFileTypeOrListOfFiles(accountId)) {
            fileTypeFound = true;
        }

        if (accountId.getClass().equals(java.io.File.class) ||
            accountId.getClass().equals(Integer.class) ||
            accountId.getClass().equals(String.class) ) {
            map.put("account_id", accountId);
        } else if (isListOfFile(accountId)) {
            for(int i = 0; i< getListSize(accountId); i++) {
                map.put("account_id[" + i + "]", getFromList(accountId, i));
            }
        }
        else {
            map.put("account_id", JSON.getDefault().getMapper().writeValueAsString(accountId));
        }
    }
    if (emailAddress != null) {
        if (isFileTypeOrListOfFiles(emailAddress)) {
            fileTypeFound = true;
        }

        if (emailAddress.getClass().equals(java.io.File.class) ||
            emailAddress.getClass().equals(Integer.class) ||
            emailAddress.getClass().equals(String.class) ) {
            map.put("email_address", emailAddress);
        } else if (isListOfFile(emailAddress)) {
            for(int i = 0; i< getListSize(emailAddress); i++) {
                map.put("email_address[" + i + "]", getFromList(emailAddress, i));
            }
        }
        else {
            map.put("email_address", JSON.getDefault().getMapper().writeValueAsString(emailAddress));
        }
    }
    if (isLocked != null) {
        if (isFileTypeOrListOfFiles(isLocked)) {
            fileTypeFound = true;
        }

        if (isLocked.getClass().equals(java.io.File.class) ||
            isLocked.getClass().equals(Integer.class) ||
            isLocked.getClass().equals(String.class) ) {
            map.put("is_locked", isLocked);
        } else if (isListOfFile(isLocked)) {
            for(int i = 0; i< getListSize(isLocked); i++) {
                map.put("is_locked[" + i + "]", getFromList(isLocked, i));
            }
        }
        else {
            map.put("is_locked", JSON.getDefault().getMapper().writeValueAsString(isLocked));
        }
    }
    if (isPaidHs != null) {
        if (isFileTypeOrListOfFiles(isPaidHs)) {
            fileTypeFound = true;
        }

        if (isPaidHs.getClass().equals(java.io.File.class) ||
            isPaidHs.getClass().equals(Integer.class) ||
            isPaidHs.getClass().equals(String.class) ) {
            map.put("is_paid_hs", isPaidHs);
        } else if (isListOfFile(isPaidHs)) {
            for(int i = 0; i< getListSize(isPaidHs); i++) {
                map.put("is_paid_hs[" + i + "]", getFromList(isPaidHs, i));
            }
        }
        else {
            map.put("is_paid_hs", JSON.getDefault().getMapper().writeValueAsString(isPaidHs));
        }
    }
    if (isPaidHf != null) {
        if (isFileTypeOrListOfFiles(isPaidHf)) {
            fileTypeFound = true;
        }

        if (isPaidHf.getClass().equals(java.io.File.class) ||
            isPaidHf.getClass().equals(Integer.class) ||
            isPaidHf.getClass().equals(String.class) ) {
            map.put("is_paid_hf", isPaidHf);
        } else if (isListOfFile(isPaidHf)) {
            for(int i = 0; i< getListSize(isPaidHf); i++) {
                map.put("is_paid_hf[" + i + "]", getFromList(isPaidHf, i));
            }
        }
        else {
            map.put("is_paid_hf", JSON.getDefault().getMapper().writeValueAsString(isPaidHf));
        }
    }
    if (quotas != null) {
        if (isFileTypeOrListOfFiles(quotas)) {
            fileTypeFound = true;
        }

        if (quotas.getClass().equals(java.io.File.class) ||
            quotas.getClass().equals(Integer.class) ||
            quotas.getClass().equals(String.class) ) {
            map.put("quotas", quotas);
        } else if (isListOfFile(quotas)) {
            for(int i = 0; i< getListSize(quotas); i++) {
                map.put("quotas[" + i + "]", getFromList(quotas, i));
            }
        }
        else {
            map.put("quotas", JSON.getDefault().getMapper().writeValueAsString(quotas));
        }
    }
    if (callbackUrl != null) {
        if (isFileTypeOrListOfFiles(callbackUrl)) {
            fileTypeFound = true;
        }

        if (callbackUrl.getClass().equals(java.io.File.class) ||
            callbackUrl.getClass().equals(Integer.class) ||
            callbackUrl.getClass().equals(String.class) ) {
            map.put("callback_url", callbackUrl);
        } else if (isListOfFile(callbackUrl)) {
            for(int i = 0; i< getListSize(callbackUrl); i++) {
                map.put("callback_url[" + i + "]", getFromList(callbackUrl, i));
            }
        }
        else {
            map.put("callback_url", JSON.getDefault().getMapper().writeValueAsString(callbackUrl));
        }
    }
    if (roleCode != null) {
        if (isFileTypeOrListOfFiles(roleCode)) {
            fileTypeFound = true;
        }

        if (roleCode.getClass().equals(java.io.File.class) ||
            roleCode.getClass().equals(Integer.class) ||
            roleCode.getClass().equals(String.class) ) {
            map.put("role_code", roleCode);
        } else if (isListOfFile(roleCode)) {
            for(int i = 0; i< getListSize(roleCode); i++) {
                map.put("role_code[" + i + "]", getFromList(roleCode, i));
            }
        }
        else {
            map.put("role_code", JSON.getDefault().getMapper().writeValueAsString(roleCode));
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
