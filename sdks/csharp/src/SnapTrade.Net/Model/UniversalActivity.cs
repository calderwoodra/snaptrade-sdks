/*
 * SnapTrade
 *
 * Connect brokerage accounts to your app for live positions and trading
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@snaptrade.com
 * Generated by: https://konfigthis.com
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = SnapTrade.Net.Client.OpenAPIDateConverter;

namespace SnapTrade.Net.Model
{
    /// <summary>
    /// A transaction or activity from an institution
    /// </summary>
    [DataContract(Name = "UniversalActivity")]
    public partial class UniversalActivity : IEquatable<UniversalActivity>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="UniversalActivity" /> class.
        /// </summary>
        /// <param name="id">Unique identifier for the transaction. This is the ID used to reference the transaction in SnapTrade.  Please note that this ID _can_ change if the transaction is deleted and re-added. Under normal circumstances, SnapTrade does not delete transactions. The only time this would happen is if SnapTrade re-fetches and reprocesses the data from the brokerage, which is rare. If you require a stable ID, please let us know and we can work with you to provide one. .</param>
        /// <param name="account">account.</param>
        /// <param name="symbol">symbol.</param>
        /// <param name="optionSymbol">optionSymbol.</param>
        /// <param name="price">The price of the security for the transaction. This is mostly applicable to &#x60;BUY&#x60;, &#x60;SELL&#x60;, and &#x60;DIVIDEND&#x60; transactions..</param>
        /// <param name="units">The number of units of the security for the transaction. This is mostly applicable to &#x60;BUY&#x60;, &#x60;SELL&#x60;, and &#x60;DIVIDEND&#x60; transactions..</param>
        /// <param name="amount">The amount of the transaction denominated in &#x60;currency&#x60;. This can be positive or negative. In general, transactions that positively affect the account balance (like sell, deposits, dividends, etc) will have a positive amount, while transactions that negatively affect the account balance (like buy, withdrawals, fees, etc) will have a negative amount..</param>
        /// <param name="currency">currency.</param>
        /// <param name="type">A string representing the type of transaction. SnapTrade does a best effort to categorize the brokerage transaction types into a common set of values. Here are some of the most popular values:   - &#x60;BUY&#x60; - Asset bought.   - &#x60;SELL&#x60; - Asset sold.   - &#x60;DIVIDEND&#x60; - Dividend payout.   - &#x60;CONTRIBUTION&#x60; - Cash contribution.   - &#x60;WITHDRAWAL&#x60; - Cash withdrawal.   - &#x60;REI&#x60; - Dividend reinvestment.   - &#x60;INTEREST&#x60; - Interest deposited into the account.   - &#x60;FEE&#x60; - Fee withdrawn from the account.   - &#x60;OPTIONEXPIRATION&#x60; - Option expiration event. &#x60;option_symbol&#x60; contains the related option contract info.   - &#x60;OPTIONASSIGNMENT&#x60; - Option assignment event. &#x60;option_symbol&#x60; contains the related option contract info.   - &#x60;OPTIONEXERCISE&#x60; - Option exercise event. &#x60;option_symbol&#x60; contains the related option contract info. .</param>
        /// <param name="optionType">If an option &#x60;BUY&#x60; or &#x60;SELL&#x60; transaction, this further specifies the type of action. The possible values are: - BUY_TO_OPEN - BUY_TO_CLOSE - SELL_TO_OPEN - SELL_TO_CLOSE .</param>
        /// <param name="description">A human-readable description of the transaction. This is usually the brokerage&#39;s description of the transaction..</param>
        /// <param name="tradeDate">The recorded time for the transaction. The granularity of this timestamp depends on the brokerage. Some brokerages provide the exact time of the transaction, while others provide only the date. Please check the [integrations page](https://snaptrade.notion.site/66793431ad0b416489eaabaf248d0afb?v&#x3D;6fab8012ade6441fa0c6d9af9c55ce3a) for the specific brokerage to see the granularity of the timestamps. Note that even though the field is named &#x60;trade_date&#x60;, it can represent any type of transaction, not just trades..</param>
        /// <param name="settlementDate">The date on which the transaction is settled..</param>
        /// <param name="fee">Any fee associated with the transaction if provided by the brokerage..</param>
        /// <param name="fxRate">The forex conversion rate involved in the transaction if provided by the brokerage. Used in cases where securities of one currency are purchased in a different currency, and the forex conversion is automatic. In those cases, price, amount and fee will be in the top level currency (activity -&gt; currency).</param>
        /// <param name="institution">The institution that the transaction is associated with. This is usually the brokerage name..</param>
        /// <param name="externalReferenceId">Reference ID from brokerage used to identify related transactions. For example if an order comprises of several transactions (buy, fee, fx), they can be grouped if they share the same &#x60;external_reference_id&#x60;.</param>
        public UniversalActivity(string id = default(string), AccountSimple account = default(AccountSimple), SymbolNullable symbol = default(SymbolNullable), OptionsSymbolNullable optionSymbol = default(OptionsSymbolNullable), double price = default(double), double units = default(double), double? amount = default(double?), UniversalActivityCurrency currency = default(UniversalActivityCurrency), string type = default(string), string optionType = default(string), string description = default(string), DateTime? tradeDate = default(DateTime?), DateTime settlementDate = default(DateTime), double fee = default(double), double? fxRate = default(double?), string institution = default(string), string externalReferenceId = default(string)) : base()
        {
            this.Id = id;
            this.Account = account;
            this.Symbol = symbol;
            this.OptionSymbol = optionSymbol;
            this.Price = price;
            this.Units = units;
            this.Amount = amount;
            this.Currency = currency;
            this.Type = type;
            this.OptionType = optionType;
            this.Description = description;
            this.TradeDate = tradeDate;
            this.SettlementDate = settlementDate;
            this.Fee = fee;
            this.FxRate = fxRate;
            this.Institution = institution;
            this.ExternalReferenceId = externalReferenceId;
            this.AdditionalProperties = new Dictionary<string, object>();
        }

        /// <summary>
        /// Unique identifier for the transaction. This is the ID used to reference the transaction in SnapTrade.  Please note that this ID _can_ change if the transaction is deleted and re-added. Under normal circumstances, SnapTrade does not delete transactions. The only time this would happen is if SnapTrade re-fetches and reprocesses the data from the brokerage, which is rare. If you require a stable ID, please let us know and we can work with you to provide one. 
        /// </summary>
        /// <value>Unique identifier for the transaction. This is the ID used to reference the transaction in SnapTrade.  Please note that this ID _can_ change if the transaction is deleted and re-added. Under normal circumstances, SnapTrade does not delete transactions. The only time this would happen is if SnapTrade re-fetches and reprocesses the data from the brokerage, which is rare. If you require a stable ID, please let us know and we can work with you to provide one. </value>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Account
        /// </summary>
        [DataMember(Name = "account", EmitDefaultValue = false)]
        public AccountSimple Account { get; set; }

        /// <summary>
        /// Gets or Sets Symbol
        /// </summary>
        [DataMember(Name = "symbol", EmitDefaultValue = true)]
        public SymbolNullable Symbol { get; set; }

        /// <summary>
        /// Gets or Sets OptionSymbol
        /// </summary>
        [DataMember(Name = "option_symbol", EmitDefaultValue = true)]
        public OptionsSymbolNullable OptionSymbol { get; set; }

        /// <summary>
        /// The price of the security for the transaction. This is mostly applicable to &#x60;BUY&#x60;, &#x60;SELL&#x60;, and &#x60;DIVIDEND&#x60; transactions.
        /// </summary>
        /// <value>The price of the security for the transaction. This is mostly applicable to &#x60;BUY&#x60;, &#x60;SELL&#x60;, and &#x60;DIVIDEND&#x60; transactions.</value>
        [DataMember(Name = "price", EmitDefaultValue = false)]
        public double Price { get; set; }

        /// <summary>
        /// The number of units of the security for the transaction. This is mostly applicable to &#x60;BUY&#x60;, &#x60;SELL&#x60;, and &#x60;DIVIDEND&#x60; transactions.
        /// </summary>
        /// <value>The number of units of the security for the transaction. This is mostly applicable to &#x60;BUY&#x60;, &#x60;SELL&#x60;, and &#x60;DIVIDEND&#x60; transactions.</value>
        [DataMember(Name = "units", EmitDefaultValue = false)]
        public double Units { get; set; }

        /// <summary>
        /// The amount of the transaction denominated in &#x60;currency&#x60;. This can be positive or negative. In general, transactions that positively affect the account balance (like sell, deposits, dividends, etc) will have a positive amount, while transactions that negatively affect the account balance (like buy, withdrawals, fees, etc) will have a negative amount.
        /// </summary>
        /// <value>The amount of the transaction denominated in &#x60;currency&#x60;. This can be positive or negative. In general, transactions that positively affect the account balance (like sell, deposits, dividends, etc) will have a positive amount, while transactions that negatively affect the account balance (like buy, withdrawals, fees, etc) will have a negative amount.</value>
        [DataMember(Name = "amount", EmitDefaultValue = true)]
        public double? Amount { get; set; }

        /// <summary>
        /// Gets or Sets Currency
        /// </summary>
        [DataMember(Name = "currency", EmitDefaultValue = false)]
        public UniversalActivityCurrency Currency { get; set; }

        /// <summary>
        /// A string representing the type of transaction. SnapTrade does a best effort to categorize the brokerage transaction types into a common set of values. Here are some of the most popular values:   - &#x60;BUY&#x60; - Asset bought.   - &#x60;SELL&#x60; - Asset sold.   - &#x60;DIVIDEND&#x60; - Dividend payout.   - &#x60;CONTRIBUTION&#x60; - Cash contribution.   - &#x60;WITHDRAWAL&#x60; - Cash withdrawal.   - &#x60;REI&#x60; - Dividend reinvestment.   - &#x60;INTEREST&#x60; - Interest deposited into the account.   - &#x60;FEE&#x60; - Fee withdrawn from the account.   - &#x60;OPTIONEXPIRATION&#x60; - Option expiration event. &#x60;option_symbol&#x60; contains the related option contract info.   - &#x60;OPTIONASSIGNMENT&#x60; - Option assignment event. &#x60;option_symbol&#x60; contains the related option contract info.   - &#x60;OPTIONEXERCISE&#x60; - Option exercise event. &#x60;option_symbol&#x60; contains the related option contract info. 
        /// </summary>
        /// <value>A string representing the type of transaction. SnapTrade does a best effort to categorize the brokerage transaction types into a common set of values. Here are some of the most popular values:   - &#x60;BUY&#x60; - Asset bought.   - &#x60;SELL&#x60; - Asset sold.   - &#x60;DIVIDEND&#x60; - Dividend payout.   - &#x60;CONTRIBUTION&#x60; - Cash contribution.   - &#x60;WITHDRAWAL&#x60; - Cash withdrawal.   - &#x60;REI&#x60; - Dividend reinvestment.   - &#x60;INTEREST&#x60; - Interest deposited into the account.   - &#x60;FEE&#x60; - Fee withdrawn from the account.   - &#x60;OPTIONEXPIRATION&#x60; - Option expiration event. &#x60;option_symbol&#x60; contains the related option contract info.   - &#x60;OPTIONASSIGNMENT&#x60; - Option assignment event. &#x60;option_symbol&#x60; contains the related option contract info.   - &#x60;OPTIONEXERCISE&#x60; - Option exercise event. &#x60;option_symbol&#x60; contains the related option contract info. </value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// If an option &#x60;BUY&#x60; or &#x60;SELL&#x60; transaction, this further specifies the type of action. The possible values are: - BUY_TO_OPEN - BUY_TO_CLOSE - SELL_TO_OPEN - SELL_TO_CLOSE 
        /// </summary>
        /// <value>If an option &#x60;BUY&#x60; or &#x60;SELL&#x60; transaction, this further specifies the type of action. The possible values are: - BUY_TO_OPEN - BUY_TO_CLOSE - SELL_TO_OPEN - SELL_TO_CLOSE </value>
        [DataMember(Name = "option_type", EmitDefaultValue = false)]
        public string OptionType { get; set; }

        /// <summary>
        /// A human-readable description of the transaction. This is usually the brokerage&#39;s description of the transaction.
        /// </summary>
        /// <value>A human-readable description of the transaction. This is usually the brokerage&#39;s description of the transaction.</value>
        [DataMember(Name = "description", EmitDefaultValue = false)]
        public string Description { get; set; }

        /// <summary>
        /// The recorded time for the transaction. The granularity of this timestamp depends on the brokerage. Some brokerages provide the exact time of the transaction, while others provide only the date. Please check the [integrations page](https://snaptrade.notion.site/66793431ad0b416489eaabaf248d0afb?v&#x3D;6fab8012ade6441fa0c6d9af9c55ce3a) for the specific brokerage to see the granularity of the timestamps. Note that even though the field is named &#x60;trade_date&#x60;, it can represent any type of transaction, not just trades.
        /// </summary>
        /// <value>The recorded time for the transaction. The granularity of this timestamp depends on the brokerage. Some brokerages provide the exact time of the transaction, while others provide only the date. Please check the [integrations page](https://snaptrade.notion.site/66793431ad0b416489eaabaf248d0afb?v&#x3D;6fab8012ade6441fa0c6d9af9c55ce3a) for the specific brokerage to see the granularity of the timestamps. Note that even though the field is named &#x60;trade_date&#x60;, it can represent any type of transaction, not just trades.</value>
        [DataMember(Name = "trade_date", EmitDefaultValue = true)]
        public DateTime? TradeDate { get; set; }

        /// <summary>
        /// The date on which the transaction is settled.
        /// </summary>
        /// <value>The date on which the transaction is settled.</value>
        [DataMember(Name = "settlement_date", EmitDefaultValue = false)]
        public DateTime SettlementDate { get; set; }

        /// <summary>
        /// Any fee associated with the transaction if provided by the brokerage.
        /// </summary>
        /// <value>Any fee associated with the transaction if provided by the brokerage.</value>
        [DataMember(Name = "fee", EmitDefaultValue = false)]
        public double Fee { get; set; }

        /// <summary>
        /// The forex conversion rate involved in the transaction if provided by the brokerage. Used in cases where securities of one currency are purchased in a different currency, and the forex conversion is automatic. In those cases, price, amount and fee will be in the top level currency (activity -&gt; currency)
        /// </summary>
        /// <value>The forex conversion rate involved in the transaction if provided by the brokerage. Used in cases where securities of one currency are purchased in a different currency, and the forex conversion is automatic. In those cases, price, amount and fee will be in the top level currency (activity -&gt; currency)</value>
        [DataMember(Name = "fx_rate", EmitDefaultValue = true)]
        public double? FxRate { get; set; }

        /// <summary>
        /// The institution that the transaction is associated with. This is usually the brokerage name.
        /// </summary>
        /// <value>The institution that the transaction is associated with. This is usually the brokerage name.</value>
        [DataMember(Name = "institution", EmitDefaultValue = false)]
        public string Institution { get; set; }

        /// <summary>
        /// Reference ID from brokerage used to identify related transactions. For example if an order comprises of several transactions (buy, fee, fx), they can be grouped if they share the same &#x60;external_reference_id&#x60;
        /// </summary>
        /// <value>Reference ID from brokerage used to identify related transactions. For example if an order comprises of several transactions (buy, fee, fx), they can be grouped if they share the same &#x60;external_reference_id&#x60;</value>
        [DataMember(Name = "external_reference_id", EmitDefaultValue = true)]
        public string ExternalReferenceId { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public IDictionary<string, object> AdditionalProperties { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class UniversalActivity {\n");
            sb.Append("  ").Append(base.ToString().Replace("\n", "\n  ")).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Account: ").Append(Account).Append("\n");
            sb.Append("  Symbol: ").Append(Symbol).Append("\n");
            sb.Append("  OptionSymbol: ").Append(OptionSymbol).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("  Units: ").Append(Units).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  OptionType: ").Append(OptionType).Append("\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  TradeDate: ").Append(TradeDate).Append("\n");
            sb.Append("  SettlementDate: ").Append(SettlementDate).Append("\n");
            sb.Append("  Fee: ").Append(Fee).Append("\n");
            sb.Append("  FxRate: ").Append(FxRate).Append("\n");
            sb.Append("  Institution: ").Append(Institution).Append("\n");
            sb.Append("  ExternalReferenceId: ").Append(ExternalReferenceId).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as UniversalActivity);
        }

        /// <summary>
        /// Returns true if UniversalActivity instances are equal
        /// </summary>
        /// <param name="input">Instance of UniversalActivity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(UniversalActivity input)
        {
            if (input == null)
            {
                return false;
            }
            return base.Equals(input) && 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && base.Equals(input) && 
                (
                    this.Account == input.Account ||
                    (this.Account != null &&
                    this.Account.Equals(input.Account))
                ) && base.Equals(input) && 
                (
                    this.Symbol == input.Symbol ||
                    (this.Symbol != null &&
                    this.Symbol.Equals(input.Symbol))
                ) && base.Equals(input) && 
                (
                    this.OptionSymbol == input.OptionSymbol ||
                    (this.OptionSymbol != null &&
                    this.OptionSymbol.Equals(input.OptionSymbol))
                ) && base.Equals(input) && 
                (
                    this.Price == input.Price ||
                    this.Price.Equals(input.Price)
                ) && base.Equals(input) && 
                (
                    this.Units == input.Units ||
                    this.Units.Equals(input.Units)
                ) && base.Equals(input) && 
                (
                    this.Amount == input.Amount ||
                    (this.Amount != null &&
                    this.Amount.Equals(input.Amount))
                ) && base.Equals(input) && 
                (
                    this.Currency == input.Currency ||
                    (this.Currency != null &&
                    this.Currency.Equals(input.Currency))
                ) && base.Equals(input) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && base.Equals(input) && 
                (
                    this.OptionType == input.OptionType ||
                    (this.OptionType != null &&
                    this.OptionType.Equals(input.OptionType))
                ) && base.Equals(input) && 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && base.Equals(input) && 
                (
                    this.TradeDate == input.TradeDate ||
                    (this.TradeDate != null &&
                    this.TradeDate.Equals(input.TradeDate))
                ) && base.Equals(input) && 
                (
                    this.SettlementDate == input.SettlementDate ||
                    (this.SettlementDate != null &&
                    this.SettlementDate.Equals(input.SettlementDate))
                ) && base.Equals(input) && 
                (
                    this.Fee == input.Fee ||
                    this.Fee.Equals(input.Fee)
                ) && base.Equals(input) && 
                (
                    this.FxRate == input.FxRate ||
                    (this.FxRate != null &&
                    this.FxRate.Equals(input.FxRate))
                ) && base.Equals(input) && 
                (
                    this.Institution == input.Institution ||
                    (this.Institution != null &&
                    this.Institution.Equals(input.Institution))
                ) && base.Equals(input) && 
                (
                    this.ExternalReferenceId == input.ExternalReferenceId ||
                    (this.ExternalReferenceId != null &&
                    this.ExternalReferenceId.Equals(input.ExternalReferenceId))
                )
                && (this.AdditionalProperties.Count == input.AdditionalProperties.Count && !this.AdditionalProperties.Except(input.AdditionalProperties).Any());
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = base.GetHashCode();
                if (this.Id != null)
                {
                    hashCode = (hashCode * 59) + this.Id.GetHashCode();
                }
                if (this.Account != null)
                {
                    hashCode = (hashCode * 59) + this.Account.GetHashCode();
                }
                if (this.Symbol != null)
                {
                    hashCode = (hashCode * 59) + this.Symbol.GetHashCode();
                }
                if (this.OptionSymbol != null)
                {
                    hashCode = (hashCode * 59) + this.OptionSymbol.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Price.GetHashCode();
                hashCode = (hashCode * 59) + this.Units.GetHashCode();
                if (this.Amount != null)
                {
                    hashCode = (hashCode * 59) + this.Amount.GetHashCode();
                }
                if (this.Currency != null)
                {
                    hashCode = (hashCode * 59) + this.Currency.GetHashCode();
                }
                if (this.Type != null)
                {
                    hashCode = (hashCode * 59) + this.Type.GetHashCode();
                }
                if (this.OptionType != null)
                {
                    hashCode = (hashCode * 59) + this.OptionType.GetHashCode();
                }
                if (this.Description != null)
                {
                    hashCode = (hashCode * 59) + this.Description.GetHashCode();
                }
                if (this.TradeDate != null)
                {
                    hashCode = (hashCode * 59) + this.TradeDate.GetHashCode();
                }
                if (this.SettlementDate != null)
                {
                    hashCode = (hashCode * 59) + this.SettlementDate.GetHashCode();
                }
                hashCode = (hashCode * 59) + this.Fee.GetHashCode();
                if (this.FxRate != null)
                {
                    hashCode = (hashCode * 59) + this.FxRate.GetHashCode();
                }
                if (this.Institution != null)
                {
                    hashCode = (hashCode * 59) + this.Institution.GetHashCode();
                }
                if (this.ExternalReferenceId != null)
                {
                    hashCode = (hashCode * 59) + this.ExternalReferenceId.GetHashCode();
                }
                if (this.AdditionalProperties != null)
                {
                    hashCode = (hashCode * 59) + this.AdditionalProperties.GetHashCode();
                }
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        public IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
