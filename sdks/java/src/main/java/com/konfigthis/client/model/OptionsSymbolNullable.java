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
import com.konfigthis.client.model.UnderlyingSymbol;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.UUID;

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
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Options Symbol
 */
@ApiModel(description = "Options Symbol")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class OptionsSymbolNullable {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_TICKER = "ticker";
  @SerializedName(SERIALIZED_NAME_TICKER)
  private String ticker;

  /**
   * Gets or Sets optionType
   */
  @JsonAdapter(OptionTypeEnum.Adapter.class)
 public enum OptionTypeEnum {
    CALL("CALL"),
    
    PUT("PUT");

    private String value;

    OptionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OptionTypeEnum fromValue(String value) {
      for (OptionTypeEnum b : OptionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OptionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OptionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OptionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OptionTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_OPTION_TYPE = "option_type";
  @SerializedName(SERIALIZED_NAME_OPTION_TYPE)
  private OptionTypeEnum optionType;

  public static final String SERIALIZED_NAME_STRIKE_PRICE = "strike_price";
  @SerializedName(SERIALIZED_NAME_STRIKE_PRICE)
  private Double strikePrice;

  public static final String SERIALIZED_NAME_EXPIRATION_DATE = "expiration_date";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_DATE)
  private String expirationDate;

  public static final String SERIALIZED_NAME_IS_MINI_OPTION = "is_mini_option";
  @SerializedName(SERIALIZED_NAME_IS_MINI_OPTION)
  private Boolean isMiniOption;

  public static final String SERIALIZED_NAME_UNDERLYING_SYMBOL = "underlying_symbol";
  @SerializedName(SERIALIZED_NAME_UNDERLYING_SYMBOL)
  private UnderlyingSymbol underlyingSymbol;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_EXCHANGE_ID = "exchange_id";
  @SerializedName(SERIALIZED_NAME_EXCHANGE_ID)
  private UUID exchangeId;

  public OptionsSymbolNullable() {
  }

  public OptionsSymbolNullable id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2bcd7cc3-e922-4976-bce1-9858296801c3", required = true, value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public OptionsSymbolNullable ticker(String ticker) {
    
    
    
    
    this.ticker = ticker;
    return this;
  }

   /**
   * Get ticker
   * @return ticker
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SPY 220819P00200000", required = true, value = "")

  public String getTicker() {
    return ticker;
  }


  public void setTicker(String ticker) {
    
    
    
    this.ticker = ticker;
  }


  public OptionsSymbolNullable optionType(OptionTypeEnum optionType) {
    
    
    
    
    this.optionType = optionType;
    return this;
  }

   /**
   * Get optionType
   * @return optionType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "CALL", required = true, value = "")

  public OptionTypeEnum getOptionType() {
    return optionType;
  }


  public void setOptionType(OptionTypeEnum optionType) {
    
    
    
    this.optionType = optionType;
  }


  public OptionsSymbolNullable strikePrice(Double strikePrice) {
    
    
    
    
    this.strikePrice = strikePrice;
    return this;
  }

  public OptionsSymbolNullable strikePrice(Integer strikePrice) {
    
    
    
    
    this.strikePrice = strikePrice.doubleValue();
    return this;
  }

   /**
   * Get strikePrice
   * @return strikePrice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "200", required = true, value = "")

  public Double getStrikePrice() {
    return strikePrice;
  }


  public void setStrikePrice(Double strikePrice) {
    
    
    
    this.strikePrice = strikePrice;
  }


  public OptionsSymbolNullable expirationDate(String expirationDate) {
    
    
    
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2017-07-17T15:13:07.177712+00:00", required = true, value = "")

  public String getExpirationDate() {
    return expirationDate;
  }


  public void setExpirationDate(String expirationDate) {
    
    
    
    this.expirationDate = expirationDate;
  }


  public OptionsSymbolNullable isMiniOption(Boolean isMiniOption) {
    
    
    
    
    this.isMiniOption = isMiniOption;
    return this;
  }

   /**
   * Get isMiniOption
   * @return isMiniOption
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "")

  public Boolean getIsMiniOption() {
    return isMiniOption;
  }


  public void setIsMiniOption(Boolean isMiniOption) {
    
    
    
    this.isMiniOption = isMiniOption;
  }


  public OptionsSymbolNullable underlyingSymbol(UnderlyingSymbol underlyingSymbol) {
    
    
    
    
    this.underlyingSymbol = underlyingSymbol;
    return this;
  }

   /**
   * Get underlyingSymbol
   * @return underlyingSymbol
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UnderlyingSymbol getUnderlyingSymbol() {
    return underlyingSymbol;
  }


  public void setUnderlyingSymbol(UnderlyingSymbol underlyingSymbol) {
    
    
    
    this.underlyingSymbol = underlyingSymbol;
  }


  public OptionsSymbolNullable localId(String localId) {
    
    
    
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "40817960", value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    
    
    
    this.localId = localId;
  }


  public OptionsSymbolNullable exchangeId(UUID exchangeId) {
    
    
    
    
    this.exchangeId = exchangeId;
    return this;
  }

   /**
   * Get exchangeId
   * @return exchangeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getExchangeId() {
    return exchangeId;
  }


  public void setExchangeId(UUID exchangeId) {
    
    
    
    this.exchangeId = exchangeId;
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
   * @return the OptionsSymbolNullable instance itself
   */
  public OptionsSymbolNullable putAdditionalProperty(String key, Object value) {
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
    OptionsSymbolNullable optionsSymbolNullable = (OptionsSymbolNullable) o;
    return Objects.equals(this.id, optionsSymbolNullable.id) &&
        Objects.equals(this.ticker, optionsSymbolNullable.ticker) &&
        Objects.equals(this.optionType, optionsSymbolNullable.optionType) &&
        Objects.equals(this.strikePrice, optionsSymbolNullable.strikePrice) &&
        Objects.equals(this.expirationDate, optionsSymbolNullable.expirationDate) &&
        Objects.equals(this.isMiniOption, optionsSymbolNullable.isMiniOption) &&
        Objects.equals(this.underlyingSymbol, optionsSymbolNullable.underlyingSymbol) &&
        Objects.equals(this.localId, optionsSymbolNullable.localId) &&
        Objects.equals(this.exchangeId, optionsSymbolNullable.exchangeId)&&
        Objects.equals(this.additionalProperties, optionsSymbolNullable.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, ticker, optionType, strikePrice, expirationDate, isMiniOption, underlyingSymbol, localId, exchangeId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OptionsSymbolNullable {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ticker: ").append(toIndentedString(ticker)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
    sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    isMiniOption: ").append(toIndentedString(isMiniOption)).append("\n");
    sb.append("    underlyingSymbol: ").append(toIndentedString(underlyingSymbol)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    exchangeId: ").append(toIndentedString(exchangeId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("ticker");
    openapiFields.add("option_type");
    openapiFields.add("strike_price");
    openapiFields.add("expiration_date");
    openapiFields.add("is_mini_option");
    openapiFields.add("underlying_symbol");
    openapiFields.add("local_id");
    openapiFields.add("exchange_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("ticker");
    openapiRequiredFields.add("option_type");
    openapiRequiredFields.add("strike_price");
    openapiRequiredFields.add("expiration_date");
    openapiRequiredFields.add("underlying_symbol");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OptionsSymbolNullable
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!OptionsSymbolNullable.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in OptionsSymbolNullable is not found in the empty JSON string", OptionsSymbolNullable.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : OptionsSymbolNullable.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("ticker").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ticker` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ticker").toString()));
      }
      if (!jsonObj.get("option_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `option_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("option_type").toString()));
      }
      if (!jsonObj.get("expiration_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expiration_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expiration_date").toString()));
      }
      // validate the required field `underlying_symbol`
      UnderlyingSymbol.validateJsonObject(jsonObj.getAsJsonObject("underlying_symbol"));
      if ((jsonObj.get("local_id") != null && !jsonObj.get("local_id").isJsonNull()) && !jsonObj.get("local_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `local_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("local_id").toString()));
      }
      if ((jsonObj.get("exchange_id") != null && !jsonObj.get("exchange_id").isJsonNull()) && !jsonObj.get("exchange_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `exchange_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("exchange_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OptionsSymbolNullable.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OptionsSymbolNullable' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OptionsSymbolNullable> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OptionsSymbolNullable.class));

       return (TypeAdapter<T>) new TypeAdapter<OptionsSymbolNullable>() {
           @Override
           public void write(JsonWriter out, OptionsSymbolNullable value) throws IOException {
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
           public OptionsSymbolNullable read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             OptionsSymbolNullable instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of OptionsSymbolNullable given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OptionsSymbolNullable
  * @throws IOException if the JSON string is invalid with respect to OptionsSymbolNullable
  */
  public static OptionsSymbolNullable fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OptionsSymbolNullable.class);
  }

 /**
  * Convert an instance of OptionsSymbolNullable to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

