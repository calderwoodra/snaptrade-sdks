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

import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { BrokerageAuthorization } from '../models';
import { paginate } from "../pagination/paginate";
import { requestBeforeHook } from '../requestBeforeHook';
/**
 * ConnectionsApi - axios parameter creator
 * @export
 */
export const ConnectionsApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * 
         * @summary Get detail of a specific brokerage authorizations for the user
         * @param {string} authorizationId The ID of a brokerage authorization object.
         * @param {string} userId 
         * @param {string} userSecret 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        detailBrokerageAuthorization: async (authorizationId: string, userId: string, userSecret: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'authorizationId' is not null or undefined
            assertParamExists('detailBrokerageAuthorization', 'authorizationId', authorizationId)
            // verify required parameter 'userId' is not null or undefined
            assertParamExists('detailBrokerageAuthorization', 'userId', userId)
            // verify required parameter 'userSecret' is not null or undefined
            assertParamExists('detailBrokerageAuthorization', 'userSecret', userSecret)
            const localVarPath = `/authorizations/{authorizationId}`
                .replace(`{${"authorizationId"}}`, encodeURIComponent(String(authorizationId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication PartnerClientId required
            await setApiKeyToObject({object: localVarQueryParameter, keyParamName: "clientId", configuration})

            // authentication PartnerSignature required
            await setApiKeyToObject({object: localVarHeaderParameter, keyParamName: "Signature", configuration})

            // authentication PartnerTimestamp required
            await setApiKeyToObject({object: localVarQueryParameter, keyParamName: "timestamp", configuration})

            if (userId !== undefined) {
                localVarQueryParameter['userId'] = userId;
            }

            if (userSecret !== undefined) {
                localVarQueryParameter['userSecret'] = userSecret;
            }


    
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            requestBeforeHook({
              queryParameters: localVarQueryParameter,
              requestConfig: localVarRequestOptions,
              path: localVarPath,
              configuration
            });

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary List all brokerage authorizations for the user
         * @param {string} userId 
         * @param {string} userSecret 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listBrokerageAuthorizations: async (userId: string, userSecret: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'userId' is not null or undefined
            assertParamExists('listBrokerageAuthorizations', 'userId', userId)
            // verify required parameter 'userSecret' is not null or undefined
            assertParamExists('listBrokerageAuthorizations', 'userSecret', userSecret)
            const localVarPath = `/authorizations`;
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication PartnerClientId required
            await setApiKeyToObject({object: localVarQueryParameter, keyParamName: "clientId", configuration})

            // authentication PartnerSignature required
            await setApiKeyToObject({object: localVarHeaderParameter, keyParamName: "Signature", configuration})

            // authentication PartnerTimestamp required
            await setApiKeyToObject({object: localVarQueryParameter, keyParamName: "timestamp", configuration})

            if (userId !== undefined) {
                localVarQueryParameter['userId'] = userId;
            }

            if (userSecret !== undefined) {
                localVarQueryParameter['userSecret'] = userSecret;
            }


    
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            requestBeforeHook({
              queryParameters: localVarQueryParameter,
              requestConfig: localVarRequestOptions,
              path: localVarPath,
              configuration
            });

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
        /**
         * 
         * @summary Remove a brokerage authorization.
         * @param {string} authorizationId The ID of the Authorization to delete.
         * @param {string} userId 
         * @param {string} userSecret 
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        removeBrokerageAuthorization: async (authorizationId: string, userId: string, userSecret: string, options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'authorizationId' is not null or undefined
            assertParamExists('removeBrokerageAuthorization', 'authorizationId', authorizationId)
            // verify required parameter 'userId' is not null or undefined
            assertParamExists('removeBrokerageAuthorization', 'userId', userId)
            // verify required parameter 'userSecret' is not null or undefined
            assertParamExists('removeBrokerageAuthorization', 'userSecret', userSecret)
            const localVarPath = `/authorizations/{authorizationId}`
                .replace(`{${"authorizationId"}}`, encodeURIComponent(String(authorizationId)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions: AxiosRequestConfig = { method: 'DELETE', ...baseOptions, ...options};
            const localVarHeaderParameter = configuration ? { "User-Agent": configuration.userAgent } : {} as any;
            const localVarQueryParameter = {} as any;

            // authentication PartnerClientId required
            await setApiKeyToObject({object: localVarQueryParameter, keyParamName: "clientId", configuration})

            // authentication PartnerSignature required
            await setApiKeyToObject({object: localVarHeaderParameter, keyParamName: "Signature", configuration})

            // authentication PartnerTimestamp required
            await setApiKeyToObject({object: localVarQueryParameter, keyParamName: "timestamp", configuration})

            if (userId !== undefined) {
                localVarQueryParameter['userId'] = userId;
            }

            if (userSecret !== undefined) {
                localVarQueryParameter['userSecret'] = userSecret;
            }


    
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            requestBeforeHook({
              queryParameters: localVarQueryParameter,
              requestConfig: localVarRequestOptions,
              path: localVarPath,
              configuration
            });

            setSearchParams(localVarUrlObj, localVarQueryParameter);
            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * ConnectionsApi - functional programming interface
 * @export
 */
export const ConnectionsApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = ConnectionsApiAxiosParamCreator(configuration)
    return {
        /**
         * 
         * @summary Get detail of a specific brokerage authorizations for the user
         * @param {ConnectionsApiDetailBrokerageAuthorizationRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async detailBrokerageAuthorization(requestParameters: ConnectionsApiDetailBrokerageAuthorizationRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<BrokerageAuthorization>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.detailBrokerageAuthorization(requestParameters.authorizationId, requestParameters.userId, requestParameters.userSecret, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary List all brokerage authorizations for the user
         * @param {ConnectionsApiListBrokerageAuthorizationsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async listBrokerageAuthorizations(requestParameters: ConnectionsApiListBrokerageAuthorizationsRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<Array<BrokerageAuthorization>>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.listBrokerageAuthorizations(requestParameters.userId, requestParameters.userSecret, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * 
         * @summary Remove a brokerage authorization.
         * @param {ConnectionsApiRemoveBrokerageAuthorizationRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async removeBrokerageAuthorization(requestParameters: ConnectionsApiRemoveBrokerageAuthorizationRequest, options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<void>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.removeBrokerageAuthorization(requestParameters.authorizationId, requestParameters.userId, requestParameters.userSecret, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * ConnectionsApi - factory interface
 * @export
 */
export const ConnectionsApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = ConnectionsApiFp(configuration)
    return {
        /**
         * 
         * @summary Get detail of a specific brokerage authorizations for the user
         * @param {ConnectionsApiDetailBrokerageAuthorizationRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        detailBrokerageAuthorization(requestParameters: ConnectionsApiDetailBrokerageAuthorizationRequest, options?: AxiosRequestConfig): AxiosPromise<BrokerageAuthorization> {
            return localVarFp.detailBrokerageAuthorization(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary List all brokerage authorizations for the user
         * @param {ConnectionsApiListBrokerageAuthorizationsRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        listBrokerageAuthorizations(requestParameters: ConnectionsApiListBrokerageAuthorizationsRequest, options?: AxiosRequestConfig): AxiosPromise<Array<BrokerageAuthorization>> {
            return localVarFp.listBrokerageAuthorizations(requestParameters, options).then((request) => request(axios, basePath));
        },
        /**
         * 
         * @summary Remove a brokerage authorization.
         * @param {ConnectionsApiRemoveBrokerageAuthorizationRequest} requestParameters Request parameters.
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        removeBrokerageAuthorization(requestParameters: ConnectionsApiRemoveBrokerageAuthorizationRequest, options?: AxiosRequestConfig): AxiosPromise<void> {
            return localVarFp.removeBrokerageAuthorization(requestParameters, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * Request parameters for detailBrokerageAuthorization operation in ConnectionsApi.
 * @export
 * @interface ConnectionsApiDetailBrokerageAuthorizationRequest
 */
export type ConnectionsApiDetailBrokerageAuthorizationRequest = {
    
    /**
    * The ID of a brokerage authorization object.
    * @type {string}
    * @memberof ConnectionsApiDetailBrokerageAuthorization
    */
    readonly authorizationId: string
    
    /**
    * 
    * @type {string}
    * @memberof ConnectionsApiDetailBrokerageAuthorization
    */
    readonly userId: string
    
    /**
    * 
    * @type {string}
    * @memberof ConnectionsApiDetailBrokerageAuthorization
    */
    readonly userSecret: string
    
}

/**
 * Request parameters for listBrokerageAuthorizations operation in ConnectionsApi.
 * @export
 * @interface ConnectionsApiListBrokerageAuthorizationsRequest
 */
export type ConnectionsApiListBrokerageAuthorizationsRequest = {
    
    /**
    * 
    * @type {string}
    * @memberof ConnectionsApiListBrokerageAuthorizations
    */
    readonly userId: string
    
    /**
    * 
    * @type {string}
    * @memberof ConnectionsApiListBrokerageAuthorizations
    */
    readonly userSecret: string
    
}

/**
 * Request parameters for removeBrokerageAuthorization operation in ConnectionsApi.
 * @export
 * @interface ConnectionsApiRemoveBrokerageAuthorizationRequest
 */
export type ConnectionsApiRemoveBrokerageAuthorizationRequest = {
    
    /**
    * The ID of the Authorization to delete.
    * @type {string}
    * @memberof ConnectionsApiRemoveBrokerageAuthorization
    */
    readonly authorizationId: string
    
    /**
    * 
    * @type {string}
    * @memberof ConnectionsApiRemoveBrokerageAuthorization
    */
    readonly userId: string
    
    /**
    * 
    * @type {string}
    * @memberof ConnectionsApiRemoveBrokerageAuthorization
    */
    readonly userSecret: string
    
}

/**
 * ConnectionsApi - object-oriented interface
 * @export
 * @class ConnectionsApi
 * @extends {BaseAPI}
 */
export class ConnectionsApi extends BaseAPI {
    /**
     * 
     * @summary Get detail of a specific brokerage authorizations for the user
     * @param {ConnectionsApiDetailBrokerageAuthorizationRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ConnectionsApi
     */
    public detailBrokerageAuthorization(requestParameters: ConnectionsApiDetailBrokerageAuthorizationRequest, options?: AxiosRequestConfig) {
        return ConnectionsApiFp(this.configuration).detailBrokerageAuthorization(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary List all brokerage authorizations for the user
     * @param {ConnectionsApiListBrokerageAuthorizationsRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ConnectionsApi
     */
    public listBrokerageAuthorizations(requestParameters: ConnectionsApiListBrokerageAuthorizationsRequest, options?: AxiosRequestConfig) {
        return ConnectionsApiFp(this.configuration).listBrokerageAuthorizations(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * 
     * @summary Remove a brokerage authorization.
     * @param {ConnectionsApiRemoveBrokerageAuthorizationRequest} requestParameters Request parameters.
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof ConnectionsApi
     */
    public removeBrokerageAuthorization(requestParameters: ConnectionsApiRemoveBrokerageAuthorizationRequest, options?: AxiosRequestConfig) {
        return ConnectionsApiFp(this.configuration).removeBrokerageAuthorization(requestParameters, options).then((request) => request(this.axios, this.basePath));
    }
}
