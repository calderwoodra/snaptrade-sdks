/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

API version: 1.0.0
Contact: api@snaptrade.com
*/

// Code generated by Konfig (https://konfigthis.com); DO NOT EDIT.

package snaptrade

import (
	"encoding/json"
)

// UnderlyingSymbol Symbol object for the underlying security of an option.
type UnderlyingSymbol struct {
	// Unique identifier for the symbol within SnapTrade. This is the ID used to reference the symbol in SnapTrade API calls.
	Id *string `json:"id,omitempty"`
	// The security's trading ticker symbol. For example \"AAPL\" for Apple Inc. We largely follow the [Yahoo Finance ticker format](https://help.yahoo.com/kb/SLN2310.html)(click on \"Yahoo Finance Market Coverage and Data Delays\"). For example, for securities traded on the Toronto Stock Exchange, the symbol has a '.TO' suffix. For securities traded on NASDAQ or NYSE, the symbol does not have a suffix.
	Symbol *string `json:"symbol,omitempty"`
	// The raw symbol is `symbol` with the exchange suffix removed. For example, if `symbol` is \"VAB.TO\", then `raw_symbol` is \"VAB\".
	RawSymbol *string `json:"raw_symbol,omitempty"`
	// A human-readable description of the security. This is usually the company name or ETF name.
	Description NullableString `json:"description,omitempty"`
	Currency *SymbolCurrency `json:"currency,omitempty"`
	Exchange *UnderlyingSymbolExchange `json:"exchange,omitempty"`
	Type *UnderlyingSymbolType `json:"type,omitempty"`
	// This identifier is unique per security per trading venue. See section 1.4.1 of the [FIGI Standard](https://www.openfigi.com/assets/local/figi-allocation-rules.pdf) for more information. This value should be the same as the `figi_code` in the `figi_instrument` child property.
	FigiCode NullableString `json:"figi_code,omitempty"`
	FigiInstrument NullableSymbolFigiInstrument `json:"figi_instrument,omitempty"`
	// This field is deprecated and should not be used. Please reach out to SnapTrade support if you have a valid usecase for this.
	// Deprecated
	Currencies []Currency `json:"currencies,omitempty"`
	AdditionalProperties map[string]interface{}
}

type _UnderlyingSymbol UnderlyingSymbol

// NewUnderlyingSymbol instantiates a new UnderlyingSymbol object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewUnderlyingSymbol() *UnderlyingSymbol {
	this := UnderlyingSymbol{}
	return &this
}

// NewUnderlyingSymbolWithDefaults instantiates a new UnderlyingSymbol object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewUnderlyingSymbolWithDefaults() *UnderlyingSymbol {
	this := UnderlyingSymbol{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *UnderlyingSymbol) GetId() string {
	if o == nil || isNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UnderlyingSymbol) GetIdOk() (*string, bool) {
	if o == nil || isNil(o.Id) {
    return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *UnderlyingSymbol) HasId() bool {
	if o != nil && !isNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *UnderlyingSymbol) SetId(v string) {
	o.Id = &v
}

// GetSymbol returns the Symbol field value if set, zero value otherwise.
func (o *UnderlyingSymbol) GetSymbol() string {
	if o == nil || isNil(o.Symbol) {
		var ret string
		return ret
	}
	return *o.Symbol
}

// GetSymbolOk returns a tuple with the Symbol field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UnderlyingSymbol) GetSymbolOk() (*string, bool) {
	if o == nil || isNil(o.Symbol) {
    return nil, false
	}
	return o.Symbol, true
}

// HasSymbol returns a boolean if a field has been set.
func (o *UnderlyingSymbol) HasSymbol() bool {
	if o != nil && !isNil(o.Symbol) {
		return true
	}

	return false
}

// SetSymbol gets a reference to the given string and assigns it to the Symbol field.
func (o *UnderlyingSymbol) SetSymbol(v string) {
	o.Symbol = &v
}

// GetRawSymbol returns the RawSymbol field value if set, zero value otherwise.
func (o *UnderlyingSymbol) GetRawSymbol() string {
	if o == nil || isNil(o.RawSymbol) {
		var ret string
		return ret
	}
	return *o.RawSymbol
}

// GetRawSymbolOk returns a tuple with the RawSymbol field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UnderlyingSymbol) GetRawSymbolOk() (*string, bool) {
	if o == nil || isNil(o.RawSymbol) {
    return nil, false
	}
	return o.RawSymbol, true
}

// HasRawSymbol returns a boolean if a field has been set.
func (o *UnderlyingSymbol) HasRawSymbol() bool {
	if o != nil && !isNil(o.RawSymbol) {
		return true
	}

	return false
}

// SetRawSymbol gets a reference to the given string and assigns it to the RawSymbol field.
func (o *UnderlyingSymbol) SetRawSymbol(v string) {
	o.RawSymbol = &v
}

// GetDescription returns the Description field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UnderlyingSymbol) GetDescription() string {
	if o == nil || isNil(o.Description.Get()) {
		var ret string
		return ret
	}
	return *o.Description.Get()
}

// GetDescriptionOk returns a tuple with the Description field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UnderlyingSymbol) GetDescriptionOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.Description.Get(), o.Description.IsSet()
}

// HasDescription returns a boolean if a field has been set.
func (o *UnderlyingSymbol) HasDescription() bool {
	if o != nil && o.Description.IsSet() {
		return true
	}

	return false
}

// SetDescription gets a reference to the given NullableString and assigns it to the Description field.
func (o *UnderlyingSymbol) SetDescription(v string) {
	o.Description.Set(&v)
}
// SetDescriptionNil sets the value for Description to be an explicit nil
func (o *UnderlyingSymbol) SetDescriptionNil() {
	o.Description.Set(nil)
}

// UnsetDescription ensures that no value is present for Description, not even an explicit nil
func (o *UnderlyingSymbol) UnsetDescription() {
	o.Description.Unset()
}

// GetCurrency returns the Currency field value if set, zero value otherwise.
func (o *UnderlyingSymbol) GetCurrency() SymbolCurrency {
	if o == nil || isNil(o.Currency) {
		var ret SymbolCurrency
		return ret
	}
	return *o.Currency
}

// GetCurrencyOk returns a tuple with the Currency field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UnderlyingSymbol) GetCurrencyOk() (*SymbolCurrency, bool) {
	if o == nil || isNil(o.Currency) {
    return nil, false
	}
	return o.Currency, true
}

// HasCurrency returns a boolean if a field has been set.
func (o *UnderlyingSymbol) HasCurrency() bool {
	if o != nil && !isNil(o.Currency) {
		return true
	}

	return false
}

// SetCurrency gets a reference to the given SymbolCurrency and assigns it to the Currency field.
func (o *UnderlyingSymbol) SetCurrency(v SymbolCurrency) {
	o.Currency = &v
}

// GetExchange returns the Exchange field value if set, zero value otherwise.
func (o *UnderlyingSymbol) GetExchange() UnderlyingSymbolExchange {
	if o == nil || isNil(o.Exchange) {
		var ret UnderlyingSymbolExchange
		return ret
	}
	return *o.Exchange
}

// GetExchangeOk returns a tuple with the Exchange field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UnderlyingSymbol) GetExchangeOk() (*UnderlyingSymbolExchange, bool) {
	if o == nil || isNil(o.Exchange) {
    return nil, false
	}
	return o.Exchange, true
}

// HasExchange returns a boolean if a field has been set.
func (o *UnderlyingSymbol) HasExchange() bool {
	if o != nil && !isNil(o.Exchange) {
		return true
	}

	return false
}

// SetExchange gets a reference to the given UnderlyingSymbolExchange and assigns it to the Exchange field.
func (o *UnderlyingSymbol) SetExchange(v UnderlyingSymbolExchange) {
	o.Exchange = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *UnderlyingSymbol) GetType() UnderlyingSymbolType {
	if o == nil || isNil(o.Type) {
		var ret UnderlyingSymbolType
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *UnderlyingSymbol) GetTypeOk() (*UnderlyingSymbolType, bool) {
	if o == nil || isNil(o.Type) {
    return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *UnderlyingSymbol) HasType() bool {
	if o != nil && !isNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given UnderlyingSymbolType and assigns it to the Type field.
func (o *UnderlyingSymbol) SetType(v UnderlyingSymbolType) {
	o.Type = &v
}

// GetFigiCode returns the FigiCode field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UnderlyingSymbol) GetFigiCode() string {
	if o == nil || isNil(o.FigiCode.Get()) {
		var ret string
		return ret
	}
	return *o.FigiCode.Get()
}

// GetFigiCodeOk returns a tuple with the FigiCode field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UnderlyingSymbol) GetFigiCodeOk() (*string, bool) {
	if o == nil {
    return nil, false
	}
	return o.FigiCode.Get(), o.FigiCode.IsSet()
}

// HasFigiCode returns a boolean if a field has been set.
func (o *UnderlyingSymbol) HasFigiCode() bool {
	if o != nil && o.FigiCode.IsSet() {
		return true
	}

	return false
}

// SetFigiCode gets a reference to the given NullableString and assigns it to the FigiCode field.
func (o *UnderlyingSymbol) SetFigiCode(v string) {
	o.FigiCode.Set(&v)
}
// SetFigiCodeNil sets the value for FigiCode to be an explicit nil
func (o *UnderlyingSymbol) SetFigiCodeNil() {
	o.FigiCode.Set(nil)
}

// UnsetFigiCode ensures that no value is present for FigiCode, not even an explicit nil
func (o *UnderlyingSymbol) UnsetFigiCode() {
	o.FigiCode.Unset()
}

// GetFigiInstrument returns the FigiInstrument field value if set, zero value otherwise (both if not set or set to explicit null).
func (o *UnderlyingSymbol) GetFigiInstrument() SymbolFigiInstrument {
	if o == nil || isNil(o.FigiInstrument.Get()) {
		var ret SymbolFigiInstrument
		return ret
	}
	return *o.FigiInstrument.Get()
}

// GetFigiInstrumentOk returns a tuple with the FigiInstrument field value if set, nil otherwise
// and a boolean to check if the value has been set.
// NOTE: If the value is an explicit nil, `nil, true` will be returned
func (o *UnderlyingSymbol) GetFigiInstrumentOk() (*SymbolFigiInstrument, bool) {
	if o == nil {
    return nil, false
	}
	return o.FigiInstrument.Get(), o.FigiInstrument.IsSet()
}

// HasFigiInstrument returns a boolean if a field has been set.
func (o *UnderlyingSymbol) HasFigiInstrument() bool {
	if o != nil && o.FigiInstrument.IsSet() {
		return true
	}

	return false
}

// SetFigiInstrument gets a reference to the given NullableSymbolFigiInstrument and assigns it to the FigiInstrument field.
func (o *UnderlyingSymbol) SetFigiInstrument(v SymbolFigiInstrument) {
	o.FigiInstrument.Set(&v)
}
// SetFigiInstrumentNil sets the value for FigiInstrument to be an explicit nil
func (o *UnderlyingSymbol) SetFigiInstrumentNil() {
	o.FigiInstrument.Set(nil)
}

// UnsetFigiInstrument ensures that no value is present for FigiInstrument, not even an explicit nil
func (o *UnderlyingSymbol) UnsetFigiInstrument() {
	o.FigiInstrument.Unset()
}

// GetCurrencies returns the Currencies field value if set, zero value otherwise.
// Deprecated
func (o *UnderlyingSymbol) GetCurrencies() []Currency {
	if o == nil || isNil(o.Currencies) {
		var ret []Currency
		return ret
	}
	return o.Currencies
}

// GetCurrenciesOk returns a tuple with the Currencies field value if set, nil otherwise
// and a boolean to check if the value has been set.
// Deprecated
func (o *UnderlyingSymbol) GetCurrenciesOk() ([]Currency, bool) {
	if o == nil || isNil(o.Currencies) {
    return nil, false
	}
	return o.Currencies, true
}

// HasCurrencies returns a boolean if a field has been set.
func (o *UnderlyingSymbol) HasCurrencies() bool {
	if o != nil && !isNil(o.Currencies) {
		return true
	}

	return false
}

// SetCurrencies gets a reference to the given []Currency and assigns it to the Currencies field.
// Deprecated
func (o *UnderlyingSymbol) SetCurrencies(v []Currency) {
	o.Currencies = v
}

func (o UnderlyingSymbol) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if !isNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !isNil(o.Symbol) {
		toSerialize["symbol"] = o.Symbol
	}
	if !isNil(o.RawSymbol) {
		toSerialize["raw_symbol"] = o.RawSymbol
	}
	if o.Description.IsSet() {
		toSerialize["description"] = o.Description.Get()
	}
	if !isNil(o.Currency) {
		toSerialize["currency"] = o.Currency
	}
	if !isNil(o.Exchange) {
		toSerialize["exchange"] = o.Exchange
	}
	if !isNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	if o.FigiCode.IsSet() {
		toSerialize["figi_code"] = o.FigiCode.Get()
	}
	if o.FigiInstrument.IsSet() {
		toSerialize["figi_instrument"] = o.FigiInstrument.Get()
	}
	if !isNil(o.Currencies) {
		toSerialize["currencies"] = o.Currencies
	}

	for key, value := range o.AdditionalProperties {
		toSerialize[key] = value
	}

	return json.Marshal(toSerialize)
}

func (o *UnderlyingSymbol) UnmarshalJSON(bytes []byte) (err error) {
	varUnderlyingSymbol := _UnderlyingSymbol{}

	if err = json.Unmarshal(bytes, &varUnderlyingSymbol); err == nil {
		*o = UnderlyingSymbol(varUnderlyingSymbol)
	}

	additionalProperties := make(map[string]interface{})

	if err = json.Unmarshal(bytes, &additionalProperties); err == nil {
		delete(additionalProperties, "id")
		delete(additionalProperties, "symbol")
		delete(additionalProperties, "raw_symbol")
		delete(additionalProperties, "description")
		delete(additionalProperties, "currency")
		delete(additionalProperties, "exchange")
		delete(additionalProperties, "type")
		delete(additionalProperties, "figi_code")
		delete(additionalProperties, "figi_instrument")
		delete(additionalProperties, "currencies")
		o.AdditionalProperties = additionalProperties
	}

	return err
}

type NullableUnderlyingSymbol struct {
	value *UnderlyingSymbol
	isSet bool
}

func (v NullableUnderlyingSymbol) Get() *UnderlyingSymbol {
	return v.value
}

func (v *NullableUnderlyingSymbol) Set(val *UnderlyingSymbol) {
	v.value = val
	v.isSet = true
}

func (v NullableUnderlyingSymbol) IsSet() bool {
	return v.isSet
}

func (v *NullableUnderlyingSymbol) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableUnderlyingSymbol(val *UnderlyingSymbol) *NullableUnderlyingSymbol {
	return &NullableUnderlyingSymbol{value: val, isSet: true}
}

func (v NullableUnderlyingSymbol) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableUnderlyingSymbol) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}


