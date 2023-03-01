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
import { AccountOrderRecordStatus } from './account-order-record-status';
// May contain unused imports in some cases
// @ts-ignore
import { Action } from './action';
// May contain unused imports in some cases
// @ts-ignore
import { OrderType } from './order-type';
// May contain unused imports in some cases
// @ts-ignore
import { TimeInForce } from './time-in-force';
// May contain unused imports in some cases
// @ts-ignore
import { UniversalSymbol } from './universal-symbol';

/**
 * Record of order in brokerageaccount
 * @export
 * @interface AccountOrderRecord
 */
export interface AccountOrderRecord {
    [key: string]: any;

    /**
     * Order id returned by brokerage
     * @type {string}
     * @memberof AccountOrderRecord
     */
    'brokerage_order_id'?: string | null;
    /**
     * 
     * @type {AccountOrderRecordStatus}
     * @memberof AccountOrderRecord
     */
    'status'?: AccountOrderRecordStatus | null;
    /**
     * 
     * @type {string}
     * @memberof AccountOrderRecord
     */
    'symbol'?: string;
    /**
     * 
     * @type {UniversalSymbol}
     * @memberof AccountOrderRecord
     */
    'universal_symbol'?: UniversalSymbol;
    /**
     * 
     * @type {Action}
     * @memberof AccountOrderRecord
     */
    'action'?: Action | null;
    /**
     * Trade Units
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'total_quantity'?: number | null;
    /**
     * Trade Units
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'open_quantity'?: number | null;
    /**
     * Trade Units
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'canceled_quantity'?: number | null;
    /**
     * Trade Units
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'filled_quantity'?: number | null;
    /**
     * Trade Price if limit or stop limit order
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'execution_price'?: number | null;
    /**
     * Trade Price if limit or stop limit order
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'limit_price'?: number | null;
    /**
     * Trade Price if limit or stop limit order
     * @type {number}
     * @memberof AccountOrderRecord
     */
    'stop_price'?: number | null;
    /**
     * 
     * @type {OrderType}
     * @memberof AccountOrderRecord
     */
    'order_type'?: OrderType | null;
    /**
     * 
     * @type {TimeInForce}
     * @memberof AccountOrderRecord
     */
    'time_in_force'?: TimeInForce | null;
    /**
     * Time
     * @type {string}
     * @memberof AccountOrderRecord
     */
    'time_placed'?: string | null;
    /**
     * Time
     * @type {string}
     * @memberof AccountOrderRecord
     */
    'time_updated'?: string | null;
    /**
     * Time
     * @type {string}
     * @memberof AccountOrderRecord
     */
    'expiry_date'?: string | null;
}

