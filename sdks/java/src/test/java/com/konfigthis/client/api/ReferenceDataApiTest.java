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
import com.konfigthis.client.model.Brokerage;
import com.konfigthis.client.model.BrokerageAuthorizationTypeReadOnly;
import com.konfigthis.client.model.Currency;
import com.konfigthis.client.model.Exchange;
import com.konfigthis.client.model.ExchangeRatePairs;
import com.konfigthis.client.model.Model400FailedRequestResponse;
import com.konfigthis.client.model.Model401FailedRequestResponse;
import com.konfigthis.client.model.Model404FailedRequestResponse;
import com.konfigthis.client.model.PartnerData;
import com.konfigthis.client.model.SecurityType;
import com.konfigthis.client.model.SymbolQuery;
import java.util.UUID;
import com.konfigthis.client.model.UniversalSymbol;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReferenceDataApi
 */
@Disabled
public class ReferenceDataApiTest {

    private final ReferenceDataApi api = new ReferenceDataApi();

    /**
     * Return the exchange rate of a currency pair
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCurrencyExchangeRatePairTest() throws ApiException {
        String currencyPair = null;
        ExchangeRatePairs response = api.getCurrencyExchangeRatePair(currencyPair);
        // TODO: test validations
    }

    /**
     * Get metadata related to Snaptrade partner
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPartnerInfoTest() throws ApiException {
        PartnerData response = api.getPartnerInfo();
        // TODO: test validations
    }

    /**
     * List of all security types.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSecurityTypesTest() throws ApiException {
        List<SecurityType> response = api.getSecurityTypes();
        // TODO: test validations
    }

    /**
     * Return list of stock exchanges on Passiv and their suffixes
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getStockExchangesTest() throws ApiException {
        List<Exchange> response = api.getStockExchanges();
        // TODO: test validations
    }

    /**
     * Search for symbols
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSymbolsTest() throws ApiException {
        SymbolQuery symbolQuery = null;
        List<UniversalSymbol> response = api.getSymbols(symbolQuery);
        // TODO: test validations
    }

    /**
     * Get details of a symbol by the ticker
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSymbolsByTickerTest() throws ApiException {
        UUID ticker = null;
        UUID symbolId = null;
        UniversalSymbol response = api.getSymbolsByTicker(ticker, symbolId);
        // TODO: test validations
    }

    /**
     * List of all brokerage authorization types
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllBrokerageAuthorizationTypeTest() throws ApiException {
        String brokerage = null;
        List<BrokerageAuthorizationTypeReadOnly> response = api.listAllBrokerageAuthorizationType(brokerage);
        // TODO: test validations
    }

    /**
     * List of all brokerages.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllBrokeragesTest() throws ApiException {
        List<Brokerage> response = api.listAllBrokerages();
        // TODO: test validations
    }

    /**
     * List of all supported currencies
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllCurrenciesTest() throws ApiException {
        List<Currency> response = api.listAllCurrencies();
        // TODO: test validations
    }

    /**
     * Return the exchange rates of all supported currencies
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllCurrenciesRatesTest() throws ApiException {
        List<ExchangeRatePairs> response = api.listAllCurrenciesRates();
        // TODO: test validations
    }

    /**
     * Search for symbols that are supported by a brokerage account using a substring
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void symbolSearchUserAccountTest() throws ApiException {
        String userId = null;
        String userSecret = null;
        UUID accountId = null;
        SymbolQuery symbolQuery = null;
        List<UniversalSymbol> response = api.symbolSearchUserAccount(userId, userSecret, accountId, symbolQuery);
        // TODO: test validations
    }

}
