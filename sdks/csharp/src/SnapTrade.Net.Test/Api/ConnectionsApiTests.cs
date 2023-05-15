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
// uncomment below to import models
//using SnapTrade.Net.Model;

namespace SnapTrade.Net.Test.Api
{
    /// <summary>
    ///  Class for testing ConnectionsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by Konfig (https://konfigthis.com).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class ConnectionsApiTests : IDisposable
    {
        private ConnectionsApi instance;

        public ConnectionsApiTests()
        {
            instance = new ConnectionsApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of ConnectionsApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' ConnectionsApi
            //Assert.IsType<ConnectionsApi>(instance);
        }

        /// <summary>
        /// Test DetailBrokerageAuthorization
        /// </summary>
        [Fact]
        public void DetailBrokerageAuthorizationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid authorizationId = null;
            //string userId = null;
            //string userSecret = null;
            //var response = instance.DetailBrokerageAuthorization(authorizationId, userId, userSecret);
            //Assert.IsType<BrokerageAuthorization>(response);
        }

        /// <summary>
        /// Test ListBrokerageAuthorizations
        /// </summary>
        [Fact]
        public void ListBrokerageAuthorizationsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string userId = null;
            //string userSecret = null;
            //var response = instance.ListBrokerageAuthorizations(userId, userSecret);
            //Assert.IsType<List<BrokerageAuthorization>>(response);
        }

        /// <summary>
        /// Test RemoveBrokerageAuthorization
        /// </summary>
        [Fact]
        public void RemoveBrokerageAuthorizationTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid authorizationId = null;
            //string userId = null;
            //string userSecret = null;
            //instance.RemoveBrokerageAuthorization(authorizationId, userId, userSecret);
        }

        /// <summary>
        /// Test SessionEvents
        /// </summary>
        [Fact]
        public void SessionEventsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string partnerClientId = null;
            //string userId = null;
            //string sessionId = null;
            //var response = instance.SessionEvents(partnerClientId, userId, sessionId);
            //Assert.IsType<List<ConnectionsSessionEvents200ResponseInner>>(response);
        }
    }
}
