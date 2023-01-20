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
import com.konfigthis.client.model.APIDisclaimerAcceptRequest;
import com.konfigthis.client.model.SnapTradeAPIDisclaimerAcceptStatus;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApiDisclaimerApi
 */
@Disabled
public class ApiDisclaimerApiTest {

    private final ApiDisclaimerApi api = new ApiDisclaimerApi();

    /**
     * Accept or Reject SnapTrade disclaimer agreement
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void acceptTest() throws ApiException {
        String userId = null;
        String userSecret = null;
        APIDisclaimerAcceptRequest apIDisclaimerAcceptRequest = null;
        SnapTradeAPIDisclaimerAcceptStatus response = api.accept(userId, userSecret, apIDisclaimerAcceptRequest);
        // TODO: test validations
    }

}
