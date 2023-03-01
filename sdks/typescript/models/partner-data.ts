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
import { Brokerage } from './brokerage';

/**
 * SnapTrade Partner metadata
 * @export
 * @interface PartnerData
 */
export interface PartnerData {
    [key: string]: any;

    /**
     * URI to redirect user back to after user is done adding brokerage connections
     * @type {string}
     * @memberof PartnerData
     */
    'redirect_uri'?: string | null;
    /**
     * Brokerages that can be accessed by partners
     * @type {Array<Brokerage>}
     * @memberof PartnerData
     */
    'allowed_brokerages'?: Array<Brokerage> | null;
    /**
     * Name of Snaptrade Partner
     * @type {string}
     * @memberof PartnerData
     */
    'name'?: string | null;
    /**
     * Slug of Snaptrade Partner
     * @type {string}
     * @memberof PartnerData
     */
    'slug'?: string | null;
    /**
     * URL to partner\'s logo
     * @type {string}
     * @memberof PartnerData
     */
    'logo_url'?: string | null;
    /**
     * Shows if pin is required by users to access connection page
     * @type {boolean}
     * @memberof PartnerData
     */
    'pin_required'?: boolean | null;
    /**
     * Shows if users of Snaptrade partners can access trade endpoints
     * @type {boolean}
     * @memberof PartnerData
     */
    'can_access_trades'?: boolean | null;
    /**
     * Shows if Snaptrade partners can get user holdings data
     * @type {boolean}
     * @memberof PartnerData
     */
    'can_access_holdings'?: boolean | null;
    /**
     * Shows if Snaptrade partners can get users account history data
     * @type {boolean}
     * @memberof PartnerData
     */
    'can_access_account_history'?: boolean | null;
    /**
     * Shows if Snaptrade partners can get users holdings data
     * @type {boolean}
     * @memberof PartnerData
     */
    'can_access_reference_data'?: boolean | null;
    /**
     * Shows if users Snaptrade partners can access portfolio group management features
     * @type {boolean}
     * @memberof PartnerData
     */
    'can_access_portfolio_management'?: boolean | null;
    /**
     * Shows if Snaptrade partners can get users account order history
     * @type {boolean}
     * @memberof PartnerData
     */
    'can_access_orders'?: boolean | null;
}

