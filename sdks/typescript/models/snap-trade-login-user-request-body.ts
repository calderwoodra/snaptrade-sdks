/*
SnapTrade

Connect brokerage accounts to your app for live positions and trading

The version of the OpenAPI document: 1.0.0
Contact: api@snaptrade.com

NOTE: This file is auto generated by Konfig (https://konfigthis.com).
*/
import type * as buffer from "buffer"


/**
 * Data to login a user via SnapTrade Partner
 * @export
 * @interface SnapTradeLoginUserRequestBody
 */
export interface SnapTradeLoginUserRequestBody {
    /**
     * Slug of the brokerage to connect the user to
     * @type {string}
     * @memberof SnapTradeLoginUserRequestBody
     */
    'broker'?: string;
    /**
     * When set to True, user will be redirected back to the partner\'s site instead of the connection portal
     * @type {boolean}
     * @memberof SnapTradeLoginUserRequestBody
     */
    'immediateRedirect'?: boolean;
    /**
     * URL to redirect the user to after the user connects their brokerage account
     * @type {string}
     * @memberof SnapTradeLoginUserRequestBody
     */
    'customRedirect'?: string;
    /**
     * The UUID of the brokerage connection to be reconnected. This parameter should be left empty unless you are reconnecting a disabled connection. See ‘Reconnecting Accounts’ for more information.
     * @type {string}
     * @memberof SnapTradeLoginUserRequestBody
     */
    'reconnect'?: string;
    /**
     * Sets whether the connection should be read or trade
     * @type {string}
     * @memberof SnapTradeLoginUserRequestBody
     */
    'connectionType'?: SnapTradeLoginUserRequestBodyConnectionTypeEnum;
    /**
     * Sets the version of the connection portal to render, with a default to \'v2\'
     * @type {string}
     * @memberof SnapTradeLoginUserRequestBody
     */
    'connectionPortalVersion'?: SnapTradeLoginUserRequestBodyConnectionPortalVersionEnum;
}

type SnapTradeLoginUserRequestBodyConnectionTypeEnum = 'read' | 'trade'
type SnapTradeLoginUserRequestBodyConnectionPortalVersionEnum = 'v2' | 'v3'


