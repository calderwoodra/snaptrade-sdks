/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"


/**
 * The total market value of the account. Note that this field is calculated based on the sum of the values of account positions and cash balances known to SnapTrade. It may not be accurate if the brokerage account has holdings that SnapTrade is not aware of. For example, if the brokerage account holds assets that SnapTrade does not support, the total value may be underreported. To get the brokerage reported total market value of the account, refer to `account.balance.total`.
 * @export
 * @interface SnapTradeHoldingsTotalValue
 */
export interface SnapTradeHoldingsTotalValue {
    [key: string]: any;

    /**
     * Total value denominated in the currency of the `currency` field.
     * @type {number}
     * @memberof SnapTradeHoldingsTotalValue
     */
    'value'?: number | null;
    /**
     * The ISO-4217 currency code for the amount.
     * @type {string}
     * @memberof SnapTradeHoldingsTotalValue
     */
    'currency'?: string | null;
}

