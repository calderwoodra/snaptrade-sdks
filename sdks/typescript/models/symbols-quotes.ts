/* tslint:disable */
/* eslint-disable */
/**
 * SnapTrade
 * Connect brokerage accounts to your app for live positions and trading
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@snaptrade.com
 *
 * NOTE: This file is auto generated by Konfig (https://konfigthis.com).
 * https://konfigthis.com
 * Do not edit the class manually.
 */

// May contain unused imports in some cases
// @ts-ignore
import { UniversalSymbol } from './universal-symbol';

/**
 * Symbols and Tickers Quotes object
 * @export
 * @interface SymbolsQuotes
 */
export interface SymbolsQuotes {
    [key: string]: any;

    /**
     * 
     * @type {UniversalSymbol}
     * @memberof SymbolsQuotes
     */
    'symbol'?: UniversalSymbol;
    /**
     * 
     * @type {number}
     * @memberof SymbolsQuotes
     */
    'bid_price'?: number | null;
    /**
     * 
     * @type {number}
     * @memberof SymbolsQuotes
     */
    'ask_price'?: number | null;
    /**
     * 
     * @type {number}
     * @memberof SymbolsQuotes
     */
    'last_trade_price'?: number | null;
    /**
     * 
     * @type {number}
     * @memberof SymbolsQuotes
     */
    'bid_size'?: number | null;
    /**
     * 
     * @type {number}
     * @memberof SymbolsQuotes
     */
    'ask_size'?: number | null;
}

