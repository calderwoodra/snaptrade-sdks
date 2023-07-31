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


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.DeleteUserResponse;
import com.konfigthis.client.model.EncryptedResponse;
import com.konfigthis.client.model.SnapTradeLoginUserRequestBody;
import com.konfigthis.client.model.SnapTradeRegisterUserRequestBody;
import com.konfigthis.client.model.UserIDandSecret;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuthenticationApi
 */
@Disabled
public class AuthenticationApiTest {

    private static AuthenticationApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AuthenticationApi(apiClient);
    }

    /**
     * Delete SnapTrade user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSnapTradeUserTest() throws ApiException {
        String userId = null;
        DeleteUserResponse response = api.deleteSnapTradeUser(userId)
                .execute();
        // TODO: test validations
    }

    /**
     * Generate encrypted JWT token
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getUserJWTTest() throws ApiException {
        String userId = null;
        String userSecret = null;
        EncryptedResponse response = api.getUserJWT(userId, userSecret)
                .execute();
        // TODO: test validations
    }

    /**
     * List SnapTrade users
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listSnapTradeUsersTest() throws ApiException {
        List<String> response = api.listSnapTradeUsers()
                .execute();
        // TODO: test validations
    }

    /**
     * Login user &amp; generate connection link
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void loginSnapTradeUserTest() throws ApiException {
        String userId = null;
        String userSecret = null;
        String broker = null;
        Boolean immediateRedirect = null;
        String customRedirect = null;
        String reconnect = null;
        String connectionType = null;
        Object response = api.loginSnapTradeUser(userId, userSecret)
                .broker(broker)
                .immediateRedirect(immediateRedirect)
                .customRedirect(customRedirect)
                .reconnect(reconnect)
                .connectionType(connectionType)
                .execute();
        // TODO: test validations
    }

    /**
     * Create SnapTrade user
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void registerSnapTradeUserTest() throws ApiException {
        String userId = null;
        String rsaPublicKey = null;
        UserIDandSecret response = api.registerSnapTradeUser()
                .userId(userId)
                .rsaPublicKey(rsaPublicKey)
                .execute();
        // TODO: test validations
    }

}
