/*
 * SnapTrade
 *
 * Connect brokerage accounts to your app for live positions and trading
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api@snaptrade.com
 * Generated by: https://konfigthis.com
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using SnapTrade.Net.Client;
using SnapTrade.Net.Api;
using SnapTrade.Net.Model;
using System.Diagnostics;

namespace SnapTrade.Net.Test.Api
{
    /// <summary>
    ///  Class for testing GettingStarted
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Konfig (https://konfigthis.com).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class GettingStartedTests : IDisposable
    {
        private APIStatusApi apiStatusApi;
        private AuthenticationApi authenticationApi;
        private PortfolioManagementApi portfolioManagementApi;
        private APIDisclaimerApi apiDisclaimerApi;
        private AccountInformationApi accountInformationApi;

        private ReferenceDataApi referenceDataApi;

        private OptionsApi optionsApi;

        private string testUserId;

        private string testUserSecret;

        public GettingStartedTests()
        {
            Configuration configuration = new Configuration();
            string clientId = System.Environment.GetEnvironmentVariable("SNAPTRADE_CLIENT_ID");
            string consumerKey = System.Environment.GetEnvironmentVariable("SNAPTRADE_CONSUMER_KEY");
            this.testUserId = System.Environment.GetEnvironmentVariable("SNAPTRADE_TEST_USER_ID");
            this.testUserSecret = System.Environment.GetEnvironmentVariable("SNAPTRADE_TEST_USER_SECRET");
            configuration.ApiKey.Add("clientId", clientId);
            configuration.ConsumerKey = consumerKey;
            apiStatusApi = new APIStatusApi(configuration);
            authenticationApi = new AuthenticationApi(configuration);
            accountInformationApi = new AccountInformationApi(configuration);
            referenceDataApi = new ReferenceDataApi(configuration);
            optionsApi = new OptionsApi(configuration);
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        [Fact]
        public void GettingStartedTest()
        {
            Status status = apiStatusApi.Check();
            Console.WriteLine(status.ToJson());
            string uuid = Guid.NewGuid().ToString();
            UserIDandSecret userIDandSecret = authenticationApi.RegisterSnapTradeUser(new SnapTradeRegisterUserRequestBody(uuid));
            Console.WriteLine(string.Format("userID: {0}, userSecret: {1}", userIDandSecret.UserId, userIDandSecret.UserSecret));
            var redirectUri = authenticationApi.LoginSnapTradeUser(userIDandSecret.UserId, userIDandSecret.UserSecret).GetLoginRedirectURI().RedirectURI;
            Console.WriteLine(redirectUri);
            var holdings = accountInformationApi.GetAllUserHoldings(userIDandSecret.UserId, userIDandSecret.UserSecret);
            Console.WriteLine(holdings);
            var deleteResponse = authenticationApi.DeleteSnapTradeUser(userIDandSecret.UserId);
            Console.WriteLine(deleteResponse);
        }

        [Fact]
        public void GetUserAccountBalance()
        {
            var accounts = accountInformationApi.ListUserAccounts(this.testUserId, this.testUserSecret);
            Console.WriteLine(accounts);
            var response = accountInformationApi.GetUserAccountBalance(this.testUserId, this.testUserSecret, accounts[0].Id);
            Console.WriteLine(response);
        }

        [Fact(Skip = "Getting 500 error code")]
        public void GetOptionsChain()
        {
            var accounts = accountInformationApi.ListUserAccounts(this.testUserId, this.testUserSecret);
            Console.WriteLine(accounts.ToString());
            var symbols = referenceDataApi.GetSymbols(new SymbolQuery("apple"));
            Console.WriteLine(symbols.ToString());
            var optionsChain = optionsApi.GetOptionsChain(this.testUserId, this.testUserSecret, accounts[0].Id, symbols[0].Id);
            Console.WriteLine(optionsChain);
        }

    }
}
