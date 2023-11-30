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
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Manual trade symbol object
 */
@ApiModel(description = "Manual trade symbol object")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ManualTradeSymbol {
  public static final String SERIALIZED_NAME_BROKERAGE_SYMBOL_ID = "brokerage_symbol_id";
  @SerializedName(SERIALIZED_NAME_BROKERAGE_SYMBOL_ID)
  private UUID brokerageSymbolId;

  public static final String SERIALIZED_NAME_UNIVERSAL_SYMBOL_ID = "universal_symbol_id";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_SYMBOL_ID)
  private UUID universalSymbolId;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Currency currency;

  public static final String SERIALIZED_NAME_LOCAL_ID = "local_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ID)
  private String localId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_SYMBOL = "symbol";
  @SerializedName(SERIALIZED_NAME_SYMBOL)
  private String symbol;

  public ManualTradeSymbol() {
  }

  public ManualTradeSymbol brokerageSymbolId(UUID brokerageSymbolId) {
    
    
    
    
    this.brokerageSymbolId = brokerageSymbolId;
    return this;
  }

   /**
   * Get brokerageSymbolId
   * @return brokerageSymbolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2bcd7cc3-e922-4976-bce1-9858296801c3", value = "")

  public UUID getBrokerageSymbolId() {
    return brokerageSymbolId;
  }


  public void setBrokerageSymbolId(UUID brokerageSymbolId) {
    
    
    
    this.brokerageSymbolId = brokerageSymbolId;
  }


  public ManualTradeSymbol universalSymbolId(UUID universalSymbolId) {
    
    
    
    
    this.universalSymbolId = universalSymbolId;
    return this;
  }

   /**
   * Get universalSymbolId
   * @return universalSymbolId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2bcd7cc3-e922-4976-bce1-9858296801c3", value = "")

  public UUID getUniversalSymbolId() {
    return universalSymbolId;
  }


  public void setUniversalSymbolId(UUID universalSymbolId) {
    
    
    
    this.universalSymbolId = universalSymbolId;
  }


  public ManualTradeSymbol currency(Currency currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Currency getCurrency() {
    return currency;
  }


  public void setCurrency(Currency currency) {
    
    
    
    this.currency = currency;
  }


  public ManualTradeSymbol localId(String localId) {
    
    
    
    
    this.localId = localId;
    return this;
  }

   /**
   * Get localId
   * @return localId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1048101", value = "")

  public String getLocalId() {
    return localId;
  }


  public void setLocalId(String localId) {
    
    
    
    this.localId = localId;
  }


  public ManualTradeSymbol description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Metaverse Global ETF", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ManualTradeSymbol symbol(String symbol) {
    
    
    
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MVGP.U.TO", value = "")

  public String getSymbol() {
    return symbol;
  }


  public void setSymbol(String symbol) {
    
    
    
    this.symbol = symbol;
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
   * @return the ManualTradeSymbol instance itself
   */
  public ManualTradeSymbol putAdditionalProperty(String key, Object value) {
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
    ManualTradeSymbol manualTradeSymbol = (ManualTradeSymbol) o;
    return Objects.equals(this.brokerageSymbolId, manualTradeSymbol.brokerageSymbolId) &&
        Objects.equals(this.universalSymbolId, manualTradeSymbol.universalSymbolId) &&
        Objects.equals(this.currency, manualTradeSymbol.currency) &&
        Objects.equals(this.localId, manualTradeSymbol.localId) &&
        Objects.equals(this.description, manualTradeSymbol.description) &&
        Objects.equals(this.symbol, manualTradeSymbol.symbol)&&
        Objects.equals(this.additionalProperties, manualTradeSymbol.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(brokerageSymbolId, universalSymbolId, currency, localId, description, symbol, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManualTradeSymbol {\n");
    sb.append("    brokerageSymbolId: ").append(toIndentedString(brokerageSymbolId)).append("\n");
    sb.append("    universalSymbolId: ").append(toIndentedString(universalSymbolId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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
    openapiFields.add("brokerage_symbol_id");
    openapiFields.add("universal_symbol_id");
    openapiFields.add("currency");
    openapiFields.add("local_id");
    openapiFields.add("description");
    openapiFields.add("symbol");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ManualTradeSymbol
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ManualTradeSymbol.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ManualTradeSymbol is not found in the empty JSON string", ManualTradeSymbol.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("brokerage_symbol_id") != null && !jsonObj.get("brokerage_symbol_id").isJsonNull()) && !jsonObj.get("brokerage_symbol_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brokerage_symbol_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brokerage_symbol_id").toString()));
      }
      if ((jsonObj.get("universal_symbol_id") != null && !jsonObj.get("universal_symbol_id").isJsonNull()) && !jsonObj.get("universal_symbol_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `universal_symbol_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("universal_symbol_id").toString()));
      }
      // validate the optional field `currency`
      if (jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) {
        Currency.validateJsonObject(jsonObj.getAsJsonObject("currency"));
      }
      if ((jsonObj.get("local_id") != null && !jsonObj.get("local_id").isJsonNull()) && !jsonObj.get("local_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `local_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("local_id").toString()));
      }
      if (!jsonObj.get("description").isJsonNull() && (jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull()) && !jsonObj.get("symbol").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `symbol` to be a primitive type in the JSON string but got `%s`", jsonObj.get("symbol").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManualTradeSymbol.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManualTradeSymbol' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManualTradeSymbol> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManualTradeSymbol.class));

       return (TypeAdapter<T>) new TypeAdapter<ManualTradeSymbol>() {
           @Override
           public void write(JsonWriter out, ManualTradeSymbol value) throws IOException {
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
           public ManualTradeSymbol read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ManualTradeSymbol instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ManualTradeSymbol given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ManualTradeSymbol
  * @throws IOException if the JSON string is invalid with respect to ManualTradeSymbol
  */
  public static ManualTradeSymbol fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManualTradeSymbol.class);
  }

 /**
  * Convert an instance of ManualTradeSymbol to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

