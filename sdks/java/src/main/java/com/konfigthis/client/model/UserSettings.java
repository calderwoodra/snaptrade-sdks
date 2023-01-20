/*
 * SnapTrade
 * Connect brokerage accounts to your app for live positions and trading
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@snaptrade.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Currency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Passiv user account settings
 */
@ApiModel(description = "Passiv user account settings")
@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class UserSettings {
  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RECEIVE_CASH_NOTIFICATION = "receive_cash_notification";
  @SerializedName(SERIALIZED_NAME_RECEIVE_CASH_NOTIFICATION)
  private Boolean receiveCashNotification;

  public static final String SERIALIZED_NAME_RECEIVE_DRIFT_NOTIFICATION = "receive_drift_notification";
  @SerializedName(SERIALIZED_NAME_RECEIVE_DRIFT_NOTIFICATION)
  private Boolean receiveDriftNotification;

  public static final String SERIALIZED_NAME_USER_TRIAL_ACTIVATED = "user_trial_activated";
  @SerializedName(SERIALIZED_NAME_USER_TRIAL_ACTIVATED)
  private Boolean userTrialActivated;

  public static final String SERIALIZED_NAME_ACTIVATED_TRIAL_DATE = "activated_trial_date";
  @SerializedName(SERIALIZED_NAME_ACTIVATED_TRIAL_DATE)
  private String activatedTrialDate;

  public static final String SERIALIZED_NAME_DEMO = "demo";
  @SerializedName(SERIALIZED_NAME_DEMO)
  private Boolean demo;

  public static final String SERIALIZED_NAME_API_ENABLED = "api_enabled";
  @SerializedName(SERIALIZED_NAME_API_ENABLED)
  private Boolean apiEnabled;

  public static final String SERIALIZED_NAME_DRIFT_THRESHOLD = "drift_threshold";
  @SerializedName(SERIALIZED_NAME_DRIFT_THRESHOLD)
  private BigDecimal driftThreshold;

  public static final String SERIALIZED_NAME_PREFERRED_CURRENCY = "preferred_currency";
  @SerializedName(SERIALIZED_NAME_PREFERRED_CURRENCY)
  private Currency preferredCurrency;

  public UserSettings() {
  }

  public UserSettings email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ops@getpassiv.com", value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public UserSettings name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "James Bond", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public UserSettings receiveCashNotification(Boolean receiveCashNotification) {
    
    this.receiveCashNotification = receiveCashNotification;
    return this;
  }

   /**
   * Get receiveCashNotification
   * @return receiveCashNotification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getReceiveCashNotification() {
    return receiveCashNotification;
  }


  public void setReceiveCashNotification(Boolean receiveCashNotification) {
    this.receiveCashNotification = receiveCashNotification;
  }


  public UserSettings receiveDriftNotification(Boolean receiveDriftNotification) {
    
    this.receiveDriftNotification = receiveDriftNotification;
    return this;
  }

   /**
   * Get receiveDriftNotification
   * @return receiveDriftNotification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getReceiveDriftNotification() {
    return receiveDriftNotification;
  }


  public void setReceiveDriftNotification(Boolean receiveDriftNotification) {
    this.receiveDriftNotification = receiveDriftNotification;
  }


  public UserSettings userTrialActivated(Boolean userTrialActivated) {
    
    this.userTrialActivated = userTrialActivated;
    return this;
  }

   /**
   * Get userTrialActivated
   * @return userTrialActivated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getUserTrialActivated() {
    return userTrialActivated;
  }


  public void setUserTrialActivated(Boolean userTrialActivated) {
    this.userTrialActivated = userTrialActivated;
  }


  public UserSettings activatedTrialDate(String activatedTrialDate) {
    
    this.activatedTrialDate = activatedTrialDate;
    return this;
  }

   /**
   * Get activatedTrialDate
   * @return activatedTrialDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-07-17T15:13:07.177712+00:00", value = "")

  public String getActivatedTrialDate() {
    return activatedTrialDate;
  }


  public void setActivatedTrialDate(String activatedTrialDate) {
    this.activatedTrialDate = activatedTrialDate;
  }


  public UserSettings demo(Boolean demo) {
    
    this.demo = demo;
    return this;
  }

   /**
   * Get demo
   * @return demo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getDemo() {
    return demo;
  }


  public void setDemo(Boolean demo) {
    this.demo = demo;
  }


  public UserSettings apiEnabled(Boolean apiEnabled) {
    
    this.apiEnabled = apiEnabled;
    return this;
  }

   /**
   * Get apiEnabled
   * @return apiEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getApiEnabled() {
    return apiEnabled;
  }


  public void setApiEnabled(Boolean apiEnabled) {
    this.apiEnabled = apiEnabled;
  }


  public UserSettings driftThreshold(BigDecimal driftThreshold) {
    
    this.driftThreshold = driftThreshold;
    return this;
  }

   /**
   * Get driftThreshold
   * @return driftThreshold
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "95", value = "")

  public BigDecimal getDriftThreshold() {
    return driftThreshold;
  }


  public void setDriftThreshold(BigDecimal driftThreshold) {
    this.driftThreshold = driftThreshold;
  }


  public UserSettings preferredCurrency(Currency preferredCurrency) {
    
    this.preferredCurrency = preferredCurrency;
    return this;
  }

   /**
   * Get preferredCurrency
   * @return preferredCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Currency getPreferredCurrency() {
    return preferredCurrency;
  }


  public void setPreferredCurrency(Currency preferredCurrency) {
    this.preferredCurrency = preferredCurrency;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the UserSettings instance itself
   */
  public UserSettings putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSettings userSettings = (UserSettings) o;
    return Objects.equals(this.email, userSettings.email) &&
        Objects.equals(this.name, userSettings.name) &&
        Objects.equals(this.receiveCashNotification, userSettings.receiveCashNotification) &&
        Objects.equals(this.receiveDriftNotification, userSettings.receiveDriftNotification) &&
        Objects.equals(this.userTrialActivated, userSettings.userTrialActivated) &&
        Objects.equals(this.activatedTrialDate, userSettings.activatedTrialDate) &&
        Objects.equals(this.demo, userSettings.demo) &&
        Objects.equals(this.apiEnabled, userSettings.apiEnabled) &&
        Objects.equals(this.driftThreshold, userSettings.driftThreshold) &&
        Objects.equals(this.preferredCurrency, userSettings.preferredCurrency)&&
        Objects.equals(this.additionalProperties, userSettings.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, name, receiveCashNotification, receiveDriftNotification, userTrialActivated, activatedTrialDate, demo, apiEnabled, driftThreshold, preferredCurrency, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSettings {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    receiveCashNotification: ").append(toIndentedString(receiveCashNotification)).append("\n");
    sb.append("    receiveDriftNotification: ").append(toIndentedString(receiveDriftNotification)).append("\n");
    sb.append("    userTrialActivated: ").append(toIndentedString(userTrialActivated)).append("\n");
    sb.append("    activatedTrialDate: ").append(toIndentedString(activatedTrialDate)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    apiEnabled: ").append(toIndentedString(apiEnabled)).append("\n");
    sb.append("    driftThreshold: ").append(toIndentedString(driftThreshold)).append("\n");
    sb.append("    preferredCurrency: ").append(toIndentedString(preferredCurrency)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("email");
    openapiFields.add("name");
    openapiFields.add("receive_cash_notification");
    openapiFields.add("receive_drift_notification");
    openapiFields.add("user_trial_activated");
    openapiFields.add("activated_trial_date");
    openapiFields.add("demo");
    openapiFields.add("api_enabled");
    openapiFields.add("drift_threshold");
    openapiFields.add("preferred_currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserSettings
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserSettings is not found in the empty JSON string", UserSettings.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("activated_trial_date") != null && !jsonObj.get("activated_trial_date").isJsonNull()) && !jsonObj.get("activated_trial_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `activated_trial_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("activated_trial_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<UserSettings>() {
           @Override
           public void write(JsonWriter out, UserSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public UserSettings read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             UserSettings instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserSettings given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserSettings
  * @throws IOException if the JSON string is invalid with respect to UserSettings
  */
  public static UserSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserSettings.class);
  }

 /**
  * Convert an instance of UserSettings to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

