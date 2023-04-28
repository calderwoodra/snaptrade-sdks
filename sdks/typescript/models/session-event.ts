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


/**
 * 
 * @export
 * @interface SessionEvent
 */
export interface SessionEvent {
    [key: string]: any;

    /**
     * 
     * @type {string}
     * @memberof SessionEvent
     */
    'id'?: string;
    /**
     * 
     * @type {string}
     * @memberof SessionEvent
     */
    'session_event_type'?: SessionEventSessionEventTypeEnum;
    /**
     * 
     * @type {string}
     * @memberof SessionEvent
     */
    'session_id'?: string;
    /**
     * SnapTrade User ID. Provided by SnapTrade Partner. Can be any string, as long as it\'s unique to a user
     * @type {string}
     * @memberof SessionEvent
     */
    'user_id'?: string;
    /**
     * Time
     * @type {string}
     * @memberof SessionEvent
     */
    'created_date'?: string;
    /**
     * 
     * @type {number}
     * @memberof SessionEvent
     */
    'brokerage_status_code'?: number | null;
    /**
     * 
     * @type {string}
     * @memberof SessionEvent
     */
    'brokerage_authorization_id'?: string;
}

export const SessionEventSessionEventTypeEnum = {
    ConnectionFailed: 'CONNECTION_FAILED',
    DisclaimerAccepted: 'DISCLAIMER_ACCEPTED',
    BrokerageConnectionInitiated: 'BROKERAGE_CONNECTION_INITIATED',
    BrokerageAuthentication: 'BROKERAGE_AUTHENTICATION',
    MfaAuthorization: 'MFA_AUTHORIZATION',
    ConnectionSuccessful: 'CONNECTION_SUCCESSFUL',
    PartnerRedirect: 'PARTNER_REDIRECT'
} as const;

export type SessionEventSessionEventTypeEnum = typeof SessionEventSessionEventTypeEnum[keyof typeof SessionEventSessionEventTypeEnum];


